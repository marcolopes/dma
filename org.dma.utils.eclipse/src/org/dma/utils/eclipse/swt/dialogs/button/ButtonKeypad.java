/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.dialogs.button;

import org.dma.utils.eclipse.swt.custom.CustomShell;
import org.dma.utils.eclipse.swt.graphics.SWTColorUtils;
import org.dma.utils.eclipse.swt.graphics.SWTFontUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public abstract class ButtonKeypad extends CustomShell {

	private final static String RETURN = "OK";

	private final static String[] LABELS = new String[]{
		"7", "8", "9",
		"4", "5", "6",
		"1", "2", "3",
		"0", ".", RETURN };

	private Text text;
	private String value = "0";
	private final int height;

	public abstract void done(String result);

	public ButtonKeypad(int height){
		super(Display.getCurrent().getActiveShell(), STYLE_SHEET);

		this.height=height;

		createCompositeValue();
		createCompositeButtons();

		setGridLayout();
		pack();
		setCenteredLocation();
	}

	public ButtonKeypad(){
		this(Display.getCurrent().getClientArea().height / 10);
	}


	/*
	 * Composites
	 */
	private void createCompositeValue() {

		Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout();
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));

		text=new Text(composite, SWT.BORDER | SWT.RIGHT);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.setForeground(SWTColorUtils.getColor(SWT.COLOR_RED));
		text.setEditable(false);
		text.setText(value);
		text.setFont(SWTFontUtils.createFont(text, 20));

	}


	private void createCompositeButtons() {

		Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout(3, false);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

		for(int i=0; i<LABELS.length; i++){
			Button button=new Button(composite, SWT.PUSH);
			button.setLayoutData(new GridData(height,height));
			button.setFont(SWTFontUtils.createFont(button, 20));
			button.setText(LABELS[i]);
			button.setData(LABELS[i]);

			button.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					String label=(String)e.widget.getData();
					if (label.equals(RETURN)){
						close();
						done(value);
					}else{
						if (value.equals("0")){
							value=label.equals(".") ? "0." : label;
						}else if (!label.equals(".") || !value.contains(".")){
							value+=label;
						}
						text.setText(value);
					}
				}
			});
		}

	}


}
