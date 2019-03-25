/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import java.awt.image.BufferedImage;

import org.dma.eclipse.swt.graphics.ImageManager;
import org.dma.java.awt.ImageUtils;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class CustomMenuItem extends MenuItem {

	@Override //subclassing
	protected void checkSubclass() {}

	private CustomAction selectionAction;

	/** @see MenuItem#MenuItem(Menu, int) */
	public CustomMenuItem(Menu parent, int style) {
		super(parent, style);
	}


	public void setImage(String imagePath) {
		setImage(ImageManager.getImage(imagePath));
	}

	public void setImage(String imagePath, int imageSize) {
		setImage(ImageUtils.createImage(imagePath, imageSize));
	}

	public void setImage(BufferedImage bufferedImage) {
		setImage(ImageManager.getImage(bufferedImage));
	}


	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		if (selectionAction!=null) selectionAction.setEnabled(enabled);
	}


	public void setSelectionAction(final CustomAction action) {
		this.selectionAction=action;
		addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				action.run();
			}
		});
	}

	public CustomAction getSelectionAction() {
		return selectionAction;
	}


}