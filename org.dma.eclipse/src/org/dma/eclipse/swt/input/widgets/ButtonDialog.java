/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.widgets;

import org.dma.eclipse.swt.widgets.CustomButton;
import org.dma.eclipse.swt.widgets.CustomShell;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class ButtonDialog extends CustomShell {

	public abstract void ok();

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
		super(parent, STYLE_RESIZABLE);

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
		GridLayout gridLayout=new GridLayout(2, true);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		for(String label: LABELS){
			final CustomButton button=new CustomButton(composite, SWT.PUSH);
			GridData gridData=new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth=height*2;
			gridData.minimumHeight=height;
			button.setLayoutData(gridData);
			button.setFontSize(15);
			button.setText(label);
			button.setData(label);

			button.addKeyListener(new KeyAdapter(){
				@Override
				public void keyPressed(KeyEvent e) {
					switch(e.keyCode){
					case SWT.CR:
					case SWT.KEYPAD_CR: close(); ok(); break;
					case SWT.ESC: close(); break;
					}
				}
			});

			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					String label=(String)e.widget.getData();
					close();
					if (label.equals(OK)) ok();
				}
			});
		}

	}


	public static void main(String[] argvs) {

		new ButtonDialog() {
			@Override
			public void ok() {
				System.out.println(OK);
			}
		}.openAndSleep();

	}


}
