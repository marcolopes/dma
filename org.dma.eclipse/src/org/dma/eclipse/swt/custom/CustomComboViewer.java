/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.Combo;

public class CustomComboViewer extends ComboViewer {

	/** @see ComboViewer#ComboViewer(Combo) */
	public CustomComboViewer(Combo combo) {
		super(combo);
		setContentProvider(ArrayContentProvider.getInstance());
		setInput(combo.getItems());

	}


}