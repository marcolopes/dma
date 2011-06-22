/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CustomTabItem extends TabItem {


	public CustomTabItem(TabFolder parent) {
		super(parent, SWT.NONE);
	}

	public CustomTabItem(TabFolder parent, int style) {
		super (parent, style);
	}


	//metodos protegidos
	protected void checkSubclass() {}


}