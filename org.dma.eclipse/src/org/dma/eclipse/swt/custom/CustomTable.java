/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import java.util.ArrayList;
import java.util.Collection;

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

	public CustomTable(Composite parent, int style) {
		super(parent, style);
		setLinesVisible(true);
		setHeaderVisible(true);
	}


	public void addResizeListener(final int minimumWidth) {
		addControlListener(new ControlAdapter(){
			private boolean busy=false;
			@Override
			public void controlResized(ControlEvent e){
				if(busy) return;
				busy=true;
				setRedraw(false);
				int remainingPercentage=100;
				int clientWidth=Math.max(getClientArea().width, minimumWidth);
				Collection <TableColumn> columns=new ArrayList();
				for(TableColumn column: getColumns()){
					int width=0;
					if (column instanceof CustomTableColumn){
						CustomTableColumn customColumn=(CustomTableColumn)column;
						width=(int)(clientWidth * customColumn.getWidthPercentage() / 100);
						remainingPercentage-=customColumn.getWidthPercentage();
					}
					if (width>0) column.setWidth(width);
					else columns.add(column);
				}
				if (remainingPercentage<0){
					System.err.println("Wrong total percentage: "+(100-remainingPercentage));
				}
				else if (columns.size()>0){
					int width=(clientWidth * remainingPercentage) / (columns.size() * 100);
					if (width==0) System.err.println("Columns NOT visible: "+columns.size());
					else for(TableColumn column: columns){
						column.setWidth(width);
					}
				}
				setRedraw(true);
				busy=false;
			}
		});
	}


	public CustomTableColumn createColumn(int style) {
		return createColumn(SWT.NONE, 0);
	}

	public CustomTableColumn createColumn(int style, int widthPercentage) {
		CustomTableColumn column=new CustomTableColumn(this, SWT.NONE);
		column.setWidthPercentage(widthPercentage);
		return column;
	}


	/** Afects already defined columns */
	public void setResizable(boolean resizable) {
		for(TableColumn column: getColumns()){
			column.setResizable(resizable);
		}
	}


}