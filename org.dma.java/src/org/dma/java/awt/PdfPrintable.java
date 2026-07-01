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
import java.awt.print.Printable;

public class PdfPrintable extends PdfImageHandler implements Printable {

	public PdfPrintable(BufferedImage image) {
		super(image);
	}

	public int getImageHeight() {return image.getHeight();}

	public BufferedImage getSubimage(int yOffset, int imageSliceHeight, int pageIndex) {
		return image.getSubimage(0, yOffset, image.getWidth(), imageSliceHeight);
	}

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
		// Scale the rendered PDF image to the maximum printable width
		// This prevents left/right clipping issues on thermal printer drivers
		double printableWidth=pageFormat.getImageableWidth();
		double scale=printableWidth / image.getWidth();

		// Determine how many source image pixels fit on one physical printed page
		int sourceSliceHeight=(int)(pageFormat.getImageableHeight() / scale);
		int yOffset=pageIndex * sourceSliceHeight;

		if (yOffset<getImageHeight()){// more content to print?
			// Extract only the visible vertical slice for the current printed page
			// This replaces the PDF coordinate translation logic with image slicing
			int imageSliceHeight=Math.min(sourceSliceHeight, getImageHeight()-yOffset);
			BufferedImage slice=getSubimage(yOffset, imageSliceHeight, pageIndex);

			// Draw the image slice scaled to the printable page area
			// The printer driver receives a simple bitmap instead of PDF vector graphics
			int x=(int)pageFormat.getImageableX();
			int y=(int)pageFormat.getImageableY();
			int height=(int)(imageSliceHeight * scale);
			Graphics2D g2d=(Graphics2D)graphics;
			g2d.drawImage(slice, x, y, (int)printableWidth, height, null);

			// Insert a control pixel on all pages (except the last)
			// This prevents the printer from auto-trimming trailing blank lines
			if (yOffset + sourceSliceHeight<getImageHeight()){
				g2d.setColor(Color.BLACK);
				g2d.fillRect(x, y+height-1, 1, 1);
			}return PAGE_EXISTS;
		}return NO_SUCH_PAGE;
	}

}