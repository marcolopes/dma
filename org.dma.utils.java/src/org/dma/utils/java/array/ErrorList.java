/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.array;

public class ErrorList {

	private final MessageList errors=new MessageList();
	private final MessageList warnings=new MessageList();

	public ErrorList(){
	}


	public void clear(){
		errors.clear();
		warnings.clear();
	}

	public void print() {
		errors.print();
		warnings.print();
	}




	/*
	 * Getters and Setters
	 */
	public boolean hasErrors(){
		return errors.hasMessages();
	}

	public MessageList getErrors() {
		return errors;
	}

	public boolean hasWarnings(){
		return warnings.hasMessages();
	}

	public MessageList getWarnings() {
		return warnings;
	}


}
