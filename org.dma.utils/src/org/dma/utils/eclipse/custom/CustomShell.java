/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.custom;

import org.dma.utils.java.numeric.IntegerUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Shell;

public class CustomShell extends Shell {

	/*
	 * Styles
	 */
	public static final int STYLE_FIXED = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE;
	public static final int STYLE_RESIZABLE = SWT.TITLE | SWT.PRIMARY_MODAL | SWT.CLOSE | SWT.RESIZE | SWT.MAX | SWT.MIN;
	public static final int STYLE_MESSAGE = SWT.TITLE | SWT.PRIMARY_MODAL;

	//subclassing
	protected void checkSubclass() {}


	public CustomShell(Shell parent, int style) {
		super(parent, style);
	}


	/*
	 * Overrided
	 */
	public void open(){
		super.open();
		setFocus();
	}


	public void pack(){
		super.pack();
		setMinimumSize();
	}


	/*
	 * Added
	 */
	public void setCenteredLocation(){
		Rectangle parentBounds = getParent().getBounds();
		Rectangle childBounds = getBounds();
		int x = parentBounds.x + (parentBounds.width - childBounds.width) / 2;
		int y = parentBounds.y + (parentBounds.height - childBounds.height) / 2;
		setLocation(x, y);
	}


	public void setParentBounds(){
		setBounds(getParent().getBounds());
	}


	public void setMinimumSize(){
		if (IntegerUtils.bit(getStyle(), SWT.RESIZE)){
			setMinimumSize(getSize().x, getSize().y);
		}
	}


	public void setGridLayout(){
		setLayout(new GridLayout());
	}


}