/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.itext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.GregorianCalendar;
import java.util.List;

import com.lowagie.text.pdf.PdfCopyFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfSignatureAppearance;
import com.lowagie.text.pdf.PdfStamper;

public class PdfUtils {

	/**
	 * <a href=http://itextpdf.sourceforge.net/howtosign.html>
	 * How to sign a PDF using iText</a>
	 */
	public static void sign(String filename, KeyStore keyStore, String keyPassword,
			String reason, String location, String contact) throws Exception {

		File infile=new File(filename);
		File outfile=new File(filename+".tmp");
		FileInputStream fis=new FileInputStream(infile);

		String alias=keyStore.aliases().nextElement();
		PrivateKey privateKey=(PrivateKey)keyStore.getKey(alias, keyPassword.toCharArray());

		PdfStamper stamper=PdfStamper.createSignature(
				new PdfReader(fis),
				new FileOutputStream(outfile), '\0');

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
		infile.delete();
		outfile.renameTo(infile);

	}


	public static void addScript(String filename, String script) throws Exception {

		File infile=new File(filename);
		File outfile=new File(filename+".tmp");
		FileInputStream fis=new FileInputStream(infile);

		PdfStamper stamper=new PdfStamper(
				new PdfReader(fis),
				new FileOutputStream(outfile));

		stamper.addJavaScript(script);

		stamper.close();
		fis.close(); //PdfReader does not close stream
		infile.delete();
		outfile.renameTo(infile);

	}


	public static void merge(List<String> fileList, String filename) throws Exception {

		PdfCopyFields copy=new PdfCopyFields(new FileOutputStream(filename));

		for(int i=0; i<fileList.size(); i++){
			PdfReader reader=new PdfReader(fileList.get(i));
			copy.addDocument(reader);
		}

		copy.close();

	}


}
