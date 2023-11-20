/*******************************************************************************
 * Copyright 2008-2015 Marco Lopes (marcolopespt@gmail.com)
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
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClipboardManager {

	private static final List<Object> CLIPBOARD = new ArrayList();

	public static void clearClipboard() {CLIPBOARD.clear();}
	public static boolean hasObject() {return !CLIPBOARD.isEmpty();}
	public static Collection<?> getClipboard() {return CLIPBOARD;}
	public static Class<?> getObjectClass() {return CLIPBOARD.get(0).getClass();}

	public static boolean hasObject(Class<?> klass) {return hasObject() && klass.equals(getObjectClass());}
	public static <T> T getObject(Class<?> klass) {return !hasObject(klass) ? null : (T)CLIPBOARD.get(0);}
	public static <T> Collection<T> getClipboard(Class<?> klass) {return !hasObject(klass) ? new ArrayList(0) : CLIPBOARD;}

	public static void copyToClipboard(Collection<?> col) {

		if (col!=null && !col.isEmpty()) {

			clearClipboard();

			CLIPBOARD.addAll(col);

			Debug.out("COLLECTION", col.size());
			Debug.out("CLIPBOARD", CLIPBOARD.size());
			Debug.out("CLASS", getObjectClass());

		}

	}


}