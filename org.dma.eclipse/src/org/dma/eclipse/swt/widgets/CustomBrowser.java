/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.apache.commons.lang.SystemUtils;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public final class CustomBrowser extends Browser {

	@Override //subclassing
	protected void checkSubclass() {}

	public static Integer detectStyle(Composite parent) {
		//WINDOWS
		if (SystemUtils.IS_OS_WINDOWS) return SWT.NONE;
		//LINUX e MAC
		for(int style: new int[]{SWT.MOZILLA, SWT.WEBKIT}){
			try{
				System.out.print("STYLE: "+style);
				Browser b=new Browser(parent, style);
				b.dispose();
				return style;

			}catch(SWTError e){
				Debug.err(e);
			}catch(SWTException e){
				Debug.err(e);
			}catch(Exception e){
				Debug.err(e);
			}
		}return null;
	}

	/**
	 * Creates a Browser with a new shell as a parent
	 * <p>
	 * A new shell is created with style SWT.NONE and
	 * bounds are set to 0 to make it invisible.
	 *
	 * @see CustomBrowser#CustomBrowser(Display)
	 */
	public CustomBrowser(Display display) {
		this(new Shell(display,SWT.NONE));
		getShell().setBounds(0, 0, 0, 0);
	}

	/**
	 * Creates a platform dependant browser
	 *
	 * @see CustomBrowser#CustomBrowser(Composite)
	 */
	public CustomBrowser(Composite parent) {
		this(parent, detectStyle(parent));
	}

	/**
	 * Creates a platform dependant browser
	 * <p>
	 * <b>If running on Linux or Mac</b>
	 * one of these should be present in VM parameters:<br>
	 * -Dorg.eclipse.swt.browser.DefaultType=mozilla<br>
	 * -Dorg.eclipse.swt.browser.DefaultType=webkit
	 *
	 * @see CustomBrowser#CustomBrowser(Composite, int)
	 */
	public CustomBrowser(Composite parent, int style) {
		super(parent, style);
	}


}