/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.input;

public interface IFieldProperties {

	public static final int NONE = 0;

	/** Converts to uppercase */
	public static final int UPPERCASE = 1 << 0;

	/** Converts to lowercase */
	public static final int LOWERCASE = 1 << 1;

	/** Allows DIGITS and SPACES */
	public static final int DIGITS = 1 << 2;

	/** Allows LETTERS and SPACES */
	public static final int LETTERS = 1 << 3;

	/** Allows SEPARATOR CHARS */
	public static final int SEPARATORS = 1 << 4;

	/** Allows POSITIVE numbers */
	public static final int POSITIVE = 1 << 5;

	/** Does not allow SPACES */
	public static final int NOSPACES = 1 << 6;


}
