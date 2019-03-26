/*******************************************************************************
 * 2010-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.dma.java.util.ArrayUtils;
import org.dma.java.util.ClipboardManager;
import org.dma.java.util.Debug;
import org.dma.java.util.ErrorList;

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

	public abstract ErrorList insertObject();
	public abstract ErrorList removeObject();
	public abstract void createObject();
	public abstract void copyObject();
	public abstract void editObject();
	public abstract T getNewObject();
	public abstract Collection<T> retrieveObjects();

	private final List<T> objectCollection=new ArrayList();

	private final MouseAdapter tableDoubleClickListener=new MouseAdapter() {
		@Override
		public void mouseDoubleClick(MouseEvent e) {
			if(getSelectionElement()!=null) editObject();
		}
	};

	private final KeyListener tableEnterKeyListener=new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.keyCode){
			case SWT.CR:
			case SWT.KEYPAD_CR: if (getSelectionElement()!=null) editObject(); break;
			}
		}
	};

	protected final TableViewer viewer;
	protected final Table table;

	public TableViewerContainer(TableViewer viewer) {
		this.viewer=viewer;
		this.table=viewer.getTable();
		this.viewer.setContentProvider(ArrayContentProvider.getInstance());
		this.viewer.setInput(objectCollection);

		addTableListeners();
	}


	public void dispose() {
		clearTable();
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


	public void addSortColumnSupport(int direction) {

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



	/*
	 * Table
	 */
	public int computeSize() {
		int visibleCount=(table.getClientArea().height-
				table.getHeaderHeight()+table.getItemHeight()-1) /
					table.getItemHeight();
		return visibleCount;
	}


	public int getOrderingIndex() {
		return ArrayUtils.indexOrFirst(table.getColumns(), table.getSortColumn());
	}


	public void forceTableFocus() {
		table.forceFocus();
	}


	public void clearTable() {
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
		int index=table.getSelectionIndex();
		table.select(index<=0 && wrap ? table.getItemCount()-1 : index-1);
		table.showSelection();
	}


	public void moveSelectionDown(boolean wrap) {
		int index=table.getSelectionIndex();
		table.select(index==table.getItemCount()-1 && wrap ? 0 : index+1);
		table.showSelection();
	}



	/*
	 * Viewer
	 */
	public void setEnabled(boolean enabled) {
		viewer.getControl().setEnabled(enabled);
	}

	public void setFocus() {
		viewer.getTable().setFocus();
	}

	public int getSelectionIndex() {
		return table.getSelectionIndex();
	}

	public int[] getSelectionIndices() {
		return table.getSelectionIndices();
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
		Collection<T> selection=getSelectionList();
		Debug.out("Selection", selection);
		ClipboardManager.copyToClipboard(selection);
	}



	/*
	 * Elements
	 */
	public int selectElement(int index) {
		viewer.refresh(false);
		if (index>table.getItemCount()-1) index=table.getItemCount()-1;
		if (index>=0){
			table.select(index);
			Object element=viewer.getElementAt(index);
			viewer.setSelection(new StructuredSelection(element));
			//viewer.refresh(element);
		}
		return index;
	}


	public int insertElements(Collection<T> col, int index) {
		List<T> list=getCollection();
		list.addAll(index, col);
		//viewer.refresh(false);
		index=selectElement(index);
		return index;
	}


	/** If no element is selected, inserts on top */
	public int insertElements(Collection<T> col) {
		int index=table.getSelectionIndex();
		return insertElements(col, index<0 ? 0 : index);
	}


	/** If no element is selected, inserts on top */
	public int insertNewElement() {
		return insertElements(Arrays.asList(getNewObject()));
	}


	public int addElements(Collection<T> col) {
		table.showColumn(table.getColumn(0));
		return insertElements(col, table.getItemCount());
	}


	public int addNewElement() {
		return addElements(Arrays.asList(getNewObject()));
	}


	public int replaceElement(T element, int index) {
		List<T> list=getCollection();
		list.set(index, element);
		//viewer.refresh(false);
		index=selectElement(index);
		return index;
	}


	/** If no element is selected, replaces first one */
	public int replaceSelectedElement(T element) {
		int index=table.getSelectionIndex();
		return replaceElement(element, index<0 ? 0 : index);
	}


	public int removeElements(int[] indices) {
		List<T> list=getCollection();
		Collection<T> col=new LinkedHashSet();
		//Arrays.sort(indices);
		for(int i: indices) col.add(list.get(i));
		list.removeAll(col);
		//viewer.refresh(false);
		int index=selectElement(indices.length==0 ? 0 : indices[0]);
		return index;
	}


	public void removeSelectedElements() {
		removeElements(getSelectionIndices());
	}


	public int moveElementsUp(int[] indices) {
		int index=ArrayUtils.smaller(indices)-1;
		if (index>=0){
			List<T> list=getCollection();
			Collection<T> col=new LinkedHashSet();
			for(int i: indices) col.add(list.get(i));
			list.removeAll(col);
			index=insertElements(col, index);
		}
		return index;
	}


	public void moveSelectedElementsUp() {
		moveElementsUp(getSelectionIndices());
	}


	public int moveElementsDown(int[] indices) {
		int index=ArrayUtils.greater(indices)+1;
		if (index<table.getItemCount()){
			List<T> list=getCollection();
			Collection<T> col=new LinkedHashSet();
			for(int i: indices) col.add(list.get(i));
			list.removeAll(col);
			index=insertElements(col, index-indices.length+1);
		}
		return index;
	}


	public void moveSelectedElementsDown() {
		moveElementsDown(getSelectionIndices());
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
		return table;
	}


}