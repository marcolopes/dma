/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.dma.java.utils.awt.ImageUtils;
import org.dma.utils.eclipse.swt.graphics.ImageManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class CustomToolItem extends ToolItem {

	@Override //subclassing
	protected void checkSubclass() {}

	private CustomAction selectionAction;

	public CustomToolItem(ToolBar parent, String text) {
		this(parent, SWT.PUSH);
		setToolTipText(text);
	}

	public CustomToolItem(ToolBar parent, int style) {
		super(parent, style);
	}


	public void setImage(String imagePath, int imageSize) {
		setImage(ImageManager.createImage(
				ImageUtils.resizeImage(imagePath, imageSize)));
	}

	public void setImage(String imagePath) {
		setImage(ImageManager.createImage(imagePath));
	}


	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		if (selectionAction!=null) selectionAction.setEnabled(enabled);
	}


	public void setSelectionAction(final CustomAction action) {
		this.selectionAction=action;
		addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				action.run();
			}
		});
	}

	public CustomAction getSelectionAction() {
		return selectionAction;
	}


}