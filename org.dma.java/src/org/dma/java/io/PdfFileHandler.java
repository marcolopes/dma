/*******************************************************************************
 * 2008-2015 Public Domain
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

public class PdfFileHandler extends FileHandler {

	public PdfFileHandler(String filename) {
		super(filename);
	}

	public PdfFileHandler(File file) {
		super(file);
	}


	/**
	 * <a href=http://itextpdf.sourceforge.net/howtosign.html>
	 * How to sign a PDF using iText</a>
	 */
	public void sign(KeyStore keyStore, String password,
			String reason, String location, String contact) throws Exception {

		FileInputStream fis=new FileInputStream(file);
		File output=new File(file+".tmp");
		FileOutputStream fos=new FileOutputStream(output);

		try{
			String alias=keyStore.aliases().nextElement();
			PrivateKey privateKey=(PrivateKey)keyStore.getKey(alias, password.toCharArray());

			PdfStamper stamper=PdfStamper.createSignature(
					new PdfReader(fis), fos, '\0'); // keep pdf version

			try{
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

			}finally{
				stamper.close();
			}

		}finally{
			fos.close(); //PdfReader does not close stream
			fis.close();
		}

		file.delete();
		output.renameTo(file);

	}


	public void addScript(String script) throws Exception {

		File output=new File(file+".tmp");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream(output);

		try{
			PdfStamper stamper=new PdfStamper(new PdfReader(fis), fos);

			try{
				stamper.addJavaScript(script);

			}finally{
				stamper.close();
			}

		}finally{
			fos.close(); //PdfReader does not close stream
			fis.close();
		}

		file.delete();
		output.renameTo(file);

	}


	/** Parameterized file will be used as OUTPUT */
	public void merge(Collection<File> files) throws Exception {

		FileOutputStream fos=new FileOutputStream(file);

		try{
			PdfCopyFields copy=new PdfCopyFields(fos);

			/*
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
			*/

			for(File file: files) try{

				PdfReader reader=new PdfReader(file.getAbsolutePath());
				try{
					copy.addDocument(reader);

				}finally{
					reader.close();
				}

			}finally{
				copy.close();
			}

		}finally{
			fos.close();
		}

	}


	public void merge2(Collection<File> files) throws Exception {

		FileOutputStream fos=new FileOutputStream(file);

		try{
			PdfCopyFields copy=new PdfCopyFields(fos);

			for(File file: files) try{

				PdfReader reader=new PdfReader(file.getAbsolutePath());
				try{
					copy.addDocument(reader);

				}finally{
					reader.close();
				}

			}finally{
				copy.close();
			}

		}finally{
			fos.close();
		}

	}


}
