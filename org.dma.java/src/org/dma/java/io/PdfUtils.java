/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Sergio Gomes (s.miguelgomes@hotmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.GregorianCalendar;

import com.lowagie.text.pdf.PdfCopyFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfSignatureAppearance;
import com.lowagie.text.pdf.PdfStamper;

public class PdfUtils {

	/**
	 * <a href=http://itextpdf.sourceforge.net/howtosign.html>
	 * How to sign a PDF using iText</a>
	 */
	public static void sign(File file, KeyStore keyStore, String password,
			String reason, String location, String contact) throws Exception {

		FileInputStream fis=new FileInputStream(file);
		File output=new File(file+".tmp");

		String alias=keyStore.aliases().nextElement();
		PrivateKey privateKey=(PrivateKey)keyStore.getKey(alias, password.toCharArray());

		PdfStamper stamper=PdfStamper.createSignature(
				new PdfReader(fis),
				new FileOutputStream(output),
				'\0'); // keep pdf version

		PdfSignatureAppearance signature=stamper.getSignatureAppearance();
		signature.setCrypto(privateKey,
				keyStore.getCertificateChain(alias),
				null, PdfSignatureAppearance.WINCER_SIGNED);

		signature.setSignDate(new GregorianCalendar());
		signature.setReason(reason);
		signature.setLocation(location);
		signature.setContact(contact);
		//comment next line to have an invisible signature
		//signature.setVisibleSignature(new Rectangle(100, 100, 200, 200), 1, null);

		stamper.close();
		fis.close(); //PdfReader does not close stream
		file.delete();
		output.renameTo(file);

	}


	public static void addScript(File file, String script) throws Exception {

		FileInputStream fis=new FileInputStream(file);
		File output=new File(file+".tmp");

		PdfStamper stamper=new PdfStamper(
				new PdfReader(fis),
				new FileOutputStream(output));

		stamper.addJavaScript(script);

		stamper.close();
		fis.close(); //PdfReader does not close stream
		file.delete();
		output.renameTo(file);

	}


	public static void merge(Collection<File> files, File output) throws Exception {

		PdfCopyFields copy=new PdfCopyFields(new FileOutputStream(output));

		for(File file: files){
			PdfReader reader=new PdfReader(file.getAbsolutePath());
			copy.addDocument(reader);
		}

		copy.close();

	}


}
