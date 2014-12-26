/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.awt;

import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;

import javax.imageio.ImageIO;

import com.thebuzzmedia.imgscalr.Scalr;

public class ImageUtils {

	/**
	 * Redraws the source image.
	 * Somehow a BufferedImage created using {@link ImageIO}
	 * will not show when converted to SWT Image
	 */
	public static BufferedImage drawImage(BufferedImage src) {
		try{
			int imageType=src.getTransparency()==Transparency.OPAQUE ?
					BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;

			// Setup the rendering resources to match the source image's
			BufferedImage result=new BufferedImage(src.getWidth(), src.getHeight(), imageType);

			// Scale the image to the new buffer using the specified rendering hint.
			Graphics2D resultGraphics=result.createGraphics();
			resultGraphics.drawImage(src, 0, 0, null);
			// Just to be clean, explicitly dispose our temporary graphics object
			resultGraphics.dispose();

			// Return the scaled image to the caller.
			return result;

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return null;
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
			System.out.println(e.getMessage());
		}
		return null;
	}


	/**
	 * Returns an {@link BufferedImage}
	 * encoded by the specified file at the specified path.
	 */
	public static BufferedImage createImage(String imagePath) {
		try{
			return drawImage(ImageIO.read(new File(imagePath)));

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return null;
	}


	/**
	 * Returns an {@link BufferedImage}
	 * encoded by the specified resource at the specified location.
	 * <p>
	 * Resource is loaded with {@link ClassLoader#getResourceAsStream(String)}.
	 */
	public static BufferedImage createImage(Class location, String resource) {
		try{
			return drawImage(ImageIO.read(
					location.getClassLoader().getResourceAsStream(resource)));

		}catch(Exception e){}
		return null;
	}


	public static BufferedImage resizeImage(BufferedImage bufferedImage, int pixels) {
		try{
			return Scalr.resize(bufferedImage, pixels);

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return null;
	}


	public static BufferedImage resizeImage(byte[] bytes, int pixels) {
		BufferedImage image=createImage(bytes);
		return pixels==0 ? image : resizeImage(image, pixels);
	}


	public static BufferedImage resizeImage(String imagePath, int pixels) {
		BufferedImage image=createImage(imagePath);
		return pixels==0 ? image : resizeImage(image, pixels);
	}


	public static BufferedImage resizeImage(Class location, String resource, int pixels) {
		BufferedImage image=createImage(location, resource);
		return pixels==0 ? image : resizeImage(image, pixels);
	}


}
