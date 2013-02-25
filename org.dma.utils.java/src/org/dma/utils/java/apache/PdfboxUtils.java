/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache;

import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class PdfboxUtils {

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
			if (silent)
				doc.silentPrint(job);
			else
				doc.print(job);

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