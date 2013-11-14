/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Sergio Gomes (s.miguelgomes@hotmail.com)
 *******************************************************************************/
package org.dma.java.utils.pdf;

import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.lowagie.text.pdf.PdfCopyFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfSignatureAppearance;
import com.lowagie.text.pdf.PdfStamper;

public class PdfUtils {

	/**
	 * <a href=http://itextpdf.sourceforge.net/howtosign.html>
	 * How to sign a PDF using iText</a>
	 */
	public static void sign(String filename, KeyStore keyStore, String password,
			String reason, String location, String contact) throws Exception {

		File infile=new File(filename);
		File outfile=new File(filename+".tmp");
		FileInputStream fis=new FileInputStream(infile);

		String alias=keyStore.aliases().nextElement();
		PrivateKey privateKey=(PrivateKey)keyStore.getKey(alias, password.toCharArray());

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


	/**
	 * Prints a PDF using apache pdfbox
	 */
	public static void print(String filename, PrinterJob job, boolean silent) throws Exception {

		job.setJobName(filename);

		PDDocument doc;
		try{
			doc=PDDocument.load(filename);

		}catch(IOException e){
			throw new Exception("Error reading file "+filename);
		}

		try{
			if (silent){
				doc.silentPrint(job);
			}else{
				doc.print(job);
			}

		}catch(PrinterAbortException e){ //avoid abort exception
		}catch(PrinterException e){
			throw new Exception("Error while printing");
		}finally{
			try{
				doc.close();
			}catch (IOException e){}
		}

	}


}
