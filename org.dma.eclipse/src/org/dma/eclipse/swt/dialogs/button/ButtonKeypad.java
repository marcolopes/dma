/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.button;

import java.math.BigDecimal;

import org.dma.eclipse.swt.custom.CustomButton;
import org.dma.eclipse.swt.custom.CustomShell;
import org.dma.eclipse.swt.custom.CustomText;
import org.dma.eclipse.swt.graphics.ColorUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class ButtonKeypad extends CustomShell {

	public abstract boolean done(String result);

	private enum FUNCTIONS {

		DELETE ("\u2190"),
		BACK ("\u21e6"),
		FORWARD ("\u21e8"),
		CLEAR ("C"),
		RETURN ("OK");

		public final String label;

		private FUNCTIONS(String label) {
			this.label=label;
		}

		public static FUNCTIONS get(String label) {
			for (FUNCTIONS element: values()){
				if (element.label.equals(label)) return element;
			}
			return null;
		}

	}

	private static final String POINT = ".";

	private static final String[] LABELS = new String[]{
		"7", "8", "9", FUNCTIONS.DELETE.label,
		"4", "5", "6", FUNCTIONS.BACK.label,
		"1", "2", "3", FUNCTIONS.FORWARD.label,
		"0", POINT, FUNCTIONS.CLEAR.label, FUNCTIONS.RETURN.label};

	private CustomText text;
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
		super(parent, STYLE_RESIZABLE);

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


	private boolean function(FUNCTIONS function) {

		text.setFocus();

		if (function==null) return false;

		switch(function){
		case DELETE:
			if (text.getSelectionCount()==0)
				//select 1 char before cursor
				text.setSelection(text.getCaretPosition()-1, text.getCaretPosition());
			text.insert("");
			break;
		case BACK:
			//move cursor 1 position back
			text.setSelection(text.getCaretPosition()-1); break;
		case FORWARD:
			//move cursor 1 position forward
			text.setSelection(text.getCaretPosition()+1); break;
		case CLEAR:
			text.selectAll();
			text.insert("");
			break;
		case RETURN: if (done(value)) close(); break;
		}return true;

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

		text=new CustomText(composite, SWT.BORDER | SWT.RIGHT);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.setForeground(ColorUtils.getColor(SWT.COLOR_RED));
		text.setFontSize(20);
		//text.setEditable(false);
		text.setText(value);

		text.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.keyCode){
				case SWT.CR:
				case SWT.KEYPAD_CR: function(FUNCTIONS.RETURN); break;
				case SWT.ESC: close(); break;
				case 'c':
				case 'C': function(FUNCTIONS.CLEAR); break;
				}
			}
		});

		text.addVerifyListener(new VerifyListener(){
			@Override
			public void verifyText(VerifyEvent event) {
				//calculates new text
				StringBuffer newText=new StringBuffer(text.getText()).
					replace(event.start, event.end, "").
					insert(event.start, event.text);
				//verifies new text
				if (newText.toString().startsWith(POINT)){
					newText.insert(0, "0");
					event.text="0"+event.text;
				}
				if (newText.length()>0) try{
					new BigDecimal(newText.toString());
				}catch(NumberFormatException e){
					event.doit=false;
				}
				value=event.doit ? newText.toString() : value;
			}
		});

	}


	private void createCompositeButtons() {

		Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout(4, true);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		for(String label: LABELS){
			final CustomButton button=new CustomButton(composite, SWT.PUSH);
			GridData gridData=new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth=height;
			gridData.minimumHeight=height;
			button.setLayoutData(gridData);
			button.setFontSize(20);
			button.setText(label);
			button.setData(label);
			button.setFocus();

			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					String label=(String)e.widget.getData();
					if (!function(FUNCTIONS.get(label))) text.insert(label);
				}
			});
		}

	}


	public static void main(String[] argvs) {

		new ButtonKeypad() {
			@Override
			public boolean done(String result) {
				System.out.println(result);
				return true;
			}
		}.openAndSleep();

	}


}
