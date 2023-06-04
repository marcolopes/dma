/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.graphics;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.util.Arrays;

import org.dma.eclipse.swt.widgets.CustomImageDescriptor;
import org.dma.java.awt.ImageUtils;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class ImageManager {

	/** Returns the {@link Image} key based on image-size hash */
	public static String getKey(Integer size) {
		return "size:"+String.valueOf(size.hashCode());
	}

	/** Returns the {@link Image} key based on image-path string */
	public static String getKey(String imagePath) {
		return "path:"+imagePath;
	}

	/** Returns the {@link Image} key based on image-bytes hash */
	public static String getKey(byte[] bytes) {
		return "bytes:"+String.valueOf(Arrays.hashCode(bytes));
	}

	/** Returns the {@link Image} key based on {@link RenderedImage} hash */
	public static String getKey(RenderedImage image) {
		return "pixels:"+String.valueOf(Arrays.hashCode(ImageUtils.getImagePixels(image)));
	}

	public interface IImageRegistry {
		/** @see ImageRegistry#get(String) */
		Image get(String key);
		/** @see ImageRegistry#put(String, Image) */
		void put(String key, Image image);
		/** @see ImageRegistry#remove(String) */
		void remove(String key);
		/** Returns the CACHED {@link Image} or a new one if not CACHED */
		Image getImage(Integer size);
		/** Returns the CACHED {@link Image} or a new one if not CACHED */
		Image getImage(String imagePath);
		/** Returns the CACHED {@link Image} or a new one if not CACHED */
		Image getImage(byte[] bytes);
		/** Returns the CACHED {@link Image} or a new one if not CACHED */
		Image getImage(BufferedImage bufferedImage);
	}

	private static class CustomImageRegistry implements IImageRegistry {
		static{Debug.out();}
		@Override
		public Image get(String key) {return null;}
		@Override
		public void put(String key, Image image) {}
		@Override
		public void remove(String key) {}
		@Override
		public Image getImage(Integer size) {return null;}
		@Override
		public Image getImage(String imagePath) {return null;}
		@Override
		public Image getImage(byte[] bytes) {return null;}
		@Override
		public Image getImage(BufferedImage bufferedImage) {return null;}
	}

	public static class ImageRegistry extends org.eclipse.jface.resource.ImageRegistry implements IImageRegistry {
		static{Debug.out();}
		@Override
		public Image getImage(Integer size) {
			String key=getKey(size);
			Image image=get(key);
			if (image==null) try{
				image=new Image(Display.getCurrent(), size, size);
				put(key, image);
				GC gc=new GC(image);
				gc.setBackground(ColorManager.getColor(SWT.TRANSPARENT));
				gc.fillRectangle(0, 0, size, size);
				gc.dispose();
			}catch(Exception e){
				System.err.println(e);
			}return image;
		}
		@Override
		public Image getImage(String imagePath) {
			String key=getKey(imagePath);
			Image image=get(key);
			if (image==null) try{
				put(key, image=new CustomImageDescriptor(imagePath).createImage());
			}catch(Exception e){
				System.err.println(e);
			}return image;
		}
		@Override
		public Image getImage(byte[] bytes) {
			String key=getKey(bytes);
			Image image=get(key);
			if (image==null) try{
				put(key, image=new CustomImageDescriptor(bytes).createImage());
			}catch(Exception e){
				System.err.println(e);
			}return image;
		}
		@Override
		public Image getImage(BufferedImage bufferedImage) {
			String key=getKey(bufferedImage);
			Image image=get(key);
			if (image==null) try{
				put(key, image=new CustomImageDescriptor(bufferedImage).createImage());
				bufferedImage.flush();
			}catch(Exception e){
				System.err.println(e);
			}return image;
		}
	}

	public static final IImageRegistry REGISTRY = Display.getCurrent()==null ? new CustomImageRegistry() : new ImageRegistry();

	/**
	 * It can be used as placeholder for missing image.
	 * @see ImageRegistry#getImage(Integer)
	 */
	public static Image getImage(Integer size) {
		return REGISTRY.getImage(size);
	}

	/** @see ImageRegistry#getImage(String) */
	public static Image getImage(String imagePath) {
		return REGISTRY.getImage(imagePath);
	}

	/** @see ImageRegistry#getImage(byte[]) */
	public static Image getImage(byte[] bytes) {
		return REGISTRY.getImage(bytes);
	}

	/** @see ImageRegistry#getImage(BufferedImage) */
	public static Image getImage(BufferedImage bufferedImage) {
		return REGISTRY.getImage(bufferedImage);
	}

}