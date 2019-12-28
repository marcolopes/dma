/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

public class CustomCTabItem extends CTabItem {

	@Override //subclassing
	protected void checkSubclass() {}

	/** @see CTabItem#CTabItem(CTabFolder, int) */
	public CustomCTabItem(CTabFolder parent, int style) {
		super(parent, style);
	}

	/** @see CTabItem#CTabItem(CTabFolder, int, int) */
	public CustomCTabItem(CTabFolder parent, int style, int index) {
		super(parent, style, index);
	}

	public void setFocus() {}


	public void update() {
		if (isDisposed()) return;
		getControl().update();
		setFocus();
	}


	public void select() {
		if (isDisposed()) return;
		getParent().setSelection(this);
		setFocus();
	}


	public boolean isSelected() {
		if (isDisposed()) return false;
		CTabItem selection=getParent().getSelection();
		return selection!=null && selection.equals(this);
	}


	public void setFontStyle(int style) {
		FontData[] fd = getFont().getFontData();
		for(int i=0; i<fd.length; i++){
			fd[i].setStyle(style);
		}
		setFont(new Font(getDisplay(), fd));
	}

}