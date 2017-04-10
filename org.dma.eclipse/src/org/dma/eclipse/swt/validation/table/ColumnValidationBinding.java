/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.table;

import java.math.BigDecimal;

import org.dma.eclipse.swt.validation.field.FieldFormat;
import org.dma.eclipse.swt.validation.field.FieldRegex;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public abstract class ColumnValidationBinding extends ColumnError {

	private final Control control;
	private final FieldRegex regex;

	/** Text / combo (with regex) */
	public ColumnValidationBinding(Control text, FieldFormat fieldFormat, String label) {
		super(label);
		this.control=text;
		this.regex=new FieldRegex(control, fieldFormat);
	}

	/** Generic (no regex) */
	public ColumnValidationBinding(Control text, String label) {
		super(label);
		this.control=text;
		this.regex=null;
	}


	public void dispose(){
		if (regex!=null) regex.detach();
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
