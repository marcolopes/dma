/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

public class IntegerToString extends CustomConverter {

	public IntegerToString() {
		super(Integer.class, String.class);
	}


	@Override
	public Object convert(Object fromObject) {
		return fromObject.toString();
	}


}
