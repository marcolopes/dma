/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

public final class ObjectUtils {


	public static boolean equals(Object a, Object b) {

		if(a==null && b==null)
			return true;

		if(a==null || b==null)
			return false;

		//avoids the numeric format notation ZOO
		if (a instanceof Number && b instanceof Number)
			return ((Number)a).doubleValue()==((Number)b).doubleValue();

		return a.equals(b);

	}


	public static String toString(Object obj) {

		return obj==null ? "" : obj.toString();

	}


}
