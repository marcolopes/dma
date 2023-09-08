/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
		if (regex.isUppercase()) event.text=event.text.toUpperCase();
		else if (regex.isLowercase()) event.text=event.text.toLowerCase();
		//construct the future text from the event fields
		StringBuilder sb=new StringBuilder(getText()).
			replace(event.start, event.end, "").
			insert(event.start, event.text);
		//match the future text against the regex pattern
		event.doit=pattern.matcher(sb.toString()).matches();
	}

	public String getText() {
		if (control instanceof Spinner) return ((Spinner)control).getText();
		if (control instanceof CCombo) return ((CCombo)control).getText();
		if (control instanceof Combo) return ((Combo)control).getText();
		if (control instanceof Text) return ((Text)control).getText();
		return "";
	}


}