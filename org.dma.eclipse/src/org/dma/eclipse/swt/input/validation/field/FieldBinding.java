/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.input.validation.field;

import java.text.DecimalFormatSymbols;

import org.dma.eclipse.swt.input.support.RegexMatcher;
import org.dma.java.input.FieldFormat;
import org.dma.java.input.FieldFormat.TYPES;
import org.dma.java.util.TimeDateUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Text;

public abstract class FieldBinding extends FieldError {

	private static final DecimalFormatSymbols DEFAULT_SYMBOLS = DecimalFormatSymbols.getInstance();

	private static final FieldFormat DEFAULT_FORMAT = new FieldFormat(TYPES.STRING, 0);

	private Listener selectionListener;
	private FocusListener focusListener;

	private boolean enabled=true;

	private final Control control;
	private final FieldFormat format;
	private final RegexMatcher matcher;
	private final FieldRules rules;

	/** Without regex matcher */
	public FieldBinding(FieldLabel label, Control control, FieldRules rules) {
		this(label, control, DEFAULT_FORMAT, null, rules);
	}

	/** With regex matcher */
	public FieldBinding(FieldLabel label, Control control, FieldFormat format, FieldRules rules) {
		this(label, control, format, new RegexMatcher(control, format), rules);
	}

	private FieldBinding(FieldLabel label, Control control, FieldFormat format, RegexMatcher matcher, FieldRules rules) {
		super(label);
		this.control=control;
		this.format=format;
		this.matcher=matcher;
		this.rules=rules;
	}


	public void dispose() {
		if (focusListener!=null) control.removeFocusListener(focusListener);
		if (selectionListener!=null) control.removeListener(SWT.Selection, selectionListener);
		if (matcher!=null) matcher.dispose();
	}



	/*
	 * Listeners
	 */
	public void addFocusListener(FocusListener focusListener) {
		this.focusListener=focusListener;
		control.addFocusListener(focusListener);
	}


	public void addSelectionListener(Listener selectionListener) {
		this.selectionListener=selectionListener;
		if (control instanceof TabFolder ||
				control instanceof Spinner ||
				control instanceof CCombo ||
				control instanceof Combo ||
				control instanceof List ||
				control instanceof Button ||
				control instanceof DateTime) control.addListener(SWT.Selection, selectionListener);
	}



	/*
	 * Validation
	 */
	public void validate(boolean edited) {
		//can be edited? is not readonly?
		enabled=!rules.isNotEditable(edited) && !rules.isReadOnly();
		//rules applied only if ENABLED
		if (enabled && rules.isNotEmpty() && isEmpty()) setError(ERRORS.INVALID_VALUE);
		if (enabled && rules.isLimitMatch() && !isLimitMatch()) setError(ERRORS.WRONG_LENGTH);
	}

	public boolean isEmpty() {
		if (control instanceof Spinner) return getSpinner().getText().isEmpty();
		if (control instanceof CCombo) return getCCombo().getSelectionIndex()==-1;
		if (control instanceof Combo) return getCombo().getSelectionIndex()==-1;
		if (control instanceof List) return getList().getSelectionCount()==0;
		if (control instanceof Button) return getButton().getText().isEmpty();
		if (control instanceof DateTime) return getDatetime().getYear()<1752;
		if (control instanceof Text) return getText().isEmpty();
		return false;
	}

	public boolean isLimitMatch() {
		if (control instanceof Spinner) return false;
		if (control instanceof CCombo) return false;
		if (control instanceof Combo) return false;
		if (control instanceof List) return false;
		if (control instanceof Button) return false;
		if (control instanceof DateTime) return false;
		if (control instanceof Text) return getText().length()==format.getSize().size;
		return false;
	}

	@Override
	public void update() {
		super.update();
		if (control instanceof Text){
			((Text)control).setEditable(enabled);
		}else{
			control.setEnabled(enabled);
		}
	}

	public void reset() {
		clearError();
		enabled=true;
	}

	public void disable() {
		clearError();
		enabled=false;
	}

	public boolean isEnabled() {
		return enabled;
	}



	/*
	 * Widgets
	 */
	public Spinner getSpinner() {
		return (Spinner)control;
	}

	public CCombo getCCombo() {
		return (CCombo)control;
	}

	public Combo getCombo() {
		return (Combo)control;
	}

	public List getList() {
		return (List)control;
	}

	public Button getButton() {
		return (Button)control;
	}

	public DateTime getDatetime() {
		return (DateTime)control;
	}

	public String getText() {
		if (control instanceof Spinner) return getSpinner().getText();
		if (control instanceof CCombo) return getCCombo().getText();
		if (control instanceof Combo) return getCombo().getText();
		if (control instanceof List) return getList().getSelection()[0];
		if (control instanceof Button) return getButton().getText();
		if (control instanceof Text) return ((Text)control).getText();
		if (control instanceof DateTime) return format.format(TimeDateUtils.getCalendar(
				getDatetime().getYear(), getDatetime().getMonth(), getDatetime().getDay()).getTime(), DEFAULT_SYMBOLS);
		return "";
	}


}