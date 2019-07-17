/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import org.dma.java.util.Debug;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorManager {

	public static final Display DISPLAY = Display.getDefault();

	public static final ColorRegistry REGISTRY = new ColorRegistry(DISPLAY);

	/*
	 * Colors
	 */
	public static final Color COLOR_WHITE = getColor(SWT.COLOR_WHITE);
	public static final Color COLOR_BLACK = getColor(SWT.COLOR_BLACK);
	public static final Color COLOR_RED = getColor(SWT.COLOR_RED);
	public static final Color COLOR_DARK_RED = getColor(SWT.COLOR_DARK_RED);
	public static final Color COLOR_GREEN = getColor(SWT.COLOR_GREEN);
	public static final Color COLOR_DARK_GREEN = getColor(SWT.COLOR_DARK_GREEN);
	public static final Color COLOR_YELLOW = getColor(SWT.COLOR_YELLOW);
	public static final Color COLOR_DARK_YELLOW = getColor(SWT.COLOR_DARK_YELLOW);
	public static final Color COLOR_BLUE = getColor(SWT.COLOR_BLUE);
	public static final Color COLOR_DARK_BLUE = getColor(SWT.COLOR_DARK_BLUE);
	public static final Color COLOR_MAGENTA = getColor(SWT.COLOR_MAGENTA);
	public static final Color COLOR_DARK_MAGENTA = getColor(SWT.COLOR_DARK_MAGENTA);
	public static final Color COLOR_CYAN = getColor(SWT.COLOR_CYAN);
	public static final Color COLOR_DARK_CYAN = getColor(SWT.COLOR_DARK_CYAN);
	public static final Color COLOR_GRAY = getColor(SWT.COLOR_GRAY);
	public static final Color COLOR_DARK_GRAY = getColor(SWT.COLOR_DARK_GRAY);
	public static final Color COLOR_LIGHT_GRAY = getColor(245, 245, 245);
	public static final Color COLOR_ORANGE = getColor(255, 127, 0);

	/** Returns the {@link Color} key based on color-RGB hash */
	public static String getKey(RGB rgb) {
		return "RGB:"+String.valueOf(rgb.hashCode());
	}


	/**
	 * Returns the CACHED {@link Color}
	 * or a new one if not CACHED or is DISPOSED.
	 */
	public static Color getColor(RGB rgb) {
		String key=getKey(rgb);
		Color color=REGISTRY.get(key);
		if (color==null) {
			color=new Color(DISPLAY, rgb);
			REGISTRY.put(key, rgb);
		}
		return color;
	}


	/**
	 * Returns the CACHED {@link Color}
	 * or a new one if not CACHED or is DISPOSED.
	 */
	public static Color getColor(int r, int g, int b) {
		return getColor(new RGB(r, g, b));
	}


	/**
	 * Returns the system {@link Color} matching the specific ID.
	 */
	public static Color getColor(int systemColorID) {
		return DISPLAY.getSystemColor(systemColorID);
	}


	/**
	 * Creates an awt color instance to match the rgb values
	 * of the specified swt color.
	 *
	 * @param color The swt color to match.
	 * @return an awt color abject.
	 */
	public static java.awt.Color toAWTColor(Color color) {
		return new java.awt.Color(color.getRed(), color.getGreen(),
				color.getBlue());
	}


	/**
	 * Creates a swt color instance to match the rgb values
	 * of the specified awt paint. For now, this method test
	 * if the paint is a color and then return the adequate
	 * swt color. Otherwise plain black is assumed.
	 *
	 * @param device The swt device to draw on (display or gc device).
	 * @param paint The awt color to match.
	 * @return a swt color object.
	 */
	public static Color toSWTColor(Device device, java.awt.Paint paint) {
		java.awt.Color color;
		if (paint instanceof java.awt.Color) {
			color = (java.awt.Color) paint;
		}else try{
			throw new Exception("only color is supported at present... "
					+ "setting paint to uniform black color");
		}catch (Exception e) {
			Debug.err(e);
			color = new java.awt.Color(0, 0, 0);
		}
		return new org.eclipse.swt.graphics.Color(device,
				color.getRed(), color.getGreen(), color.getBlue());
	}


	/**
	 * Creates a swt color instance to match the rgb values
	 * of the specified awt color. alpha channel is not supported.
	 * Note that the dispose method will need to be called on the
	 * returned object.
	 *
	 * @param device The swt device to draw on (display or gc device).
	 * @param color The awt color to match.
	 * @return a swt color object.
	 */
	public static Color toSWTColor(Device device, java.awt.Color color) {
		return new org.eclipse.swt.graphics.Color(device,
				color.getRed(), color.getGreen(), color.getBlue());
	}


}