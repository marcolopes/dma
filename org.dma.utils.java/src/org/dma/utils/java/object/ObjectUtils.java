/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.object;

public final class ObjectUtils {

	public static <T> boolean equals(T a, T b) {

		if(a==null && b==null)
			return true;

		if(a==null || b==null)
			return false;

		//avoids the numeric format notation ZOO
		if (a instanceof Number && b instanceof Number)
			return ((Number)a).doubleValue()==((Number)b).doubleValue();

		return a.equals(b);

	}


}