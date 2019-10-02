/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * IBM Corporation and others
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.dma.java.io.FileHandler;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;

public class CustomImageDescriptor extends ImageDescriptor {

	/*
	 * Adapted from https://github.com/moovida/uDig/blob/master/plugins/net.refractions.udig.ui/src/net/refractions/udig/ui/graphics/AWTSWTImageUtils.java
	 */
	public static ImageData createImageData(RenderedImage image, boolean transparent) {
		int width=image.getWidth();
		int height=image.getHeight();
		int depth=24;
		PaletteData palette=new PaletteData(0xFF, 0xFF00, 0xFF0000);
		ImageData swtdata=new ImageData(width, height, depth, palette);
		swtdata.transparentPixel=-1;
		int step=swtdata.depth / 8;
		byte[] data=swtdata.data;
		Raster raster=image.getData();
		int numbands=raster.getNumBands();
		int[] awtdata=raster.getPixels(0, 0, width, height, new int[width * height * numbands]);
		int baseindex=0;
		for(int y=0; y < height; y++){
			int index=((0 + y) * swtdata.bytesPerLine) + (0 * step);
			for(int x=0; x < width; x++){
				int pixel=(x + (y * width));
				baseindex=pixel * numbands;
				data[index++]=(byte)awtdata[baseindex + 2];
				data[index++]=(byte)awtdata[baseindex + 1];
				data[index++]=(byte)awtdata[baseindex];
				if (numbands == 4 && transparent){
					swtdata.setAlpha(x, y, awtdata[baseindex + 3]);
				}
			}
		}return swtdata;
	}

	public static ImageData createImageData(BufferedImage image) {
		if(image.getType()!=BufferedImage.TYPE_3BYTE_BGR){
			return createImageData(image, image.getTransparency()!=Transparency.OPAQUE);
		}
		int width=image.getWidth();
		int height=image.getHeight();
		int bands=image.getColorModel().getColorSpace().getNumComponents();
		int depth=24;
		byte[] pixels=((DataBufferByte)image.getRaster().getDataBuffer()).getData();
		return new ImageData(width, height, depth, new PaletteData(
				0x0000ff, 0x00ff00, 0xff0000), width * bands, pixels);
	}

	private static void close(InputStream stream) {
		try{
			stream.close();
		}catch(Exception e){}
	}

	private static ImageData getImageData(InputStream stream) {
		try{
			return new ImageData(stream);
		}catch(Exception e){
			return null;
		}finally{
			close(stream);
		}
	}

	private final ImageData data;

	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the resource at the specified location.
	 */
	public CustomImageDescriptor(Class location, String resource) {
		this(getImageData(location.getClassLoader().getResourceAsStream(resource)));
	}

	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the the file at the specified path.
	 */
	public CustomImageDescriptor(String path) {
		this(getImageData(new FileHandler(path).asInputStream()));
	}

	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the specified bytes.
	 */
	public CustomImageDescriptor(byte[] bytes) {
		this(getImageData(new ByteArrayInputStream(bytes)));
	}

	/**
	 * Creates and returns a new {@link ImageDescriptor}
	 * stored by the specified {@link BufferedImage}.
	 */
	public CustomImageDescriptor(BufferedImage image) {
		this(createImageData(image));
	}

	public CustomImageDescriptor(ImageData data) {
		this.data=data;
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.resource.ImageDescriptor
	 */
	@Override
	public ImageData getImageData() {
		return data;
	}


	/**
	 * snippet 156: convert between SWT Image and AWT BufferedImage.
	 * <p>
	 * For a list of all SWT example snippets see
	 * http://www.eclipse.org/swt/snippets/
	 */
	public BufferedImage convertToAWT() {
		PaletteData palette=data.palette;
		if (palette.isDirect){
			ColorModel colorModel=new DirectColorModel(data.depth, palette.redMask, palette.greenMask, palette.blueMask);
			BufferedImage image=new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
			for (int y=0; y < data.height; y++){
				for (int x=0; x < data.width; x++){
					int pixel=data.getPixel(x, y);
					RGB rgb=palette.getRGB(pixel);
					image.setRGB(x, y,  rgb.red << 16 | rgb.green << 8 | rgb.blue);
				}
			}return image;
		}
		RGB[] rgbs=palette.getRGBs();
		byte[] red=new byte[rgbs.length];
		byte[] green=new byte[rgbs.length];
		byte[] blue=new byte[rgbs.length];
		for (int i=0; i < rgbs.length; i++) {
			RGB rgb=rgbs[i];
			red[i]=(byte)rgb.red;
			green[i]=(byte)rgb.green;
			blue[i]=(byte)rgb.blue;
		}
		ColorModel colorModel=data.transparentPixel==-1 ?
				new IndexColorModel(data.depth, rgbs.length, red, green, blue) :
				new IndexColorModel(data.depth, rgbs.length, red, green, blue, data.transparentPixel);
		BufferedImage image=new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
		WritableRaster raster=image.getRaster();
		int[] pixelArray=new int[1];
		for (int y=0; y < data.height; y++){
			for (int x=0; x < data.width; x++){
				int pixel=data.getPixel(x, y);
				pixelArray[0]=pixel;
				raster.setPixel(x, y, pixelArray);
			}
		}return image;
	}


}