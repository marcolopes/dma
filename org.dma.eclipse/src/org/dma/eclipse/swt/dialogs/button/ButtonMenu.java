/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.button;

import org.dma.eclipse.swt.custom.CustomShell;
import org.dma.eclipse.swt.graphics.SWTFontUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public abstract class ButtonMenu extends CustomShell {

	public abstract String label(int index);
	public abstract void done(int index);

	private Text text;

	private final int labels;
	private final int height;

	public ButtonMenu(int labels) {
		this(labels, Display.getCurrent().getClientArea().height / 10);
	}

	public ButtonMenu(int labels, int height) {
		super(Display.getCurrent().getActiveShell(), STYLE_FIXED);

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
		GridLayout gridLayout=new GridLayout(1, false);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

		for(int i=0; i<labels; i++){
			Button button=new Button(composite, SWT.PUSH);
			button.setLayoutData(new GridData(height*4,height));
			button.setFont(SWTFontUtils.createFont(button, 15));
			button.setText(label(i));
			button.setData(i);

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


}
