/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;

public class CustomCTabItem extends CTabItem {

	//subclassing
	protected void checkSubclass() {}

	public CustomCTabItem(CTabFolder parent) {
		super(parent, SWT.NONE);
	}


}