/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.custom;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.Combo;

public class CustomComboViewer extends ComboViewer {

	public CustomComboViewer(Combo combo) {
		super(combo);

		setContentProvider(new ArrayContentProvider());
		setInput(combo.getItems());

	}


}