/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.awt;

import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

public class ImageUtils {

	/**
	 * Redraws the source image.
	 * <p>
	 * Somehow a BufferedImage created using {@link ImageIO}
	 * will not show when converted to SWT Image
	 */
	public static BufferedImage drawImage(BufferedImage image) {
		try{//Setup the rendering resources to match the source image's
			BufferedImage result=new BufferedImage(image.getWidth(), image.getHeight(),
					image.getTransparency()==Transparency.OPAQUE ?
					BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB);
			//Scale the image to the new buffer using the specified rendering hint
			Graphics2D g2d=result.createGraphics();
			g2d.drawImage(image, 0, 0, null);
			g2d.dispose();
			//Return the scaled image to the caller
			return result;

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	public static int[] getImagePixels(RenderedImage image) {
		return image.getData().getPixels(0, 0, image.getWidth(), image.getHeight(), (int[])null);
	}


	/** @see Scalr#resize(BufferedImage, int, java.awt.image.BufferedImageOp...) */
	public static BufferedImage resizeImage(BufferedImage image, int size) {
		try{return size==0 ? image : Scalr.resize(image, size);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/**
	 * Returns a {@link BufferedImage}
	 * encoded by the specified buffer.
	 */
	public static BufferedImage createImage(byte[] bytes) {
		try{return drawImage(ImageIO.read(new ByteArrayInputStream(bytes)));
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/**
	 * Returns a {@link BufferedImage}
	 * encoded by the specified file at the specified path.
	 */
	public static BufferedImage createImage(String pathname) {
		try{return drawImage(ImageIO.read(new File(pathname)));
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/**
	 * Returns a {@link BufferedImage}
	 * encoded by the specified resource at the specified location.
	 */
	public static BufferedImage createImage(Class location, String resource) {
		try{InputStream stream=location.getClassLoader().getResourceAsStream(resource);
			try{BufferedImage image=ImageIO.read(stream);
				return drawImage(image);
			}finally{
				stream.close();
			}
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/** @see ImageUtils#resizeImage(BufferedImage, int) */
	public static BufferedImage createImage(byte[] bytes, int size) {
		BufferedImage image=createImage(bytes);
		return size==0 ? image : resizeImage(image, size);
	}


	/** @see ImageUtils#resizeImage(BufferedImage, int) */
	public static BufferedImage createImage(String path, int size) {
		BufferedImage image=createImage(path);
		return size==0 ? image : resizeImage(image, size);
	}


	/** @see ImageUtils#resizeImage(BufferedImage, int) */
	public static BufferedImage createImage(Class location, String resource, int size) {
		BufferedImage image=createImage(location, resource);
		return size==0 ? image : resizeImage(image, size);
	}


}