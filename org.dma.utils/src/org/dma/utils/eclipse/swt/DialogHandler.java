/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import org.dma.utils.java.array.ErrorList;
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
	public static boolean error(ErrorList error){
		return error.hasErrors() ? error(error.getErrorMessage()) : false;
	}

	public static boolean error(String message) {
		return open(message, TYPE.ERROR);
	}

	public static boolean error(String operation, String message) {
		return error(operation +"\n"+ message);
	}


	/*
	 * Information
	 */
	public static boolean information(String message) {
		return open(message, TYPE.INFORMATION);
	}

	public static boolean information(String operation, String message) {
		return information(operation +"\n"+ message);
	}


	/*
	 * Question
	 */
	public static boolean question(String message) {
		return open(message, TYPE.QUESTION);
	}

	public static boolean question(String operation, String message) {
		return information(operation +"\n"+ message);
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
