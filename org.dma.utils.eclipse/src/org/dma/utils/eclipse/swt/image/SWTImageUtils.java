/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.image;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.dma.utils.eclipse.swt.snippets.Snippet156;
import org.dma.utils.java.ImageUtils;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

public class SWTImageUtils {

	/*
	 * SWT Image
	 */
	public static Image createImage(byte[] bytes) throws Exception {
		return new Image(Display.getCurrent(), new ByteArrayInputStream(bytes));
	}

	public static Image createImage(BufferedImage bufferedImage) throws Exception {
		return new Image(Display.getCurrent(), Snippet156.convertToSWT(bufferedImage));
	}

	public static Image createImage(byte[] bytes, int pixels) throws Exception {
		return createImage(ImageUtils.resizeBufferedImage(bytes, pixels));
	}

	/**
	 * @return {@link Image} that can be used as placeholder for missing image.
	 */
	public static Image createImage(int size) {
		Image image = new Image(Display.getCurrent(), size, size);
		//
		GC gc = new GC(image);
		gc.setBackground(getColor(SWT.COLOR_RED));
		gc.fillRectangle(0, 0, size, size);
		gc.dispose();
		//
		return image;
	}


	/**
	 * Returns an {@link Image} encoded by the specified {@link InputStream}.
	 *
	 * @param stream
	 *            the {@link InputStream} encoding the image data
	 * @return the {@link Image} encoded by the specified input stream
	 */
	public static Image createImage(InputStream stream) throws IOException {
		try{
			Display display = Display.getCurrent();
			ImageData data = new ImageData(stream);
			if (data.transparentPixel > 0) {
				return new Image(display, data, data.getTransparencyMask());
			}
			return new Image(display, data);
		} finally {
			stream.close();
		}
	}


	/**
	 * Returns an {@link ImageDescriptor} stored in the file at the specified path.
	 *
	 * @param path
	 *            the path to the image file.
	 * @return the {@link ImageDescriptor} stored in the file at the specified path.
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		try{
			return ImageDescriptor.createFromURL(new File(path).toURI().toURL());
		} catch (MalformedURLException e){
			return null;
		}
	}


	/**
	 * Returns the system {@link Color} matching the specific ID.
	 *
	 * @param systemColorID
	 *            the ID value for the color
	 * @return the system {@link Color} matching the specific ID
	 */
	public static Color getColor(int systemColorID) {
		Display display = Display.getCurrent();
		return display.getSystemColor(systemColorID);
	}



}
