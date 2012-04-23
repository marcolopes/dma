/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import org.dma.utils.java.array.MessageList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class DialogHandler {

	public static String ERROR_TITLE = "Error";
	public static String INFORMATION_TITLE = "Information";
	public static String QUESTION_TITLE = "Attention";
	public static String CONFIRMATION_TITLE = "Attention";

	private static enum TYPE {ERROR, INFORMATION, QUESTION, CONFIRMATION}

	/*
	 * Error
	 */
	public static boolean error(String operation, String message) {
		return open(operation, message, TYPE.ERROR);
	}

	public static boolean error(String message) {
		return error(null, message);
	}

	public static boolean error(MessageList list){
		return error(list.toString());
	}

	public static boolean error(String operation, MessageList list) {
		return error(operation, list.toString());
	}



	/*
	 * Information
	 */
	public static boolean information(String operation, String message) {
		return open(operation, message, TYPE.INFORMATION);
	}

	public static boolean information(String message) {
		return information(null, message);
	}

	public static boolean information(MessageList list){
		return information(list.toString());
	}

	public static boolean information(String operation, MessageList list) {
		return information(operation, list.toString());
	}



	/*
	 * Question
	 */
	public static boolean question(String operation, String message) {
		return open(operation, message, TYPE.QUESTION);
	}

	public static boolean question(String message) {
		return question(null, message);
	}

	public static boolean question(MessageList list){
		return question(list.toString());
	}

	public static boolean question(String operation, MessageList list) {
		return question(operation, list.toString());
	}



	/*
	 * Confirmation
	 */
	public static boolean confirm(String operation, String message) {
		return open(operation, message, TYPE.CONFIRMATION);
	}

	public static boolean confirm(String message) {
		return confirm(null, message);
	}

	public static boolean confirm(MessageList list){
		return confirm(list.toString());
	}

	public static boolean confirm(String operation, MessageList list) {
		return confirm(operation, list.toString());
	}



	/*
	 * Dialog
	 */
	public static boolean open(String operation, String message, TYPE type) {

		if (message.isEmpty())
			return false;

		String message2=operation==null || operation.isEmpty() ?
				message : operation +"\n"+ message;

		String title="";
		switch(type) {
			case ERROR: title=ERROR_TITLE; break;
			case INFORMATION: title=INFORMATION_TITLE; break;
			case QUESTION: title=QUESTION_TITLE; break;
			case CONFIRMATION: title=CONFIRMATION_TITLE; break;
		}

		Shell shell=Display.getDefault().getActiveShell();
		switch(type) {
			case ERROR: MessageDialog.openError(shell, title, message2); break;
			case INFORMATION: MessageDialog.openInformation(shell, title, message2); break;
			case QUESTION: return MessageDialog.openQuestion(shell, title, message2);
			case CONFIRMATION: return MessageDialog.openConfirm(shell, title, message2);
		}

		return true;
	}


}
