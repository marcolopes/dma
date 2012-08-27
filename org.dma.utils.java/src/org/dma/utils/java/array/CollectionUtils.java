/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionUtils {

	/*
	 * Conversion
	 */
	public static <T> T[] toArray(Collection<T> c, T[] a) {
		if (c.size() > a.length)
			a=(T[])Array.newInstance(a.getClass().getComponentType(), c.size());

		return c.toArray(a);
	}


	public static <T> T[] toArray(Collection<T> c, Class k) {
		return c.toArray((T[])Array.newInstance(k, c.size()));
	}


	public static <T> T[] toArray(Collection<T> c) {
		return toArray(c, Object.class);
	}





	/*
	 * Analysis
	 */
	public static int occurences(Collection<String> collection, String element) {

		int count=0;

		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext())
			if(iterator.next().contains(element))
				count++;

		return count;

	}







	/*
	 * Transformation
	 */
	public static String concat(Collection<String> collection, String separator) {

		String string="";

		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext())
			string=string.length()==0 ?
				iterator.next() : string+separator+iterator.next();

		return string;

	}


	public static void removeContaining(Collection<String> collection, String searchFor){

		Collection<String> removeList=new ArrayList();

		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			if(element.contains(searchFor))
				removeList.add(element);
		}

		collection.removeAll(removeList);

	}


	public static void removeContaining(Collection<String> collection, String[] searchFor){

		for (int i=0; i<searchFor.length; i++)
			removeContaining(collection, searchFor[i]);

	}


	public static <T> void addDistinct(Collection<T> collection, Collection<T> collection2) {

		Iterator<T> iterator=collection2.iterator();
		while(iterator.hasNext())
			collection.add(iterator.next());

	}


	public static <T> void removeDuplicated(Collection<T> collection, Collection<T> collection2 ) {

		Iterator<T> iterator=collection2.iterator();
		while(iterator.hasNext())
			collection.remove(iterator.next());

	}


	public static <T> Collection<T> remove(List<T> list, int[] indexes) {

		Collection<T> removeList=new ArrayList(indexes.length);

		for(int i=0; i<indexes.length; i++)
			removeList.add(list.get(indexes[i]));

		list.removeAll(removeList);

		return removeList;

	}


	public static <T> Collection<T> insert(List<T> into, List<T> from, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int i=0; i<indexes.length; i++)
			insertList.add(from.get(indexes[i]));

		into.addAll(position, insertList);

		return insertList;

	}


	public static <T> void moveDown(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int i=0; i<indexes.length; i++)
			insertList.add(list.get(indexes[i]));

		remove(list, indexes);
		list.addAll(position, insertList);

	}


	public static <T> void moveUp(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int i=0; i<indexes.length; i++)
			insertList.add(list.get(indexes[i]));

		remove(list, indexes);
		list.addAll(position, insertList);

	}


	public static void main(String[] argvs){
	}


}
