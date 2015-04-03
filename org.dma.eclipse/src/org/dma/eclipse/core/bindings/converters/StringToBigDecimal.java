/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import java.math.BigDecimal;

import org.dma.eclipse.core.bindings.converters.CustomConverter;

public class StringToBigDecimal extends CustomConverter {

	public StringToBigDecimal() {
		super(String.class, BigDecimal.class);
	}


	@Override
	public Object convert(Object fromObject) {
		return new BigDecimal(fromObject.toString());
	}


}
