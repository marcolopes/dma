/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class CollectionUtils {

	/*
	 * Conversion
	 */
	/** USE NATIVE c.toArray(a) */
	@Deprecated
	public static <T> T[] toArray(Collection<T> col, T[] array) {
		return col.toArray(array);
	}

	/** Returns a new array even if collection is empty */
	public static <T> T[] toArray(Collection<T> col, Class klass) {
		return toArray(col, (T[])Array.newInstance(klass, col.size()));
	}

	/** Returns a new array or null if collection is empty */
	public static <T> T[] toArray(Collection<T> col) {
		return col.isEmpty() ? null : toArray(col, col.iterator().next().getClass());
	}

	public static <T> String[] toStringArray(Collection<T> col) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=element.toString();
		}

		return result;

	}





	/*
	 * Analysis
	 */
	public static <T> int occurences(Collection<T> col, String searchFor) {

		int count=0;

		for(T element: col){
			if(element.toString().contains(searchFor)) count++;
		}

		return count;

	}

	public static <T> T random(Collection<T> col) {

		int index=new Random().nextInt(col.size());

		for(T element: col){
			if (--index < 0) return element;
		}

		return null;

	}



	/*
	 * Transformation
	 */
	public static <T> String[] numbers(Collection<T> col) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=StringUtils.numbers(element.toString());
		}

		return result;

	}


	public static <T> String[] capitalize(Collection<T> col) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=StringUtils.capitalize(element.toString());
		}

		return result;

	}


	public static <T> String[] uncapitalize(Collection<T> col) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=StringUtils.uncapitalize(element.toString());
		}

		return result;

	}


	public static <T> String[] addPrefix(Collection<T> col, String prefix) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=prefix+element.toString();
		}

		return result;

	}


	public static <T> String[] addSuffix(Collection<T> col, String suffix) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=element.toString()+suffix;
		}

		return result;

	}


	public static <T> String[] removeAll(Collection<T> col, String searchFor) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=StringUtils.removeAll(element.toString(), searchFor);
		}

		return result;

	}


	public static <T> String[] trim(Collection<T> col) {

		String[] result=new String[col.size()];

		int index=0;
		for(T element: col){
			result[index++]=element.toString().trim();
		}

		return result;

	}


	public static <T> String[] compact(Collection<T> col) {

		Collection<String> result=new ArrayList();

		for(T element: col){
			String s=element.toString();
			if(!s.trim().isEmpty()) result.add(s);
		}

		return result.toArray(new String[result.size()]);

	}


	public static <T> String concat(Collection<T> col, String separator) {

		StringBuilder result=new StringBuilder();

		for(T element: col){
			String s=element.toString();
			if(!s.isEmpty()){
				if(result.length()>0) result.append(separator);
				result.append(s);
			}
		}

		return result.toString();

	}


	public static <T> String concat(List<T> col, int fromIndex, int toIndex, String separator) {

		if(fromIndex<0 || toIndex>col.size() || fromIndex>toIndex) return "";

		return concat(col.subList(fromIndex+1, toIndex), separator);

	}


	public static <T> String concatFrom(List<T> col, int fromIndex, String separator) {

		return concat(col, fromIndex, col.size()-1, separator);

	}


	public static <T> String concatUpto(List<T> col, int toIndex, String separator) {

		return concat(col, 0, toIndex, separator);

	}


	public static <T> Collection<T> merge(Collection<T>...col) {

		//ensure maximum capacity
		Collection<T> result=new ArrayList(col.length);

		for(Collection<T> c: col){
			if (c!=null) result.addAll(c);
		}

		return result;

	}


	public static <T> List<T> index(List<T> col, int...index) {

		//ensure exact capacity
		List<T> result=new ArrayList(index.length);

		for(int i: index){
			result.add(col.get(i));
		}

		return result;

	}


	public static <T> List<T> head(List<T> col) {

		return col.isEmpty() ? col : col.subList(0, col.size()-1);

	}


	public static <T> List<T> tail(List<T> col) {

		return col.isEmpty() ? col : col.subList(1, col.size());

	}


	/** Returns removed elements */
	public static <T> Collection<T> removeContaining(Collection<T> col, String searchFor) {

		Collection<T> remove=new ArrayList();

		for(T element: col){
			if(element.toString().contains(searchFor)) remove.add(element);
		}

		col.removeAll(remove);

		return remove;

	}


	/** Returns removed elements */
	public static <T> Collection<T> removeContaining(Collection<T> col, String...searchFor) {

		Collection<T> remove=new ArrayList();

		for(int i=0; i<searchFor.length; i++){
			remove.addAll(removeContaining(col, searchFor[i]));
		}

		return remove;

	}


	public static void main(String[] argvs) {}


}