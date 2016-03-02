/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

public class IntegerToCombo extends CustomConverter {

	private final String[] elements;

	public IntegerToCombo(String[] elements) {
		super(Integer.class, String.class);
		this.elements=elements;
	}


	@Override
	public Object convert(Object fromObject) {
		return elements.length==0 ? null : elements[(Integer)fromObject];
	}


}
