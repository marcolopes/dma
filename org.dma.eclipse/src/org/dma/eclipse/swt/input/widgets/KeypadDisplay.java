/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.widgets;

import java.math.BigDecimal;

import org.dma.eclipse.swt.graphics.ColorManager;
import org.dma.eclipse.swt.widgets.CustomShell;
import org.dma.eclipse.swt.widgets.CustomText;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class KeypadDisplay extends CustomText {

	public enum FUNCTIONS {
		/** Move cursor 1 position back */
		BACK,
		/** Move cursor 1 position forward */
		FORWARD,
		/** Delete selected / before cursor chars */
		DELETE,
		/** Clear all chars */
		CLEAR;
	}

	private String value="";

	public KeypadDisplay(Composite parent, int fontSize) {
		super(parent, SWT.BORDER | SWT.RIGHT);

		setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		setForeground(ColorManager.getColor(SWT.COLOR_RED));
		setFontSize(fontSize);
		//setEditable(false);
		setText(value);

		addVerifyListener(new VerifyListener(){
			@Override
			public void verifyText(VerifyEvent event) {
				//calculates new text
				StringBuffer newText=new StringBuffer(getText()).
					replace(event.start, event.end, "").
					insert(event.start, event.text);
				//verifies new text
				if (newText.toString().startsWith(".")){
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


	public void function(FUNCTIONS function) {

		switch(function){
		case BACK: setSelection(getCaretPosition()-1); break;
		case FORWARD: setSelection(getCaretPosition()+1); break;
		case DELETE:
			//select 1 char before cursor
			if (getSelectionCount()==0) setSelection(getCaretPosition()-1, getCaretPosition());
			insert("");
			break;
		case CLEAR:
			selectAll();
			function(FUNCTIONS.DELETE);
			break;
		}

	}


	public void setValue(String value) {
		this.value=value;
		setText(value);
		selectAll();
	}

	public String getValue() {
		return value;
	}



	public static void main(String[] argvs) {

		CustomShell shell=new CustomShell(CustomShell.STYLE_RESIZABLE);
		shell.setGridLayout();
		final KeypadDisplay display=new KeypadDisplay(shell, 20);
		display.setValue("100.001");
		display.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.keyCode){
				case 'c':
				case 'C': display.function(FUNCTIONS.CLEAR); break;
				case SWT.CR:
				case SWT.KEYPAD_CR: display.selectAll(); break;
				case SWT.ESC: display.copy(); break;
				}
			}
		});
		shell.openAndSleep();

	}


}
