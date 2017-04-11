/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.input;

import org.dma.java.math.NumericUtils;

public class FieldProperties implements IFieldProperties {

	public final int properties;

	public FieldProperties(int properties) {
		this.properties=properties;
	}

	public boolean is(int properties) {
		return NumericUtils.bit(this.properties, properties);
	}

	public boolean isUppercase() {
		return is(UPPERCASE);
	}

	public boolean isLowercase() {
		return is(LOWERCASE);
	}

	public boolean isDigits() {
		return is(DIGITS);
	}

	public boolean isLetters() {
		return is(LETTERS);
	}

	public boolean isPositive() {
		return is(POSITIVE);
	}

}