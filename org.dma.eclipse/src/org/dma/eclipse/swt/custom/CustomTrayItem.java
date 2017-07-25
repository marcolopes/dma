/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

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

	public CustomTrayItem(Shell parent, String name, String imagePath, boolean minimized) {
		super(parent.getDisplay().getSystemTray(), SWT.NONE);
		this.parent=parent;
		setToolTipText(name);
		setImage(ImageManager.getImage(imagePath));
		addListener(SWT.Selection, maximizeListener);
		update(minimized);
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

	/** @see TrayItem#setVisible */
	@Deprecated
	public void update(boolean minimized) {
		setVisible(minimized);
	}

	/** @see CustomTrayItem#isVisible */
	@Deprecated
	public boolean isMinimized() {
		return isVisible();
	}

	public void showTip(String text, String message) {
		toolTip.show(text, message);
	}


}