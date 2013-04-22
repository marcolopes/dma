/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.array;

import java.util.ArrayList;

public class PagedList<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	private int index=0;
	private int count=0;

	public void reset() {
		reset(0);
	}

	public void reset(int index) {
		clear();
		setIndex(index);
	}

	public void home() {
		index=0;
	}

	public void next() {
		index=index+count>=size() ?
				size() : index+count;
	}

	public void previous() {
		index=index-count<=0 ?
				0 : index-count;
	}

	public boolean hasNext() {
		return count>0 && index+count<size();
	}

	public boolean hasPrevious() {
		return count>0 && index>0;
	}



	/*
	 * Getters and setters
	 */
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index=index;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count=count;
	}


}
