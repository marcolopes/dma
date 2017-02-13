/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
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
	public boolean saveImage(String filename, int format) {
		try{
			ImageLoader saver=new ImageLoader();
			saver.data=new ImageData[]{image.getImageData()};
			saver.save(filename, SWT.IMAGE_PNG);

		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}


	public boolean savePNG(String filename) {
		return saveImage(filename, SWT.IMAGE_PNG);
	}


	public boolean saveJPEG(String filename) {
		return saveImage(filename, SWT.IMAGE_JPEG);
	}


}