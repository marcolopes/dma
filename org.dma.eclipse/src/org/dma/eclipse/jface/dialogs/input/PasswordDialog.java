/*******************************************************************************
 * Copyright 2008-2015 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.jface.dialogs.input;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

public class PasswordDialog extends InputDialog {

	public PasswordDialog(Shell parentShell, String dialogTitle) {
		this(parentShell, dialogTitle, null);
	}

	public PasswordDialog(Shell parentShell, String dialogTitle, String dialogMessage) {
		this(parentShell, dialogTitle, dialogMessage, null);
	}

	public PasswordDialog(Shell parentShell, String dialogTitle, String dialogMessage, String initialValue) {
		this(parentShell, dialogTitle, dialogMessage, initialValue, null);
	}

	public PasswordDialog(Shell parentShell, String dialogTitle, String dialogMessage, String initialValue, IInputValidator validator) {
		super(parentShell, dialogTitle, dialogMessage, initialValue, validator);
	}

	@Override
	protected int getInputTextStyle() {
		return super.getInputTextStyle() | SWT.PASSWORD;
	}

	/** Opens dialog and returns value (null=aborted) */
	@Override
	public String getValue() {
		return super.open()==Window.CANCEL ? null : super.getValue();
	}


}
