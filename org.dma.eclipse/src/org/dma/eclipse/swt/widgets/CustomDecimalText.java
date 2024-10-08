/*******************************************************************************
 * Copyright 2008-2019 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.widgets;

import java.math.BigDecimal;

import org.dma.eclipse.swt.graphics.ColorManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class CustomDecimalText extends CustomText {

	private String value="";

	public String getValue() {return value;}

	/** @see Text#Text(Composite, int) */
	public CustomDecimalText(Composite parent, int style) {
		super(parent, style);

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

	public void setValue(String value) {
		this.value=value;
		setText(value);
		selectAll();
	}


	public static void main(String[] args) {

		CustomShell shell=new CustomShell(CustomShell.STYLE_RESIZABLE);
		shell.setGridLayout();
		final CustomDecimalText text=new CustomDecimalText(shell, SWT.BORDER | SWT.RIGHT);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.setForeground(ColorManager.getColor(SWT.COLOR_RED));
		text.setFontSize(30);
		text.setValue("100.001");
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.keyCode){
				case 'c':
				case 'C': text.function(FUNCTIONS.CLEAR); break;
				case SWT.CR:
				case SWT.KEYPAD_CR: text.selectAll(); break;
				case SWT.ESC: text.copy(); break;
				}
			}
		});
		shell.openAndSleep();

	}


}
