/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.field;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

public class FieldLabel {

	private final Control control;
	private final String text;

	public FieldLabel() {
		this(null, null);
	}

	public FieldLabel(String text) {
		this(null, text);
	}

	public FieldLabel(Control control) {
		this(control, null);
	}

	public FieldLabel(Control control, String text) {
		this.control=control;
		this.text=text;
	}


	/** @see Control#setForeground(Color) */
	public void setColor(Color color) {
		if (control!=null){
			if (control instanceof Label) ((Label)control).setForeground(color);
			if (control instanceof Button)((Button)control).setBackground(color);
		}
	}

	public String getText() {
		if (text!=null) return text;
		if (control!=null){
			if (control instanceof Label) return ((Label)control).getText();
			if (control instanceof Button) return ((Button)control).getText();
		}return "";
	}

}