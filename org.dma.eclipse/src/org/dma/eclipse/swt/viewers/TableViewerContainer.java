/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.dma.eclipse.swt.graphics.FontManager;
import org.dma.eclipse.swt.widgets.CustomTable.SORT_DIRECTION;
import org.dma.java.util.ArrayUtils;
import org.dma.java.util.ClipboardManager;
import org.dma.java.util.Debug;
import org.dma.java.util.MessageList;
import org.dma.java.util.MovableList;
import org.dma.java.util.SystemUtils;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Table;

public abstract class TableViewerContainer<T> extends TableContainer {

	public static final int TABLE_DINAMIC_LOAD = FontManager.AVERAGE_ITEM_HEIGHT==0 ? 0 :
		Display.getCurrent().getClientArea().height / FontManager.AVERAGE_ITEM_HEIGHT;

	public abstract Collection<T> retrieveObjects(long topIndex, long bottomIndex);
	public abstract MessageList insertObject();
	public abstract MessageList removeObject();
	public abstract void createObject();
	public abstract void copyObject();
	public abstract T getNewObject();

	private final SelectionListener verticallBarSelectionListener=new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			ScrollBar scrollBar=(ScrollBar)e.getSource();
			if (scrollBar.getMaximum()-(scrollBar.getSelection()+scrollBar.getThumb())==0){
				updateTable(SWT.MouseWheel);
			}
		}
	};

	private final MouseWheelListener tableMouseListener=new MouseWheelListener() {
		@Override
		public void mouseScrolled(MouseEvent e) {
			ScrollBar scrollBar=((Table)e.getSource()).getVerticalBar();
			if (scrollBar.getMaximum()-(scrollBar.getSelection()+scrollBar.getThumb())==0){
				updateTable(SWT.MouseWheel);
			}
		}
	};

	private final KeyAdapter tableNavigationKeyListener=new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			e.doit=!viewer.isBusy();
			if (e.doit) switch(e.keyCode) {
				case SWT.ARROW_DOWN: updateTable(SWT.ARROW_DOWN); break;
				case SWT.PAGE_DOWN: updateTable(SWT.PAGE_DOWN); break;
			}
		}
	};

	protected final MovableList<T> objectCollection=new MovableList();
	protected final TableViewer viewer;
	protected final long dynamicLoad;

	public TableViewerContainer(TableViewer viewer) {
		this(viewer, 0);
	}

	public TableViewerContainer(TableViewer viewer, int dynamicLoad) {
		this(viewer, dynamicLoad, SORT_DIRECTION.NONE);
	}

	public TableViewerContainer(TableViewer viewer, SORT_DIRECTION direction) {
		this(viewer, 0, direction);
	}

	public TableViewerContainer(TableViewer viewer, int dynamicLoad, SORT_DIRECTION direction) {
		super(viewer.getTable(), direction);
		this.viewer=viewer;
		this.dynamicLoad=dynamicLoad;

		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setInput(objectCollection);

		if (dynamicLoad>0) addTableListeners();
	}


	public void dispose() {
		removeTableListeners();
		clearTable();
		super.dispose();
	}


	/*
	 * Listeners
	 */
	private void addTableListeners() {
		if (table.getVerticalBar()!=null) table.getVerticalBar().addSelectionListener(verticallBarSelectionListener);
		table.addMouseWheelListener(tableMouseListener);
		table.addKeyListener(tableNavigationKeyListener);
	}

	private void removeTableListeners() {
		if (table.getVerticalBar()!=null) table.getVerticalBar().removeSelectionListener(verticallBarSelectionListener);
		table.removeMouseWheelListener(tableMouseListener);
		table.removeKeyListener(tableNavigationKeyListener);
	}



	/*
	 * Viewer
	 */
	private void refreshViewer(boolean updateLabels) {
		table.setRedraw(false);
		viewer.refresh(updateLabels);
		table.setRedraw(true);
		if (SystemUtils.IS_OS_MAC) table.redraw();
	}

	public void refreshTable() {
		refreshViewer(true);
	}

	public void clearTable() {
		objectCollection.clear();
		refreshViewer(false);
	}

	/** Returns true if changed */
	public void updateTable(int keycode) {
		long size=objectCollection.size();
		long objectsToLoad=getObjectsToLoad(keycode);
		if (objectsToLoad!=0) objectCollection.addAll(retrieveObjects(size, size+objectsToLoad));
		refreshViewer(keycode==SWT.DEFAULT);
	}

	/** Returns true if changed */
	@Override
	public boolean updateTable() {
		/*
		 * VERSION 1
		 *
		objectCollection.clear();
		objectCollection.addAll(retrieveObjects());
		refreshTable();*/
		long size=objectCollection.size();
		objectCollection.clear();
		int index=getSelectionIndex();
		updateTable(SWT.DEFAULT);
		selectElement(index);
		return objectCollection.size()!=size;
	}

	/* Used for dynamic load */
	private long getObjectsToLoad(int keycode) {
		switch(keycode){
		default: //reset
		case SWT.DEFAULT: return dynamicLoad==0 ? getNumberOfObjects() : dynamicLoad;
		case SWT.ARROW_UP: break; //nothing
		case SWT.PAGE_UP: break; //nothing
		case SWT.ARROW_DOWN: if (getSelectionIndex()+1>=objectCollection.size()) return dynamicLoad; break;
		case SWT.PAGE_DOWN: if (getSelectionIndex()+computeSize()>=objectCollection.size()) return dynamicLoad; break;
		case SWT.MouseWheel: return dynamicLoad;
		}return 0;
	}

	public void setEnabled(boolean enabled) {
		viewer.getControl().setEnabled(enabled);
	}

	public void setFocus() {
		viewer.getTable().setFocus();
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
	public void removeSelection() {
		table.deselectAll();
		viewer.setSelection(StructuredSelection.EMPTY);
	}

	public int selectElement(int index) {
		viewer.refresh(false);
		if (index>table.getItemCount()-1) index=table.getItemCount()-1;
		if (index<0) return 0;
		table.select(index);
		table.showSelection();
		Object element=viewer.getElementAt(index);
		viewer.setSelection(new StructuredSelection(element));
		//viewer.refresh(element);
		return index;
	}

	public int insertElements(Collection<T> col, int index) {
		/*
		 * VERSION 1
		 *
		objectCollection.addAll(index>objectCollection.size() ? objectCollection.size() : index, col);
		return selectElement(index);*/
		objectCollection.addAll(index, col);
		return selectElement(index);
	}

	/** If no element is selected, inserts on top */
	public int insertElements(Collection<T> col) {
		int index=getSelectionIndex();
		return insertElements(col, index<0 ? 0 : index);
	}


	/** If no element is selected, inserts on top */
	public int insertNewElement() {
		return insertElements(Arrays.asList(getNewObject()));
	}

	public int addElements(Collection<T> col) {
		return insertElements(col, objectCollection.size());
	}

	public int addNewElement() {
		return addElements(Arrays.asList(getNewObject()));
	}

	public int setElements(Collection<T> col) {
		objectCollection.clear();
		return addElements(col);
	}

	public int replaceElement(T element, int index) {
		objectCollection.set(index, element);
		return selectElement(index);
	}

	/** If no element is selected, replaces first one */
	public int replaceSelectedElement(T element) {
		int index=getSelectionIndex();
		return replaceElement(element, index<0 ? 0 : index);
	}

	public int removeElements(int[] indices) {
		/*
		 * VERSION 1
		 *
		Collection<T> col=new LinkedHashSet();
		//Arrays.sort(indices);
		for(int i: indices) col.add(objectCollection.get(i));
		objectCollection.removeAll(col);
		//viewer.refresh(false);
		int index=selectElement(indices.length==0 ? 0 : indices[0]);
		return index;*/
		objectCollection.remove(indices);
		return selectElement(indices.length==0 ? 0 : indices[0]);
	}

	public int removeSelectedElements() {
		return removeElements(getSelectionIndices());
	}

	public int moveElementsUp(int[] indices) {
		/*
		 * VERSION 1
		 *
		int index=ArrayUtils.smaller(indices)-1;
		if (index>=0){
			Collection<T> col=new LinkedHashSet();
			for(int i: indices) col.add(objectCollection.get(i));
			objectCollection.removeAll(col);
			index=insertElements(col, index);
		}return index;*/
		/*
		 * VERSION 2
		 *
		int index=ArrayUtils.smaller(indices);
		return index>0 ? insertElements(objectCollection.remove(indices), index-1) : index;*/
		int index=ArrayUtils.smaller(indices);
		if (index>0) objectCollection.moveTo(index-1, indices);
		return selectElement(indices.length==0 ? 0 : index-1);
	}

	public int moveSelectedElementsUp() {
		return moveElementsUp(getSelectionIndices());
	}

	public int moveElementsDown(int[] indices) {
		/*
		 * VERSION 1
		 *
		int index=ArrayUtils.greater(indices)+1;
		if (index<table.getItemCount()){
			Collection<T> col=new LinkedHashSet();
			for(int i: indices) col.add(objectCollection.get(i));
			objectCollection.removeAll(col);
			index=insertElements(col, index-indices.length+1);
		}return index;*/
		/*
		 * VERSION 2
		 *
		int index=ArrayUtils.greater(indices);
		return index<table.getItemCount()-1 ? insertElements(objectCollection.remove(indices),
			ArrayUtils.smaller(indices)+1) : index;*/
		int index=ArrayUtils.greater(indices);
		if (index<objectCollection.size()-1) objectCollection.moveTo(ArrayUtils.smaller(indices)+1, indices);
		return selectElement(indices.length==0 ? 0 : index+1);
	}

	public int moveSelectedElementsDown() {
		return moveElementsDown(getSelectionIndices());
	}



	/*
	 * Getters and setters
	 */
	public boolean isEmpty() {
		return objectCollection.isEmpty();
	}

	public Collection<T> getCollection() {
		return objectCollection;
	}

	@Deprecated
	public long getNumberOfObjects() {
		return Integer.MAX_VALUE;
	}

	public TableViewer getViewer() {
		return viewer;
	}


}