/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

import org.dma.java.util.MethodResult;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MessageDialog {

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
					case ERROR: org.eclipse.jface.dialogs.MessageDialog.openError(shell, type.title, message2); break;
					case INFORMATION: result.value=org.eclipse.jface.dialogs.MessageDialog.open(org.eclipse.jface.dialogs.MessageDialog.INFORMATION, shell, type.title, message2, SWT.NONE); break;
					case QUESTION: result.value=org.eclipse.jface.dialogs.MessageDialog.open(org.eclipse.jface.dialogs.MessageDialog.QUESTION, shell, type.title, message2, SWT.NONE); break;
					case CONFIRMATION: result.value=org.eclipse.jface.dialogs.MessageDialog.open(org.eclipse.jface.dialogs.MessageDialog.CONFIRM, shell, type.title, message2, SWT.NONE); break;
					}
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}

		return result.value;

	}


}