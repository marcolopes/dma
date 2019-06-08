/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolTip;

public class CustomToolTip extends ToolTip {

	@Override //subclassing
	protected void checkSubclass() {}

	/** @see ToolTip#ToolTip(Shell, int) */
	public CustomToolTip(Shell parent) {
		super(parent, SWT.BALLOON | SWT.ICON_INFORMATION);
		setAutoHide(false);
	}


	public void show(String text, String message) {
		setVisible(false); //clear
		setText(text);
		setMessage(message);
		setLocation(getParent().getLocation());
		setVisible(true);
	}


}