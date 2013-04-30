/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.awt;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import javax.imageio.ImageIO;

import com.thebuzzmedia.imgscalr.Scalr;

public class ImageUtils {

	/*
	 * AWT BufferedImage
	 */
	public static int[] getImagePixels(BufferedImage bufferedImage) {
		return bufferedImage.getData().getPixels(0,0,
				bufferedImage.getWidth(),bufferedImage.getHeight(),(int[])null);
	}


	public static BufferedImage createImage(byte[] bytes) throws Exception {
		return ImageIO.read(new ByteArrayInputStream(bytes));
	}


	public static BufferedImage resizeImage(byte[] bytes, int pixels) throws Exception {
		return Scalr.resize(createImage(bytes), pixels);
	}


}
