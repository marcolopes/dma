/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import java.awt.image.BufferedImage;

import org.dma.java.awt.ImageUtils;
import org.dma.java.util.Debug;

import org.eclipse.jface.action.Action;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getCanonicalName();

	/** @see Action */
	public CustomAction() {
		Debug.out("ID", ID);
		setId(ID);
	}

	public void setImageDescriptor(String imagePath) {
		setImageDescriptor(ImageUtils.createImage(imagePath));
	}

	public void setImageDescriptor(String imagePath, int imageSize) {
		setImageDescriptor(ImageUtils.createImage(imagePath, imageSize));
	}

	public void setImageDescriptor(BufferedImage bufferedImage) {
		setImageDescriptor(new CustomImageDescriptor(bufferedImage));
	}

}