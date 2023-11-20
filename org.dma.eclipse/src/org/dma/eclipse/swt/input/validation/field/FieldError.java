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

	public boolean hasError() {return error!=ERRORS.NO_ERROR;}
	public void setError(ERRORS error) {this.error=error;}

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


}