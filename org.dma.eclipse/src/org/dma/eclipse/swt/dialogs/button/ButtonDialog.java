/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.dialogs.button;

import org.dma.eclipse.swt.widgets.CustomButton;
import org.dma.eclipse.swt.widgets.CustomShell;
import org.dma.java.util.Debug;

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

		final Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout(2, true);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		for(String label: new String[]{OK, CANCEL}){
			final CustomButton button=new CustomButton(composite, SWT.PUSH);
			GridData gridData=new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth=height*2;
			gridData.minimumHeight=height;
			button.setLayoutData(gridData);
			button.setFontSize(15);
			button.setText(label);
			button.setData(label);

			button.addKeyListener(new KeyAdapter() {
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


	public static void main(String[] args) {

		new ButtonDialog() {
			@Override
			public void ok() {
				Debug.out(OK);
			}
		}.openAndSleep();

	}


}
