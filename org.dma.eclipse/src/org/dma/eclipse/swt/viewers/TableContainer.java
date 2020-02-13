/*******************************************************************************
 * 2010-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import org.dma.java.util.ArrayUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public abstract class TableContainer {

	public abstract void editObject();
	public abstract void updateTable();

	private final MouseAdapter tableDoubleClickListener=new MouseAdapter() {
		@Override
		public void mouseDoubleClick(MouseEvent e) {
			if(getSelectionIndex()!=-1) editObject();
		}
	};

	private final KeyListener tableEnterKeyListener=new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.keyCode){
			case SWT.CR:
			case SWT.KEYPAD_CR: if (getSelectionIndex()!=-1) editObject(); break;
			}
		}
	};

	protected final Table table;

	public TableContainer(Table table) {
		this(table, SWT.NONE);
	}

	/**
	 * @param table
	 * @param direction
	 * {@link SWT#UP}
	 * {@link SWT#DOWN}
	 * {@link SWT#NONE}
	 */
	public TableContainer(Table table, int direction) {
		this.table=table;

		if (direction==SWT.UP || direction==SWT.DOWN) addSortColumnSupport(direction);
		addTableListeners();
	}


	public void dispose() {
		removeTableListeners();
		//table.dispose();
	}



	/*
	 * Listeners
	 */
	private void addTableListeners() {
		table.addMouseListener(tableDoubleClickListener);
		table.addKeyListener(tableEnterKeyListener);
	}

	private void removeTableListeners() {
		table.removeMouseListener(tableDoubleClickListener);
		table.removeKeyListener(tableEnterKeyListener);
	}



	/*
	 * Table
	 */
	private void addSortColumnSupport(int direction) {

		table.setSortColumn(table.getColumn(0));
		table.setSortDirection(direction);

		for(TableColumn column: table.getColumns()){
			column.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					TableColumn column=(TableColumn)e.widget;
					//avoids if unselected
					if (table.getSortColumn().getText().equals(column.getText())){
						//inverts sort direction
						table.setSortDirection(table.getSortDirection()==SWT.UP ? SWT.DOWN : SWT.UP);
					}
					table.setSortColumn(column);
					updateTable();
				}
			});
		}

	}


	public void forceFocus() {
		table.forceFocus();
	}

	public int computeSize() {
		return (table.getClientArea().height-table.getHeaderHeight()+table.getItemHeight()-1) /
				table.getItemHeight();
	}

	public void moveSelectionUp(boolean wrap) {
		int index=getSelectionIndex();
		table.select(index<=0 && wrap ? table.getItemCount()-1 : index-1);
		table.showSelection();
	}

	public void moveSelectionDown(boolean wrap) {
		int index=getSelectionIndex();
		table.select(index==table.getItemCount()-1 && wrap ? 0 : index+1);
		table.showSelection();
	}

	public int getOrderingIndex() {
		return ArrayUtils.indexOrFirst(table.getColumns(), table.getSortColumn());
	}

	public int getSelectionIndex() {
		return table.getSelectionIndex();
	}

	public int[] getSelectionIndices() {
		return table.getSelectionIndices();
	}

	public Table getTable() {
		return table;
	}


}