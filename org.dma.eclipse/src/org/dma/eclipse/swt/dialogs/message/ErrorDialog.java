/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

import org.dma.java.util.ArrayUtils;
import org.dma.java.util.MessageList;

public class ErrorDialog {

	/*
	 * Error
	 */
	public static boolean open(String operation, String...message) {
		return MessageDialog.open(operation, ArrayUtils.concat(message, "\n"),
				MessageDialog.TYPE.ERROR);
	}

	public static boolean open(String operation, MessageList list) {
		return open(operation, list.toArray());
	}

	public static boolean open(String message) {
		return open(null, message);
	}

	public static boolean open(MessageList list){
		return open(null, list.toArray());
	}


}
