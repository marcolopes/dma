/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class CustomButton extends Button {

	//subclassing
	protected void checkSubclass() {}

	public CustomButton(Composite parent, String text, Image image) {
		super(parent, SWT.NONE);

		setToolTipText(text);
		setImage(image);
	}


}