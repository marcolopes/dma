/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

import org.apache.pdfbox.pdmodel.PDDocument;

public class PrinterUtils {


	public static PrintService getDefaultPrintService() {

		return PrintServiceLookup.lookupDefaultPrintService();

	}


	public static String getDefaultPrintServiceName() {

		PrintService ps=getDefaultPrintService();
		return ps==null ? "" : ps.getName();

	}


	public static PrintService getPrintService(String printerName) {

		try{
			PrintService[] ps = PrinterJob.lookupPrintServices();
			for (int i=0; i<ps.length; i++) {
				if (ps[i].getName().indexOf(printerName) >= 0) {
					return ps[i];
				}
			}

		}catch(Exception e){
		}

		return null;

	}


	public static PrinterJob createPrinterJob(PrintService ps) throws Exception {

		PrinterJob job=PrinterJob.getPrinterJob();

		try{
			job.setPrintService(ps);

		}catch(PrinterException e){
			throw new Exception("Invalid printer");
		}

		return job;

	}


	public static PrinterJob createPrinterJob(String printerName) throws Exception {

		return createPrinterJob(getPrintService(printerName));

	}


	/**
	 * Prints a PDF using apache pdfbox
	 */
	public static void printPdf(String filename, PrinterJob job, boolean silent) throws Exception {

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


	/**
	 * Prints a BYTE ARRAY using java print
	 */
	public static void printData(byte[] data, PrintService ps) throws Exception {

		DocPrintJob job=ps.createPrintJob();
		Doc doc=new SimpleDoc(data, DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
		job.print(doc, null);

	}


	/**
	 * Prints a BYTE ARRAY using java print
	 * Assumes the DEFAULT print service.
	 */
	public static void printData(byte[] data) throws Exception {

		printData(data, getDefaultPrintService());

	}


}