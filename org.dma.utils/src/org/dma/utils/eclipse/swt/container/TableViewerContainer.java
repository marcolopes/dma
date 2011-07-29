/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dma.utils.java.ArrayUtils;
import org.dma.utils.java.ClipboardManager;
import org.dma.utils.java.Debug;
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

public abstract class TableViewerContainer implements ITableViewerContainer {

	protected final TableViewer viewer;
	protected final ITableLabelProvider labelProvider;
	protected final List<Object> objectCollection=new ArrayList();

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

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	//dispose
	public void dispose() {

		Debug.info();

		viewer.cancelEditing();
		removeTableDoubleClickListener();
		removeTableEnterKeyListener();
		clearObjectCollection();

	}





	//listeners
	private void addTableDoubleClickListener() {

		tableDoubleClickListener=new MouseAdapter() {
			public void mouseDoubleClick(MouseEvent e) {
				if(getSelectedObject()!=null) {
					editObject();
				}
			}
		};

		viewer.getTable().addMouseListener(tableDoubleClickListener);

	}


	private void removeTableDoubleClickListener() {

		viewer.getTable().removeMouseListener(tableDoubleClickListener);

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

		viewer.getTable().addKeyListener(tableEnterKeyListener);

	}

	private void removeTableEnterKeyListener() {

		viewer.getTable().removeKeyListener(tableEnterKeyListener);

	}






	//table
	public void updateTable() {

		objectCollection.clear();
		objectCollection.addAll(retrieveObjects());
		viewer.refresh();

	}

	public int computeSize(){

		Rectangle rect = viewer.getTable().getClientArea();
		int itemHeight = viewer.getTable().getItemHeight();
		int headerHeight = viewer.getTable().getHeaderHeight();
		int visibleCount = (rect.height-headerHeight+itemHeight-1) / itemHeight;
		return visibleCount;
	}

	public void forceTableFocus() {
		if(viewer!=null)
			viewer.getTable().forceFocus();
	}

	public String[] getColumnText() {
		String[] names=new String[viewer.getTable().getColumns().length];
		for(int i=0; i<viewer.getTable().getColumns().length; i++)
			names[i]=viewer.getTable().getColumns()[i].getText();
		return names;
	}

	public String getSortColumnText() {
		return viewer.getTable().getSortColumn()==null ?
			"" : viewer.getTable().getSortColumn().getText();
	}






	//collection
	public int getSize() {
		return this.objectCollection.size();
	}

	public Collection getObjectCollection() {
		return this.objectCollection;
	}

	public void clearObjectCollection(){
		objectCollection.clear();
		viewer.refresh();
	}







	//viewer
	public void setEnabled(boolean enabled) {
		viewer.getControl().setEnabled(enabled);
	}

	public TableViewer getViewer() {
		return viewer;
	}

	public int[] getSelectionIndices() {
		return viewer.getTable().getSelectionIndices();
	}

	public Object getSelectedObject() {
		return ((StructuredSelection)viewer.getSelection()).getFirstElement();
	}

	public Object[] getSelectedObjectsArray() {
		return ((StructuredSelection)viewer.getSelection()).toArray();
	}

	public void transferSelectionToClipboard() {

		Object[] objectsArray=getSelectedObjectsArray();
		Debug.info("objectsArray", ArrayUtils.toList(objectsArray));
		ClipboardManager.transferToClipboard(objectsArray);

	}


}