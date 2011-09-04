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

		if(a!=null && b!=null)
			return a.equals(b);

		return false;

	}


	public static String toString(Object obj) {

		return obj==null ? "" : obj.toString();

	}


}
