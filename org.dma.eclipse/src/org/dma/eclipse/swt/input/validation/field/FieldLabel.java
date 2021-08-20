/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.field;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

public class FieldLabel {

	private final Control control;
	private final String text;

	public FieldLabel() {
		this("");
	}

	public FieldLabel(Label label) {
		this.control=label;
		this.text=label==null ? "" : label.getText();
	}

	public FieldLabel(String text) {
		this.control=null;
		this.text=text;
	}


	/** @see Control#setForeground(Color) */
	public void setColor(Color color) {
		if (control!=null) control.setForeground(color);
	}

	public String getText() {
		return text;
	}

}