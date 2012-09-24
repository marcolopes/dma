/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.dialogs.button;

import org.dma.utils.eclipse.swt.SWTUtils;
import org.dma.utils.eclipse.swt.custom.CustomShell;
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

	private Text text;

	private final String[] labels;
	private final int height;

	public abstract void done(String label);

	public ButtonMenu(String[] labels, int height){
		super(Display.getCurrent().getActiveShell(), STYLE_SHEET);

		this.labels=labels;
		this.height=height;

		createComposite();

		setGridLayout();
		pack();
		setCenteredLocation();
	}

	public ButtonMenu(String[] labels){
		this(labels, Display.getCurrent().getClientArea().height / 10);
	}


	/*
	 * Composites
	 */
	private void createComposite() {

		Composite composite = new Composite(this, SWT.NONE);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

		for(int i=0; i<labels.length; i++){
			Button button=new Button(composite, SWT.PUSH);
			button.setLayoutData(new GridData(height*4,height));
			button.setFont(SWTUtils.createFont(button, 15));
			button.setText(labels[i]);
			button.setData(labels[i]);

			button.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					String label=(String)e.widget.getData();
					close();
					done(label);
				}
			});
		}

	}



}
