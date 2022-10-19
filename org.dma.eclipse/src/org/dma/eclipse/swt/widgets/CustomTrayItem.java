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

import org.apache.commons.lang.SystemUtils;

import org.dma.eclipse.swt.graphics.ImageManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TrayItem;

public class CustomTrayItem extends TrayItem {

	@Override //subclassing
	protected void checkSubclass() {}

	private final Listener maximizeListener=new Listener() {
		@Override
		public void handleEvent(Event event) {
			if (!parent.isVisible()){
				parent.setMinimized(false);
				parent.setVisible(true);
			}
		}
	};

	private CustomToolTip toolTip;

	private final Shell parent;

	/** @see TrayItem#TrayItem(org.eclipse.swt.widgets.Tray, int) */
	public CustomTrayItem(Shell parent, String name, String imagePath, boolean visible) {
		super(parent.getDisplay().getSystemTray(), SWT.NONE);
		this.parent=parent;
		setToolTipText(name);
		setImage(ImageManager.getImage(imagePath));
		addListener(SWT.Selection, maximizeListener);
		setVisible(visible);
	}

	@Override
	public void dispose() {
		removeListener(SWT.Selection, maximizeListener);
		setToolTip(null);
		super.dispose();
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (toolTip!=null) toolTip.dispose();
		toolTip=new CustomToolTip(parent);
		//BUG: Tip does not show in windows 7 tray
		setToolTip(visible && !SystemUtils.IS_OS_WINDOWS_7 ? toolTip : null);
	}

	/** @see TrayItem#getVisible */
	public boolean isVisible() {
		return getVisible();
	}

	public void showTip(String text, String message) {
		toolTip.show(text, message);
	}


}