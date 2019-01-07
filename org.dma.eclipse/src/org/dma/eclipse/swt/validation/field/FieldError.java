/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.field;

import org.dma.eclipse.swt.graphics.ColorManager;

import org.eclipse.swt.widgets.Label;

public abstract class FieldError  {

	public abstract String processErrorMessage(ERRORS error, String message, String label);

	public enum ERRORS {
		NONE,
		IS_ZERO,
		IS_EMPTY,
		WRONG_LENGTH,
		USER_DEFINED}

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