/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.java.array;

import java.util.ArrayList;
import java.util.List;

import org.dma.utils.java.Debug;

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


	public static boolean hasObject(Class cl) {
		return !isEmpty() && cl.equals(getObjectClass());
	}


	public static <T> T getObject(Class cl) {
		return !hasObject(cl) ? null : (T)clipboard.iterator().next();
	}


	public static <T> List<T> getCollection(Class cl) {
		return !hasObject(cl) ? null : (List<T>)clipboard;
	}


}
