/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Extends <tt>ArrayList</tt> backed by a <tt>HashSet</tt>
 * and guarantees no duplicate elements
 */
public class UniqueArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	/** Unique elements SET */
	private final Set<T> set=new HashSet();

	/** Used by addAll methods */
	private Collection<T> addUnique(Collection<? extends T> col) {
		Collection<T> unique=new ArrayList();
		for(T e: col){
			if (set.add(e)) unique.add(e);
		}
		return unique;
	}

	public UniqueArrayList(int initialCapacity) {
		super(initialCapacity);
	}

	public UniqueArrayList() {
		super();
	}

	public UniqueArrayList(Collection<? extends T> col) {
		super.addAll(addUnique(col)); // avoid addAll OVERRIDE!
	}


	@Override
	public void add(int index, T e) {
		if (set.add(e)) super.add(index, e);
	}

	@Override
	public boolean add(T e) {
		return set.add(e) ? super.add(e) : false;
	}

	@Override
	public boolean addAll(Collection<? extends T> col) {
		return super.addAll(addUnique(col));
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> col) {
		return super.addAll(index, addUnique(col));
	}

	@Override
	public T set(int index, T e) {
		T remove=get(index);
		return set.remove(remove) &&
				set.add(e) ? super.set(index, e) : null;
	}

	@Override
	public T remove(int index) {
		T remove=get(index);
		return set.remove(remove) ? super.remove(index) : null;
	}

	@Override
	public boolean remove(Object o) {
		return set.remove(o) ? super.remove(o) : null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return set.removeAll(c) ? super.removeAll(c) : false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return set.retainAll(c) ? super.retainAll(c) : false;
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		set.clear();
		super.clear();
	}

	@Override
	public int indexOf(Object o) {
		for (int i=0; i<size(); i++){
			if (get(i).equals(o)) return i;
		}
		return -1;
	}


	public int indexOf(Collection<?> col) {
		for(Object o: col){
			int index=indexOf(o);
			if (index!=-1) return index;
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