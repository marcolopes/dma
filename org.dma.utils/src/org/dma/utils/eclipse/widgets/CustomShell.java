/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CustomShell extends Shell {

	/*
	 * Styles
	 */
	public static final int STYLE_FIXED = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE;
	public static final int STYLE_RESIZABLE = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE | SWT.RESIZE | SWT.MAX | SWT.MIN;
	public static final int STYLE_MESSAGE = SWT.PRIMARY_MODAL| SWT.TITLE;

	public CustomShell(Display display) {
		super(display);
	}

	public CustomShell(Display display, int style) {
		super(display, style);
	}

	public CustomShell(Shell parent, int style) {
		super(parent, style);
	}


	//metodos protegidos
	protected void checkSubclass() {}


}