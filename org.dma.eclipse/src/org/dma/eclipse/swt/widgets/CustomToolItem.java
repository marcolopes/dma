/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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

import java.awt.image.BufferedImage;

import org.dma.eclipse.swt.graphics.ImageManager;
import org.dma.java.awt.ImageHandler;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class CustomToolItem extends ToolItem {

	@Override //subclassing
	protected void checkSubclass() {}

	private IAction selectionAction;

	/** @see ToolItem#ToolItem(ToolBar, int) */
	public CustomToolItem(ToolBar parent, int style) {
		super(parent, style);
	}


	public void setImage(String pathname) {
		setImage(ImageManager.getImage(pathname));
	}

	@Deprecated
	void setImage(String pathname, int size) {
		setImage(new ImageHandler(pathname).resize(size));
	}

	public void setImage(BufferedImage image) {
		setImage(ImageManager.getImage(image));
	}


	/*
	 * Selection
	 */
	public void setSelectionAction(final IAction action) {
		selectionAction=action;
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
				action.runWithEvent(null);
			}
		});
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