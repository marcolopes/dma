/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.java.util.Debug;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MessageDialog extends org.eclipse.jface.dialogs.MessageDialog {

	@SuppressWarnings("hiding")
	public enum TYPE {

		ERROR ("Error", false),
		INFORMATION ("Information", false),
		CONFIRMATION ("Confirmation", true),
		QUESTION ("Question", true);

		private String title;
		private final boolean defaultResult;

		TYPE(String title, boolean defaultResult) {
			this.title=title;
			this.defaultResult=defaultResult;
		}

		public void setTitle(String title){
			this.title=title;
		}

		private boolean result=true;

		public boolean open(final String header, String message) {

			if (message!=null && !message.isEmpty()) try{
				final String message2=header==null || header.isEmpty() ? message : header+"\n"+message;
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						Shell shell=Display.getDefault().getActiveShell();
						switch(MessageDialog.TYPE.this) {
						case ERROR: openError(shell, title, message2); break;
						case INFORMATION: openInformation(shell, title, message2); break;
						case CONFIRMATION: result=openConfirm(shell, title, message2); break;
						case QUESTION: result=openQuestion(shell, title, message2); break;
						}
					}
				});
				return result;

			}catch(Exception e){
				Debug.err(e);
			}

			return defaultResult;

		}

	}

	public static boolean open(final String message, final TYPE type) {
		return open(null, message, type);
	}

	public static boolean open(final String header, final String message, final TYPE type) {
		return type.open(header, message);
	}

	public MessageDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage,
			String dialogMessage, int dialogImageType, String[] dialogButtonLabels, int defaultIndex) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType, dialogButtonLabels, defaultIndex);
	}

	public static void main(String[] argvs) {

		TYPE.ERROR.open("HEADER", "MESSAGE");
		TYPE.INFORMATION.open("HEADER", "MESSAGE");
		TYPE.CONFIRMATION.open("HEADER", "MESSAGE");
		TYPE.QUESTION.open("HEADER", "MESSAGE");

	}


}