/*******************************************************************************
 * 2010-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dma.java.util.ArrayUtils;
import org.dma.java.util.ClipboardManager;
import org.dma.java.util.Debug;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
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

public abstract class TableViewerContainer<T> {

	public abstract T getNewObject();
	public abstract void insertObject();
	public abstract void removeObject();
	public abstract void createObject();
	public abstract void copyObject();
	public abstract void editObject();
	public abstract Collection<T> retrieveObjects();

	private final MouseAdapter tableDoubleClickListener=new MouseAdapter() {
		@Override
		public void mouseDoubleClick(MouseEvent e) {
			if(getSelectionElement()!=null) {
				editObject();
			}
		}
	};

	private final KeyListener tableEnterKeyListener=new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.keyCode==SWT.CR || e.keyCode==SWT.KEYPAD_CR){
				if(getSelectionElement()!=null) {
					editObject();
				}
			}
		}
	};

	private final List<T> objectCollection=new ArrayList();

	protected final TableViewer viewer;

	public TableViewerContainer(TableViewer viewer) {
		this.viewer=viewer;
		this.viewer.setContentProvider(ArrayContentProvider.getInstance());
		this.viewer.setInput(objectCollection);

		addTableListeners();
	}


	public void dispose() {
		clearTable();
		removeTableListeners();
		//getTable().dispose();
	}



	/*
	 * Listeners
	 */
	private void addTableListeners() {

		getTable().addMouseListener(tableDoubleClickListener);
		getTable().addKeyListener(tableEnterKeyListener);

	}


	private void removeTableListeners() {

		getTable().removeMouseListener(tableDoubleClickListener);
		getTable().removeKeyListener(tableEnterKeyListener);

	}


	public void addSortColumnSupport(int direction) {

		getTable().setSortColumn(getTable().getColumn(0));
		getTable().setSortDirection(direction);

		for(TableColumn column: getTable().getColumns()){
			column.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					TableColumn column=(TableColumn)e.widget;
					//avoids if unselected
					if(getTable().getSortColumn().getText().equals(column.getText())){
						//inverts sort direction
						getTable().setSortDirection(getTable().getSortDirection()==SWT.UP ?
							SWT.DOWN : SWT.UP);
					}
					getTable().setSortColumn(column);
					updateTable();
				}
			});
		}

	}



	/*
	 * Table
	 */
	public int computeSize() {
		int visibleCount=(getTable().getClientArea().height-
				getTable().getHeaderHeight()+getTable().getItemHeight()-1) /
					getTable().getItemHeight();
		return visibleCount;
	}


	public int getOrderingIndex() {
		return ArrayUtils.indexOrFirst(getTable().getColumns(), getTable().getSortColumn());
	}


	public void forceTableFocus() {
		getTable().forceFocus();
	}


	public void clearTable(){
		objectCollection.clear();
		viewer.refresh();
	}


	public void updateTable() {
		updateTable(false);
	}


	public void updateTable(boolean updateLabels) {
		objectCollection.clear();
		objectCollection.addAll(retrieveObjects());
		viewer.refresh(updateLabels);
	}


	public void moveSelectionUp(boolean wrap) {
		int index=getTable().getSelectionIndex();
		getTable().select(index<=0 && wrap ? getTable().getItemCount()-1 : index-1);
		getTable().showSelection();
	}


	public void moveSelectionDown(boolean wrap) {
		int index=getTable().getSelectionIndex();
		getTable().select(index==getTable().getItemCount()-1 && wrap ? 0 : index+1);
		getTable().showSelection();
	}



	/*
	 * Viewer
	 */
	public void setEnabled(boolean enabled) {
		viewer.getControl().setEnabled(enabled);
	}

	public int getSelectionIndex() {
		return getTable().getSelectionIndex();
	}

	public int[] getSelectionIndices() {
		return getTable().getSelectionIndices();
	}

	public T getSelectionElement() {
		StructuredSelection selection=(StructuredSelection)viewer.getSelection();
		return (T)selection.getFirstElement();
	}

	public List<T> getSelectionList() {
		StructuredSelection selection=(StructuredSelection)viewer.getSelection();
		return selection.toList();
	}

	public void copySelectionToClipboard() {
		List<T> selectionList=getSelectionList();
		Debug.out("Selection", selectionList);
		ClipboardManager.copyToClipboard(selectionList);
	}



	/*
	 * Getters and setters
	 */
	public List<T> getCollection() {
		return objectCollection;
	}

	public boolean isEmpty() {
		return getCollection().isEmpty();
	}

	public TableViewer getViewer() {
		return viewer;
	}

	public Table getTable() {
		return getViewer().getTable();
	}


}