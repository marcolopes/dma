/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.awt;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class PrinterUtils {


	public static PrintService lookupDefaultPrintService() {

		return PrintServiceLookup.lookupDefaultPrintService();

	}


	public static String lookupDefaultPrintServiceName() {

		PrintService ps=lookupDefaultPrintService();
		return ps==null ? "" : ps.getName();

	}


	public static PrintService lookupPrintService(String printerName) {

		try{
			PrintService[] ps = PrinterJob.lookupPrintServices();
			for (int i=0; i<ps.length; i++) {
				if (ps[i].getName().indexOf(printerName) >= 0) {
					return ps[i];
				}
			}

		}catch(Exception e){}

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

		return createPrinterJob(lookupPrintService(printerName));

	}


	/** Prints STREAM DATA using java print */
	public static void print(InputStream is, PrintService ps) throws PrintException {

		DocPrintJob job = ps.createPrintJob();
		Doc document = new SimpleDoc(is, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
		job.print(document, null);

	}


	/** Prints RAW DATA using java print */
	public static void print(byte[] data, PrintService ps) throws PrintException {

		print(new ByteArrayInputStream(data), ps);

	}


	/** Prints RAW DATA using java print */
	public static void print(byte[] data, String printerName) throws PrintException {

		print(data, lookupPrintService(printerName));

	}


	/** Prints RAW DATA using java print (DEFAULT print service) */
	public static void print(byte[] data) throws PrintException {

		print(data, lookupDefaultPrintService());

	}


	/** Prints FILE DATA using java print */
	public static void print(File file, PrintService ps) throws FileNotFoundException, PrintException {

		print(new FileInputStream(file), ps);

	}


	/** Prints FILE DATA using java print */
	public static void print(File file, String printerName) throws FileNotFoundException, PrintException {

		print(file, lookupPrintService(printerName));

	}


	/** Prints FILE DATA using java print */
	public static void print(File file) throws FileNotFoundException, PrintException {

		print(file, lookupDefaultPrintService());

	}


}