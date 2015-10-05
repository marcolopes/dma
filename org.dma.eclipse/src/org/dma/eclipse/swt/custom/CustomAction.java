/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import java.awt.image.BufferedImage;

import org.dma.eclipse.swt.graphics.SWTImageUtils;
import org.dma.java.awt.ImageUtils;
import org.dma.java.util.Debug;

import org.eclipse.jface.action.Action;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getName();

	public CustomAction() {
		Debug.out("ID", ID);
		setId(ID);
	}

	public void setImageDescriptor(BufferedImage bufferedImage, int imageSize) {
		setImageDescriptor(ImageUtils.resizeImage(bufferedImage, imageSize));
	}

	public void setImageDescriptor(BufferedImage bufferedImage) {
		setImageDescriptor(SWTImageUtils.getImageDescriptor(bufferedImage));
	}

}