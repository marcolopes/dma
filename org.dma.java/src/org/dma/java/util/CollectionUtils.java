/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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