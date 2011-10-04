/*******************************************************************************
 * 2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.image;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.utils.java.Debug;
import org.eclipse.swt.graphics.Image;

public class ImageManager {

	private static final int MISSING_IMAGE_SIZE = 16;

	private static Map<String, Image> cacheMap = new LinkedHashMap();


	/**
	 * Returns the cached resized image or a new one if it does not exist;
	 * Cache Map key based on byte-array hash + pixels hash
	 */
	public static Image resizeImage(byte[] bytes, int pixels) {
		String key=String.valueOf(Arrays.hashCode(bytes))+":"+String.valueOf(pixels);
		Image image = cacheMap.get(key);
		if (image == null) {
			try{
				image = ImageUtils.createImage(bytes,pixels);
			} catch (Exception e){
				image = ImageUtils.createImage(MISSING_IMAGE_SIZE);
			}
			cacheMap.put(key, image);
			debug();
		}

		return image;
	}


	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on byte-array hash
	 */
	public static Image getImage(byte[] bytes) {
		String key=String.valueOf(Arrays.hashCode(bytes));
		Image image = cacheMap.get(key);
		if (image == null) {
			try{
				image = ImageUtils.createImage(bytes);
			} catch (Exception e){
				image = ImageUtils.createImage(MISSING_IMAGE_SIZE);
			}
			cacheMap.put(key, image);
			debug();
		}

		return image;
	}


	/**
	 * Returns the cached image or a new one if it does not exist;
	 * Cache Map key based on path string
	 */
	public static Image getImage(String path) {
		Image image = cacheMap.get(path);
		if (image == null) {
			try{
				image = ImageUtils.createImage(new FileInputStream(path));
			} catch (Exception e){
				image = ImageUtils.createImage(MISSING_IMAGE_SIZE);
			}
			cacheMap.put(path, image);
			debug();
		}

		return image;
	}


	/**
	 * Dispose all of the cached images
	 */
	public static void disposeImages() {
		debug();
		// dispose created images
		Iterator<Image> iterator=cacheMap.values().iterator();
		while(iterator.hasNext()){
			iterator.next().dispose();
		}
		cacheMap.clear();
	}


	public static void debug() {
		if (!Debug.isOn())
			return;

		Debug.header("IMAGES");
		System.out.println("size: " + cacheMap.size());
		Iterator<String> iterator=cacheMap.keySet().iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			System.out.println("key: " + key);
		}
		Debug.footer();
	}


}
