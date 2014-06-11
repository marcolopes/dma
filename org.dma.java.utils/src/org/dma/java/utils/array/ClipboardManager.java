/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.java.utils.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dma.java.utils.Debug;

public class ClipboardManager {

	private static final List objectCollection=new ArrayList();

	public static void clearClipboard() {
		objectCollection.clear();
	}


	public static void copyToClipboard(Collection<?> col) {

		if(col!=null && !col.isEmpty()) {

			clearClipboard();

			objectCollection.addAll(col);

			Debug.out("COLLECTION", col.size());
			Debug.out("CLIPBOARD", objectCollection.size());
			Debug.out("CLASS", getObjectClass());

		}

	}



	/*
	 * Getters and setters
	 */
	public static boolean hasObject() {
		return !objectCollection.isEmpty();
	}


	public static Class getObjectClass() {
		return objectCollection.get(0).getClass();
	}


	public static boolean hasObject(Class klass) {
		return hasObject() && klass.equals(getObjectClass());
	}


	public static <T> T getObject(Class klass) {
		return !hasObject(klass) ? null : (T)objectCollection.get(0);
	}


	public static <T> Collection<T> getCollection(Class klass) {
		return !hasObject(klass) ? new ArrayList(0) : objectCollection;
	}


	public static Collection<?> getClipboard() {
		return objectCollection;
	}


}
