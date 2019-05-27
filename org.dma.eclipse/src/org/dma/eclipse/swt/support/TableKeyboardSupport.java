/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.support;

import org.dma.java.util.Debug;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

public class TableKeyboardSupport {

	protected final TableViewer viewer;
	protected final Table table;

	public TableKeyboardSupport(TableViewer viewer) {
		this.viewer=viewer;
		this.table=viewer.getTable();
	}


	/**
	 * After the cell editors have been set on tableViewer,
	 * this method should be called to start giving keyboard support.
	 */
	public void startSupport() {

		int column=0;
		for(CellEditor editor: viewer.getCellEditors()){
			startSupport(editor, column++);
		}

		/* Table key listener */
		table.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode==SWT.CR || e.keyCode==SWT.KEYPAD_CR){
					editColumnOrNext(viewer.getColumnViewerEditor().getFocusCell()==null ? 0 :
						viewer.getColumnViewerEditor().getFocusCell().getColumnIndex());
				}
			}
		});

	}


	private void startSupport(CellEditor editor, final int column) {

		/* Editor key listener */
		editor.getControl().addKeyListener(new KeyAdapter(){
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
		});

		/* Editor traverse listener */
		editor.getControl().addTraverseListener(new TraverseListener(){
			@Override
			public void keyTraversed(TraverseEvent e) {
				switch(e.detail) {
				case SWT.TRAVERSE_TAB_NEXT:
				case SWT.TRAVERSE_RETURN:
					editColumnOrNext(getNextColumn(column));
					e.detail=SWT.TRAVERSE_NONE;
					break;

				case SWT.TRAVERSE_TAB_PREVIOUS:
					editColumnOrPrevious(getPreviousColumn(column));
					e.detail=SWT.TRAVERSE_NONE;
					break;
				}
			}
		});

	}



	/*
	 * Edit
	 */
	public int getPreviousColumn(int column) {
		return column<=0 ? table.getColumnCount()-1 : column-1;
	}


	public int getNextColumn(int column) {
		return column>=table.getColumnCount()-1 ? 0 : column+1;
	}


	public Object getSelectedElement() {
		IStructuredSelection selection=(IStructuredSelection)viewer.getSelection();
		return selection==null ? selection : selection.getFirstElement();
	}


	public void selectControlText(int column) {
		CellEditor editor=viewer.getCellEditors()[column];
		if(editor.getControl() instanceof Text){
			Text text=(Text)editor.getControl();
			text.selectAll();
		}
	}


	public void editColumnOrNext(int column) {

		Object selectedElement=getSelectedElement();
		if(selectedElement==null) return;
		Debug.err("column", column);

		Integer currentColumn=column;
		do{
			//table.setFocus();
			viewer.editElement(selectedElement, currentColumn);
			//select cell text
			selectControlText(currentColumn);
			//is editor active?
			if (viewer.isCellEditorActive()) return;

			currentColumn=getNextColumn(currentColumn);

		}while(currentColumn!=column);

		//viewer.cancelEditing();

	}


	public void editColumnOrPrevious(int column) {

		Object selectedElement=getSelectedElement();
		if(selectedElement==null) return;
		Debug.err("column", column);

		int currentColumn=column;
		do{
			//table.setFocus();
			viewer.editElement(selectedElement, currentColumn);
			//select cell text
			selectControlText(currentColumn);
			//is editor active?
			if(viewer.isCellEditorActive()) return;

			currentColumn=getPreviousColumn(currentColumn);

		}while(currentColumn!=column);

	}


	public void editLine() {
		editColumnOrNext(0);
	}


}