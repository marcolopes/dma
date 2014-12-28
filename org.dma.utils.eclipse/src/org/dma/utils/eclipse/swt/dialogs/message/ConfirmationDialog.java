/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.dialogs.message;

import org.dma.utils.java.array.ArrayUtils;
import org.dma.utils.java.array.MessageList;

public class ConfirmationDialog extends CustomDialog {

	/*
	 * Confirmation
	 */
	public static boolean open(String operation, String...message) {
		return open(operation, ArrayUtils.concat(message,"\n"), TYPE.CONFIRMATION);
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
