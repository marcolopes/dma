/*******************************************************************************
 * 2010-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.SystemUtils;
import org.dma.java.util.ArrayUtils;
import org.dma.java.util.ClipboardManager;
import org.dma.java.util.Debug;
import org.dma.java.util.MessageList;
import org.dma.java.util.MovableList;

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

	protected final MovableList<T> objectCollection=new MovableList();
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
		if (SystemUtils.IS_OS_MAC) table.redraw();
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
		/*
		 * VERSION 1
		 *
		objectCollection.addAll(index>objectCollection.size() ?
				objectCollection.size() : index, col);
		return selectElement(index);
		*/
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
		return index;
		*/
		objectCollection.remove(indices);
		return selectElement(indices.length==0 ? 0 : indices[0]);
	}

	public void removeSelectedElements() {
		removeElements(getSelectionIndices());
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
		}return index;
		*/
		/*
		 * VERSION 2
		 *
		int index=ArrayUtils.smaller(indices);
		return index>0 ? insertElements(objectCollection.remove(indices), index-1) : index;
		*/
		int index=ArrayUtils.smaller(indices);
		if (index>0) objectCollection.moveTo(index-1, indices);
		return selectElement(indices.length==0 ? 0 : index-1);
	}

	public void moveSelectedElementsUp() {
		moveElementsUp(getSelectionIndices());
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
		}return index;
		*/
		/*
		 * VERSION 2
		 *
		int index=ArrayUtils.greater(indices);
		return index<table.getItemCount()-1 ? insertElements(
				objectCollection.remove(indices), ArrayUtils.smaller(indices)+1) : index;
		*/
		int index=ArrayUtils.greater(indices);
		if (index<objectCollection.size()-1) objectCollection.moveTo(ArrayUtils.smaller(indices)+1, indices);
		return selectElement(indices.length==0 ? 0 : index+1);
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