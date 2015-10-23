/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.dma.java.awt.ImageUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

public class ImageManager {

	private static final Map<String, Image> CACHE=new HashMap();

	/** Returns the {@link Image} key based on image-size hash */
	public static String getKey(Integer size) {
		return "SIZE:"+String.valueOf(size.hashCode());
	}

	/** Returns the {@link Image} key based on image-path string */
	public static String getKey(String path) {
		return "PATH:"+path;
	}

	/** Returns the {@link Image} key based on image-bytes hash */
	public static String getKey(byte[] bytes) {
		return "BYTES:"+String.valueOf(Arrays.hashCode(bytes));
	}

	/** Returns the {@link Image} key based on {@link BufferedImage} hash */
	public static String getKey(BufferedImage bufferedImage) {
		return "PIXELS:"+String.valueOf(Arrays.hashCode(ImageUtils.getImagePixels(bufferedImage)));
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or null if not CACHED or is DISPOSED
	 */
	public static Image getImage(String key) {
		Image image=CACHE.get(key);
		return image==null || image.isDisposed() ? null : image;
	}

	/**
	 * Puts {@link Image} into the CACHE
	 * and disposes previous CACHED image
	 */
	public static void putImage(Image image, String key) {
		image=CACHE.put(key, image);
		if (image!=null) image.dispose();
	}


	/**
	 * Returns an {@link Image}
	 * encoded by the specified {@link InputStream}
	 */
	private static Image createImage(InputStream stream) {
		try{
			Display display=Display.getCurrent();
			ImageData data=new ImageData(stream);
			return data.transparentPixel > 0 ?
				new Image(display, data, data.getTransparencyMask()) :
				new Image(display, data);

		}catch(Exception e){
			System.out.println(e);
		}

		return null;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED.
	 * It can be used as placeholder for missing image.
	 */
	public static Image createImage(Integer size) {
		String key=getKey(size);
		Image image=getImage(key);
		if (image==null) try{
			image=new Image(Display.getCurrent(), size, size);
			GC gc=new GC(image);
			gc.setBackground(Display.getCurrent().getSystemColor(SWT.TRANSPARENT));
			gc.fillRectangle(0, 0, size, size);
			gc.dispose();
			putImage(image, key);

		}catch(Exception e){
			System.out.println(e);
		}
		return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image createImage(String path) {
		String key=getKey(path);
		Image image=getImage(key);
		if (image==null) try{
			FileInputStream stream=new FileInputStream(path);
			image=createImage(stream);
			stream.close();
			putImage(image, key);

		}catch(Exception e){
			System.out.println(e);
		}
		return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image createImage(byte[] bytes) {
		String key=getKey(bytes);
		Image image=getImage(key);
		if (image==null) try{
			ByteArrayInputStream stream=new ByteArrayInputStream(bytes);
			image=createImage(stream);
			stream.close();
			putImage(image, key);

		}catch(Exception e){
			System.out.println(e);
		}
		return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image createImage(BufferedImage bufferedImage) {
		String key=getKey(bufferedImage);
		Image image=getImage(key);
		if (image==null) try{
			image=new Image(Display.getCurrent(), SWTImageUtils.convertToSWT(bufferedImage));
			putImage(image, key);

		}catch(Exception e){
			System.out.println(e);
		}
		return image;
	}


	/** Dispose all of the CACHED images */
	public static void disposeImages() {
		debug();
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