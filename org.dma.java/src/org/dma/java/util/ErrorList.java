/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

public class ErrorList {

	private final MessageList errors=new MessageList();
	private final MessageList warnings=new MessageList();

	public ErrorList() {}

	public ErrorList(Exception e) {
		errors.add(e.getMessage());
	}


	/** Clears errors and warnings */
	public void clear() {
		errors.clear();
		warnings.clear();
	}

	/** Prints errors and warnings */
	public void print() {
		errors.print();
		warnings.print();
	}

	/** Adds errors and warnings */
	public void add(ErrorList list) {
		errors.add(list.getErrors());
		warnings.add(list.getWarnings());
	}



	/*
	 * Getters and Setters
	 */
	public boolean hasErrors() {
		return !errors.isEmpty();
	}

	public MessageList getErrors() {
		return errors;
	}

	public boolean hasWarnings() {
		return !warnings.isEmpty();
	}

	public MessageList getWarnings() {
		return warnings;
	}


}
