/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.dma.eclipse.swt.graphics.SWTImageUtils;
import org.dma.java.Debug;
import org.dma.java.awt.ImageUtils;

import org.eclipse.jface.action.Action;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getName();

	public CustomAction() {
		Debug.out("ID", ID);
		setId(ID);
	}


	public void setImageDescriptor(String imagePath, int imageSize) {
		setImageDescriptor(SWTImageUtils.getImageDescriptor(
				ImageUtils.resizeImage(imagePath, imageSize)));
	}

	public void setImageDescriptor(String imagePath) {
		setImageDescriptor(SWTImageUtils.getImageDescriptor(imagePath));
	}

}