/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.eclipse.jface.dialogs.message.CustomMessageDialog.TYPE;
import org.dma.java.util.MessageList;

public class ErrorDialog extends GenericDialog {

	public static boolean open(MessageList message) {
		return open(TYPE.ERROR, message);
	}

	public static boolean open(String message) {
		return open(TYPE.ERROR, message);
	}

	public static boolean open(String header, MessageList message) {
		return open(TYPE.ERROR, header, message);
	}

	public static boolean open(String header, String message) {
		return open(TYPE.ERROR, header, message);
	}

}
