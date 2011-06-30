/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CustomShell extends Shell {

	/*
	 * Styles
	 */
	public static final int STYLE_FIXED = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE;
	public static final int STYLE_RESIZABLE = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE | SWT.RESIZE | SWT.MAX | SWT.MIN;
	public static final int STYLE_MESSAGE = SWT.PRIMARY_MODAL| SWT.TITLE;

	//subclassing
	protected void checkSubclass() {}


	public CustomShell(Display display, int style) {
		super(display, style);
	}

	public CustomShell(Shell parent, int style) {
		super(parent, style);
	}


	public void open(){
		try {
			Rectangle parentBounds = getParent().getBounds();
			Rectangle childBounds = getBounds();
			int x = parentBounds.x + (parentBounds.width - childBounds.width) / 2;
			int y = parentBounds.y + (parentBounds.height - childBounds.height) / 2;
			setLocation (x, y);

			super.open();
			setFocus();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}