/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Extends <tt>ArrayList</tt> and guarantees no duplicate elements
 */
public class UniqueArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	public UniqueArrayList(int initialCapacity) {
		super(initialCapacity);
	}

	public UniqueArrayList() {
		super();
	}

	public UniqueArrayList(T[] array) {
		this(Arrays.asList(array));
	}

	public UniqueArrayList(Collection<? extends T> col) {
		addAll(col);
	}


	@Override
	public void add(int index, T e) {
		if (!contains(e)) super.add(index, e);
	}

	@Override
	public boolean add(T e) {
		return contains(e) ? false : super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends T> col) {
		return super.addAll(new LinkedHashSet(col));
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> col) {
		return super.addAll(index, new LinkedHashSet(col));
	}

	@Override
	public T set(int index, T e) {
		return contains(e) ? null : super.set(index, e);
	}

	/** Ensures element.equals(o) */
	@Override
	public int indexOf(Object o) {
		for (int i=0; i<size(); i++){
			if (get(i).equals(o)) return i;
		}
		return -1;
	}


	public boolean containsAny(Collection<?> col) {
		for(Object o: col){
			if (contains(o)) return true;
		}
		return false;
	}


}