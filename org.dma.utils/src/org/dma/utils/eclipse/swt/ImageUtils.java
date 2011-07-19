package org.dma.utils.eclipse.swt;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import javax.imageio.ImageIO;

import org.dma.utils.eclipse.swt.snippets.Snippet156;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

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


	/*
	 * SWT Image
	 */
	public static Image createImage(byte[] bytes){

		return new Image(Display.getDefault(), new ByteArrayInputStream(bytes));

	}


	public static Image createImage(BufferedImage bufferedImage) throws Exception {

		return new Image(Display.getCurrent(), Snippet156.convertToSWT(bufferedImage));

	}


	public static Image resizeImage(byte[] bytes, int pixels) throws Exception {

		return createImage(resizeBufferedImage(bytes, pixels));

	}


}
