/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;

import org.dma.java.utils.awt.ImageUtils;
import org.eclipse.swt.graphics.Image;

public class ImageManager extends HashMap<String, Image> {

	private static final long serialVersionUID = 1L;

	private static final ImageManager INSTANCE = new ImageManager();

	private static Image MISSING_IMAGE;

	private static Image getMissingImage(){
		if (MISSING_IMAGE==null){
			MISSING_IMAGE=SWTImageUtils.createImage(16);
		}
		return MISSING_IMAGE;
	}

	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on byte-array hash
	 */
	public static Image getImage(byte[] bytes) {
		String key=String.valueOf(Arrays.hashCode(bytes));
		Image image=INSTANCE.get(key);
		if (image==null) {
			try{
				image=SWTImageUtils.createImage(bytes);
			} catch (Exception e){
				image=getMissingImage();
			}
			INSTANCE.put(key, image);
		}

		return image;
	}


	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on path string
	 */
	public static Image getImage(String path) {
		Image image=INSTANCE.get(path);
		if (image==null) {
			try{
				image=SWTImageUtils.createImage(path);
			} catch (Exception e){
				image=getMissingImage();
			}
			INSTANCE.put(path, image);
		}

		return image;
	}


	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on image hash
	 */
	public static Image getImage(BufferedImage bufferedImage) {
		String key=String.valueOf(Arrays.hashCode(ImageUtils.getImagePixels(bufferedImage)));
		Image image=INSTANCE.get(key);
		if (image==null) {
			try{
				image=SWTImageUtils.createImage(bufferedImage);
			} catch (Exception e){
				image=getMissingImage();
			}
			INSTANCE.put(key, image);
		}

		return image;
	}


	/**
	 * Dispose all of the cached images
	 */
	public static void disposeImages() {
		debug();
		// dispose created images
		for(Image image: INSTANCE.values()){
			image.dispose();
		}
		INSTANCE.clear();
		MISSING_IMAGE=null;
	}


	/*
	 * Debug
	 */
	public static void debug() {
		System.out.println("IMAGE CACHE: " + INSTANCE.size());
		for(String key: INSTANCE.keySet()){
			System.out.println("key: " + key);
		}
	}


}
