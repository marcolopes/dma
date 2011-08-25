/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class DialogHandler {

	private static enum TYPE {ERROR, INFORMATION, QUESTION, CONFIRMATION}

	private static String ERROR_TITLE = "Error";
	private static String INFORMATION_TITLE = "Information";
	private static String QUESTION_TITLE = "Attention";
	private static String CONFIRMATION_TITLE = "Attention";

	public static void setMessages(String error, String information, String question, String confirmation) {
		ERROR_TITLE=error;
		INFORMATION_TITLE=information;
		QUESTION_TITLE=question;
		CONFIRMATION_TITLE=confirmation;
	}


	/*
	 * Error
	 */
	public static boolean error(String message) {
		return open(message, TYPE.ERROR);
	}


	/*
	 * Information
	 */
	public static boolean information(String message) {
		return open(message, TYPE.INFORMATION);
	}

	public static boolean information(String operation, String message) {
		return open(operation +"\n"+ message, TYPE.INFORMATION);
	}


	/*
	 * Question
	 */
	public static boolean question(String message) {
		return open(message, TYPE.QUESTION);
	}


	/*
	 * Confirmation
	 */
	public static boolean confirm(String message) {
		return open(message, TYPE.CONFIRMATION);
	}


	/*
	 * Dialog
	 */
	public static boolean open(String message, TYPE type) {
		return open(null, message, type);
	}


	public static boolean open(String title, String message, TYPE type) {

		try{
			if(title==null) {

				switch(type) {
					case ERROR: title=ERROR_TITLE; break;
					case INFORMATION: title=INFORMATION_TITLE; break;
					case QUESTION: title=QUESTION_TITLE; break;
					case CONFIRMATION: title=CONFIRMATION_TITLE; break;
				}
			}

			Shell shell=Display.getDefault().getActiveShell();
			switch(type) {
				case ERROR: MessageDialog.openError(shell, title, message); break;
				case INFORMATION: MessageDialog.openInformation(shell, title, message); break;
				case QUESTION: return MessageDialog.openQuestion(shell, title, message);
				case CONFIRMATION: return MessageDialog.openConfirm(shell, title, message);
			}

		} catch (Exception e){
			e.printStackTrace();
		}

		return true;
	}


}
