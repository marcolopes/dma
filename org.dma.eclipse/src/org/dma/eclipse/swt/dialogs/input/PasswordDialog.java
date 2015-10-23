/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.input;

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
