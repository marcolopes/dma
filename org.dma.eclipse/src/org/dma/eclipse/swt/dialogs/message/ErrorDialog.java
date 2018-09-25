/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.message;

import org.dma.java.util.MessageList;

public class ErrorDialog {

	public static boolean open(String...message) {
		return open(new MessageList(message));
	}

	public static boolean open(MessageList message) {
		return open(null, message);
	}

	public static boolean open(String header, MessageList message) {
		return MessageDialog.open(header, message.toString(), MessageDialog.TYPE.ERROR);
	}


}
