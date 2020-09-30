/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.table;

public abstract class ColumnError {

	public abstract String processError(String message, String label);

	private String message;

	protected final String label;

	public ColumnError(String label) {
		this.label=label;
	}


	/*
	 * Message
	 */
	public String getError() {
		return processError(message==null ? "" : message, label==null ? "" : label);
	}

	public void setError(String message) {
		this.message=message;
	}

	public void clearError() {
		setError(null);
	}

	public boolean hasError() {
		return message!=null && !message.isEmpty();
	}


}
