/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 * USE {@link org.dma.java.util.StringList}
 */
@Deprecated
public class CollectionUtils {

	/*
	 * Conversion
	 */
	/** @see Collection#toArray(Object[]) */
	@Deprecated
	static <T> T[] toArray(Collection<T> col, T[] array) {
		return col.toArray(array);
	}

	/** Returns a new array even if collection is empty */
	@Deprecated
	static <T> T[] toArray(Collection<T> col, Class klass) {
		return toArray(col, (T[])Array.newInstance(klass, col.size()));
	}

	/** Returns a new array or null if collection is empty */
	@Deprecated
	static <T> T[] toArray(Collection<T> col) {
		return col.isEmpty() ? null : toArray(col, col.iterator().next().getClass());
	}

	@Deprecated
	static <T> String[] toStringArray(Collection<T> col) {
		return StringList.valueOf(col).toArray();
	}

	@Deprecated
	static <T> T random(Collection<T> col) {
		return new RandomValue().from(col);
	}


}