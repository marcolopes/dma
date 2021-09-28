/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.eclipse.jface.dialogs.message.CustomMessageDialog.TYPE;
import org.dma.java.util.ErrorList;
import org.dma.java.util.MessageList;

public class GenericDialog {

	public static boolean open(ErrorList error) {
		return open("", error);
	}

	public static boolean open(String header, ErrorList error) {
		return open(TYPE.ERROR, header, error.errors()) ||
				open(TYPE.INFORMATION, header, error.warnings());
	}

	public static boolean open(TYPE type, MessageList message) {
		return open(type, message.toString());
	}

	public static boolean open(TYPE type, String message) {
		return open(type, "", message);
	}

	public static boolean open(TYPE type, String header, MessageList message) {
		return open(type, header, message.toString());
	}

	public static boolean open(TYPE type, String header, String message) {
		return type.open(header, message);
	}


}
