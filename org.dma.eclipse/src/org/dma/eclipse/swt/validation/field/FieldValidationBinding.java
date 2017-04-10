/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.field;

import org.dma.eclipse.swt.validation.IValidationRules;
import org.dma.java.math.NumericUtils;
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

public abstract class FieldValidationBinding extends FieldError implements IValidationRules {

	/** @see org.dma.eclipse.swt.validation#IValidationRules */
	public abstract String getErrorMessage(int error);

	private final Control control;
	private final FieldRegex regex;
	private int rules;

	private boolean enabled=true;
	private Listener selectionListener;
	private FocusListener focusListener;

	/** Text / combo (with regex) */
	public FieldValidationBinding(Label label, Control control, FieldFormat fieldFormat, int rules) {
		super(label);
		this.control=control;
		this.regex=new FieldRegex(control, fieldFormat);
		this.rules=rules;
	}

	/** Text / combo / list / button (no regex) */
	public FieldValidationBinding(Label label, Control control, int rules) {
		super(label);
		this.control=control;
		this.regex=null;
		this.rules=rules;
	}

	/** Generic (no regex) */
	public FieldValidationBinding(Control control, int rules) {
		super(null);
		this.control=control;
		this.regex=null;
		this.rules=rules;
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

		//field can be edited
		enabled=!(NumericUtils.bit(rules, NOTEDITABLE) && edited) &&
				//field is not READ-ONLY
				!NumericUtils.bit(rules, READONLY);

		//rules applied only if ENABLED
		if (!enabled) return;

		//field cannot be EMPTY
		if (NumericUtils.bit(rules, NOTEMPTY) &&
			//TEXT has no chars?
			((control instanceof Text && getText().trim().isEmpty()) ||
			//COMBO/LIST has no elements?
			(control instanceof Combo && getCombo().getItemCount()==0) ||
			(control instanceof List && getList().getItemCount()==0)))
			setError(getErrorMessage(NOTEMPTY));

		//field cannot be ZERO
		if (NumericUtils.bit(rules, NOTZERO) &&
			//TEXT/SPINNER is zero?
			((control instanceof Text && getText().trim().equals("0")) ||
			(control instanceof Spinner && getText().trim().equals("0")) ||
			//COMBO/LIST has no selected elements?
			(control instanceof Combo && getCombo().getSelectionIndex()==-1) ||
			(control instanceof List && getList().getSelectionCount()==0)))
			setError(getErrorMessage(NOTZERO));

		//field length must match regex
		if (NumericUtils.bit(rules, LIMITMATCH) &&
			(control instanceof Text &&
			regex!=null && !regex.isLimitMatch()))
			setError(getErrorMessage(LIMITMATCH));

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
			return TimeDateUtils.getDateFormatted(
					TimeDateUtils.getCalendar(dt.getYear(), dt.getMonth(), dt.getDay()).getTime());
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
		this.rules=rules;
	}

	public boolean isEnabled() {
		return enabled;
	}


}