/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.input;

import java.util.regex.Pattern;

import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public class FieldRegex {

	private final Control control;
	private final FieldFormat fieldFormat;
	private final Pattern pattern;

	private final VerifyListener verifyListener=new VerifyListener(){
		@Override
		public void verifyText(VerifyEvent e){
			if(fieldFormat.isUppercase()){
				e.text=e.text.toUpperCase();
			}
			else if(fieldFormat.isLowercase()){
				e.text=e.text.toLowerCase();
			}
			e.doit=patternMatcher(e);
		}

		private boolean patternMatcher(VerifyEvent e) {
			String str="";
			if(control instanceof Text){
				Text text=(Text)control;
				str=text.getText();
			}
			else if(control instanceof CCombo){
				CCombo ccombo=(CCombo)control;
				str=ccombo.getText();
			}

			StringBuffer newText=new StringBuffer(str).
				replace(e.start, e.end, "").
				insert(e.start, e.text);

			/*
			Debug.out("text", e.text);
			Debug.out("start", e.start);
			Debug.out("end", e.end);
			Debug.out("newText", newText);
			*/

			return pattern.matcher(newText.toString()).matches();
		}
	};


	public FieldRegex(Control control, FieldFormat fieldFormat) {
		this.control=control;
		this.fieldFormat=fieldFormat;
		this.pattern=fieldFormat.getRegexPattern();
		addListeners();
	}


	public void detach() {
		removeListeners();
	}



	/*
	 * Listeners
	 */
	private void addListeners() {

		if(control instanceof Text){
			Text text=(Text)control;
			text.addVerifyListener(verifyListener);
		}
		else if(control instanceof CCombo){
			CCombo ccombo=(CCombo)control;
			ccombo.addVerifyListener(verifyListener);
		}

	}


	private void removeListeners() {

		if(control instanceof Text){
			Text text=(Text)control;
			text.removeVerifyListener(verifyListener);
		}
		else if(control instanceof CCombo){
			CCombo ccombo=(CCombo)control;
			ccombo.removeVerifyListener(verifyListener);
		}

	}


}