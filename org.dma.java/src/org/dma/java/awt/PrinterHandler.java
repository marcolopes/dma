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

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
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
import org.apache.pdfbox.printing.PDFPageable;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;

import org.dma.java.io.FileParameters;
import org.dma.java.io.Folder;
import org.dma.java.util.Debug;

public class PrinterHandler {

	public static PrintService lookupPrintService(String printerName) {
		for(PrintService ps: PrinterJob.lookupPrintServices()) {
			if (printerName!=null && ps.getName().indexOf(printerName)>=0) return ps;
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
	private final boolean debug;

	public PrinterHandler(String printerName) {
		this(printerName, false);
	}

	public PrinterHandler(String printerName, boolean debug) {
		this.printerName=printerName;
		this.debug=debug;
		this.service=lookupPrintService(printerName);
	}


	public void checkPrinter() throws PrinterException {
		Debug.out("service", service);
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
				throw new PrintException("Error while printing", e);
			}finally{
				in.close();
			}

		}catch(IOException e){
			throw new IOException("Error loading data", e);
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
				throw new PrintException("Error while printing", e);
			}finally{
				in.close();
			}

		}catch(IOException e){
			throw new IOException("Error loading file "+file, e);
		}

	}


	private void save(BufferedImage image, int pageIndex, File pdfFile) {
		RenderedImageHandler handler=new RenderedImageHandler(image);
		File file=new FileParameters(pdfFile.getName().
				concat(pageIndex<0 ? "" : ".page"+pageIndex),
				RenderedImageHandler.IMAGE_PNG, Folder.temporary()).toFile();
		file.deleteOnExit();
		handler.save(file, RenderedImageHandler.IMAGE_PNG);
		System.out.println(file);
	}


	/** Prints a PDF using apache pdfbox */
	public void printPdf(final File file, boolean pageable) throws PrinterException, PrintException, IOException {

		checkPrinter();

		if (file!=null) try{

			final PDDocument document=PDDocument.load(file);

			try{PrinterJob job=PrinterJob.getPrinterJob();
				job.setPrintService(service);
				job.setJobName(file.getName());

				if (pageable) job.setPageable(new PDFPageable(document));
				else{
					// 1. Get the default PageFormat from the OS (usually A4 or Letter)
					PageFormat pf=job.defaultPage();

					// 2. Define the full printable area (zero margins for maximum precision in calculations)
					// This ensures we use every pixel the driver allows
					Paper paper=pf.getPaper();
					paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight());
					pf.setPaper(paper);

					// 3. Render the PDF page once as a high quality image
					// 203 DPI matches most thermal printer native resolutions and avoids scaling artifacts
					final BufferedImage image=new PDFRenderer(document).renderImageWithDPI(0, 203*3, ImageType.BINARY);
					if (debug) save(image, -1, file);

					job.setPrintable(new Printable() {
						@Override
						public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
							Debug.err("pageIndex", pageIndex);

							// 4. Scale the rendered PDF image to the maximum printable width
							// This prevents left/right clipping issues on thermal printer drivers
							double printableWidth=pageFormat.getImageableWidth();
							double scale=printableWidth / image.getWidth();

							// 5. Determine how many source image pixels fit on one physical printed page
							int sourceSliceHeight=(int)(pageFormat.getImageableHeight() / scale);
							int yOffset=pageIndex * sourceSliceHeight;

							if (yOffset<image.getHeight()){// more content to print?
								// 6. Extract only the visible vertical slice for the current printed page
								// This replaces the PDF coordinate translation logic with image slicing
								int imageSliceHeight=Math.min(sourceSliceHeight, image.getHeight()-yOffset);
								BufferedImage slice=image.getSubimage(0, yOffset, image.getWidth(), imageSliceHeight);
								if (debug) save(slice, pageIndex, file);

								// 7. Draw the image slice scaled to the printable page area
								// The printer driver receives a simple bitmap instead of PDF vector graphics
								int x=(int)pageFormat.getImageableX();
								int y=(int)pageFormat.getImageableY();
								int height=(int)(imageSliceHeight * scale);
								Graphics2D g2d=(Graphics2D)graphics;
								g2d.drawImage(slice, x, y, (int)printableWidth, height, null);

								// 8. Insert a control pixel on all pages (except the last)
								// This prevents the printer from auto-trimming trailing blank lines
								if (yOffset + sourceSliceHeight<image.getHeight()){
									g2d.setColor(Color.BLACK);
									g2d.fillRect(x, y+height-1, 1, 1);
								}return PAGE_EXISTS;
							}return NO_SUCH_PAGE;
						}
					}, pf);
				}

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