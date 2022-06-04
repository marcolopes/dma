/*******************************************************************************
 * 2008-2021 Public Domain
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
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public class RegexMatcher implements Listener {

	private final Control control;
	private final FieldRegex regex;
	private final Pattern pattern;

	public RegexMatcher(Control control, FieldRegex regex) {
		this.control=control;
		this.regex=regex;
		this.pattern=regex.getPattern();
		control.addListener(SWT.Verify, this);
	}

	public void dispose() {
		control.removeListener(SWT.Verify, this);
	}

	@Override
	public void handleEvent(Event event) {
		if (regex.isUppercase()){
			event.text=event.text.toUpperCase();
		}else if (regex.isLowercase()){
			event.text=event.text.toLowerCase();
		}

		StringBuffer newText=new StringBuffer(getText()).
			replace(event.start, event.end, "").
			insert(event.start, event.text);

		/*
		Debug.out("text", event.text);
		Debug.out("start", event.start);
		Debug.out("end", event.end);
		Debug.out("newText", newText);
		*/

		event.doit=pattern.matcher(newText.toString()).matches();

	}

	public String getText() {
		if (control instanceof Spinner) return ((Spinner)control).getText();
		if (control instanceof CCombo) return ((CCombo)control).getText();
		if (control instanceof Combo) return ((Combo)control).getText();
		if (control instanceof Text) return ((Text)control).getText();
		return "";
	}


}