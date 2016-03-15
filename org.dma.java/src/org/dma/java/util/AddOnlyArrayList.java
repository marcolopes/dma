/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Collection;

public class AddOnlyArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	public AddOnlyArrayList(int initialCapacity) {
		super(initialCapacity);
	}

	public AddOnlyArrayList() {
		super();
	}

	public AddOnlyArrayList(Collection<? extends T> c) {
		super(c);
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public T remove(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}


}