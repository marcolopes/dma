/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import java.util.HashMap;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorManager {

	public static final ColorCache CACHE = new ColorCache();

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
	public static final Color COLOR_LIGHT_GRAY = getColor(245,245,245);
	public static final Color COLOR_ORANGE = getColor(255,127,0);

	public static class ColorCache extends HashMap<RGB, Color> {

		private static final long serialVersionUID = 1L;

		/**
		 * Returns the CACHED {@link Color}
		 * or null if not CACHED or is DISPOSED
		 */
		public Color get(RGB key) {
			Color color=super.get(key);
			return color==null || color.isDisposed() ? null : color;
		}

		/**
		 * Puts {@link Color} into the CACHE
		 * and disposes previous CACHED color
		 */
		@Override
		public Color put(RGB key, Color color) {
			color=super.put(key, color);
			if (color!=null) color.dispose();
			return color;
		}

		/**
		 * Dispose of all the CACHED colors
		 */
		@Override
		public void clear() {
			debug();
			for (Color color: values()) {
				color.dispose();
			}
			super.clear();
		}

		/** Debug */
		public void debug() {
			System.out.println("COLOR CACHE: " + size());
			for(RGB key: keySet()){
				System.out.println(key+": "+get(key));
			}
		}

	}

	/**
	 * Returns the system {@link Color} matching the specific ID.
	 */
	public static Color getColor(int systemColorID) {
		return Display.getDefault().getSystemColor(systemColorID);
	}


	/**
	 * Returns the CACHED {@link Color}
	 * or a new one if not CACHED or is DISPOSED.
	 */
	public static Color getColor(RGB rgb) {
		Color color=CACHE.get(rgb);
		if (color==null) {
			color=new Color(Display.getDefault(), rgb);
			CACHE.put(rgb, color);
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


}