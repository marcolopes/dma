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

public abstract class ButtonDialog extends CustomShell {

	private final static String OK = "OK";
	private final static String CANCEL = "X";
	private final static String[] keys = new String[]{OK,CANCEL};

	private Text text;
	private final int pixels;

	public abstract void done(boolean ok);

	public ButtonDialog(int pixels){
		super(Display.getCurrent().getActiveShell(), SWT.SHEET);

		this.pixels=pixels;

		createComposite();

		setGridLayout();
		pack();
		setCenteredLocation();
	}

	public ButtonDialog(){
		this(Display.getCurrent().getClientArea().height / 10);
	}


	/*
	 * Composites
	 */
	private void createComposite() {

		Composite composite = new Composite(this, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

		for(int i=0; i<keys.length; i++){
			Button button=new Button(composite, SWT.PUSH);
			button.setLayoutData(new GridData(pixels*2,pixels));
			button.setFont(SWTUtils.createFont(button, 20));
			button.setText(keys[i]);
			button.setData(keys[i]);

			button.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					String c=(String)e.widget.getData();
					close();
					done(c.equals(OK));
				}
			});
		}

	}


}
