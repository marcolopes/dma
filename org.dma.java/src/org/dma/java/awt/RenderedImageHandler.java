/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.awt;

import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.spi.IIORegistry;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.spi.ImageReaderWriterSpi;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.codec.binary.Base64;

public class RenderedImageHandler {

	public enum IMAGE_FORMATS {

		/** Uncompressed 1-bit friendly format; always preserves exact raster data */ BMP ("bmp"),
		/** Lossless compressed format; supports indexed 1-bit when palette is preserved */ PNG ("png"),
		/** Indexed color format; can store 1-bit if palette matches, but encoder is limited */ GIF ("gif"),
		/** Lossy 24-bit format; never preserves 1-bit or grayscale fidelity */ JPEG ("jpg");

		public static Map<Class, ImageReaderWriterSpi> PROVIDERS = getServiceProviders();

		public static Map<Class, ImageReaderWriterSpi> getServiceProviders() {
			Map<Class, ImageReaderWriterSpi> map=new LinkedHashMap();
			for(Class<ImageReaderWriterSpi> category: new Class[]{ImageReaderSpi.class, ImageWriterSpi.class}){
				Iterator<ImageReaderWriterSpi> serviceProviders=IIORegistry.getDefaultInstance().getServiceProviders(category, true);
				while(serviceProviders.hasNext()){
					ImageReaderWriterSpi provider=serviceProviders.next();
					map.put(category, provider);
					System.out.println(category+": "+Arrays.asList(provider.getFileSuffixes()));
				}
			}return Collections.unmodifiableMap(map);
		}

		public final String name;

		private IMAGE_FORMATS() {this(null);}
		private IMAGE_FORMATS(String name) {
			this.name=name;
		}

		public static IMAGE_FORMATS get(RenderedImage image) {
			if (image!=null){
				SampleModel sm=image.getSampleModel();
				int size=sm.getSampleSize(0);
				int bands=sm.getNumBands();
				ColorModel cm=image.getColorModel();
				// 1-bit bilevel (Black & White) -> PNG preferred (saveAuto handles BMP fallback)
				if (size==1) return IMAGE_FORMATS.PNG;
				// Images with transparency -> PNG required to preserve alpha channel background
				if (cm!=null && cm.hasAlpha()) return IMAGE_FORMATS.PNG;
				// Indexed Palette (<= 256 colors) -> GIF (change to PNG if you want to phase out GIF)
				if (cm instanceof IndexColorModel) return IMAGE_FORMATS.GIF;
				// 8-bit Grayscale without alpha (e.g., scanned documents) -> PNG for lossless compression
				if (bands==1 && size==8) return IMAGE_FORMATS.PNG;
				// High-density RGB/TrueColor images without alpha (e.g., photos) -> JPEG for optimal compression
				if (bands>=3 && size>=8) return IMAGE_FORMATS.JPEG;
			}// Generic fallback safeguard
			return IMAGE_FORMATS.PNG;

		}

	}

	protected final RenderedImage image;

	public RenderedImageHandler(RenderedImage image) {
		this.image=image;
	}


	/** @see Raster#getPixels(int, int, int, int, int[])*/
	@Deprecated
	public int[] getPixels() {
		return image==null ? new int[0] : image.getData().getPixels(0, 0, image.getWidth(), image.getHeight(), (int[])null);
	}

	/** @see ImageIO#write(RenderedImage, String, ImageOutputStream) */
	public byte[] getBytes(IMAGE_FORMATS format) {
		if (image!=null) try{
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			try{ImageOutputStream ios=ImageIO.createImageOutputStream(baos);
				try{ImageIO.write(image, format.name, ios);
				}finally{
					ios.flush();
					ios.close();
				}return baos.toByteArray();
			}finally{
				baos.close();
			}

		}catch(IOException e){
			System.err.println(e);
		}return null;
	}

	/** @see ImageIO#write(RenderedImage, String, File) */
	public boolean save(IMAGE_FORMATS format, File file) {
		if (image!=null) try{
			return ImageIO.write(image, format.name, file);
		}catch(IOException e){
			System.err.println(e);
		}return false;
	}

	/** @see RenderedImageHandler#getBytes(IMAGE_FORMATS) */
	public String toBase64String(IMAGE_FORMATS format) {
		return Base64.encodeBase64String(getBytes(format));
	}

}