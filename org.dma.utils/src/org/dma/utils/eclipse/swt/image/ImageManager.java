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

	private static Map<String, Image> imageMap = new LinkedHashMap();


	public static Image resizeImage(byte[] bytes, int pixels) {
		String key=String.valueOf(Arrays.hashCode(bytes))+":"+String.valueOf(pixels);
		Debug.info("### KEY ###", key);
		Image image = imageMap.get(key);
		if (image == null) {
			try{
				image = ImageUtils.createImage(bytes,pixels);
			} catch (Exception e){
				image = ImageUtils.createImage(MISSING_IMAGE_SIZE);
			}
			imageMap.put(key, image);
			debug();
		}

		return image;
	}


	public static Image getImage(byte[] bytes) {
		String key=String.valueOf(Arrays.hashCode(bytes));
		Debug.info("### KEY ###", key);
		Image image = imageMap.get(key);
		if (image == null) {
			try{
				image = ImageUtils.createImage(bytes);
			} catch (Exception e){
				image = ImageUtils.createImage(MISSING_IMAGE_SIZE);
			}
			imageMap.put(key, image);
			debug();
		}

		return image;
	}


	/**
	 * Returns an {@link Image} stored in the file at the specified path.
	 *
	 * @param path
	 *            the path to the image file
	 * @return the {@link Image} stored in the file at the specified path
	 */
	public static Image getImage(String path) {
		Image image = imageMap.get(path);
		Debug.info("### KEY ###", path);
		if (image == null) {
			try{
				image = ImageUtils.createImage(new FileInputStream(path));
			} catch (Exception e){
				image = ImageUtils.createImage(MISSING_IMAGE_SIZE);
			}
			imageMap.put(path, image);
			debug();
		}

		return image;
	}


	/**
	 * Dispose all of the cached {@link Image}
	 */
	public static void disposeImages() {
		debug();
		// dispose created images
		Iterator<Image> iterator=imageMap.values().iterator();
		while(iterator.hasNext()){
			iterator.next().dispose();
		}
		imageMap.clear();
	}


	public static void debug() {
		if (!Debug.isOn())
			return;

		Debug.header("IMAGES");
		System.out.println("size: " + imageMap.size());
		Iterator<String> iterator=imageMap.keySet().iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			System.out.println("key: " + key);
		}
		Debug.footer();
	}


}
