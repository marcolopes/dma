/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Henry Proudhon and Contributors (henry.proudhon AT insa-lyon.fr)
 * Object Refinery Limited and Contributors.
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

public class FontManager {

	public static final Display DISPLAY = Display.getDefault();

	public static final FontRegistry REGISTRY = new FontRegistry(DISPLAY);

	/*
	 * Fonts
	 */
	public static final Font SYSTEM_FONT = DISPLAY.getSystemFont();
	public static final Font TEXT_FONT = JFaceResources.getTextFont();

	public static final String SYSTEM_FONT_NAME = SYSTEM_FONT.getFontData()[0].getName();
	public static final Font SYSTEM_FONT_BOLD = REGISTRY.getBold(SYSTEM_FONT_NAME);
	public static final Font SYSTEM_FONT_ITALIC = REGISTRY.getItalic(SYSTEM_FONT_NAME);

	/*
	 * Chars
	 */
	public static final int AVERAGE_CHAR_WIDTH = getAverageCharWidth();
	public static final int AVERAGE_CHAR_HEIGHT = getAverageCharHeight();
	public static final int AVERAGE_ITEM_HEIGHT = new Table(new Shell(), SWT.NONE).getItemHeight();

	private static int getAverageCharWidth() {
		GC gc=new GC(new Shell(), SWT.NONE);
		int width=gc.getFontMetrics().getAverageCharWidth();
		gc.dispose(); //necessario em MAC
		return width;
	}

	private static int getAverageCharHeight() {
		GC gc=new GC(new Shell(), SWT.NONE);
		int height=gc.getFontMetrics().getAscent();
		gc.dispose(); //necessario em MAC
		return height;
	}


	/**
	 * Returns the CACHED {@link Font}
	 */
	public static Font getFont(String symbolicName) {
		try{
			return REGISTRY.get(symbolicName);
		}catch(Exception e){
			e.printStackTrace();
		}return null;
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
		switch(font.getStyle()){
			case java.awt.Font.PLAIN: style |= SWT.NORMAL; break;
			case java.awt.Font.BOLD: style |= SWT.BOLD; break;
			case java.awt.Font.ITALIC: style |= SWT.ITALIC; break;
			case java.awt.Font.ITALIC + java.awt.Font.BOLD: style |= SWT.ITALIC | SWT.BOLD; break;
		}//convert the font size (in pt for awt) to height in pixels for swt
		int height=(int) Math.round(font.getSize() * 72.0 / device.getDPI().y);
		return new FontData(font.getFamily(), height, style);
	}


	public static int toAWTStyle(int swtStyle) {
		switch(swtStyle){
			case SWT.NORMAL: return java.awt.Font.PLAIN;
			case SWT.ITALIC: return  java.awt.Font.ITALIC;
			case SWT.BOLD: return java.awt.Font.BOLD;
		}return java.awt.Font.PLAIN;
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
		int style=toAWTStyle(fontData.getStyle());
		int height=(int)Math.round(fontData.height * device.getDPI().y / 72.0);
		return new java.awt.Font(fontData.getName(), style, height);
	}


}
