/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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