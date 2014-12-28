/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.dma.utils.java.Debug;
import org.dma.utils.java.awt.ImageUtils;
import org.dma.utils.eclipse.swt.graphics.SWTImageUtils;

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