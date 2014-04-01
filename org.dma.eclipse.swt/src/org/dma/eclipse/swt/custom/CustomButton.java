/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class CustomButton extends Button {

	//subclassing
	protected void checkSubclass() {}

	private CustomAction action;

	public CustomButton(Composite parent, String text, Image image) {
		super(parent, SWT.NONE);
		setToolTipText(text);
		setImage(image);
	}

	/**
	 * (non-Javadoc)
	 * @see org.eclipse.swt.widgets.Control#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		if (action!=null) action.setEnabled(enabled);
	}


	public void setAction(final CustomAction action) {
		this.action=action;
		addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				action.run();
			}
		});
	}

	public CustomAction getAction() {
		return action;
	}


}