/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.dialogs.message;

import org.dma.utils.java.array.MessageList;

public class QuestionDialog extends CustomDialog {

	/*
	 * Question
	 */
	public static boolean open(String operation, String message) {
		return open(operation, message, TYPE.QUESTION);
	}

	public static boolean open(String operation, MessageList list) {
		return open(operation, list.toString(), TYPE.QUESTION);
	}

	public static boolean open(String message) {
		return open(null, message, TYPE.QUESTION);
	}

	public static boolean open(MessageList list){
		return open(null, list.toString(), TYPE.QUESTION);
	}


}
