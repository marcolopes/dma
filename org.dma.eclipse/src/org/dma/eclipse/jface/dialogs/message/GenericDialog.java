/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.eclipse.jface.dialogs.message.CustomMessageDialog.DIALOG_TYPES;
import org.dma.java.util.ErrorList;
import org.dma.java.util.MessageList;

public class GenericDialog {

	public static boolean open(ErrorList error) {
		return open(null, error);
	}

	public static boolean open(String header, ErrorList error) {
		return open(DIALOG_TYPES.ERROR, header, error.errors()) ||
				open(DIALOG_TYPES.INFORMATION, header, error.warnings());
	}

	public static boolean open(DIALOG_TYPES type, MessageList message) {
		return open(type, message.toString());
	}

	public static boolean open(DIALOG_TYPES type, String message) {
		return open(type, null, message);
	}

	public static boolean open(DIALOG_TYPES type, String header, MessageList message) {
		return open(type, header, message.toString());
	}

	public static boolean open(DIALOG_TYPES type, String header, String message) {
		return type.open(header, message);
	}


}
