/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

public class CustomCTabItem extends CTabItem {

	@Override //subclassing
	protected void checkSubclass() {}

	private IAction selectionAction;

	public IAction getSelectionAction() {return selectionAction;}

	/** @see CTabItem#CTabItem(CTabFolder, int) */
	public CustomCTabItem(CTabFolder parent, int style) {
		super(parent, style);
	}

	/** @see CTabItem#CTabItem(CTabFolder, int, int) */
	public CustomCTabItem(CTabFolder parent, int style, int index) {
		super(parent, style, index);
	}

	/** Override */
	public void setFocus() {}

	/** Update and focus */
	public void update() {
		if (isDisposed()) return;
		getControl().update();
		setFocus();
	}

	/** Select and focus */
	public void select() {
		if (isDisposed()) return;
		getParent().setSelection(this);
		setFocus();
	}

	public boolean isSelected() {
		if (isDisposed()) return false;
		CTabItem selection=getParent().getSelection();
		return selection!=null && selection.equals(this);
	}

	public void setSelectionAction(IAction action) {
		this.selectionAction=action;
		getParent().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (isSelected()) selectionAction.runWithEvent(null);
			}
		});
	}

	public void setFontStyle(int style) {
		FontData[] fd = getFont().getFontData();
		for(int i=0; i<fd.length; i++){
			fd[i].setStyle(style);
		}setFont(new Font(getDisplay(), fd));
	}


}