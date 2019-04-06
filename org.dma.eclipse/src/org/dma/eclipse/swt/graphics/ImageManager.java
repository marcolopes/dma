/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;

import org.dma.eclipse.swt.custom.CustomImageDescriptor;
import org.dma.java.awt.ImageUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class ImageManager {

	public static final ImageCache CACHE = new ImageCache();

	public static class ImageCache extends HashMap<String, Image> {

		private static final long serialVersionUID = 1L;

		/**
		 * Returns the CACHED {@link Image}
		 * or null if not CACHED or is DISPOSED
		 */
		public Image get(String key) {
			Image image=super.get(key);
			return image==null || image.isDisposed() ? null : image;
		}

		/**
		 * Puts {@link Image} into the CACHE
		 * and disposes previous CACHED image
		 */
		@Override
		public Image put(String key, Image image) {
			image=super.put(key, image);
			if (image!=null) image.dispose();
			return image;
		}

		/**
		 * Dispose all of the CACHED images
		 */
		@Override
		public void clear() {
			debug();
			for(Image image: values()){
				if (image!=null) image.dispose();
			}
			super.clear();
		}

		/** Debug */
		public void debug() {
			System.out.println("IMAGE CACHE: " + size());
			for(String key: keySet()){
				System.out.println(key+": "+get(key));
			}
		}

	}

	/** Returns the {@link Image} key based on image-size hash */
	public static String getKey(Integer size) {
		return "size:"+String.valueOf(size.hashCode());
	}

	/** Returns the {@link Image} key based on image-path string */
	public static String getKey(String path) {
		return "path:"+path;
	}

	/** Returns the {@link Image} key based on image-bytes hash */
	public static String getKey(byte[] bytes) {
		return "bytes:"+String.valueOf(Arrays.hashCode(bytes));
	}

	/** Returns the {@link Image} key based on {@link BufferedImage} hash */
	public static String getKey(BufferedImage bufferedImage) {
		return "pixels:"+String.valueOf(Arrays.hashCode(ImageUtils.getImagePixels(bufferedImage)));
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED.
	 * It can be used as placeholder for missing image.
	 */
	public static Image getImage(Integer size) {
		String key=getKey(size);
		Image image=CACHE.get(key);
		if (image==null) try{
			image=new Image(Display.getDefault(), size, size);
			CACHE.put(key, image);
			GC gc=new GC(image);
			gc.setBackground(Display.getDefault().getSystemColor(SWT.TRANSPARENT));
			gc.fillRectangle(0, 0, size, size);
			gc.dispose();

		}catch(Exception e){
			System.err.println(e);
		}return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image getImage(String path) {
		String key=getKey(path);
		Image image=CACHE.get(key);
		if (image==null){
			image=new CustomImageDescriptor(path).createImage();
			CACHE.put(key, image);
		}return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image getImage(byte[] bytes) {
		String key=getKey(bytes);
		Image image=CACHE.get(key);
		if (image==null){
			image=new CustomImageDescriptor(bytes).createImage();
			CACHE.put(key, image);
		}return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image getImage(BufferedImage bufferedImage) {
		String key=getKey(bufferedImage);
		Image image=CACHE.get(key);
		if (image==null){
			image=new CustomImageDescriptor(bufferedImage).createImage();
			CACHE.put(key, image);
		}return image;
	}


}