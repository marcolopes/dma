/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolTip;

public class CustomToolTip extends ToolTip {

	@Override //subclassing
	protected void checkSubclass() {}

	private final Shell parent;

	public CustomToolTip(Shell parent) {
		super(parent, SWT.BALLOON | SWT.ICON_INFORMATION);
		this.parent=parent;
		setAutoHide(false);
	}


	public void show(String text, String message) {
		setVisible(false); //clear
		setText(text);
		setMessage(message);
		setLocation(parent.getLocation());
		setVisible(true);
	}


}