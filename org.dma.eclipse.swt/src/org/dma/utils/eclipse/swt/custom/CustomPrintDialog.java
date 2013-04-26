/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.eclipse.swt.printing.PrintDialog;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.swt.widgets.Shell;

public class CustomPrintDialog extends PrintDialog {

	//subclassing
	protected void checkSubclass() {}

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

		PrinterData printerData=open();
		return printerData==null ? null : printerData.name;

	}


}
