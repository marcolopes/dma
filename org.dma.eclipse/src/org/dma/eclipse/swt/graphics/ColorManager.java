/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.graphics;

import org.dma.java.util.Debug;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorManager {

	/** Returns the {@link Color} key based on color-RGB hash */
	public static String getKey(RGB rgb) {
		return "RGB:"+String.valueOf(rgb.hashCode());
	}

	public interface IColorRegistry {
		/** @see ColorRegistry#get(String) */
		Color get(String symbolicName);
		/** @see ColorRegistry#put(String, RGB) */
		void put(String symbolicName, RGB colorData);
		/** Returns The system {@link Color} matching the specific ID */
		Color getColor(int systemColorID);
		/** Returns The CACHED {@link Color} or a new one if not CACHED */
		Color getColor(int red, int green, int blue);
		/** Returns The CACHED {@link Color} or a new one if not CACHED */
		Color getColor(RGB rgb);
	}

	private static class HeadlessColorRegistry implements IColorRegistry {
		static{Debug.out();}
		@Override
		public Color get(String symbolicName) {return null;}
		@Override
		public void put(String symbolicName, RGB colorData) {}
		@Override
		public Color getColor(int systemColorID) {return null;}
		@Override
		public Color getColor(int red, int green, int blue) {return null;}
		@Override
		public Color getColor(RGB rgb) {return null;}
	}

	public static class CustomColorRegistry extends ColorRegistry implements IColorRegistry {
		static{Debug.out();}
		@Override
		public Color getColor(int systemColorID) {
			return Display.getCurrent().getSystemColor(systemColorID);
		}
		@Override
		public Color getColor(int red, int green, int blue) {
			return getColor(new RGB(red, green, blue));
		}
		@Override
		public Color getColor(RGB rgb) {
			String key=getKey(rgb);
			put(key, rgb);
			return get(key);
		}
	}

	public static final IColorRegistry REGISTRY = Display.getCurrent()==null ? new HeadlessColorRegistry() : new CustomColorRegistry();

	/** @see IColorRegistry#getColor(int) */
	public static Color getColor(int systemColorID) {
		return REGISTRY.getColor(systemColorID);
	}

	/** @see IColorRegistry#getColor(int, int, int) */
	public static Color getColor(int red, int green, int blue) {
		return REGISTRY.getColor(red, green, blue);
	}

	/** @see IColorRegistry#getColor(RGB) */
	public static Color getColor(RGB rgb) {
		return REGISTRY.getColor(rgb);
	}

	/*
	 * Colors
	 */
	public static final Color COLOR_WHITE = COLORS.WHITE.color;
	public static final Color COLOR_BLACK = COLORS.BLACK.color;
	public static final Color COLOR_RED = COLORS.RED.color;
	public static final Color COLOR_DARK_RED = COLORS.DARK_RED.color;
	public static final Color COLOR_GREEN = COLORS.GREEN.color;
	public static final Color COLOR_DARK_GREEN = COLORS.DARK_GREEN.color;
	public static final Color COLOR_YELLOW = COLORS.YELLOW.color;
	public static final Color COLOR_DARK_YELLOW = COLORS.DARK_YELLOW.color;
	public static final Color COLOR_BLUE = COLORS.BLUE.color;
	public static final Color COLOR_DARK_BLUE = COLORS.DARK_BLUE.color;
	public static final Color COLOR_MAGENTA = COLORS.MAGENTA.color;
	public static final Color COLOR_DARK_MAGENTA = COLORS.DARK_MAGENTA.color;
	public static final Color COLOR_CYAN = COLORS.CYAN.color;
	public static final Color COLOR_DARK_CYAN = COLORS.DARK_CYAN.color;
	public static final Color COLOR_GRAY = COLORS.GRAY.color;
	public static final Color COLOR_DARK_GRAY = COLORS.DARK_GRAY.color;
	public static final Color COLOR_LIGHT_GRAY = COLORS.LIGHT_GRAY.color;
	public static final Color COLOR_ORANGE = COLORS.ORANGE.color;

	public enum COLORS {

		WHITE (SWT.COLOR_WHITE),
		BLACK (SWT.COLOR_BLACK),
		RED (SWT.COLOR_RED),
		DARK_RED (SWT.COLOR_DARK_RED),
		GREEN (SWT.COLOR_GREEN),
		DARK_GREEN (SWT.COLOR_DARK_GREEN),
		YELLOW (SWT.COLOR_YELLOW),
		DARK_YELLOW (SWT.COLOR_DARK_YELLOW),
		BLUE (SWT.COLOR_BLUE),
		DARK_BLUE (SWT.COLOR_DARK_BLUE),
		MAGENTA (SWT.COLOR_MAGENTA),
		DARK_MAGENTA (SWT.COLOR_DARK_MAGENTA),
		CYAN (SWT.COLOR_CYAN),
		DARK_CYAN (SWT.COLOR_DARK_CYAN),
		GRAY (SWT.COLOR_GRAY),
		DARK_GRAY (SWT.COLOR_DARK_GRAY),
		LIGHT_GRAY (245, 245, 245),
		ORANGE (255, 127, 0);

		public final Color color;

		COLORS(int red, int green, int blue) {this(getColor(red, green, blue));}
		COLORS(int id) {this(getColor(id));}
		COLORS(Color color) {this.color=color;}

	}

	/**
	 * Creates a AWT color instance to match the RGB values
	 * of the specified SWT color.
	 *
	 * @param color The SWT color to match.
	 * @return The AWT color abject.
	 */
	public static java.awt.Color toAWTColor(Color color) {
		return new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue());
	}

	/**
	 * Creates a SWT color instance to match the RGB values
	 * of the specified AWT paint. For now, this method test
	 * if the paint is a color and then return the adequate
	 * SWT color. Otherwise plain black is assumed.
	 *
	 * @param device The swt device to draw on (display or gc device).
	 * @param paint The AWT color to match.
	 * @return The SWT color object.
	 */
	public static Color toSWTColor(Device device, java.awt.Paint paint) {
		java.awt.Color color;
		if (paint instanceof java.awt.Color){
			color=(java.awt.Color)paint;
		}else try{
			throw new Exception("only color is supported... setting paint to uniform black color");
		}catch(Exception e){
			e.printStackTrace();
			color=new java.awt.Color(0, 0, 0);
		}return new Color(device, color.getRed(), color.getGreen(), color.getBlue());
	}

	/**
	 * Creates a SWT color instance to match the RGB values
	 * of the specified AWT color. alpha channel is not supported.
	 * Note that the dispose method will need to be called on the
	 * returned object.
	 *
	 * @param device The SWT device to draw on (display or gc device).
	 * @param color The AWT color to match.
	 * @return The SWT color object.
	 */
	public static Color toSWTColor(Device device, java.awt.Color color) {
		return new Color(device, color.getRed(), color.getGreen(), color.getBlue());
	}

}