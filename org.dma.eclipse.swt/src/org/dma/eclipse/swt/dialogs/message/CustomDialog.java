/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CustomDialog {

	/*
	 * Dialog
	 */
	public static enum TYPE {

		ERROR ("Error"),
		INFORMATION ("Information"),
		QUESTION ("Attention"),
		CONFIRMATION ("Attention");

		private String title;

		TYPE(String title) {
			this.title=title;
		}

		public static void setTitle(String error, String information, String question, String confirmation){
			ERROR.title=error;
			INFORMATION.title=information;
			QUESTION.title=question;
			CONFIRMATION.title=confirmation;
		}

	}

	public static boolean open(String operation, String message, TYPE type) {

		if (message.isEmpty())
			return false;

		String message2=operation==null || operation.isEmpty() ?
				message : operation +"\n"+ message;

		Shell shell=Display.getDefault().getActiveShell();
		switch(type) {
			case ERROR: MessageDialog.openError(shell, type.title, message2); break;
			case INFORMATION: MessageDialog.openInformation(shell, type.title, message2); break;
			case QUESTION: return MessageDialog.openQuestion(shell, type.title, message2);
			case CONFIRMATION: return MessageDialog.openConfirm(shell, type.title, message2);
		}

		return true;
	}


}