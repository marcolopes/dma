/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CustomTabItem extends TabItem {

	@Override //subclassing
	protected void checkSubclass() {}

	private IAction selectionAction;

	/** @see TabItem#TabItem(TabFolder, int) */
	public CustomTabItem(TabFolder parent, int style) {
		super(parent, style);
	}

	/** @see TabItem#TabItem(TabFolder, int, int) */
	public CustomTabItem(TabFolder parent, int style, int index) {
		super(parent, style, index);
	}

	public void setFocus() {}

	public void update() {
		if (isDisposed()) return;
		getControl().update();
		setFocus();
	}


	/*
	 * Selection
	 */
	public void select() {
		if (isDisposed()) return;
		getParent().setSelection(this);
		setFocus();
	}

	public boolean isSelected() {
		if (isDisposed()) return false;
		TabItem[] selection=getParent().getSelection();
		return selection.length>0 && selection[0].equals(this);
	}

	public void setSelectionAction(IAction action) {
		this.selectionAction=action;
		getParent().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (isSelected()) selectionAction.run();
			}
		});
	}

	public IAction getSelectionAction() {
		return selectionAction;
	}


}