/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import javax.imageio.ImageIO;

import com.thebuzzmedia.imgscalr.Scalr;

public class ImageUtils {

	/*
	 * AWT BufferedImage
	 */
	public static BufferedImage createBufferedImage(byte[] bytes) throws Exception {
		return ImageIO.read(new ByteArrayInputStream(bytes));
	}

	public static BufferedImage resizeBufferedImage(byte[] bytes, int pixels) throws Exception {
		return Scalr.resize(createBufferedImage(bytes), pixels);
	}


}
