/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.dma.utils.eclipse.swt.graphics.SWTImageUtils;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getName();

	public CustomAction() {
		setId(ID);
	}

	public CustomAction(String toolTip, ImageDescriptor image){
		this();
		setToolTipText(toolTip);
		setImageDescriptor(image);
	}

	public CustomAction(String toolTip, String imagePath){
		this(toolTip, SWTImageUtils.getImageDescriptor(imagePath));
	}


}