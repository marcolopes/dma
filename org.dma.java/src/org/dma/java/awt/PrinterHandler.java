/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

import org.apache.pdfbox.pdmodel.PDDocument;

import org.dma.java.util.Debug;

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
		Debug.err("service", service);
		if (service==null) throw new PrinterException("Invalid printer "+printerName);
	}


	/** Prints RAW DATA using java print */
	public void print(byte[] data) throws PrinterException, PrintException, IOException {

		checkPrinter();

		if (data!=null) try{

			ByteArrayInputStream in=new ByteArrayInputStream(data);

			try{DocPrintJob job=service.createPrintJob();
				Doc document=new SimpleDoc(in, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
				job.print(document, null);

			}catch(PrintException e){
				throw new PrintException("Error while printing");
			}finally{
				in.close();
			}

		}catch(IOException e){
			throw new IOException("Error loading data");
		}

	}


	/** Prints FILE DATA using java print */
	public void print(File file) throws PrinterException, PrintException, IOException {

		checkPrinter();

		if (file!=null) try{

			FileInputStream in=new FileInputStream(file);

			try{DocPrintJob job=service.createPrintJob();
				Doc document=new SimpleDoc(in, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
				job.print(document, null);

			}catch(PrintException e){
				throw new PrintException("Error while printing");
			}finally{
				in.close();
			}

		}catch(IOException e){
			throw new IOException("Error loading file "+file, e);
		}

	}


	/** Prints a PDF using apache pdfbox */
	public void printPdf(File file) throws PrinterException, PrintException, IOException {

		checkPrinter();

		if (file!=null) try{

			PDDocument doc=PDDocument.load(file);

			try{PrinterJob job=PrinterJob.getPrinterJob();
				job.setPrintService(service);
				job.setJobName(file.getName());
				doc.silentPrint(job);
				/*PDFPrinter printer=new PDFPrinter(doc, Scaling.ACTUAL_SIZE, Orientation.AUTO);
				job.setPageable(printer.getPageable());
				job.print();*/

			}catch(PrinterAbortException e){
				 //avoid abort exception
			}catch(PrinterException e){
				throw new PrintException("Error while printing", e);
			}finally{
				doc.close();
			}

		}catch(IOException e){
			throw new IOException("Error loading file "+file, e);
		}

	}


}