/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Sergio Gomes (s.miguelgomes@hotmail.com)
 *******************************************************************************/
package org.dma.utils.itext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.dma.utils.java.file.FileParameters;
import org.dma.utils.java.file.FileUtils;

import com.itextpdf.text.pdf.PdfCopyFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class PdfUtils {

	public static boolean merge(List<String> filesList, String filename){

		try {
			PdfCopyFields PdfFile = new PdfCopyFields(new FileOutputStream(filename));

			for(int i=0; i<filesList.size(); i++){
				PdfReader reader = new PdfReader(filesList.get(i));
				PdfFile.addDocument(reader);
			}

			PdfFile.close();

			return true;

		} catch (Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public static boolean addJavaScript(String filename, String script){

		try {
			String outfile=FileUtils.createTempFile(new FileParameters("script", "pdf"));

			PdfStamper pdfStamper=new PdfStamper(
				new PdfReader(new FileInputStream(filename)),
				new FileOutputStream(outfile));

			pdfStamper.addJavaScript(script);
			pdfStamper.close();

			FileUtils.copyFile(outfile,filename);
			FileUtils.deleteFile(outfile);

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}


}
