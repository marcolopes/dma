/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.field;

import org.dma.eclipse.swt.input.FieldFormat;
import org.dma.eclipse.swt.input.FieldRegex;
import org.dma.java.util.TimeDateUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public abstract class FieldBinding extends FieldError {

	private final Control control;
	private final FieldFormat fieldFormat;
	private final FieldRegex regex;

	protected FieldRules rules;

	private boolean enabled=true;
	private Listener selectionListener;
	private FocusListener focusListener;

	/** Text / combo (with regex) */
	public FieldBinding(Label label, Control control, FieldFormat fieldFormat, int rules) {
		super(label);
		this.control=control;
		this.fieldFormat=fieldFormat;
		this.regex=new FieldRegex(control, fieldFormat);
		this.rules=new FieldRules(rules);
	}

	/** Text / combo / list / button (no regex) */
	public FieldBinding(Label label, Control control, int rules) {
		super(label);
		this.control=control;
		this.fieldFormat=null;
		this.regex=null;
		this.rules=new FieldRules(rules);
	}

	/** Generic (no regex) */
	public FieldBinding(Control control, int rules) {
		super(null);
		this.control=control;
		this.fieldFormat=null;
		this.regex=null;
		this.rules=new FieldRules(rules);
	}


	public void dispose() {
		control.removeFocusListener(focusListener);
		control.removeListener(SWT.Selection,selectionListener);
		if (regex!=null) regex.detach();
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

		if (control instanceof Spinner ||
				control instanceof Combo ||
				control instanceof List ||
				control instanceof Button){

			control.addListener(SWT.Selection,selectionListener);

		}

	}



	/*
	 * Validation
	 */
	public void disable() {
		clearError();
		enabled=false;
	}


	public void reset() {
		clearError();
		enabled=true;
	}


	public void validate(boolean edited) {

		//can be edited AND is not readonly?
		enabled=!rules.isNotEditable(edited) && !rules.isReadOnly();

		//rules applied only if ENABLED
		if (!enabled) return;

		//SPINNER
		if (control instanceof Spinner){
			//is zero?
			if (rules.isNotZero() && getText().trim().equals("0")) setError(ERRORS.IS_ZERO);
		}
		//COMBO
		else if (control instanceof Combo){
			//has no elements?
			if (rules.isNotEmpty() && getCombo().getItemCount()==0) setError(ERRORS.IS_EMPTY);
			//has no selected elements?
			if (rules.isNotZero() && getCombo().getSelectionIndex()==-1) setError(ERRORS.IS_ZERO);
		}
		//LIST
		else if (control instanceof List){
			//has no elements?
			if (rules.isNotEmpty() && getList().getItemCount()==0) setError(ERRORS.IS_EMPTY);
			//has no selected elements?
			if (rules.isNotZero() && getList().getSelectionCount()==0) setError(ERRORS.IS_ZERO);
		}
		//BUTTON
		else if (control instanceof Button){
		}
		//DATETIME
		else if (control instanceof DateTime){
		}
		//TEXT
		else if (control instanceof Text){
			String text=getText().trim();
			//is zero?
			if (rules.isNotZero() && text.equals("0")) setError(ERRORS.IS_ZERO);
			//has no chars?
			if (rules.isNotEmpty() && text.isEmpty()) setError(ERRORS.IS_EMPTY);
			//length not exact?
			if (rules.isLimitMatch() && text.length()!=fieldFormat.getSize().size) setError(ERRORS.WRONG_LENGTH);
		}

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



	/*
	 * Getters and setters
	 */
	public String getText() {
		if (control instanceof Spinner){
			return getSpinner().getText();
		}
		else if (control instanceof Combo){
			return getCombo().getText();
		}
		else if (control instanceof List){
			return getList().getSelection()[0];
		}
		else if (control instanceof Button){
			return getButton().getText();
		}
		else if (control instanceof DateTime){
			DateTime dt=getDatetime();
			return fieldFormat.format(TimeDateUtils.getCalendar(
					dt.getYear(), dt.getMonth(), dt.getDay()).getTime());
		}
		return ((Text)control).getText();
	}

	public Spinner getSpinner() {
		return (Spinner)control;
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

	public void setRules(int rules) {
		this.rules=new FieldRules(rules);
	}

	public boolean isEnabled() {
		return enabled;
	}


}