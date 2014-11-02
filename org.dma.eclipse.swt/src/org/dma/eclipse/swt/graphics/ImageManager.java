/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.dma.java.utils.awt.ImageUtils;

import org.eclipse.swt.graphics.Image;

public class ImageManager {

	private static final Map<String, Image> CACHE = new HashMap();

	public static void putImage(String key, Image image) {
		image=CACHE.put(key, image);
		if (image!=null) image.dispose();
	}


	/**
	 * Returns the CACHED image or a new one if it does not exist;
	 * Cache Map key based on path string
	 */
	public static Image getImage(String path) {
		Image image=CACHE.get(path);
		if (image==null) {
			image=SWTImageUtils.createImage(path);
			CACHE.put(path, image);
		}

		return image;
	}


	/**
	 * Returns the CACHED image or a new one if it does not exist;
	 * Cache Map key based on byte-array hash
	 */
	public static Image getImage(byte[] bytes) {
		String key=String.valueOf(Arrays.hashCode(bytes));
		Image image=CACHE.get(key);
		if (image==null) {
			image=SWTImageUtils.createImage(bytes);
			CACHE.put(key, image);
		}

		return image;
	}


	/**
	 * Returns the CACHED image or a new one if it does not exist;
	 * Cache Map key based on image hash
	 */
	public static Image getImage(BufferedImage bufferedImage) {
		String key=String.valueOf(Arrays.hashCode(ImageUtils.getImagePixels(bufferedImage)));
		Image image=CACHE.get(key);
		if (image==null) {
			image=SWTImageUtils.createImage(bufferedImage);
			CACHE.put(key, image);
		}

		return image;
	}


	/** Dispose all of the CACHED images */
	public static void disposeImages() {
		debug();
		//dispose created images
		for(Image image: CACHE.values()){
			if (image!=null) image.dispose();
		}
		CACHE.clear();
	}


	/** Debug */
	public static void debug() {
		System.out.println("IMAGE CACHE: " + CACHE.size());
		for(String key: CACHE.keySet()){
			System.out.println(key+": "+CACHE.get(key));
		}
	}


}