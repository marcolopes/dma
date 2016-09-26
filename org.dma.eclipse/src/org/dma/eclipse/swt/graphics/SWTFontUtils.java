/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Henry Proudhon and Contributors (henry.proudhon AT insa-lyon.fr)
 * Object Refinery Limited and Contributors.
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class SWTFontUtils {

	/**
	 * Creates a new font with the specified height.
	 * The font is automatically disposed when
	 * the associated control is disposed
	 */
	public static Font createFont(Control control, int height){

		FontData[] fontData=control.getFont().getFontData();

		for(int i=0; i<fontData.length; ++i)
			fontData[i].setHeight(height);

		final Font font=new Font(Display.getDefault(), fontData);

		// Since you created the font, you must dispose it
		control.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				font.dispose();
			}
		});

		return font;

	}


	/**
	 * Create a <code>FontData</code> object which encapsulate
	 * the essential data to create a swt font. The data is taken
	 * from the provided awt Font.
	 * <p>When the object is no more used, the user must explicitely
	 * call the dispose method on the returned font to free the
	 * operating system resources (the garbage collector won't do it).
	 *
	 * @param device The swt device to draw on (display or gc device).
	 * @param font The awt font from which to get the data.
	 * @param ensureSameHeight A boolean used to enforce the same height
	 * (in pixels) between the awt font and the newly created swt font.
	 * @return a <code>FontData</code> object.
	 */
	public static FontData toSWTFontData(Device device, java.awt.Font font,	boolean ensureSameHeight) {
		int style=SWT.NORMAL;
		switch (font.getStyle()) {
			case java.awt.Font.PLAIN:
				style |= SWT.NORMAL;
				break;
			case java.awt.Font.BOLD:
				style |= SWT.BOLD;
				break;
			case java.awt.Font.ITALIC:
				style |= SWT.ITALIC;
				break;
			case (java.awt.Font.ITALIC + java.awt.Font.BOLD):
				style |= SWT.ITALIC | SWT.BOLD;
				break;
		}
		// convert the font size (in pt for awt) to height in pixels for swt
		int height=(int) Math.round(font.getSize() * 72.0 / device.getDPI().y);
		return new FontData(font.getFamily(), height, style);
	}



	/**
	 * Create an awt font by converting as much information
	 * as possible from the provided swt <code>Font</code>.
	 *
	 * @param device The swt device being drawn on (display or gc device).
	 * @param font The swt font to convert.
	 * @return An awt font converted from the provided swt font.
	 */
	public static java.awt.Font toAWTFont(Device device, Font font) {
		FontData fontData=font.getFontData()[0];
		int style;
		switch (fontData.getStyle()) {
			case SWT.NORMAL:
				style=java.awt.Font.PLAIN;
				break;
			case SWT.ITALIC:
				style=java.awt.Font.ITALIC;
				break;
			case SWT.BOLD:
				style=java.awt.Font.BOLD;
				break;
			default:
				style=java.awt.Font.PLAIN;
				break;
		}
		int height=(int) Math.round(fontData.height * device.getDPI().y / 72.0);
		return new java.awt.Font(fontData.getName(), style, height);
	}


}
