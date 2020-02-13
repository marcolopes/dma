/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class CustomTableColumn extends TableColumn {

	@Override //subclassing
	protected void checkSubclass() {}

	private int widthPercentage=0;

	/** @see TableColumn#TableColumn(Table, int) */
	public CustomTableColumn(Table parent, int style) {
		super(parent, style);
	}


	public int getWidthPercentage() {
		return widthPercentage;
	}

	public void setWidthPercentage(int widthPercentage) {
		this.widthPercentage=widthPercentage;
	}


}