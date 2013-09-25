/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

public class CustomCTabItem extends CTabItem {

	//subclassing
	protected void checkSubclass() {}

	public CustomCTabItem(CTabFolder parent) {
		super(parent, SWT.NONE);
	}


	public void setStyle(int style) {

		FontData[] fd = getFont().getFontData();
		for(int i=0; i<fd.length; i++){
			fd[i].setStyle(style);
		}

		setFont(new Font(getDisplay(), fd));

	}

}