/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.input;

public class FieldSize {

	public final int size, scale;

	public FieldSize(int size) {
		this(size, 0);
	}

	public FieldSize(int size, int scale) {
		this.size=size;
		this.scale=scale;
	}



	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return size+"/"+scale;
	}


}