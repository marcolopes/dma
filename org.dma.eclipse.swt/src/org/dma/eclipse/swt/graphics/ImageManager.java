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

	private static final Map<String, Image> cache=new HashMap();

	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on byte-array hash
	 */
	public static Image getImage(byte[] bytes) {
		String key=String.valueOf(Arrays.hashCode(bytes));
		Image image=cache.get(key);
		if (image==null) {
			image=SWTImageUtils.createImage(bytes);
			cache.put(key, image);
		}

		return image;
	}


	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on path string
	 */
	public static Image getImage(String path) {
		Image image=cache.get(path);
		if (image==null) {
			image=SWTImageUtils.createImage(path);
			cache.put(path, image);
		}

		return image;
	}


	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on image hash
	 */
	public static Image getImage(BufferedImage bufferedImage) {
		String key=String.valueOf(Arrays.hashCode(ImageUtils.getImagePixels(bufferedImage)));
		Image image=cache.get(key);
		if (image==null) {
			image=SWTImageUtils.createImage(bufferedImage);
			cache.put(key, image);
		}

		return image;
	}


	/** Dispose all of the cached images */
	public static void disposeImages() {
		debug();
		// dispose created images
		for(Image image: cache.values()){
			if (image!=null) image.dispose();
		}
		cache.clear();
	}


	/*
	 * Debug
	 */
	public static void debug() {
		System.out.println("IMAGE CACHE: " + cache.size());
		for(String key: cache.keySet()){
			System.out.println(key+": "+cache.get(key));
		}
	}


}
