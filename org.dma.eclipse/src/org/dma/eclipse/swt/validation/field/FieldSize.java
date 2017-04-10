/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation.field;

public class FieldSize {

	public int size, scale;

	public FieldSize(int size){
		this(size, 0);
	}

	public FieldSize(int size, int scale){
		this.size=size;
		this.scale=scale;
	}



	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString(){
		return size+"/"+scale;
	}


}