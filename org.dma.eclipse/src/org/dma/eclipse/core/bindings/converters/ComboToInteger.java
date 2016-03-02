/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

public class ComboToInteger extends CustomConverter {

	private final String[] elements;

	public ComboToInteger(String[] elements) {
		super(String.class, Integer.class);
		this.elements=elements;
	}


	@Override
	public Object convert(Object fromObject) {
		for(int n=0; n<elements.length; n++){
			if(elements[n].equals(fromObject)) return Integer.valueOf(n);
		}
		return 0;
	}


}
