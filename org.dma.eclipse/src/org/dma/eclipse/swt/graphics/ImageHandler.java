/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

public class ImageHandler {

	private final Image image;

	public ImageHandler(Image image) {
		this.image=image;
	}

	/**
	 * Saves an {@link Image}
	 * to file in the specified {@link SWT} format.
	 */
	public boolean saveImage(String pathname, int format) {
		try{
			ImageLoader saver=new ImageLoader();
			saver.data=new ImageData[]{image.getImageData()};
			saver.save(pathname, SWT.IMAGE_PNG);

		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}


	public boolean savePNG(String pathname) {
		return saveImage(pathname, SWT.IMAGE_PNG);
	}


	public boolean saveJPEG(String pathname) {
		return saveImage(pathname, SWT.IMAGE_JPEG);
	}


}