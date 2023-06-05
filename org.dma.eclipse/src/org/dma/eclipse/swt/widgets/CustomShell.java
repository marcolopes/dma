/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
import org.dma.java.math.NumericUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CustomShell extends Shell {

	@Override //subclassing
	protected void checkSubclass() {}

	/*
	 * Styles
	 */
	/** MODAL (block) + TITLE */
	public static final int STYLE_MESSAGE = SWT.PRIMARY_MODAL | SWT.TITLE;
	/** MODAL (block) + TITLE + CLOSE */
	public static final int STYLE_DEFAULT = STYLE_MESSAGE | SWT.CLOSE;
	/** MODAL (block) + TITLE + CLOSE + RESIZE + MIN + MAX */
	public static final int STYLE_RESIZABLE = STYLE_DEFAULT | SWT.RESIZE | SWT.MIN | SWT.MAX;

	public CustomShell(int style) {
		this(null, style);
	}

	/** @see Shell#Shell(Display, int) */
	public CustomShell(Shell parent, int style) {
		super(parent, style);
	}


	public void setImage(String pathname) {
		setImage(ImageHandler.createImage(pathname));
	}

	public void setImage(BufferedImage image) {
		setImage(ImageManager.getImage(image));
	}


	@Override
	public void open() {
		super.open();
		setFocus();
	}


	public void sleep() {
		while(!isDisposed()){
			if (!getDisplay().readAndDispatch()) getDisplay().sleep();
		}
	}


	public void openAndSleep() {
		open();
		sleep();
	}


	@Override
	public void pack() {
		super.pack();
		setMinimumSize();
	}


	@Override
	public void setLocation(int x, int y) {
		super.setLocation(
			Math.max(x, getDisplay().getBounds().x),
			Math.max(y, getDisplay().getBounds().y));
	}


	public void setCenteredLocation() {
		Rectangle parentBounds=getParent()==null ?
				getDisplay().getPrimaryMonitor().getBounds() :
				getParent().getBounds();
		Rectangle childBounds=getBounds();
		int x=parentBounds.x + (parentBounds.width - childBounds.width) / 2;
		int y=parentBounds.y + (parentBounds.height - childBounds.height) / 2;
		setLocation(x, y);
	}


	public void setMinimumSize() {
		if (NumericUtils.bit(getStyle(), SWT.RESIZE)){
			setMinimumSize(getSize().x, getSize().y);
		}
	}


	public void setParentBounds() {
		if (getParent()==null) return;
		setBounds(getParent().getBounds());
	}


	public GridLayout setGridLayout() {
		GridLayout layout=new GridLayout();
		setLayout(layout);
		return layout;
	}


}