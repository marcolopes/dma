/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class CustomTableColumn extends TableColumn {

	@Override //subclassing
	protected void checkSubclass() {}

	private float widthPercentage=0;

	public CustomTableColumn(Table parent, int style) {
		super(parent, style);
	}


	public float getWidthPercentage() {
		return widthPercentage;
	}

	public void setWidthPercentage(float widthPercentage) {
		this.widthPercentage=widthPercentage;
	}


}