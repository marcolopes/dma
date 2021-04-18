/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Sergio Gomes (s.miguelgomes@hotmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.util.Collection;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfCopyFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

import org.dma.java.security.PdfSignature;

/**
 * https://kb.itextpdf.com/home/it5kb/faq/can-itext-2-1-7-itextsharp-4-1-6-or-earlier-be-used-commercially
 */
public class PdfFile extends CustomFile {

	public PdfFile(String pathname, String...more) {
		super(pathname, more);
	}

	public PdfFile(File file) {
		super(file);
	}


	/**
	 * <a href=http://itextpdf.sourceforge.net/howtosign.html>
	 * How to sign a PDF using iText</a>
	 */
	public void append(PdfSignature signature) throws DocumentException, IOException {

		CustomFile output=new CustomFile(this+".tmp");

		FileInputStream in=asInputStream();
		FileOutputStream out=output.asOutputStream();

		try{
			PdfStamper stamper=PdfStamper.createSignature(
					new PdfReader(in), out,
					'\0', //keep pdf version
					null, //process in memory
					true); //allow multiple signatures

			signature.stampWith(stamper);

		}finally{
			out.close(); //PdfReader does not close stream
			in.close();
		}

		delete();
		output.renameTo(this);

	}


	@Deprecated
	public void sign(KeyStore keyStore, String password, String reason, String location, String contact)
			throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException, DocumentException, IOException {

		String alias=keyStore.aliases().nextElement();
		PrivateKey privateKey=(PrivateKey)keyStore.getKey(alias, password.toCharArray());

		PdfSignature signature=new PdfSignature(privateKey, keyStore.getCertificateChain(alias));
		signature.setReason(reason);
		signature.setLocation(location);
		signature.setContact(contact);

		append(signature);

	}


	public void addScript(String script) throws DocumentException, IOException {

		CustomFile output=new CustomFile(this+".tmp");

		FileInputStream in=asInputStream();
		FileOutputStream out=output.asOutputStream();

		try{
			PdfStamper stamper=new PdfStamper(new PdfReader(in), out);

			try{
				stamper.addJavaScript(script);

			}finally{
				stamper.close();
			}

		}finally{
			out.close(); //PdfReader does not close stream
			in.close();
		}

		delete();
		output.renameTo(this);

	}


	/** Parameterized file will be used as OUTPUT */
	public void merge(Collection<File> files) throws DocumentException, IOException {

		if (files.size()==0) return;

		FileOutputStream out=asOutputStream();

		try{
			PdfCopyFields copy=new PdfCopyFields(out);

			try{
				for(File file: files){
					PdfReader reader=new PdfReader(file.getAbsolutePath());
					try{
						copy.addDocument(reader);

					}finally{
						reader.close();
					}
				}

			}finally{
				copy.close();
			}

		}finally{
			out.close();
		}

	}


}
