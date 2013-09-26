/*******************************************************************************
 * 2010-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dma.java.utils.Debug;
import org.dma.java.utils.array.ArrayUtils;
import org.dma.java.utils.array.ClipboardManager;
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

public abstract class TableViewerContainer<T> implements ITableViewerContainer<T> {

	protected final Collection<T> objectCollection=new ArrayList();

	private final TableViewer viewer;

	private MouseAdapter tableDoubleClickListener;
	private KeyListener tableEnterKeyListener;

	public TableViewerContainer(TableViewer viewer) {

		this.viewer=viewer;
		this.viewer.setContentProvider(ArrayContentProvider.getInstance());
		this.viewer.setInput(objectCollection);

		addTableDoubleClickListener();
		addTableEnterKeyListener();

	}


	public void dispose() {

		getTable().removeMouseListener(tableDoubleClickListener);
		getTable().removeKeyListener(tableEnterKeyListener);
		clearTable();

	}






	/*
	 * Listeners
	 */
	private void addTableDoubleClickListener() {

		tableDoubleClickListener=new MouseAdapter() {
			public void mouseDoubleClick(MouseEvent e) {
				if(getSelectionElement()!=null) {
					editObject();
				}
			}
		};

		getTable().addMouseListener(tableDoubleClickListener);

	}


	private void addTableEnterKeyListener() {

		tableEnterKeyListener=new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.keyCode==SWT.CR || e.keyCode==SWT.KEYPAD_CR){
					if(getSelectionElement()!=null) {
						editObject();
					}
				}
			}
		};

		getTable().addKeyListener(tableEnterKeyListener);

	}


	public void addSortColumnSupport(int direction) {

		getTable().setSortColumn(getTable().getColumn(0));
		getTable().setSortDirection(direction);

		for(int i=0; i<getTable().getColumnCount(); i++){

			getTable().getColumn(i).addSelectionListener(new SelectionAdapter() {
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
	public int computeSize(){
		int visibleCount = (getTable().getClientArea().height-
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






	/*
	 * Viewer
	 */
	public void setEnabled(boolean enabled) {
		viewer.getControl().setEnabled(enabled);
	}

	public int[] getSelectionIndices() {
		return getTable().getSelectionIndices();
	}

	public T getSelectionElement() {
		return (T)((StructuredSelection)viewer.getSelection()).getFirstElement();
	}

	public List<T> getSelectionList() {
		return ((StructuredSelection)viewer.getSelection()).toList();
	}

	public void copySelectionToClipboard() {
		Collection selectionList=getSelectionList();
		Debug.out("Selection", selectionList);
		ClipboardManager.copyToClipboard(selectionList);
	}






	/*
	 * (non-Javadoc)
	 * @see org.dma.eclipse.swt.viewers.ITableViewerContainer#updateTable()
	 */
	public void updateTable() {
		objectCollection.clear();
		objectCollection.addAll(retrieveObjects());
		viewer.refresh();
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
	 * Getters and setters
	 */
	public int getSize() {
		return objectCollection.size();
	}

	public Collection<T> getCollection() {
		return objectCollection;
	}

	public TableViewer getViewer() {
		return viewer;
	}

	public Table getTable() {
		return viewer.getTable();
	}


}