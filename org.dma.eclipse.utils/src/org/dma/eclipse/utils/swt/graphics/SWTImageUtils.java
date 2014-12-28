/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * IBM Corporation and others
 *******************************************************************************/
package org.dma.eclipse.utils.swt.graphics;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;

public class SWTImageUtils {

	/**
	 * Saves an {@link Image}
	 * to file in the specified {@link SWT} format.
	 */
	public static boolean saveImage(Image image, String filename, int format) {
		try{
			ImageLoader saver=new ImageLoader();
			saver.data=new ImageData[]{image.getImageData()};
			saver.save(filename, SWT.IMAGE_PNG);

		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}


	public static boolean savePNG(Image image, String filename) {
		return saveImage(image, filename, SWT.IMAGE_PNG);
	}


	public static boolean saveJPEG(Image image, String filename) {
		return saveImage(image, filename, SWT.IMAGE_JPEG);
	}


	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the specified {@link InputStream}.
	 */
	public static ImageDescriptor getImageDescriptor(InputStream stream) throws IOException {
		try{
			return ImageDescriptor.createFromImageData(new ImageData(stream));

		}finally{
			stream.close();
		}
	}


	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the the file at the specified path.
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		try{
			return getImageDescriptor(new FileInputStream(path));

		}catch(Exception e){}
		return null;
	}


	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the resource at the specified location.
	 */
	public static ImageDescriptor getImageDescriptor(Class location, String resource) {
		try{
			return getImageDescriptor(location.getClassLoader().getResourceAsStream(resource));

		}catch(Exception e){
			return null;
		}
	}


	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the specified {@link BufferedImage}.
	 * <p>
	 * The AWT BufferedImage is converted to an SWT ImageData.
	 */
	public static ImageDescriptor getImageDescriptor(BufferedImage bufferedImage) {
		try{
			return ImageDescriptor.createFromImageData(convertToSWT(bufferedImage));

		}catch(Exception e){}
		return null;
	}


	/**
	 * snippet 156: convert between SWT Image and AWT BufferedImage.
	 * <p>
	 * For a list of all SWT example snippets see
	 * http://www.eclipse.org/swt/snippets/
	 */
	@Deprecated
	public static BufferedImage convertToAWT(ImageData data) {
		PaletteData palette = data.palette;
		if (palette.isDirect) {
			ColorModel colorModel = new DirectColorModel(data.depth, palette.redMask, palette.greenMask, palette.blueMask);
			BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int pixel = data.getPixel(x, y);
					RGB rgb = palette.getRGB(pixel);
					bufferedImage.setRGB(x, y,  rgb.red << 16 | rgb.green << 8 | rgb.blue);
				}
			}
			return bufferedImage;
		}

		RGB[] rgbs = palette.getRGBs();
		byte[] red = new byte[rgbs.length];
		byte[] green = new byte[rgbs.length];
		byte[] blue = new byte[rgbs.length];
		for (int i = 0; i < rgbs.length; i++) {
			RGB rgb = rgbs[i];
			red[i] = (byte)rgb.red;
			green[i] = (byte)rgb.green;
			blue[i] = (byte)rgb.blue;
		}
		ColorModel colorModel = data.transparentPixel == -1 ?
				new IndexColorModel(data.depth, rgbs.length, red, green, blue) :
				new IndexColorModel(data.depth, rgbs.length, red, green, blue, data.transparentPixel);
		BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
		WritableRaster raster = bufferedImage.getRaster();
		int[] pixelArray = new int[1];
		for (int y = 0; y < data.height; y++) {
			for (int x = 0; x < data.width; x++) {
				int pixel = data.getPixel(x, y);
				pixelArray[0] = pixel;
				raster.setPixel(x, y, pixelArray);
			}
		}
		return bufferedImage;
	}


	/**
	 * snippet 156: convert between SWT Image and AWT BufferedImage.
	 * <p>
	 * For a list of all SWT example snippets see
	 * http://www.eclipse.org/swt/snippets/
	 */
	public static ImageData convertToSWT(BufferedImage bufferedImage) {
		if (bufferedImage.getColorModel() instanceof DirectColorModel) {
			/*
			DirectColorModel colorModel = (DirectColorModel)bufferedImage.getColorModel();
			PaletteData palette = new PaletteData(
					colorModel.getRedMask(),
					colorModel.getGreenMask(),
					colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(),
					colorModel.getPixelSize(), palette);
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[3];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					int pixel = palette.getPixel(new RGB(pixelArray[0], pixelArray[1], pixelArray[2]));
					data.setPixel(x, y, pixel);
				}
			}
			*/
			DirectColorModel colorModel = (DirectColorModel)bufferedImage.getColorModel();
			PaletteData palette = new PaletteData(
					colorModel.getRedMask(),
					colorModel.getGreenMask(),
					colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(),
					colorModel.getPixelSize(), palette);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF));
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha()) {
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
					}
				}
			}
			return data;
		}
		else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
			IndexColorModel colorModel = (IndexColorModel)bufferedImage.getColorModel();
			int size = colorModel.getMapSize();
			byte[] reds = new byte[size];
			byte[] greens = new byte[size];
			byte[] blues = new byte[size];
			colorModel.getReds(reds);
			colorModel.getGreens(greens);
			colorModel.getBlues(blues);
			RGB[] rgbs = new RGB[size];
			for (int i = 0; i < rgbs.length; i++) {
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF, blues[i] & 0xFF);
			}
			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(),
					colorModel.getPixelSize(), palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}
			return data;
		}
		else if (bufferedImage.getColorModel() instanceof ComponentColorModel) {
			ComponentColorModel colorModel = (ComponentColorModel)bufferedImage.getColorModel();
			//ASSUMES: 3 BYTE BGR IMAGE TYPE
			PaletteData palette = new PaletteData(0x0000FF, 0x00FF00,0xFF0000);
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(),
					colorModel.getPixelSize(), palette);
			//This is valid because we are using a 3-byte Data model with no transparent pixels
			data.transparentPixel = -1;
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[3];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					int pixel = palette.getPixel(new RGB(pixelArray[0], pixelArray[1], pixelArray[2]));
					data.setPixel(x, y, pixel);
				}
			}
			return data;
		}
		return null;
	}


}