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
package org.dma.eclipse.swt.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

public class ImageHandler {

	public static final int IMAGE_BMP = SWT.IMAGE_BMP;
	public static final int IMAGE_GIF = SWT.IMAGE_GIF;
	public static final int IMAGE_ICO = SWT.IMAGE_ICO;
	public static final int IMAGE_JPEG = SWT.IMAGE_JPEG;
	public static final int IMAGE_PNG = SWT.IMAGE_PNG;

	private final Image image;

	public ImageHandler(Image image) {
		this.image=image;
	}

	/**
	 * Saves an {@link Image}
	 * to file in the specified {@link SWT} format.
	 */
	public boolean save(String filename, int format) {
		try{ImageLoader saver=new ImageLoader();
			saver.data=new ImageData[]{image.getImageData()};
			saver.save(filename, format);
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


}