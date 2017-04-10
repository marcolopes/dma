/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.table;

public abstract class ColumnError {

	public abstract String processMessage(String message, String label);

	private String message;
	private boolean error;

	protected final String label;

	public ColumnError(String label) {
		this.label=label;
		clearError();
	}


	/*
	 * Message
	 */
	public String getMessage() {
		return message;
	}

	public void setError(String message) {
		this.message=processMessage(message==null ? "" : message,
				label==null ? "" : label);
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
