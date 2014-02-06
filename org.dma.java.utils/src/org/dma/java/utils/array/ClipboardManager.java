/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.java.utils.array;

import java.util.ArrayList;
import java.util.Collection;

import org.dma.java.utils.Debug;

public class ClipboardManager<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	private static ClipboardManager INSTANCE = new ClipboardManager<Object>();

	public static void clearClipboard() {
		INSTANCE.clear();
	}


	public static void copyToClipboard(Collection<Object> objectCollection) {

		if(objectCollection!=null && objectCollection.size()>0) {

			clearClipboard();

			INSTANCE.addAll(objectCollection);

			Debug.out("COLLECTION", objectCollection.size());
			Debug.out("CLIPBOARD", INSTANCE.size());
			Debug.out("CLASS", getObjectClass());

		}

	}



	/*
	 * Getters and setters
	 */
	public static boolean hasObject() {
		return !INSTANCE.isEmpty();
	}


	public static boolean hasObject(Class klass) {
		return hasObject() && klass.equals(getObjectClass());
	}


	public static <T> T getObject(Class klass) {
		return !hasObject(klass) ? null : (T)INSTANCE.iterator().next();
	}


	public static Class getObjectClass() {
		return INSTANCE.iterator().next().getClass();
	}


	public static Collection getCollection(Class klass) {
		return !hasObject(klass) ? null : INSTANCE;
	}


	public static Collection<Object> getClipboard() {
		return INSTANCE;
	}


}
