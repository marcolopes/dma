/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.dma.eclipse.swt.graphics.ImageManager;
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
	public static final int STYLE_FIXED = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE;
	public static final int STYLE_RESIZABLE = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE | SWT.RESIZE | SWT.MAX;
	public static final int STYLE_MESSAGE = SWT.TITLE | SWT.PRIMARY_MODAL;

	public CustomShell(int style) {
		this(Display.getDefault().getActiveShell(), style);
	}

	/** @see Shell#Shell(Display, int) */
	public CustomShell(Shell parent, int style) {
		super(parent, style);
	}


	public void setImage(String imagePath) {
		setImage(ImageManager.getImage(imagePath));
	}


	@Override
	public void open() {
		super.open();
		setFocus();
	}


	public void openAndSleep() {
		open();
		while(!isDisposed()){
			if (!getDisplay().readAndDispatch()) getDisplay().sleep();
		}
	}


	@Override
	public void pack() {
		super.pack();
		setMinimumSize();
	}


	@Override
	public void setLocation (int x, int y) {
		super.setLocation(
			Math.max(x, getDisplay().getBounds().x),
			Math.max(y, getDisplay().getBounds().y));
	}


	public void setCenteredLocation() {
		Rectangle parentBounds = getParent()==null ?
				getDisplay().getPrimaryMonitor().getBounds() :
				getParent().getBounds();
		Rectangle childBounds = getBounds();
		int x = parentBounds.x + (parentBounds.width - childBounds.width) / 2;
		int y = parentBounds.y + (parentBounds.height - childBounds.height) / 2;
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