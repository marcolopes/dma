/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

public class ErrorList {

	private final MessageList errors=new MessageList();
	private final MessageList warnings=new MessageList();

	public ErrorList() {}

	public ErrorList(Exception e) {
		addError(e.getMessage());
	}


	/** Clears ERRORS and WARNINGS */
	public void clear() {
		errors.clear();
		warnings.clear();
	}

	/** Prints ERRORS and WARNINGS */
	public void print() {
		errors.print();
		warnings.print();
	}

	/** Adds ERRORS and WARNINGS */
	public void add(ErrorList list) {
		errors.addAll(list.errors);
		warnings.addAll(list.warnings);
	}


	/*
	 * Errors
	 */
	public void addError(String prefix, String message) {
		errors.add(prefix, message);
	}

	public void addError(String message) {
		errors.add(message);
	}

	public void addError(Exception e) {
		errors.add(e);
	}

	public MessageList errors() {
		return errors;
	}


	/*
	 * Warnings
	 */
	public void addWarning(String prefix, String message) {
		warnings.add(prefix, message);
	}

	public void addWarning(String message) {
		warnings.add(message);
	}

	public void addWarning(Exception e) {
		warnings.add(e);
	}

	public MessageList warnings() {
		return warnings;
	}


}
