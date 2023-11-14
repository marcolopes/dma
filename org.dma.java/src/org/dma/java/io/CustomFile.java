/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

import org.dma.java.util.Debug;
import org.dma.java.util.StringList;
import org.dma.java.util.StringUtils;

public class CustomFile extends File {

	/**
	 * Unicode Byte Order Mark<br>
	 * http://unicode.org/faq/utf_bom.html
	 */
	public static final char[] UTF8_BOM_BYTES = new char[]{0xEF,0xBB,0xBF};
	public static final String UTF8_BOM = new String(UTF8_BOM_BYTES);
	public static final String UTF16_BOM = "\ufeff";

	public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;
	public static final Charset UTF16_CHARSET = StandardCharsets.UTF_16;
	public static final Charset ISO_CHARSET = StandardCharsets.ISO_8859_1;
	public static final Charset WIN1252_CHARSET = Charset.forName("Windows-1252");

	public static final int BASE64_LINE_LENGTH = 64;
	public static final int STRING_BUFFER_LENGTH = 4096;

	/** Replace an existing file AND copy attributes */
	public static final CopyOption[] COPY_OPTIONS = new CopyOption[]{
		StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES};

	/** Replace an existing file */
	public static final CopyOption[] MOVE_OPTIONS = new CopyOption[]{
		StandardCopyOption.REPLACE_EXISTING};

	/** Replaces accented and illegal characters */
	public static String normalize(String filename) {
		String plain=StringUtils.unaccent(filename).
				replace('\\','-').replace('/','-').replace('|','-').
				replace(" -","-").replace("- ","-").replace("--","-").
				replace("  "," ").replace(' ','_').replace("__","_");
		return StringUtils.removeAll(plain, '<','>',':','?','*','\"','\n','\r','\t','\f','\0');
	}

	/** Ensures absolute path */
	public CustomFile(File path, String...more) {
		this(path.getPath(), more);
	}

	/** Ensures absolute path */
	public CustomFile(String pathname, String...more) {
		this(Paths.get(pathname, more).toFile());
	}

	/** Ensures absolute path */
	public CustomFile(File path) {
		super(path.getAbsolutePath());
	}


	/**
	 * Generic File Copy<br>
	 * Does not cancel the operation
	 */
	@Deprecated
	public AbstractFileCopy copy() {
		return new AbstractFileCopy(this){
			@Override
			public boolean cancel() {
				return false;
			}
		};
	}


	/**
	 * Copies the file to DESTINATION
	 * @param dst Can be file or directory
	 */
	public boolean copyTo(File dst, CopyOption...options) {
		if (exists()) try{//destination can be a directory!
			File target=dst.isDirectory() ? Paths.get(dst.getPath(), getName()).toFile() : dst;
			Files.copy(toPath(), target.toPath(), options.length==0 ? COPY_OPTIONS : options);
			return true;
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	/**
	 * Moves the file to DESTINATION
	 * @param dst Can be file or directory
	 */
	public boolean moveTo(File dst, CopyOption...options) {
		if (exists()) try{//destination can be a directory!
			File target=dst.isDirectory() ? Paths.get(dst.getPath(), getName()).toFile() : dst;
			Files.move(toPath(), target.toPath(), options.length==0 ? MOVE_OPTIONS : options);
			return true;
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	public boolean renameTo(String pathname) {
		try{return renameTo(new File(pathname));
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	public boolean create() {
		try{return super.createNewFile();
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	@Override
	public boolean delete() {
		try{return super.delete();
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	/** @see Desktop#open(File) */
	public boolean open() throws IOException {
		if (Desktop.isDesktopSupported()){
			Desktop.getDesktop().open(this);
			return true;
		}return false;
	}


	/**
	 * In Windows, use {@link CustomFile#executeWithCmd(String...)}
	 * to avoid CreateProcess error=740
	 * (The requested operation requires elevation)
	 *
	 * @see Command#Command(File, String, List)
	 * @see Process#exitValue()
	 */
	public int execute(String...args) throws IOException {
		return new Command(getParentFile(), toString(), args).start().exitValue();
	}


	/**
	 * https://ss64.com/nt/start.html
	 *
	 * @see WindowsCommand#WindowsCommand(File, String)
	 * @see Process#exitValue()
	 */
	public int executeWithCmd(String...args) throws IOException {
		//START "title" [/D path] [options] "command" [parameters]
		StringList list=new StringList("START", StringUtils.quote(getName()),
				/*path defined by Command WORKING directory parameter
				"/D "+StringUtils.quote(getParent())),*/
				StringUtils.quote(getName()));
		list.addAll(Arrays.asList(args));
		//START "title" "program" parameters
		String command=list.concat(" ");
		Debug.err(command);
		return new WindowsCommand(getParentFile(), command).start().exitValue();
	}


	public FileInputStream asInputStream() throws FileNotFoundException {
		return new FileInputStream(this);
	}


	public FileOutputStream asOutputStream(boolean append) throws FileNotFoundException {
		return new FileOutputStream(this, append);
	}


	public FileOutputStream asOutputStream() throws FileNotFoundException {
		return asOutputStream(false);
	}


	public URL toURL() {
		try{return toURI().toURL();
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	public boolean equals(File file) {
		try{return getCanonicalFile().equals(file.getCanonicalFile());
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	/** @see File#getPath() */
	@Override
	public String toString() {
		return getPath();
	}


	public static void main(String[] args) {

		System.out.println(Folder.current().toString());
		System.out.println(new CustomFile(""));
		System.out.println();
		System.out.println(new CustomFile("C:\\Users\\marcolopes\\Temp"));
		System.out.println(new CustomFile("C:\\Users\\marcolopes", "Temp"));
		System.out.println(new CustomFile("C:\\Users", "marcolopes", "Temp"));
		System.out.println(new CustomFile("C:", "Users", "marcolopes", "Temp"));
		System.out.println();
		System.out.println(new CustomFile("\\Users\\marcolopes\\Temp"));
		System.out.println(new CustomFile("\\Users\\marcolopes", "Temp"));
		System.out.println(new CustomFile("\\Users", "marcolopes", "Temp"));

	}


}
