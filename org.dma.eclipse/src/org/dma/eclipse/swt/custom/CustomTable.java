/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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


	public void addSortSupport(int direction, final IAction refreshAction) {
		setSortColumn(getColumn(0));
		setSortDirection(direction);
		for(TableColumn column: getColumns()){
			column.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					TableColumn column=(TableColumn)e.widget;
					//avoids if unselected
					if (getSortColumn().getText().equals(column.getText())){
						//inverts sort direction
						setSortDirection(getSortDirection()==SWT.UP ? SWT.DOWN : SWT.UP);
					}
					setSortColumn(column);
					refreshAction.run();
				}
			});
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


	/** @see TableColumn#setResizable */
	public void setResizable(boolean resizable) {
		for(TableColumn column: getColumns()){
			column.setResizable(resizable);
		}
	}

	public void resizeColumns(int minWidth) {
		if (busy) return;
		busy=true;
		setRedraw(false);
		int remainingPercentage=100;
		int tableWidth=Math.max(getClientArea().width, minWidth);
		Collection <TableColumn> columns=new ArrayList();
		for(TableColumn column: getColumns()){
			int width=0;
			if (column instanceof CustomTableColumn){
				CustomTableColumn customColumn=(CustomTableColumn)column;
				remainingPercentage-=customColumn.getWidthPercentage();
				width=(int)(tableWidth * customColumn.getWidthPercentage() / 100);
			}
			if (width>0) column.setWidth(width);
			else columns.add(column);
		}
		if (remainingPercentage<0){
			System.err.println("Wrong total percentage: "+(100-remainingPercentage));
		}
		else if (columns.size()>0){
			int width=(tableWidth * remainingPercentage) / (columns.size() * 100);
			if (width==0){
				System.err.println("Zero width columns: "+columns.size());
			}else{
				for(TableColumn column: columns) column.setWidth(width);
			}
		}
		setRedraw(true);
		busy=false;
	}


}