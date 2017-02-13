/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.button;

import org.dma.eclipse.swt.custom.CustomButton;
import org.dma.eclipse.swt.custom.CustomShell;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class ButtonDialog extends CustomShell {

	public abstract void ok();
	public abstract void cancel();

	private static final String OK = IDialogConstants.OK_LABEL;
	private static final String CANCEL = IDialogConstants.CANCEL_LABEL;
	private static final String[] LABELS = new String[]{OK, CANCEL};

	private final int height;

	public ButtonDialog() {
		this(Display.getDefault().getActiveShell());
	}

	public ButtonDialog(int height) {
		this(Display.getDefault().getActiveShell(), height);
	}

	public ButtonDialog(Shell parent) {
		this(parent, Display.getDefault().getClientArea().height / 10);
	}

	public ButtonDialog(Shell parent, int height) {
		super(parent, STYLE_FIXED);

		this.height=height;

		createContents();
		setGridLayout();
		pack();
		setCenteredLocation();
	}



	/*
	 * Contents
	 */
	private void createContents() {

		Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout(2, false);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

		for(int i=0; i<LABELS.length; i++){
			CustomButton button=new CustomButton(composite, SWT.PUSH);
			button.setLayoutData(new GridData(height*2, height));
			button.setFontSize(15);
			button.setText(LABELS[i]);
			button.setData(LABELS[i]);

			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					String label=(String)e.widget.getData();
					close();
					if (label.equals(OK)){
						ok();
					}else{
						cancel();
					}
				}
			});
		}

	}


}
