/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.table;

import java.math.BigDecimal;

import org.dma.eclipse.swt.input.RegexMatcher;
import org.dma.java.input.FieldFormat;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public abstract class ColumnBinding extends ColumnError {

	private final Control control;
	private final RegexMatcher regexMatcher;

	/** Text / combo (with regex) */
	public ColumnBinding(Control text, FieldFormat fieldFormat, String label) {
		super(label);
		this.control=text;
		this.regexMatcher=new RegexMatcher(control, fieldFormat);
	}

	/** Generic (no regex) */
	public ColumnBinding(Control text, String label) {
		super(label);
		this.control=text;
		this.regexMatcher=null;
	}


	public void dispose() {
		if (regexMatcher!=null) regexMatcher.detach();
	}



	/*
	 * Text
	 */
	public String getText() {
		if (control instanceof Text){
			return ((Text) control).getText();
		}
		else if (control instanceof Combo){
			return ((Combo) control).getText();
		}
		else if (control instanceof Spinner){
			return ((Spinner)control).getText();
		}
		return "";
	}


	public Integer getTextInteger() {
		try{
			return Integer.valueOf(getText());

		}catch(NumberFormatException e){}

		return 0;
	}


	public BigDecimal getTextBigDecimal() {
		try{
			return new BigDecimal(getText());

		}catch(NumberFormatException e){}

		return BigDecimal.ZERO;
	}



	/*
	 * Getters and setters
	 */
	public Combo getCombo() {
		return (Combo)control;
	}

	public List getList() {
		return (List)control;
	}

	public Button getButton() {
		return (Button)control;
	}


}
