/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;

public class CustomBrowser extends Browser {

	public CustomBrowser(Composite parent){
		super(parent, SWT.NONE);
	}

	public CustomBrowser(Composite parent, int style){
		super(parent, style);
	}


	public void setInvisible() {
		try {
			setVisible(false);
			setBounds(0, 0, 1, 1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	//metodos protegidos
	protected void checkSubclass() {}


}
