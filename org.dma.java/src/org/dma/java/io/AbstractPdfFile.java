/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.PrivateKey;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

import org.dma.java.security.PdfSignature;

/**
 * https://kb.itextpdf.com/home/it5kb/faq/can-itext-2-1-7-itextsharp-4-1-6-or-earlier-be-used-commercially
 * <br>
 * https://itextpdf.com/en/blog/itext-news-technical-notes/announcing-deprecation-support-java-7
 * <br>
 * https://stackoverflow.com/questions/12596643/itext-multiple-signatures
 */
public abstract class AbstractPdfFile extends ByteFile {

	/** Creates a new PDF reader */
	public abstract PdfReader getPdfReader(byte[] ownerPassword) throws IOException;

	/** @see ByteFile#ByteFile(File, String...) */
	public AbstractPdfFile(File file, String...more) {
		super(file, more);
	}

	/** @see ByteFile#ByteFile(String, String...) */
	public AbstractPdfFile(String pathname, String...more) {
		super(pathname, more);
	}

	/** @see ByteFile#ByteFile(File) */
	public AbstractPdfFile(File file) {
		super(file);
	}


	@Deprecated
	public void sign(KeyStore keyStore, String password, String reason, String location, String contact) throws Exception {

		String alias=keyStore.aliases().nextElement();
		PrivateKey privateKey=(PrivateKey)keyStore.getKey(alias, password.toCharArray());

		PdfSignature signature=new PdfSignature(privateKey, keyStore.getCertificateChain(alias));
		signature.setReason(reason);
		signature.setLocation(location);
		signature.setContact(contact);

		stamp(signature);

	}


	/**
	 * <a href=http://itextpdf.sourceforge.net/howtosign.html>
	 * How to sign a PDF using iText</a>
	 */
	public void stamp(PdfSignature signature) throws Exception {

		CustomFile output=new CustomFile(this+".tmp");

		PdfReader reader=getPdfReader(null);
		PdfStamper stamper=PdfStamper.createSignature(reader,
			null, //keep output file
			'\0', //keep pdf version
			output, //process directly on file
			true); //allow multiple signatures
		signature.stampWith(stamper);
		stamper.close(); //apply signature
		reader.close();

		delete();
		output.renameTo(this);

	}


	public void addScript(String script) throws DocumentException, IOException {

		CustomFile output=new CustomFile(this+".tmp");

		FileOutputStream out=output.asOutputStream();
		try{PdfReader reader=getPdfReader(null);
			PdfStamper stamper=new PdfStamper(reader, out);
			stamper.addJavaScript(script);
			stamper.close();
			reader.close();
		}finally{
			out.close();
		}

		delete();
		output.renameTo(this);

	}


}