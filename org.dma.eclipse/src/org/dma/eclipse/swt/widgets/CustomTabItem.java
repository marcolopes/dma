/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CustomTabItem extends TabItem {

	@Override //subclassing
	protected void checkSubclass() {}

	private Action selectionAction;

	public CustomTabItem(TabFolder parent) {
		this(parent, SWT.NONE);
	}

	/** @see TabItem#TabItem(TabFolder, int) */
	public CustomTabItem(TabFolder parent, int style) {
		super(parent, style);
	}


	public void update() {
		if (isDisposed()) return;
		getControl().update();
	}


	public void select() {
		if (isDisposed()) return;
		getParent().setSelection(this);
	}


	public boolean isSelected() {
		if (isDisposed()) return false;
		TabItem[] selection=getParent().getSelection();
		return selection.length>0 && selection[0].equals(this);
		/*
		Control control=getParent().getSelection()[0].getControl();
		return control!=null && control.equals(getControl());
		*/
	}

	public void setSelectionAction(final Action action) {
		this.selectionAction=action;
		//add listener to TabFolder
		getParent().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (isSelected()) action.run();
			}
		});
	}

	public Action getSelectionAction() {
		return selectionAction;
	}


}