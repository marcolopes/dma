/*******************************************************************************
 * 2010-2020 Public Domain
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
import org.dma.java.util.MessageList;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;

public abstract class TableViewerContainer<T> extends TableContainer {

	public abstract Collection<T> retrieveObjects();
	public abstract MessageList insertObject();
	public abstract MessageList removeObject();
	public abstract void createObject();
	public abstract void copyObject();
	public abstract T getNewObject();

	protected final List<T> objectCollection=new ArrayList();
	protected final TableViewer viewer;

	public TableViewerContainer(TableViewer viewer) {
		this(viewer, SWT.NONE);
	}

	public TableViewerContainer(TableViewer viewer, int direction) {
		super(viewer.getTable(), direction);

		this.viewer=viewer;
		this.viewer.setContentProvider(ArrayContentProvider.getInstance());
		this.viewer.setInput(objectCollection);
	}


	public void dispose() {
		clearTable();
		super.dispose();
	}



	/*
	 * Viewer
	 */
	public void refreshTable(boolean updateLabels) {
		viewer.refresh(updateLabels);
	}

	public void refreshTable() {
		refreshTable(true);
	}

	public void clearTable() {
		objectCollection.clear();
		refreshTable();
	}

	@Override
	public void updateTable() {
		objectCollection.clear();
		objectCollection.addAll(retrieveObjects());
		refreshTable();
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
	public int selectElement(int index) {
		viewer.refresh(false);
		if (index>table.getItemCount()-1) index=table.getItemCount()-1;
		if (index>=0){
			table.select(index);
			Object element=viewer.getElementAt(index);
			viewer.setSelection(new StructuredSelection(element));
			//viewer.refresh(element);
		}return index;
	}

	public int insertElements(Collection<T> col, int index) {
		objectCollection.addAll(index>objectCollection.size() ?
				objectCollection.size() : index, col);
		//viewer.refresh(false);
		index=selectElement(index);
		return index;
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
		table.showColumn(table.getColumn(0));
		return insertElements(col, table.getItemCount());
	}

	public int addNewElement() {
		return addElements(Arrays.asList(getNewObject()));
	}

	public int replaceElement(T element, int index) {
		objectCollection.set(index, element);
		//viewer.refresh(false);
		index=selectElement(index);
		return index;
	}

	/** If no element is selected, replaces first one */
	public int replaceSelectedElement(T element) {
		int index=getSelectionIndex();
		return replaceElement(element, index<0 ? 0 : index);
	}

	public int removeElements(int[] indices) {
		Collection<T> col=new LinkedHashSet();
		//Arrays.sort(indices);
		for(int i: indices) col.add(objectCollection.get(i));
		objectCollection.removeAll(col);
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
			Collection<T> col=new LinkedHashSet();
			for(int i: indices) col.add(objectCollection.get(i));
			objectCollection.removeAll(col);
			index=insertElements(col, index);
		}return index;
	}

	public void moveSelectedElementsUp() {
		moveElementsUp(getSelectionIndices());
	}

	public int moveElementsDown(int[] indices) {
		int index=ArrayUtils.greater(indices)+1;
		if (index<table.getItemCount()){
			Collection<T> col=new LinkedHashSet();
			for(int i: indices) col.add(objectCollection.get(i));
			objectCollection.removeAll(col);
			index=insertElements(col, index-indices.length+1);
		}return index;
	}

	public void moveSelectedElementsDown() {
		moveElementsDown(getSelectionIndices());
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

	public int getNumberOfObjects() {
		return objectCollection.size();
	}

	public TableViewer getViewer() {
		return viewer;
	}


}