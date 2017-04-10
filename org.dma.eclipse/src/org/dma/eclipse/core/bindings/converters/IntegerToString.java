/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
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
