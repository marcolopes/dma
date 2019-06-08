/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.validation.field;

import org.dma.java.math.NumericUtils;

public class FieldRules implements IFieldRules {

	public final int rules;

	public FieldRules(int rules) {
		this.rules=rules;
	}

	public boolean is(int rules) {
		return NumericUtils.bit(this.rules, rules);
	}

	public boolean isReadOnly() {
		return is(READONLY);
	}

	public boolean isNotEditable(boolean edited) {
		return edited && is(NOTEDITABLE);
	}

	public boolean isNotZero() {
		return is(NOTZERO);
	}

	public boolean isNotEmpty() {
		return is(NOTEMPTY);
	}

	public boolean isLimitMatch() {
		return is(LIMITMATCH);
	}

}