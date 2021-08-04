/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
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

	public static PrintService lookupPrintService(String printerName) {
		for(PrintService ps: PrinterJob.lookupPrintServices()) {
			if (ps.getName().indexOf(printerName)>=0) return ps;
		}return null;
	}

	public static PrintService lookupPrintService() {
		return PrintServiceLookup.lookupDefaultPrintService();
	}


	public static String lookupDefaultPrinterName() {
		PrintService ps=lookupPrintService();
		return ps==null ? "" : ps.getName();
	}

	/** Returns default printer if invalid */
	public static String lookupPrinterName(String printerName) {
		try{new PrinterHandler(printerName).checkPrinter();
		}catch(PrinterException e){
			return lookupDefaultPrinterName();
		}return printerName;
	}

	private final PrintService service;

	private final String printerName;

	public PrinterHandler(String printerName) {
		this.printerName=printerName;
		this.service=lookupPrintService(printerName);
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
	public void print(InputStream in) throws PrinterException, PrintException {

		checkPrinter();

		DocPrintJob job=service.createPrintJob();
		Doc document=new SimpleDoc(in, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
		job.print(document, null);

	}


	/** Prints RAW DATA using java print */
	public void print(byte[] data) throws PrinterException, PrintException {

		print(new ByteArrayInputStream(data));

	}


	/** Prints FILE DATA using java print */
	public void print(File file) throws PrinterException, PrintException {

		if (file!=null) try{

			FileInputStream in=new FileInputStream(file);

			try{
				print(in);

			}finally{
				in.close();
			}

		}catch(IOException e){
			throw new PrintException("Error loading file "+file);
		}

	}


	/** Prints a PDF using apache pdfbox */
	public void printPdf(File file) throws PrinterException, PrintException {

		PrinterJob job=createPrinterJob();

		if (file!=null) try{

			job.setJobName(file.getName());

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
			throw new PrintException("Error loading file "+file);
		}

	}


}