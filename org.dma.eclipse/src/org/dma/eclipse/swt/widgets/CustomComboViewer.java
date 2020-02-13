/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

public class CustomComboViewer<T> extends ComboViewer {

	/** @see ComboViewer#ComboViewer(Composite, int) */
	public CustomComboViewer(Composite parent, int style) {
		super(parent, style);
	}

	/** @see ComboViewer#ComboViewer(Combo) */
	public CustomComboViewer(Combo combo) {
		super(combo);
		setContentProvider(ArrayContentProvider.getInstance());
		setInput(combo.getItems());
	}


	/** @see ComboViewer#setSelection(ISelection) */
	public void setSelection(T element) {
		super.setSelection(new StructuredSelection(element));
	}


	public T getSelectedElement() {
		return (T)getElementAt(getCombo().getSelectionIndex());
	}

}