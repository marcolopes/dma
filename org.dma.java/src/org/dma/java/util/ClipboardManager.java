/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClipboardManager {

	private static final List<Object> CLIPBOARD = new ArrayList();

	public static void clearClipboard() {
		CLIPBOARD.clear();
	}


	public static void copyToClipboard(Collection<?> col) {

		if(col!=null && !col.isEmpty()) {

			clearClipboard();

			CLIPBOARD.addAll(col);

			Debug.out("COLLECTION", col.size());
			Debug.out("CLIPBOARD", CLIPBOARD.size());
			Debug.out("CLASS", getObjectClass());

		}

	}



	/*
	 * Getters and setters
	 */
	public static boolean hasObject() {
		return !CLIPBOARD.isEmpty();
	}


	public static Class<?> getObjectClass() {
		return CLIPBOARD.get(0).getClass();
	}


	public static boolean hasObject(Class<?> klass) {
		return hasObject() && klass.equals(getObjectClass());
	}


	public static <T> T getObject(Class<?> klass) {
		return !hasObject(klass) ? null : (T)CLIPBOARD.get(0);
	}


	public static <T> Collection<T> getClipboard(Class<?> klass) {
		return !hasObject(klass) ? new ArrayList(0) : CLIPBOARD;
	}


	public static Collection<?> getClipboard() {
		return CLIPBOARD;
	}


}