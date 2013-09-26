/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

import org.dma.java.utils.array.MessageList;

public class ErrorDialog extends CustomDialog {

	/*
	 * Error
	 */
	public static boolean open(String operation, String message) {
		return open(operation, message, TYPE.ERROR);
	}

	public static boolean open(String operation, MessageList list) {
		return open(operation, list.toString());
	}

	public static boolean open(String message) {
		return open(null, message);
	}

	public static boolean open(MessageList list){
		return open(list.toString());
	}


}
