/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.field;

import org.dma.eclipse.swt.graphics.ColorManager;
import org.dma.java.util.StringUtils;

public abstract class FieldError  {

	public abstract String formatLabel(ERRORS error, String message, String label);

	public enum ERRORS {
		NO_ERROR,
		WRONG_LENGTH,
		INVALID_VALUE,
		USER_DEFINED}

	private String message;
	private ERRORS error;

	protected final FieldLabel label;

	public FieldError(FieldLabel label) {
		this.label=label;
		clearError();
	}

	public void update() {
		label.setColor(hasError() ? ColorManager.COLOR_RED : null);
	}


	/*
	 * Message
	 */
	public String getErrorMessage() {
		return formatLabel(error, error==ERRORS.NO_ERROR ? "" : message, label.getText());
	}

	public void setError(String message) {
		this.message=message;
		setError(StringUtils.isEmpty(message) ? ERRORS.NO_ERROR : ERRORS.USER_DEFINED);
	}

	public void clearError() {
		setError(ERRORS.NO_ERROR);
	}



	/*
	 * Getters and setters
	 */
	public boolean hasError() {
		return error!=ERRORS.NO_ERROR;
	}

	public void setError(ERRORS error) {
		this.error=error;
	}


}