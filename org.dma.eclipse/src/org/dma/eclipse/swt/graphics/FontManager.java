/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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
		try{return REGISTRY.get(symbolicName);
		}catch(Exception e){
			e.printStackTrace();
		}return null;
	}


	/**
	 * Create a <code>FontData</code> object which encapsulate
	 * the essential data to create a SWT font. The data is taken
	 * from the provided AWT Font.
	 * <p>When the object is no more used, the user must explicitely
	 * call the dispose method on the returned font to free the
	 * operating system resources (the garbage collector won't do it).
	 *
	 * @param device The SWT device to draw on (display or gc device).
	 * @param font The AWT font from which to get the data.
	 * @param ensureSameHeight A boolean used to enforce the same height
	 * (in pixels) between the AWT font and the newly created SWT font.
	 * @return The <code>FontData</code> object.
	 */
	public static FontData toSWTFontData(Device device, java.awt.Font font,	boolean ensureSameHeight) {
		int style=SWT.NORMAL;
		switch(font.getStyle()){
			case java.awt.Font.PLAIN: style |= SWT.NORMAL; break;
			case java.awt.Font.BOLD: style |= SWT.BOLD; break;
			case java.awt.Font.ITALIC: style |= SWT.ITALIC; break;
			case java.awt.Font.ITALIC + java.awt.Font.BOLD: style |= SWT.ITALIC | SWT.BOLD; break;
		}//convert the font size (in pt for AWT) to height in pixels for SWT
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
	 * Create a AWT font by converting as much information
	 * as possible from the provided SWT <code>Font</code>
	 *
	 * @param device The SWT device being drawn on (display or gc device)
	 * @param font The SWT font to convert
	 * @return The AWT font converted from the provided SWT font
	 */
	public static java.awt.Font toAWTFont(Device device, Font font) {
		FontData fontData=font.getFontData()[0];
		int style=toAWTStyle(fontData.getStyle());
		int height=(int)Math.round(fontData.height * device.getDPI().y / 72.0);
		return new java.awt.Font(fontData.getName(), style, height);
	}


}
