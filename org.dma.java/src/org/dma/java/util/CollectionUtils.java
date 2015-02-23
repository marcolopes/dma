/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {

	/*
	 * Conversion
	 */
	/** USE NATIVE c.toArray(a) */
	@Deprecated
	public static <T> T[] toArray(Collection<T> c, T[] a) {
		return c.toArray(a);
	}

	/** The collection CAN be empty */
	public static <T> T[] toArray(Collection<T> c, Class klass) {
		return c.toArray((T[])Array.newInstance(klass, c.size()));
	}

	/** The collection CANNOT be empty! */
	public static <T> T[] toArray(Collection<T> c) {
		return toArray(c, c.iterator().next().getClass());
	}





	/*
	 * Analysis
	 */
	public static <T> int occurences(Collection<T> col, String searchFor) {

		int count=0;

		for(T e: col){
			if(e.toString().contains(searchFor)) count++;
		}

		return count;

	}





	/*
	 * Transformation
	 */
	public static <T> String concat(Collection<T> col, String separator) {

		StringBuilder result=new StringBuilder();

		for(T e: col){
			String str=e.toString();
			if(!str.isEmpty()){
				if(result.length()>0) result.append(separator);
				result.append(str);
			}
		}

		return result.toString();

	}


	public static <T> String[] addPrefix(Collection<T> col, String prefix) {

		String[] result=new String[col.size()];

		int index=0;
		for(T e: col){
			result[index++]=prefix+e;
		}

		return result;

	}


	public static <T> String[] addSuffix(Collection<T> col, String suffix) {

		String[] result=new String[col.size()];

		int index=0;
		for(T e: col){
			result[index++]=e+suffix;
		}

		return result;

	}


	/** Returns removed elements */
	public static <T> Collection<T> removeContaining(Collection<T> col, String searchFor){

		Collection<T> removeList=new ArrayList();

		for(T e: col){
			if(e.toString().contains(searchFor)) removeList.add(e);
		}

		col.removeAll(removeList);

		return removeList;

	}


	public static <T> void removeContaining(Collection<T> col, String[] searchFor){

		for(int i=0; i<searchFor.length; i++){
			removeContaining(col, searchFor[i]);
		}

	}


	public static void main(String[] argvs) {}


}