/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import java.awt.image.BufferedImage;
import java.util.Arrays;

import org.dma.eclipse.swt.widgets.CustomImageDescriptor;
import org.dma.java.awt.ImageUtils;
import org.dma.java.util.Debug;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class ImageManager {

	public static final Display DISPLAY = Display.getDefault();

	public static final ImageRegistry REGISTRY = new ImageRegistry(DISPLAY);

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
		Image image=REGISTRY.get(key);
		if (image==null) try{
			image=new Image(DISPLAY, size, size);
			REGISTRY.put(key, image);
			GC gc=new GC(image);
			gc.setBackground(DISPLAY.getSystemColor(SWT.TRANSPARENT));
			gc.fillRectangle(0, 0, size, size);
			gc.dispose();

		}catch(Exception e){
			Debug.err(e);
		}return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image getImage(String path) {
		String key=getKey(path);
		Image image=REGISTRY.get(key);
		if (image==null){
			image=new CustomImageDescriptor(path).createImage();
			REGISTRY.put(key, image);
		}return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image getImage(byte[] bytes) {
		String key=getKey(bytes);
		Image image=REGISTRY.get(key);
		if (image==null){
			image=new CustomImageDescriptor(bytes).createImage();
			REGISTRY.put(key, image);
		}return image;
	}


	/**
	 * Returns the CACHED {@link Image}
	 * or a new one if not CACHED or is DISPOSED
	 */
	public static Image getImage(BufferedImage bufferedImage) {
		String key=getKey(bufferedImage);
		Image image=REGISTRY.get(key);
		if (image==null){
			image=new CustomImageDescriptor(bufferedImage).createImage();
			REGISTRY.put(key, image);
		}return image;
	}


}