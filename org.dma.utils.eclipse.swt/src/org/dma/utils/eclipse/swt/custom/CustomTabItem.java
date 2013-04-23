/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CustomTabItem extends TabItem {

	//subclassing
	protected void checkSubclass() {}

	public CustomTabItem(TabFolder parent) {
		super(parent, SWT.NONE);
	}

	public CustomTabItem(TabFolder parent, int style) {
		super(parent, style);
	}


}