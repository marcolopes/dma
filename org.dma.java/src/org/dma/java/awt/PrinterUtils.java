/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.awt;

import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

import org.apache.pdfbox.pdmodel.PDDocument;

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

			for(int i=0; i<ps.length; i++) {
				if(ps[i].getName().indexOf(printerName)>=0) return ps[i];
			}

		}catch(Exception e){}

		return null;

	}


	public static PrinterJob createPrinterJob(PrintService ps) throws PrinterException {

		PrinterJob job=PrinterJob.getPrinterJob();
		job.setPrintService(ps);
		return job;

	}


	public static PrinterJob createPrinterJob(String printerName) throws PrinterException {

		PrintService ps=lookupPrintService(printerName);

		try{
			return createPrinterJob(ps);

		}catch(PrinterException e){
			throw new PrinterException("Invalid printer "+printerName);
		}

	}


	/** Prints a PDF using apache pdfbox */
	public static boolean printPdf(File file, PrinterJob job) throws PrinterException, IOException {

		job.setJobName(file.getName());

		try{
			PDDocument doc=PDDocument.load(file);

			try{
				doc.silentPrint(job);
				/*
				PDFPrinter printer=new PDFPrinter(doc, Scaling.ACTUAL_SIZE, Orientation.AUTO);
				job.setPageable(printer.getPageable());
				job.print();
				*/

				return true;

			}catch(PrinterAbortException e){ //avoid abort exception
			}catch(PrinterException e){
				throw new PrinterException("Error while printing");
			}finally{
				doc.close();
			}

		}catch(IOException e){
			throw new IOException("Error reading file "+file);
		}

		return false;

	}


	/** Prints a PDF using apache pdfbox
	 * @throws IOException
	 * @throws PrinterException */
	public static boolean printPdf(File file, String printerName) throws PrinterException, IOException {

		return printPdf(file, createPrinterJob(printerName));

	}


	/** Prints STREAM DATA using java print
	 * @throws PrintException */
	public static boolean print(InputStream is, PrintService ps) throws PrintException {

		DocPrintJob job=ps.createPrintJob();
		Doc document=new SimpleDoc(is, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
		job.print(document, null);

		return true;

	}


	/** Prints RAW DATA using java print
	 * @throws PrintException */
	public static boolean print(byte[] data, PrintService ps) throws PrintException {

		return print(new ByteArrayInputStream(data), ps);

	}


	/** Prints RAW DATA using java print
	 * @throws PrintException */
	public static boolean print(byte[] data, String printerName) throws PrintException {

		return print(data, lookupPrintService(printerName));

	}


	/** Prints RAW DATA using java print (DEFAULT print service)
	 * @throws PrintException */
	public static boolean print(byte[] data) throws PrintException {

		return print(data, lookupDefaultPrintService());

	}


	/** Prints FILE DATA using java print */
	public static boolean print(File file, PrintService ps) throws PrintException, IOException {

		FileInputStream fis=new FileInputStream(file);

		try{
			return print(fis, ps);

		}finally{
			fis.close();
		}

	}


	/** Prints FILE DATA using java print
	 * @throws IOException
	 * @throws PrintException */
	public static boolean print(File file, String printerName) throws PrintException, IOException {

		return print(file, lookupPrintService(printerName));

	}


	/** Prints FILE DATA using java print
	 * @throws IOException
	 * @throws PrintException */
	public static boolean print(File file) throws PrintException, IOException {

		return print(file, lookupDefaultPrintService());

	}


}