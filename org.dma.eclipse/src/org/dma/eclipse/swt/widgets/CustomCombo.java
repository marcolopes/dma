/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

public class CustomCombo<T> extends Combo {

	@Override //subclassing
	protected void checkSubclass() {}

	private IAction selectionAction;

	/** @see Combo#Combo(Composite, int) */
	public CustomCombo(Composite parent, int style) {
		super(parent, style);
	}


	/*
	 * Selection
	 */
	public void setSelectionAction(final IAction action) {
		action.setEnabled(isEnabled()); //synchronize states
		action.addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				setEnabled(action.isEnabled());
			}
		});
		addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectionAction.run();
			}
		});
		this.selectionAction=action;
	}

	@Override
	public void setEnabled(boolean enabled) {
		if (selectionAction!=null) selectionAction.setEnabled(enabled);
		super.setEnabled(enabled);
	}

	public IAction getSelectionAction() {
		return selectionAction;
	}


}