/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.awt;

import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

public class ImageUtils {

	/**
	 * Redraws the source image.
	 * Somehow a BufferedImage created using {@link ImageIO}
	 * will not show when converted to SWT Image
	 */
	public static BufferedImage drawImage(BufferedImage bufferedImage) {
		try{
			// Setup the rendering resources to match the source image's
			BufferedImage result=new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),
					bufferedImage.getTransparency()==Transparency.OPAQUE ?
					BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB);

			// Scale the image to the new buffer using the specified rendering hint
			Graphics2D resultGraphics=result.createGraphics();
			resultGraphics.drawImage(bufferedImage, 0, 0, null);
			resultGraphics.dispose();

			// Return the scaled image to the caller
			return result;

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	public static int[] getImagePixels(BufferedImage bufferedImage) {
		return bufferedImage.getData().getPixels(0, 0,
				bufferedImage.getWidth(), bufferedImage.getHeight(), (int[])null);
	}


	/**
	 * Returns an {@link BufferedImage}
	 * encoded by the specified buffer.
	 */
	public static BufferedImage createImage(byte[] bytes) {
		try{
			return drawImage(ImageIO.read(new ByteArrayInputStream(bytes)));

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/**
	 * Returns an {@link BufferedImage}
	 * encoded by the specified file at the specified path.
	 */
	public static BufferedImage createImage(String pathname) {
		try{
			return drawImage(ImageIO.read(new File(pathname)));

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/**
	 * Returns an {@link BufferedImage}
	 * encoded by the specified resource at the specified location.
	 */
	public static BufferedImage createImage(Class location, String resource) {
		try{
			return drawImage(ImageIO.read(location.getClassLoader().getResourceAsStream(resource)));

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	public static BufferedImage resizeImage(BufferedImage bufferedImage, int size) {
		try{
			return size==0 ? bufferedImage : Scalr.resize(bufferedImage, size);

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/** @see ImageUtils#resizeImage(BufferedImage, int) */
	public static BufferedImage resizeImage(byte[] bytes, int size) {
		BufferedImage bufferedImage=createImage(bytes);
		return size==0 ? bufferedImage : resizeImage(bufferedImage, size);
	}


	/** @see ImageUtils#resizeImage(BufferedImage, int) */
	public static BufferedImage resizeImage(String path, int size) {
		BufferedImage bufferedImage=createImage(path);
		return size==0 ? bufferedImage : resizeImage(bufferedImage, size);
	}


	/** @see ImageUtils#resizeImage(BufferedImage, int) */
	public static BufferedImage resizeImage(Class location, String resource, int size) {
		BufferedImage bufferedImage=createImage(location, resource);
		return size==0 ? bufferedImage : resizeImage(bufferedImage, size);
	}


}
