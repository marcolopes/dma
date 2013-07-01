/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionUtils {

	/*
	 * Conversion
	 */
	public static <T> T[] toArray(Collection<T> c, T[] a) {
		if (c.size()>a.length){
			a=(T[])Array.newInstance(a.getClass().getComponentType(), c.size());
		}
		return c.toArray(a);
	}


	public static <T> T[] toArray(Collection<T> c, Class klass) {
		return c.toArray((T[])Array.newInstance(klass, c.size()));
	}

	/**
	 * The collection MUST NOT be empty!
	 */
	public static <T> T[] toArray(Collection<T> c) {
		return toArray(c, c.iterator().next().getClass());
	}





	/*
	 * Analysis
	 */
	public static <T> int occurences(Collection<T> collection, String searchFor) {

		int count=0;

		for (T element: collection){
			if(element.toString().contains(searchFor))
				count++;
		}

		return count;

	}





	/*
	 * Transformation
	 */
	public static <T> String concat(Collection<T> collection, String separator) {

		String string="";

		for (T element: collection){
			string=string.length()==0 ?
				element.toString() : string+separator+element;
		}

		return string;

	}


	public static <T> void removeContaining(Collection<T> collection, String searchFor){

		Collection<T> removeList=new ArrayList();

		for (T element: collection){
			if(element.toString().contains(searchFor))
				removeList.add(element);
		}

		collection.removeAll(removeList);

	}


	public static <T> void removeContaining(Collection<T> collection, String[] searchFor){

		for(int i=0; i<searchFor.length; i++){
			removeContaining(collection, searchFor[i]);
		}

	}


	public static <T> Collection<T> remove(List<T> list, int[] indexes) {

		Collection<T> removeList=new ArrayList(indexes.length);

		for(int index: indexes){
			removeList.add(list.get(index));
		}

		list.removeAll(removeList);

		return removeList;

	}


	public static <T> Collection<T> insert(List<T> into, List<T> from, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int index: indexes){
			insertList.add(from.get(index));
		}

		into.addAll(position, insertList);

		return insertList;

	}


	public static <T> void moveDown(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int index: indexes){
			insertList.add(list.get(index));
		}

		remove(list, indexes);
		list.addAll(position, insertList);

	}


	public static <T> void moveUp(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int index: indexes){
			insertList.add(list.get(index));
		}

		remove(list, indexes);
		list.addAll(position, insertList);

	}


	public static void main(String[] argvs){
	}


}