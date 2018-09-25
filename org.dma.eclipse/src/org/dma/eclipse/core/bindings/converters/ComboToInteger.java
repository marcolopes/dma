/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
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
		for(int i=0; i<elements.length; i++){
			if(elements[i].equals(fromObject)) return Integer.valueOf(i);
		}
		return 0;
	}


}
