/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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

import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

public class ImageHandler {

	public static final String IMAGE_BMP = "bmp";
	public static final String IMAGE_GIF = "gif";
	public static final String IMAGE_JPEG = "jpg";
	public static final String IMAGE_PNG = "png";

	private final RenderedImage image;

	public ImageHandler(RenderedImage image) {
		this.image=image;
	}

	/**
	 * Writes the image using {@link ImageIO}
	 * to array, in the specified format.
	 */
	public byte[] getBytes(String formatName) {
		try{ByteArrayOutputStream baos=new ByteArrayOutputStream();
			try{ImageOutputStream ios=ImageIO.createImageOutputStream(baos);
				try{ImageIO.write(image, formatName, ios);
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


	/**
	 * Writes the image using {@link ImageIO}
	 * to file, in the specified format.
	 */
	public boolean save(File file, String formatName) {
		try{return ImageIO.write(image, formatName, file);
		}catch(IOException e){
			System.err.println(e);
		}return false;
	}


}