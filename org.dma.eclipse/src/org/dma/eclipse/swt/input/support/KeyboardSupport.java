/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.input.support;

import org.dma.java.util.SystemUtils;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Text;

public class KeyboardSupport implements KeyListener {

	protected final TableViewer viewer;

	public KeyboardSupport(TableViewer viewer) {
		this.viewer=viewer;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.keyCode==SWT.CR || e.keyCode==SWT.KEYPAD_CR){
			ViewerCell cell=viewer.getColumnViewerEditor().getFocusCell();
			editColumnOrNext(cell==null ? 0 : cell.getColumnIndex());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}


	/** Call after setting the cell editors on the viewer */
	public void startSupport() {

		int column=0;
		for(CellEditor editor: viewer.getCellEditors()){
			addSupport(editor, column++);
		}

		/* Table key listener */
		viewer.getTable().addKeyListener(this);

	}


	private void addSupport(CellEditor editor, final int column) {

		/* Editor key listener */
		editor.getControl().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
		});

		/* Editor traverse listener */
		editor.getControl().addTraverseListener(new TraverseListener() {
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
		return column<=0 ? viewer.getTable().getColumnCount()-1 : column-1;
	}

	public int getNextColumn(int column) {
		return column>=viewer.getTable().getColumnCount()-1 ? 0 : column+1;
	}

	public Object getSelectedElement() {
		IStructuredSelection selection=(IStructuredSelection)viewer.getSelection();
		return selection.getFirstElement();
	}

	public void selectControlText(int column) {
		if (SystemUtils.IS_OS_MAC){
			Object element=getSelectedElement();
			viewer.cancelEditing();
			viewer.editElement(element, column);
		}CellEditor editor=viewer.getCellEditors()[column];
		if (editor.getControl() instanceof Text){
			Text text=(Text)editor.getControl();
			text.selectAll();
		}
	}

	public void editColumnOrNext(int column) {

		int currentColumn=column;

		do try{
			viewer.editElement(getSelectedElement(), currentColumn);
			//is editor active?
			if (viewer.isCellEditorActive()) column=currentColumn;
			else currentColumn=getNextColumn(currentColumn);

		}catch(Exception e){
			e.printStackTrace();
		}while(currentColumn!=column);

		//select cell text
		selectControlText(currentColumn);

	}

	public void editColumnOrPrevious(int column) {

		int currentColumn=column;

		do try{
			viewer.editElement(getSelectedElement(), currentColumn);
			//is editor active?
			if (viewer.isCellEditorActive()) column=currentColumn;
			else currentColumn=getPreviousColumn(currentColumn);

		}catch(Exception e){
			e.printStackTrace();
		}while(currentColumn!=column);

		//select cell text
		selectControlText(currentColumn);

	}

	public void editLine() {
		editColumnOrNext(0);
	}


}