/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.table;

public abstract class ColumnError {

	public abstract String processErrorMessage(String message, String label);

	private String message;

	protected final String label;

	public ColumnError(String label) {
		this.label=label;
	}


	/*
	 * Message
	 */
	public String getErrorMessage() {
		return processErrorMessage(message==null ? "" : message,
				label==null ? "" : label);
	}

	public void setErrorMessage(String message) {
		this.message=message;
	}

	public void clearError() {
		setErrorMessage(null);
	}

	public boolean hasError() {
		return this.message!=null && !this.message.isEmpty();
	}


}
