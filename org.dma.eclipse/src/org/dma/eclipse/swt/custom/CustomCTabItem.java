/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Control;

public class CustomCTabItem extends CTabItem {

	@Override //subclassing
	protected void checkSubclass() {}

	public CustomCTabItem(CTabFolder parent) {
		this(parent, SWT.NONE);
	}

	/** @see CTabItem#CTabItem(CTabFolder, int) */
	public CustomCTabItem(CTabFolder parent, int style) {
		super(parent, style);
	}


	public void update() {
		if (isDisposed()) return;
		getControl().update();
	}


	public boolean isSelected() {
		if (isDisposed()) return false;
		Control control=getParent().getSelection().getControl();
		//tab seleccionado?
		return control!=null && control.equals(getControl());
	}


	public void setFontStyle(int style) {
		FontData[] fd = getFont().getFontData();
		for(int i=0; i<fd.length; i++){
			fd[i].setStyle(style);
		}
		setFont(new Font(getDisplay(), fd));
	}

}