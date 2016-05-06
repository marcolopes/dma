/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MessageDialog extends org.eclipse.jface.dialogs.MessageDialog {

	public enum TYPE {

		ERROR ("Error", false),
		INFORMATION ("Information", false),
		CONFIRMATION ("Confirmation", true),
		QUESTION ("Question", true);

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

	public MessageDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage,
			String dialogMessage, int dialogImageType, String[] dialogButtonLabels, int defaultIndex) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType, dialogButtonLabels, defaultIndex);
	}

	private static boolean result;

	public static boolean open(final String message, final TYPE type) {
		return open(null, message, type);
	}

	public static boolean open(String header, String message, final TYPE type) {

		if (message==null || message.isEmpty()) return type.result;

		final String message2=header==null || header.isEmpty() ?
				message : header+"\n"+message;

		result=true;

		try{
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					Shell shell=Display.getDefault().getActiveShell();
					switch(type) {
					case ERROR: openError(shell, type.title, message2); break;
					case INFORMATION: result=open(INFORMATION, shell, type.title, message2, SWT.NONE); break;
					case CONFIRMATION: result=open(CONFIRM, shell, type.title, message2, SWT.NONE); break;
					case QUESTION: result=open(QUESTION, shell, type.title, message2, SWT.NONE); break;
					}
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}

		return result;

	}


}