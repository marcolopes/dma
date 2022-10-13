/*
 * Copyright 2011 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;


/**
 * <p>A utility which auto-translates the English-language text in a directory of HTML documents using
 * Google Translate.</p>
 *
 * <p>Pass the Android client assets/ directory as first argument, and the language to translate to second
 * as a comma-separated list. Specify "all" for language to try to translate for all existing translations.
 * Each argument after this is the name of a file to translate; if the first one is "all", all files will
 * be translated.</p>
 * 
 * <p>Usage: {@code HtmlAssetTranslator android/assets/ (all|lang1[,lang2 ...]) (all|file1.html[ file2.html ...])}</p>
 *
 * <p>{@code android/assets/ es all} will translate .html files in subdirectory html-en to 
 * directory html-es, for example. Note that only text nodes in the HTML document are translated. 
 * Any text that is a child of a node with {@code class="notranslate"} will not be translated. It will 
 * also add a note at the end of the translated page that indicates it was automatically translated.</p>
 *
 * @author Sean Owen
 */
public final class HtmlAssetTranslator {

  private static final Pattern COMMA = Pattern.compile(",");

  private HtmlAssetTranslator() {}

  public static void main(String[] args) throws IOException {
    if (args.length < 3) {
      System.err.println("Usage: HtmlAssetTranslator android/assets/ " +
                         "(all|lang1[,lang2 ...]) (all|file1.html[ file2.html ...])");
      return;
    }
    File assetsDir = new File(args[0]);
    Collection<String> languagesToTranslate = parseLanguagesToTranslate(assetsDir, args[1]);
    List<String> restOfArgs = Arrays.asList(args).subList(2, args.length);
    Collection<String> fileNamesToTranslate = parseFileNamesToTranslate(assetsDir, restOfArgs);
    for (String language : languagesToTranslate) {
      translateOneLanguage(assetsDir, language, fileNamesToTranslate);
    }
  }

  private static Collection<String> parseLanguagesToTranslate(File assetsDir,
                                                              CharSequence languageArg) throws IOException {
    if ("all".equals(languageArg)) {
      Collection<String> languages = new ArrayList<String>();
      FileFilter fileFilter = new FileFilter() {

        @Override
        public boolean accept(File file) {
          String fileName = file.getName();
          return file.isDirectory() && fileName.startsWith("html-") && !"html-en".equals(fileName);
        }
      };

      for (File languageDir : assetsDir.listFiles(fileFilter)) {
        languages.add(languageDir.getName().substring(5));
      }
      return languages;
    } else {
      return Arrays.asList(COMMA.split(languageArg));
    }
  }

  private static Collection<String> parseFileNamesToTranslate(File assetsDir,
                                                              List<String> restOfArgs) throws IOException {
    if ("all".equals(restOfArgs.get(0))) {
      Collection<String> fileNamesToTranslate = new ArrayList<String>();
      File htmlEnAssetDir = new File(assetsDir, "html-en");
      FileFilter fileFilter = new FileFilter() {

        @Override
        public boolean accept(File file) {
          return file.isFile() && file.getName().endsWith(".html");
        }
      };
      for (File file : htmlEnAssetDir.listFiles(fileFilter)) {
        fileNamesToTranslate.add(file.getName());
      }
      return fileNamesToTranslate;
    } else {
      return restOfArgs;
    }
  }

  private static void translateOneLanguage(File assetsDir,
                                           String language,
                                           final Collection<String> filesToTranslate) throws IOException {
    File targetHtmlDir = new File(assetsDir, "html-" + language); 
    targetHtmlDir.mkdirs();
    File englishHtmlDir = new File(assetsDir, "html-en");

    String translationTextTranslated =
        StringsResourceTranslator.translateString("Translated by Google Translate.", language);

    File[] sourceFiles = englishHtmlDir.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        return name.endsWith(".html") && (filesToTranslate.isEmpty() || filesToTranslate.contains(name));
      }
    });
    for (File sourceFile : sourceFiles) {
      translateOneFile(language, targetHtmlDir, sourceFile, translationTextTranslated);
    }
  }

  private static void translateOneFile(String language,
                                       File targetHtmlDir,
                                       File sourceFile,
                                       String translationTextTranslated) throws IOException {

    File destFile = new File(targetHtmlDir, sourceFile.getName());

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    Document document;
    try {
      DocumentBuilder builder = factory.newDocumentBuilder();
      document = builder.parse(sourceFile);
    } catch (ParserConfigurationException pce) {
      throw new IllegalStateException(pce);
    }
   catch (SAXException sae) {
      throw new IOException(sae);
   }

    Element rootElement = document.getDocumentElement();
    rootElement.normalize();

    Queue<Node> nodes = new LinkedList<Node>();
    nodes.add(rootElement);

    while (!nodes.isEmpty()) {
      Node node = nodes.poll();
      if (shouldTranslate(node)) {
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
          nodes.add(children.item(i));
        }
      }
      if (node.getNodeType() == Node.TEXT_NODE) {
        String text = node.getTextContent();
        if (!text.trim().isEmpty()) {
          text = StringsResourceTranslator.translateString(text, language);
          node.setTextContent(' ' + text + ' ');
        }
      }
    }

    Node translateText = document.createTextNode(translationTextTranslated);
    Node paragraph = document.createElement("p");
    paragraph.appendChild(translateText);
    Node body = rootElement.getElementsByTagName("body").item(0);
    body.appendChild(paragraph);

    DOMImplementationRegistry registry;
    try {
      registry = DOMImplementationRegistry.newInstance();
    } catch (ClassNotFoundException e) { 
      throw new IllegalStateException(e);
    } catch (InstantiationException e) {
      throw new IllegalStateException(e);    
    } catch (IllegalAccessException e) {
      throw new IllegalStateException(e);  
    }

    DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
    LSSerializer writer = impl.createLSSerializer();
    String fileAsString = writer.writeToString(document);
    // Replace default XML header with HTML DOCTYPE
    fileAsString = fileAsString.replaceAll("<\\?xml[^>]+>", "<!DOCTYPE HTML>");
    writer.writeToURI(document, language);
    // Files.write(destFile, Collections.singleton(fileAsString), Charset.forName("UTF_8"));
  }

  private static boolean shouldTranslate(Node node) {
    // Ignore "notranslate" nodes
    NamedNodeMap attributes = node.getAttributes();
    if (attributes != null) {
      Node classAttribute = attributes.getNamedItem("class");
      if (classAttribute != null) {
        String textContent = classAttribute.getTextContent();
        if (textContent != null && textContent.contains("notranslate")) {
          return false;
        }
      }
    }
    String nodeName = node.getNodeName();
    if ("script".equalsIgnoreCase(nodeName)) {
      return false;
    }
    // Ignore non-text snippets
    String textContent = node.getTextContent();
    if (textContent != null) {
      for (int i = 0; i < textContent.length(); i++) {
        if (Character.isLetter(textContent.charAt(i))) {
          return true;
        }
      }
    }
    return false;
  }

}
