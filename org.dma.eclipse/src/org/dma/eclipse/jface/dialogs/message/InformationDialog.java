/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.java.util.MessageList;

public class InformationDialog extends GenericDialog {

	public static boolean open(MessageList message) {
		return open(CustomMessageDialog.TYPE.INFORMATION, message);
	}

	public static boolean open(String message) {
		return open(CustomMessageDialog.TYPE.INFORMATION, message);
	}

	public static boolean open(String header, MessageList message) {
		return open(CustomMessageDialog.TYPE.INFORMATION, header, message);
	}

	public static boolean open(String header, String message) {
		return open(CustomMessageDialog.TYPE.INFORMATION, header, message);
	}

}
