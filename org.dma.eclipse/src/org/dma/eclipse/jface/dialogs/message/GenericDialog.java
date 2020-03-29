/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.java.util.MessageList;

public class GenericDialog {

	public static boolean open(CustomMessageDialog.TYPE type, MessageList message) {
		return open(type, message.toString());
	}

	public static boolean open(CustomMessageDialog.TYPE type, String message) {
		return open(type, "", message);
	}

	public static boolean open(CustomMessageDialog.TYPE type, String header, MessageList message) {
		return open(type, header, message.toString());
	}

	public static boolean open(CustomMessageDialog.TYPE type, String header, String message) {
		return type.open(header, message);
	}


}
