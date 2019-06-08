/*******************************************************************************
 * 2008-2017 Public Domain
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

	private final String[] labels;
	private final int height;

	public ButtonMenu(String...labels) {
		this(Display.getDefault().getActiveShell(), labels);
	}

	public ButtonMenu(int height, String...labels) {
		this(Display.getDefault().getActiveShell(), height, labels);
	}

	public ButtonMenu(Shell parent, String...labels) {
		this(parent, Display.getDefault().getClientArea().height / 10, labels);
	}

	public ButtonMenu(Shell parent, int height, String...labels) {
		super(parent, STYLE_RESIZABLE);

		this.labels=labels;
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
		GridLayout gridLayout=new GridLayout(1, true);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		int index=0;
		for(String label: labels){
			CustomButton button=new CustomButton(composite, SWT.PUSH);
			GridData gridData=new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth=height*4;
			gridData.minimumHeight=height;
			button.setLayoutData(gridData);
			button.setFontSize(15);
			button.setText(label);
			button.setData(index);
			index++;

			button.addKeyListener(new KeyAdapter(){
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


	public static void main(String[] argvs) {

		new ButtonMenu("Zero", "One", "Two") {
			@Override
			public void done(int index) {
				System.out.println(index);
			}
		}.openAndSleep();

	}


}
