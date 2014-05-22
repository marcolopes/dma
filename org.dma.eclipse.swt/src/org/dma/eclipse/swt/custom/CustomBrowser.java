/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.apache.commons.lang.SystemUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public final class CustomBrowser extends Browser {

	//subclassing
	protected void checkSubclass() {}

	/**
	 * Creates a </ul>CustomBrowser with a new shell as a parent<br>
	 * A new shell is created with style SWT.NONE and
	 * bounds are set to 0 to make it invisible.
	 */
	public CustomBrowser(Display display) {
		this(new Shell(display,SWT.NONE));
		getShell().setBounds(0, 0, 0, 0);
	}

	/**
	 * Creates a platform dependant browser<br>
	 * Style <b>SWT.NONE</b> is used for Windows<br>
	 * Style <b>SWT.WEBKIT</b> is used for other Plaftorms
	 */
	public CustomBrowser(Composite parent) {
		super(parent, SystemUtils.IS_OS_WINDOWS ? SWT.NONE : SWT.WEBKIT);
	}


	public boolean setFile(String filename) {
		return setUrl(filename);
	}


}