/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.dma.eclipse.swt.graphics.SWTImageUtils;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getName();

	public CustomAction(String toolTip, String imagePath){
		this(toolTip, SWTImageUtils.getImageDescriptor(imagePath));
	}

	public CustomAction(String toolTip, ImageDescriptor image){
		this();
		setToolTipText(toolTip);
		setImageDescriptor(image);
	}

	public CustomAction() {
		setId(ID);
	}


}