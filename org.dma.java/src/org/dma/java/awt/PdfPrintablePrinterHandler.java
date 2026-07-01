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

import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;

import javax.print.PrintException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;

import org.dma.java.util.SystemUtils;

public class PdfPrintablePrinterHandler extends PrinterHandler {

	public PdfPrintablePrinterHandler(String printerName) {
		super(printerName);
	}

	public Printable getPrintable(BufferedImage image) {
		return new PdfPrintable(image);
	}

	/** Prints a PDF using apache pdfbox */
	@Override
	public void print(final File file) throws PrinterException, PrintException, IOException {

		checkPrinter();

		if (file!=null) try{

			PDDocument document=PDDocument.load(file);

			try{PrinterJob job=PrinterJob.getPrinterJob();
				job.setPrintService(service);
				PageFormat pf=job.defaultPage();

				// Define the full printable area (zero margins for maximum precision in calculations)
				// This ensures we use every pixel the driver allows
				Paper paper=pf.getPaper();
				paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight());
				pf.setPaper(paper);

				int numberOfPages=document.getNumberOfPages();
				for(int pageIndex=0; pageIndex<numberOfPages; pageIndex++){
					// Define a unique name to avoid identical job entries for multi-page documents
					// This prevents asynchronous spooling conflicts and job overwrites caused by identical names
					job.setJobName(numberOfPages==1 ? file.getName() : file.getName()+" [copy "+(pageIndex+1)+" of "+numberOfPages+"]");

					// Render the PDF page once as a high quality image
					// 203 DPI matches most thermal printer native resolutions and avoids scaling artifacts
					BufferedImage image=new PDFRenderer(document).renderImageWithDPI(pageIndex, 203*3, SystemUtils.IS_OS_MAC ? ImageType.GRAY : ImageType.BINARY);
					job.setPrintable(getPrintable(image), pf);
					job.print();
				}

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