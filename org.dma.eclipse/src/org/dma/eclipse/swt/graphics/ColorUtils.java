/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Henry Proudhon and Contributors (henry.proudhon AT insa-lyon.fr)
 * Object Refinery Limited and Contributors.
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Display;

public class ColorUtils {

	/**
	 * Returns the system {@link Color} matching the specific ID.
	 *
	 * @param systemColorID
	 *            the ID value for the color
	 * @return the system {@link Color} matching the specific ID
	 */
	public static Color getColor(int systemColorID) {
		Display display = Display.getDefault();
		return display.getSystemColor(systemColorID);
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
			e.printStackTrace();
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
