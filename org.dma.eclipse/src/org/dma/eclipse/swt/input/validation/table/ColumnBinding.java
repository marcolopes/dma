/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.table;

import org.dma.eclipse.swt.input.support.RegexMatcher;
import org.dma.java.input.FieldFormat;
import org.dma.java.util.TimeDateUtils;

import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public abstract class ColumnBinding extends ColumnError {

	private final Control control;
	private final FieldFormat fieldFormat;
	private final RegexMatcher regexMatcher;

	/** Text / combo (with regex) */
	public ColumnBinding(Control control, FieldFormat fieldFormat, String label) {
		super(label);
		this.control=control;
		this.fieldFormat=fieldFormat;
		this.regexMatcher=new RegexMatcher(control, fieldFormat);
	}

	/** Generic (no regex) */
	public ColumnBinding(Control control, String label) {
		super(label);
		this.control=control;
		this.fieldFormat=null;
		this.regexMatcher=null;
	}


	public void dispose() {
		if (regexMatcher!=null) regexMatcher.detach();
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
		if (control instanceof Spinner){
			return getSpinner().getText();
		}
		else if (control instanceof CCombo){
			return getCCombo().getText();
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
		else if (control instanceof Text){
			Text control=(Text)this.control;
			return control.getText();
		}
		return "";
	}


}