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

public abstract class ButtonMenu extends CustomShell {

	public abstract void done(int index);

	private final String[] items;
	private final int height;

	public ButtonMenu(String...items) {
		this(Display.getDefault().getActiveShell(), items);
	}

	public ButtonMenu(int height, String...items) {
		this(Display.getDefault().getActiveShell(), height, items);
	}

	public ButtonMenu(Shell parent, String...items) {
		this(parent, Display.getDefault().getClientArea().height / 10, items);
	}

	public ButtonMenu(Shell parent, int height, String...items) {
		super(parent, STYLE_RESIZABLE);

		this.items=items;
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
		GridLayout gridLayout=new GridLayout(1, true);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		int index=0;
		for(String text: items){
			CustomButton button=new CustomButton(composite, SWT.PUSH);
			GridData gridData=new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth=height*4;
			gridData.minimumHeight=height;
			button.setLayoutData(gridData);
			button.setFontSize(15);
			button.setText(text);
			button.setData(index++);

			button.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					switch(e.keyCode){
					case SWT.ESC: close(); break;
					}
				}
			});

			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					int index=(Integer)e.widget.getData();
					close();
					done(index);
				}
			});
		}

	}


	public static void main(String[] args) {

		new ButtonMenu("Zero", "One", "Two") {
			@Override
			public void done(int index) {
				System.out.println(index);
			}
		}.openAndSleep();

	}


}
