/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.field;

import org.dma.eclipse.swt.graphics.ColorManager;

import org.eclipse.swt.widgets.Label;

public abstract class FieldError  {

	public enum ERRORS {
		NONE,
		USER_DEFINED,
		IS_EMPTY,
		IS_ZERO,
		BAD_LENGTH}

	public abstract String processErrorMessage(ERRORS error, String message, String label);

	private String message;
	private ERRORS error;

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
		return processErrorMessage(error, message==null ? "" : message,
				label==null ? "" : label.getText());
	}

	public void setError(String message) {
		this.message=message;
		setError(message==null || message.isEmpty() ? ERRORS.NONE : ERRORS.USER_DEFINED);
	}

	public void clearError() {
		setError(ERRORS.NONE);
	}



	/*
	 * Getters and setters
	 */
	public boolean hasError() {
		return error!=ERRORS.NONE;
	}

	public void setError(ERRORS error) {
		this.error=error;
	}


}