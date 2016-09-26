/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.button;

import java.math.BigDecimal;

import org.dma.eclipse.swt.custom.CustomShell;
import org.dma.eclipse.swt.graphics.SWTColorUtils;
import org.dma.eclipse.swt.graphics.SWTFontUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public abstract class ButtonKeypad extends CustomShell {

	public abstract boolean done(String result);

	private static final String DELETE = "\u2190";
	private static final String BACK = "\u21e6";
	private static final String FORWARD = "\u21e8";
	private static final String POINT = ".";
	private static final String CLEAR = "C";
	private static final String RETURN = "OK";

	private static final String[] LABELS = new String[]{
		"7", "8", "9", DELETE,
		"4", "5", "6", BACK,
		"1", "2", "3", FORWARD,
		"0", POINT, CLEAR, RETURN };

	private Text text;
	private String value = "";

	private final int height;

	public ButtonKeypad() {
		this(Display.getDefault().getActiveShell());
	}

	public ButtonKeypad(int height) {
		this(Display.getDefault().getActiveShell(), height);
	}

	public ButtonKeypad(Shell parent) {
		this(parent, Display.getDefault().getClientArea().height / 10);
	}

	public ButtonKeypad(Shell parent, int height) {
		super(parent, STYLE_FIXED);

		this.height=height;

		createCompositeDisplay();
		createCompositeButtons();
		setGridLayout();
		pack();
		setCenteredLocation();
	}


	public void setValue(String value) {
		this.value=value;
		text.setText(value);
		text.selectAll();
	}

	public void setValue(BigDecimal value) {
		setValue(value.toPlainString());
	}

	public void setValue(Double value) {
		setValue(BigDecimal.valueOf(value));
	}

	public void setValue(BigDecimal value, int scale) {
		setValue(value.setScale(scale));
	}



	/*
	 * Contents
	 */
	private void createCompositeDisplay() {

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
		text.setFont(SWTFontUtils.createFont(text, 20));
		//text.setEditable(false);
		text.setText(value);
		text.addVerifyListener(new VerifyListener(){
			@Override
			public void verifyText(VerifyEvent e) {
				//calculates new text
				StringBuffer newText=new StringBuffer(text.getText()).
					replace(e.start, e.end, "").
					insert(e.start, e.text);
				//verifies new text
				if (newText.toString().startsWith(POINT)){
					newText.insert(0, "0");
					e.text="0"+e.text;
				}
				if (newText.length()>0) try{
					new BigDecimal(newText.toString());
				}catch(NumberFormatException e1){
					e.doit=false;
				}
				value=e.doit ? newText.toString() : value;
			}
		});

	}


	private void createCompositeButtons() {

		Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout(4, false);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

		for(String label: LABELS){
			Button button=new Button(composite, SWT.PUSH);
			button.setLayoutData(new GridData(height,height));
			button.setFont(SWTFontUtils.createFont(button, 20));
			button.setText(label);
			button.setData(label);

			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					String label=(String)e.widget.getData();
					if (label.equals(RETURN)){
						if (done(value)) close();
					}else{
						if (label.equals(BACK)){
							//move cursor 1 position back
							text.setSelection(text.getCaretPosition()-1);
						}else if (label.equals(FORWARD)){
							//move cursor 1 position forward
							text.setSelection(text.getCaretPosition()+1);
						}else if (label.equals(DELETE)){
							if (text.getSelectionCount()==0){
								//select 1 char before cursor
								text.setSelection(text.getCaretPosition()-1, text.getCaretPosition());
							}
							text.insert("");
						}else if (label.equals(CLEAR)){
							text.selectAll();
							text.insert("");
						}else{
							text.insert(label);
						}
						text.setFocus();
					}
				}
			});
		}

	}


	public static void main(String[] argvs) {

		new ButtonKeypad() {
			@Override
			public boolean done(String result) {
				return true;
			}
		}.openAndSleep();

	}


}
