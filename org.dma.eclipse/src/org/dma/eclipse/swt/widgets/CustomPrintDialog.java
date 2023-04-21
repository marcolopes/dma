/*******************************************************************************
 * Copyright 2008-2016 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.widgets;

import org.eclipse.swt.printing.PrintDialog;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CustomPrintDialog extends PrintDialog {

	@Override //subclassing
	protected void checkSubclass() {}

	public CustomPrintDialog() {
		this(Display.getDefault().getActiveShell());
	}

	/** @see PrintDialog#PrintDialog(Shell) */
	public CustomPrintDialog(Shell parent){
		super(parent);
	}

	/**
	 * Opens the System Print Dialog
	 * @return The selected printer name
	 * (or null if dialogue was canceled)
	 */
	public String openDialog() {

		PrinterData pd=open();

		return pd==null ? null : pd.name;

	}


}
