/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.support;

import java.util.regex.Pattern;

import org.dma.java.input.FieldRegex;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class RegexMatcher {

	private final Listener verifyListener = new Listener() {
		@Override
		public void handleEvent(Event event) {
			if(regex.isUppercase()){
				event.text=event.text.toUpperCase();
			}
			else if(regex.isLowercase()){
				event.text=event.text.toLowerCase();
			}
			event.doit=patternMatcher(event);
		}
	};

	private final Control control;
	private final FieldRegex regex;
	private final Pattern pattern;

	public RegexMatcher(Control control, FieldRegex regex) {
		this.control=control;
		this.regex=regex;
		this.pattern=regex.getRegexPattern();
		control.addListener(SWT.Verify, verifyListener);
	}

	public void dispose() {
		control.removeListener(SWT.Verify, verifyListener);
	}

	private boolean patternMatcher(Event event) {

		String text="";

		if(control instanceof CCombo){
			CCombo control=(CCombo)this.control;
			text=control.getText();
		}
		else if(control instanceof Combo){
			Combo control=(Combo)this.control;
			text=control.getText();
		}
		else if(control instanceof Text){
			Text control=(Text)this.control;
			text=control.getText();
		}

		StringBuffer newText=new StringBuffer(text).
			replace(event.start, event.end, "").
			insert(event.start, event.text);

		/*
		Debug.out("text", event.text);
		Debug.out("start", event.start);
		Debug.out("end", event.end);
		Debug.out("newText", newText);
		*/

		return pattern.matcher(newText.toString()).matches();

	}


}