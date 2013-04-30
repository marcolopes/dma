/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.java.utils.array;

import java.util.ArrayList;
import java.util.List;

import org.dma.java.utils.Debug;

public class ClipboardManager {

	private static List<Object> clipboard=new ArrayList();

	public static void clearClipboard() {
		clipboard.clear();
	}


	public static void copyToClipboard(Object[] objectArray) {

		if(objectArray!=null && objectArray.length>0) {

			clearClipboard();
			clipboard=ArrayUtils.toList(objectArray);

			Debug.out("CLIPBOARD", clipboard.size());
			Debug.out("OBJECTS", objectArray.length);
			Debug.out("CLASS", getObjectClass());

		}

	}



	/*
	 * Getters and setters
	 */
	public static List<Object> getClipboard() {
		return clipboard;
	}


	public static Class getObjectClass() {
		return clipboard.get(0).getClass();
	}


	public static boolean isEmpty() {
		return clipboard.size()==0;
	}


	public static boolean hasObject(Class klass) {
		return !isEmpty() && klass.equals(getObjectClass());
	}


	public static <T> T getObject(Class klass) {
		return !hasObject(klass) ? null : (T)clipboard.iterator().next();
	}


	public static <T> List<T> getCollection(Class klass) {
		return !hasObject(klass) ? null : (List<T>)clipboard;
	}


}
