/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
import java.io.File;
import java.io.IOException;

import javax.print.PrintException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class PdfPageablePrinterHandler extends PrinterHandler {

	public PdfPageablePrinterHandler(String printerName) {
		super(printerName);
	}

	/** Prints a PDF using apache pdfbox */
	@Override
	public void print(File file) throws PrinterException, PrintException, IOException {

		checkPrinter();

		if (file!=null) try{

			PDDocument document=PDDocument.load(file);

			try{PrinterJob job=PrinterJob.getPrinterJob();
				job.setPrintService(service);
				job.setJobName(file.getName());
				job.setPageable(new PDFPageable(document));
				job.print();

			}catch(PrinterAbortException e){
				 //avoid abort exception
			}catch(PrinterException e){
				e.printStackTrace();
				throw new PrintException("Error while printing", e);
			}finally{
				document.close();
			}

		}catch(IOException e){
			throw new IOException("Error loading file "+file, e);
		}

	}

}