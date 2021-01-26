/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface;

import java.awt.image.BufferedImage;

import org.dma.eclipse.swt.widgets.CustomImageDescriptor;
import org.dma.java.awt.ImageUtils;
import org.dma.java.util.Debug;

import org.eclipse.jface.action.Action;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getName();

	/** @see Action */
	public CustomAction() {
		Debug.out("ID", ID);
		setId(ID);
	}

	public void setImageDescriptor(String imagePath) {
		setImageDescriptor(ImageUtils.createImage(imagePath));
	}

	@Deprecated
	void setImageDescriptor(String imagePath, int imageSize) {
		setImageDescriptor(ImageUtils.createImage(imagePath, imageSize));
	}

	public void setImageDescriptor(BufferedImage image) {
		setImageDescriptor(new CustomImageDescriptor(image));
	}

	/** @see Action#setEnabled(boolean) */
	public void enable() {
		setEnabled(true);
	}

	/** @see Action#setEnabled(boolean) */
	public void disable() {
		setEnabled(false);
	}

}