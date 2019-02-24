/*******************************************************************************
 * 2008-2019 Public Domain
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
		Collection set=new LinkedHashSet(this);
		set.addAll(col);
		clear();
		return super.addAll(set);
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> col) {
		Collection set=new LinkedHashSet(subList(0, index));
		set.addAll(col);
		set.addAll(subList(index, size()));
		clear();
		return super.addAll(set);
	}

	@Override
	public T set(int index, T e) {
		return contains(e) ? null : super.set(index, e);
	}

	/** Ensures element.equals(o) */
	@Override
	public int indexOf(Object o) {
		int index=0;
		for(T element: this){
			if (element.equals(o)) return index;
			index++;
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