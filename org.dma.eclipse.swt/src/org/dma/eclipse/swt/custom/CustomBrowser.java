/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public final class CustomBrowser extends Browser {

	//subclassing
	protected void checkSubclass() {}

	/**
	 * Creates a Browser with a new shell as a parent
	 * <p>
	 * A new shell is created with style SWT.NONE and
	 * bounds are set to 0 to make it invisible.
	 */
	public CustomBrowser(Display display) {
		this(new Shell(display,SWT.NONE));
		getShell().setBounds(0, 0, 0, 0);
	}

	/**
	 * Creates a platform dependant browser
	 * <p>
	 * <b>One of these should be present in VM parameters:</b><br>
	 * -Dorg.eclipse.swt.browser.DefaultType=mozilla<br>
	 * -Dorg.eclipse.swt.browser.DefaultType=webkit
	 */
	public CustomBrowser(Composite parent) {
		super(parent, SWT.DEFAULT);
		//super(parent, SystemUtils.IS_OS_WINDOWS ? SWT.NONE : SWT.WEBKIT);
	}


	public boolean setFile(String filename) {
		return setUrl(filename);
	}


}