/*******************************************************************************
 * 2008-2020 Public Domain
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
	public boolean save(String pathname, int format) {
		try{
			ImageLoader saver=new ImageLoader();
			saver.data=new ImageData[]{image.getImageData()};
			saver.save(pathname, format);

		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


}