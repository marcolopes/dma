/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

public class StringToInteger extends CustomConverter {

	public StringToInteger() {
		super(String.class, Integer.class);
	}


	@Override
	public Object convert(Object fromObject) {
		return Integer.valueOf(fromObject.toString());
	}


}
