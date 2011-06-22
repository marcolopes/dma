/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse;

import java.util.ArrayList;
import java.util.List;

import org.dma.utils.java.ArrayUtils;

public class ClipboardManager {

	private static List<Object> clipboard=new ArrayList();
	private static Class objectClass;

	public static void transferToClipboard(Object[] objectArray) {

		if(objectArray!=null && objectArray.length>0) {

			Debug.info("--- TO CLIPBOARD ---");
			Debug.info("objectArray", objectArray.length);
			Debug.info("clipboard", clipboard.size());
			Debug.info("objectClass", objectClass);

			clearClipboard();
			clipboard=ArrayUtils.toList(objectArray);
			objectClass=clipboard.get(0).getClass();

			Debug.info("--- TRANSFERED ---");
			Debug.info("clipboard", clipboard.size());
			Debug.info("objectClass", objectClass);

		}
	}


	public static void clearClipboard() {
		clipboard.clear();
	}


	public static List<Object> getCollection(Class cl) {
		Debug.info("--- FROM CLIPBOARD ---");
		Debug.info("clipboard", clipboard.size());
		Debug.info("objectClass", objectClass);

		if(!cl.equals(objectClass))
			return null;

		return clipboard;
	}


	public static Object getObject(Class cl) {
		if(clipboard.size()==0 || !cl.equals(objectClass))
			return null;

		return clipboard.iterator().next();
	}


	public static boolean hasObject(Class cl) {
		return cl.equals(objectClass);
	}


	public static boolean hasObject() {
		return clipboard.size()>0;
	}






	//getters and setters
	public static List<Object> getClipboard() {
		return clipboard;
	}

	public static Class getObjectClass() {
		return objectClass;
	}


}
