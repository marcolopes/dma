/*******************************************************************************
 * 2008-2016 Public Domain
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

public class PrinterHandler {

	public static PrintService lookupDefaultPrintService() {
		return PrintServiceLookup.lookupDefaultPrintService();
	}

	public static String lookupDefaultPrinterName() {
		PrintService ps=lookupDefaultPrintService();
		return ps==null ? "" : ps.getName();
	}

	public static PrintService lookupPrintService(String printerName) {
		PrintService[] ps=PrinterJob.lookupPrintServices();
		for(int i=0; i<ps.length; i++) {
			if(ps[i].getName().indexOf(printerName)>=0) return ps[i];
		}
		return null;
	}

	/** Returns default printer if invalid */
	public static String getPrinterNameOrDefault(String printerName) {
		try{
			new PrinterHandler(printerName).checkPrinter();
			return printerName;
		}
		catch(PrinterException e){}
		return lookupDefaultPrinterName();
	}

	private final PrintService service;

	private final String printerName;

	public PrinterHandler(String printerName) {
		this.printerName=printerName;
		this.service=printerName==null ? null : lookupPrintService(printerName);
	}


	public void checkPrinter() throws PrinterException {
		if (service==null) throw new PrinterException("Invalid printer "+printerName);
	}


	public PrinterJob createPrinterJob() throws PrinterException {

		checkPrinter();
		PrinterJob job=PrinterJob.getPrinterJob();
		job.setPrintService(service);
		return job;

	}


	/** Prints STREAM DATA using java print */
	public void print(InputStream is) throws PrinterException, PrintException {

		checkPrinter();
		DocPrintJob job=service.createPrintJob();
		Doc document=new SimpleDoc(is, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
		job.print(document, null);

	}


	/** Prints RAW DATA using java print */
	public void print(byte[] data) throws PrinterException, PrintException {

		print(new ByteArrayInputStream(data));

	}


	/** Prints FILE DATA using java print */
	public void print(File file) throws PrinterException, PrintException, IOException {

		FileInputStream fis=new FileInputStream(file);

		try{
			print(fis);

		}finally{
			fis.close();
		}

	}


	/** Prints a PDF using apache pdfbox */
	public void printPdf(File file) throws PrinterException, IOException {

		PrinterJob job=createPrinterJob();
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

			}catch(PrinterAbortException e){
				 //avoid abort exception
			}catch(PrinterException e){
				throw new PrinterException("Error while printing");
			}finally{
				doc.close();
			}

		}catch(IOException e){
			throw new IOException("Error reading file "+file);
		}

	}


}