/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import java.util.ArrayList;
import java.util.Collection;

import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class CustomTable extends Table {

	/*
	 * Styles
	 */
	public static final int STYLE_SINGLE = SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION;
	public static final int STYLE_MULTI =  SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION;

	@Override //subclassing
	protected void checkSubclass() {}

	private boolean busy=false;

	/** @see Table#Table(Composite, int) */
	public CustomTable(Composite parent, int style) {
		super(parent, style);
		setLinesVisible(true);
		setHeaderVisible(true);
	}


	public CustomTableColumn createColumn(int style) {
		return createColumn(style, 0);
	}

	public CustomTableColumn createColumn(int style, int widthPercentage) {
		CustomTableColumn column=new CustomTableColumn(this, style);
		column.setWidthPercentage(widthPercentage);
		return column;
	}


	/** @see TableColumn#setResizable */
	public void setResizable(boolean resizable) {
		for(TableColumn column: getColumns()){
			column.setResizable(resizable);
		}
	}

	public void addResizeListener(final int minWidth) {
		addControlListener(new ControlAdapter(){
			private int width=0;
			@Override
			public void controlResized(ControlEvent e){
				//table width changed?
				if (width!=getSize().x){
					//width = x coordinate
					width=getSize().x;
					resizeColumns(minWidth);
				}
			}
		});
	}

	public void resizeColumns(int minWidth) {
		if (busy) return;
		busy=true;
		setRedraw(false);
		int totalPercentage=0;
		int tableWidth=Math.max(getClientArea().width, minWidth);
		//columns with undefined WIDTH
		Collection<TableColumn> columns=new ArrayList();
		for(TableColumn column: getColumns()){
			int width=0;
			if (column instanceof CustomTableColumn){
				CustomTableColumn customColumn=(CustomTableColumn)column;
				totalPercentage+=customColumn.getWidthPercentage();
				width=tableWidth * customColumn.getWidthPercentage() / 100;
			}//set DEFINED WIDTH
			if (width>0) column.setWidth(width);
			else columns.add(column);
		}
		if (totalPercentage<0 || totalPercentage>100){
			Debug.err("Wrong total percentage: "+totalPercentage);
		}else if (columns.size()>0){
			int remainingWidth=tableWidth * (100-totalPercentage) / 100;
			if (remainingWidth==0){
				Debug.err("No remaining width for "+columns.size()+" columns");
			}else{
				int width=remainingWidth / columns.size();
				for(TableColumn column: columns) column.setWidth(width);
			}
		}
		setRedraw(true);
		busy=false;
	}


}