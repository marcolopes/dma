/*******************************************************************************
 * 2008-2013 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import org.dma.eclipse.core.bindings.converters.CustomConverter;

public class StringToInteger extends CustomConverter {

	public StringToInteger() {
		super(String.class, Integer.class);
	}


	@Override
	public Object convert(Object fromObject) {
		return Integer.valueOf(fromObject.toString());
	}


}
