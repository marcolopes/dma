/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfCopy;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.RandomAccessFileOrArray;

import org.dma.java.security.PdfSignature;
import org.dma.java.time.Chronograph;

/**
 * https://kb.itextpdf.com/home/it5kb/faq/can-itext-2-1-7-itextsharp-4-1-6-or-earlier-be-used-commercially
 */
public class PdfFile extends CustomFile {

	/** @see CustomFile#CustomFile(File, String...) */
	public PdfFile(File path, String...more) {
		super(path, more);
	}

	/** @see CustomFile#CustomFile(String, String...) */
	public PdfFile(String pathname, String...more) {
		super(pathname, more);
	}

	public PdfFile(File file) {
		super(file);
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

		stamp(signature);

	}


	/**
	 * <a href=http://itextpdf.sourceforge.net/howtosign.html>
	 * How to sign a PDF using iText</a>
	 */
	public void stamp(PdfSignature signature) throws DocumentException, IOException {

		CustomFile output=new CustomFile(this+".tmp");

		//only parts of the pdf are read as needed
		PdfReader reader=new PdfReader(new RandomAccessFileOrArray(getAbsolutePath(), false, true), null);
		//PdfReader reader=new PdfReader(getAbsolutePath());
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
		try{
			//only parts of the pdf are read as needed
			PdfReader reader=new PdfReader(new RandomAccessFileOrArray(getAbsolutePath(), false, true), null);
			//PdfReader reader=new PdfReader(getAbsolutePath());
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


	/** Parameterized file will be used as OUTPUT */
	public void merge(Collection<File> files) throws DocumentException, IOException {

		if (files.isEmpty()) return;

		FileOutputStream out=asOutputStream();
		try{
			Document document=new Document();
			PdfCopy copy=new PdfCopy(document, out);
			document.open();
			for(File file: files){
				System.out.println(file);
				//only parts of the pdf are read as needed
				//PdfReader reader=new PdfReader(new RandomAccessFileOrArray(file.getAbsolutePath(), false, true), null);
				PdfReader reader=new PdfReader(file.getAbsolutePath());
				for(int pageNumber=0; pageNumber<reader.getNumberOfPages();){
					copy.addPage(copy.getImportedPage(reader, ++pageNumber));
				}copy.freeReader(reader);
				reader.close();
			}document.close();
			copy.close();
		}finally{
			out.close();
		}

	}


	public static void main(String[] argvs) throws Exception {

		CustomFile source=new CustomFile(Folder.temporary(), "source.pdf");
		PdfFile output=new PdfFile(Folder.temporary(), "output.pdf");

		Chronograph time=new Chronograph().start();
		File[] other=new File[5];
		for(int i=0; i<other.length; i++){
			CustomFile file=new CustomFile(Folder.temporary(), "other"+i+".pdf");
			if (!file.exists()){
				System.out.println(file);
				source.copyTo(file);
			}other[i]=file;
		}System.out.println("COPY time="+time);

		time.reset();
		output.merge(new ArrayList());
		output.merge(Arrays.asList(other));
		System.out.println("MERGE time="+time);

		time.reset();
		output.addScript("script");
		System.out.println("ADD SCRIPT time="+time);

		time.reset();
		try{output.stamp(null);
		}catch(NullPointerException e){
		}System.out.println("STAMP time="+time);

	}

}