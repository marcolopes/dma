/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.field;

import org.dma.eclipse.swt.graphics.ColorManager;

import org.eclipse.swt.widgets.Label;

public abstract class FieldError {

	public abstract String processMessage(String message, String label);

	private String message;
	private boolean error;

	protected final Label label;

	public FieldError(Label label) {
		this.label=label;
		clearError();
	}

	public void update() {
		if (label!=null) label.setForeground(hasError() ?
				ColorManager.COLOR_RED : null);
	}


	/*
	 * Message
	 */
	public String getMessage() {
		return message;
	}

	public void setError(String message) {
		this.message=processMessage(message==null ? "" : message,
				label==null ? "" : label.getText());
		setError(this.message!=null && !this.message.isEmpty());
	}

	public void clearError() {
		setError(null);
	}



	/*
	 * Getters and setters
	 */
	public boolean hasError() {
		return error;
	}

	public void setError(boolean error) {
		this.error=error;
	}


}