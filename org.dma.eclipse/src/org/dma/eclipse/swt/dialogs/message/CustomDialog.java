/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

import org.dma.java.klass.MethodResult;

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

	}


	public static boolean open(String operation, String message, final TYPE type) {

		if (message==null || message.isEmpty()) return type.result;

		final MethodResult result=new MethodResult(true);

		try{
			final String message2=operation==null || operation.isEmpty() ?
					message : operation +"\n"+ message;

			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					Shell shell=Display.getDefault().getActiveShell();
					switch(type) {
						case ERROR: MessageDialog.openError(shell, type.title, message2); break;
						case INFORMATION: MessageDialog.openInformation(shell, type.title, message2); break;
						case QUESTION: result.value=MessageDialog.openQuestion(shell, type.title, message2); break;
						case CONFIRMATION: result.value=MessageDialog.openConfirm(shell, type.title, message2); break;
					}
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}

		return result.value;

	}


}