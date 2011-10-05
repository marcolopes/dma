/*******************************************************************************
 * 2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolTip;

public class CustomToolTip extends ToolTip {

	private final Shell parent;

	//subclassing
	protected void checkSubclass() {}

	public CustomToolTip(Shell parent, String text) {
		super(parent, SWT.BALLOON | SWT.ICON_INFORMATION);

		this.parent=parent;
		setText(text);
		setAutoHide(false);
	}


	public void show(String message) {
		setMessage(message);
		setLocation(parent.getLocation());
		setVisible(true);
	}


}