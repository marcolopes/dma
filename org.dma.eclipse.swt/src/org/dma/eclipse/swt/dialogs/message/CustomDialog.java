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
	public enum TYPE {

		ERROR ("Error", false),
		INFORMATION ("Information", false),
		QUESTION ("Attention", true),
		CONFIRMATION ("Attention", true);

		private String title;
		private final boolean result;

		TYPE(String title, boolean result) {
			this.title=title;
			this.result=result;
		}

		public void setTitle(String title){
			this.title=title;
		}

		public static void setTitle(String error, String information, String question, String confirmation){
			ERROR.setTitle(error);
			INFORMATION.setTitle(information);
			QUESTION.setTitle(question);
			CONFIRMATION.setTitle(confirmation);
		}

	}


	public static boolean open(String operation, String message, TYPE type) {

		if (message.isEmpty()) return type.result;

		String message2=operation==null || operation.isEmpty() ?
				message : operation +"\n"+ message;

		Shell shell=Display.getDefault().getActiveShell();
		switch (type) {
			case ERROR: MessageDialog.openError(shell, type.title, message2); break;
			case INFORMATION: MessageDialog.openInformation(shell, type.title, message2); break;
			case QUESTION: return MessageDialog.openQuestion(shell, type.title, message2);
			case CONFIRMATION: return MessageDialog.openConfirm(shell, type.title, message2);
		}

		return true;

	}


}