/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CustomTabItem extends TabItem {

	//subclassing
	protected void checkSubclass() {}

	public CustomTabItem(TabFolder parent) {
		this(parent, SWT.NONE);
	}

	public CustomTabItem(TabFolder parent, int style) {
		super(parent, style);
	}


	public void update() {
		if (isDisposed()) return;
		getControl().update();
	}


	public boolean isSelected() {
		if (isDisposed()) return false;
		Control control=getParent().getSelection()[0].getControl();
		//tab seleccionado?
		return control!=null && control.equals(getControl());
	}

}