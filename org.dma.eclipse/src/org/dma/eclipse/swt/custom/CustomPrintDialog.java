/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

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
	 * @return
	 * Selected printer name<br>
	 * null - if dialogue was canceled
	 */
	public String openDialog() {

		PrinterData pd=open();

		return pd==null ? null : pd.name;

	}


}
