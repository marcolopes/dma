/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.utils.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolTip;

public class CustomToolTip extends ToolTip {

	@Override //subclassing
	protected void checkSubclass() {}

	private final Shell parent;

	public CustomToolTip(Shell parent, String text) {
		super(parent, SWT.BALLOON | SWT.ICON_INFORMATION);
		this.parent=parent;
		setText(text);
		setAutoHide(false);
	}


	public void show(String message) {
		setVisible(false); // clear
		setMessage(message);
		setLocation(parent.getLocation());
		setVisible(true);
	}


}