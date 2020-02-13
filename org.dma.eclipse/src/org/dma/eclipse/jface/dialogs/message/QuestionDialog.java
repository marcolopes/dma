/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.java.util.MessageList;

public class QuestionDialog extends GenericDialog {

	public static boolean open(MessageList message) {
		return open(CustomMessageDialog.TYPE.QUESTION, message);
	}

	public static boolean open(String message) {
		return open(CustomMessageDialog.TYPE.QUESTION, message);
	}

	public static boolean open(String header, MessageList message) {
		return open(CustomMessageDialog.TYPE.QUESTION, header, message);
	}

	public static boolean open(String header, String message) {
		return open(CustomMessageDialog.TYPE.QUESTION, header, message);
	}

}
