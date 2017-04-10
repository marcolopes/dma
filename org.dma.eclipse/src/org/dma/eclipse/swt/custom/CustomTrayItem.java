/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.apache.commons.lang.SystemUtils;
import org.dma.eclipse.swt.graphics.ImageManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;

public class CustomTrayItem {

	private final Listener maximizeListener=new Listener() {
		@Override
		public void handleEvent(final Event event) {
			if(!parent.isVisible()){
				parent.setMinimized(false);
				parent.setVisible(true);
			}
		}
	};

	private TrayItem trayItem;

	private final Shell parent;
	private final String name;
	private final Image image;
	private final Tray sysTray;
	private final CustomToolTip toolTip;

	public CustomTrayItem(Shell parent, String name, String imagePath, String toolTipText, boolean minimized) {
		this.parent=parent;
		this.name=name;
		this.image=ImageManager.getImage(imagePath);
		this.sysTray=parent.getDisplay().getSystemTray();
		this.toolTip=new CustomToolTip(parent, toolTipText);
		create(minimized);
	}


	private void create(boolean minimized) {
		//check if tray exists
		if (sysTray==null || !minimized) return;
		//item
		trayItem=new TrayItem(sysTray, SWT.NONE);
		trayItem.setImage(image);
		trayItem.setToolTipText(name);
		//BUG: Tip does not show in windows 7
		if (!SystemUtils.IS_OS_WINDOWS_7) trayItem.setToolTip(toolTip);
		//listeners
		trayItem.addListener(SWT.Selection, maximizeListener);
	}


	public void dispose() {
		if (trayItem==null) return;
		//listeners
		trayItem.removeListener(SWT.Selection, maximizeListener);
		//item
		trayItem.setToolTip(null);
		trayItem.dispose();
		trayItem=null;
	}


	public void update(boolean minimized) {
		//destroy current
		dispose();
		//create new
		create(minimized);
	}


	public void showTip(String message) {
		toolTip.show(message);
	}

	public void showTip(String prefix, String message) {
		showTip(prefix+": "+message);
	}

	public boolean isVisible() {
		return trayItem!=null;
	}

	public boolean isValid() {
		return sysTray!=null;
	}


}