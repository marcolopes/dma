/*******************************************************************************
 * 2008-2013 Public Domain
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
import org.eclipse.swt.widgets.Text;

public abstract class ButtonKeypad extends CustomShell {

	private final static String DELETE = "\u2190";
	private final static String BACK = "\u21e6";
	private final static String FORWARD = "\u21e8";
	private final static String POINT = ".";
	private final static String CLEAR = "C";
	private final static String RETURN = "OK";

	private final static String[] LABELS = new String[]{
		"7", "8", "9", DELETE,
		"4", "5", "6", BACK,
		"1", "2", "3", FORWARD,
		"0", POINT, CLEAR, RETURN };

	private Text text;
	private String value = "";
	private final int height;

	public abstract boolean done(String result);

	public ButtonKeypad(int height){
		super(Display.getCurrent().getActiveShell(), STYLE_FIXED);

		this.height=height;

		createCompositeDisplay();
		createCompositeButtons();

		setGridLayout();
		pack();
		setCenteredLocation();
	}

	public ButtonKeypad(){
		this(Display.getCurrent().getClientArea().height / 10);
	}


	public void setValue(String value){
		this.value=value;
		text.setText(value);
		text.selectAll();
	}

	public void setValue(BigDecimal value){
		setValue(value.toPlainString());
	}



	/*
	 * Composites
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
				if (newText.length()>0){
					try{
						new BigDecimal(newText.toString());
					}catch(NumberFormatException e1){
						e.doit=false;
					}
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
						if (done(value)) close();
					}else{
						if (label.equals(BACK)){
							text.setSelection(text.getCaretPosition()-1);
						}else if (label.equals(FORWARD)){
							text.setSelection(text.getCaretPosition()+1);
						}else if (label.equals(DELETE)){
							if (text.getSelectionCount()==0){
								text.setSelection(text.getCaretPosition()-1, text.getCaretPosition());
							}
							text.insert("");
						}else if (label.equals(CLEAR)){
							text.selectAll();
							text.insert("");
						}else{
							text.insert(label);
							/*
							if (value.isEmpty() || value.equals("0")){
								update(label.equals(POINT) ? "0." : label);
							}else if (!label.equals(POINT) || !value.contains(POINT)){
								update(value+label);
							}
							*/
						}
						text.setFocus();
					}
				}
			});
		}

	}


}
