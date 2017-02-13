/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

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
		private final boolean result;

		TYPE(String title, boolean result) {
			this.title=title;
			this.result=result;
		}

		public void setTitle(String title){
			this.title=title;
		}

		private boolean result2;

		public boolean open(final String header, final String message) {

			result2=result;

			if (message!=null && !message.isEmpty()) try{

				result2=true;

				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						Shell shell=Display.getDefault().getActiveShell();
						final String message2=header==null || header.isEmpty() ?
								message : header+"\n"+message;
						switch(MessageDialog.TYPE.this) {
						case ERROR: openError(shell, title, message2); break;
						case INFORMATION: openInformation(shell, title, message2); break;
						case CONFIRMATION: result2=openConfirm(shell, title, message2); break;
						case QUESTION: result2=openQuestion(shell, title, message2); break;
						}
					}
				});

			}catch(Exception e){
				e.printStackTrace();
			}

			return result2;

		}

	}


	public MessageDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage,
			String dialogMessage, int dialogImageType, String[] dialogButtonLabels, int defaultIndex) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType, dialogButtonLabels, defaultIndex);
	}


	public static boolean open(final String message, final TYPE type) {
		return open(null, message, type);
	}

	public static boolean open(final String header, final String message, final TYPE type) {
		return type.open(header, message);
	}


	public static void main(String[] argvs) {

		TYPE.ERROR.open("HEADER", "MESSAGE");
		TYPE.INFORMATION.open("HEADER", "MESSAGE");
		TYPE.CONFIRMATION.open("HEADER", "MESSAGE");
		TYPE.QUESTION.open("HEADER", "MESSAGE");

	}


}