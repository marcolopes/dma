/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;

public class PagedList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	private int index=0;
	private int count=0;

	public void home() {
		index=0;
	}

	public void next() {
		int index=this.index+count;
		this.index=index>=size() ? size() : index;
	}

	public void previous() {
		int index=this.index-count;
		this.index=index<=0 ? 0 : index;
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
