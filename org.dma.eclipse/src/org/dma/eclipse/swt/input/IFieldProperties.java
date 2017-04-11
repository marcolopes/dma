/*******************************************************************************
 * 2008-2017 Public Domain
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

	/** Allows only DIGITS and SPACES */
	public static final int DIGITS = 1 << 2;

	/** Allows only LETTERS and SPACES */
	public static final int LETTERS = 1 << 3;

	/** Allows only POSITIVE numbers */
	public static final int POSITIVE = 1 << 4;


}
