/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Mode;
import org.imgscalr.Scalr.Rotation;

public class ImageHandler extends RenderedImageHandler {

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

	/**
	 * Returns a {@link BufferedImage}
	 * encoded by the specified buffer.
	 */
	public static BufferedImage createImage(byte[] bytes) {
		if (bytes!=null) try{return drawImage(ImageIO.read(new ByteArrayInputStream(bytes)));
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
			try{return drawImage(ImageIO.read(stream));
			}finally{
				stream.close();
			}
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	private final BufferedImage image;

	/** @see ImageHandler#createImage(byte[]) */
	public ImageHandler(byte[] bytes) {
		this(createImage(bytes));
	}

	/** @see ImageHandler#createImage(String) */
	public ImageHandler(String pathname) {
		this(createImage(pathname));
	}

	/** @see ImageHandler#createImage(Class, String) */
	public ImageHandler(Class location, String resource) {
		this(createImage(location, resource));
	}

	public ImageHandler(BufferedImage image) {
		super(image);
		this.image=image;
	}


	/** @see Scalr#resize(BufferedImage, int, BufferedImageOp...) */
	public BufferedImage resize(int targetSize,	BufferedImageOp... ops) {
		if (image!=null) try{
			return targetSize==0 ? image : Scalr.resize(image, targetSize, ops);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	/** @see Scalr#resize(BufferedImage, Mode, int, BufferedImageOp...) */
	public BufferedImage resize(Mode resizeMode, int targetSize, BufferedImageOp... ops) {
		if (image!=null) try{
			return targetSize==0 ? image : Scalr.resize(image, resizeMode, targetSize, ops);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	/** @see Scalr#rotate(BufferedImage, Rotation, BufferedImageOp...) */
	public BufferedImage rotate(Rotation rotation, BufferedImageOp... ops) {
		if (image!=null) try{
			return Scalr.rotate(image, rotation, ops);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

}