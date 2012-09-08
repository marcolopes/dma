/*******************************************************************************
 * 2010-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.viewers;

import java.util.ArrayList;
import java.util.List;

import org.dma.utils.java.ClipboardManager;
import org.dma.utils.java.Debug;
import org.dma.utils.java.array.ArrayUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Table;

public abstract class TableViewerContainer implements ITableViewerContainer {

	protected final List<Object> objectCollection=new ArrayList();

	private final TableViewer viewer;
	private final ITableLabelProvider labelProvider;

	private MouseAdapter tableDoubleClickListener;
	private KeyListener tableEnterKeyListener;

	public TableViewerContainer(TableViewer viewer, ITableLabelProvider labelProvider) {

		this.viewer=viewer;
		this.labelProvider=labelProvider;

		try{
			//viewer
			this.viewer.setLabelProvider(this.labelProvider);
			this.viewer.setContentProvider(new ArrayContentProvider());
			this.viewer.setInput(this.objectCollection);

			addTableDoubleClickListener();
			addTableEnterKeyListener();

		} catch (Exception e){
			e.printStackTrace();
		}

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
				if(getSelectedObject()!=null) {
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
					if(getSelectedObject()!=null) {
						editObject();
					}
				}
			}
		};

		getTable().addKeyListener(tableEnterKeyListener);

	}






	/*
	 * Table
	 */
	public int computeSize(){
		Rectangle rect = getTable().getClientArea();
		int itemHeight = getTable().getItemHeight();
		int headerHeight = getTable().getHeaderHeight();
		int visibleCount = (rect.height-headerHeight+itemHeight-1) / itemHeight;
		return visibleCount;
	}


	public String[] getColumnText() {
		String[] names=new String[getTable().getColumns().length];
		for(int i=0; i<getTable().getColumns().length; i++)
			names[i]=getTable().getColumns()[i].getText();
		return names;
	}


	public String getSortColumnText() {
		return getTable().getSortColumn()==null ?
			"" : getTable().getSortColumn().getText();
	}


	public void forceTableFocus() {
		getTable().forceFocus();
	}


	public void clearTable(){
		objectCollection.clear();
		viewer.refresh();
	}


	/*
	 * (non-Javadoc)
	 * @see org.dma.utils.eclipse.swt.viewers.ITableViewerContainer#updateTable()
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
	 * Viewer
	 */
	public void setEnabled(boolean enabled) {
		viewer.getControl().setEnabled(enabled);
	}

	public int[] getSelectionIndices() {
		return getTable().getSelectionIndices();
	}

	public Object getSelectedObject() {
		return ((StructuredSelection)viewer.getSelection()).getFirstElement();
	}

	public Object[] getSelectedObjectsArray() {
		return ((StructuredSelection)viewer.getSelection()).toArray();
	}

	public void copySelectionToClipboard() {
		Object[] objectsArray=getSelectedObjectsArray();
		Debug.out("objectsArray", ArrayUtils.toList(objectsArray));
		ClipboardManager.copyToClipboard(objectsArray);
	}






	/*
	 * Getters and setters
	 */
	public int getSize() {
		return objectCollection.size();
	}

	public List getCollection() {
		return objectCollection;
	}

	public TableViewer getViewer() {
		return viewer;
	}

	public Table getTable() {
		return viewer.getTable();
	}


}