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
import java.util.Iterator;
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
	public static <T> int occurences(Collection<T> collection, String element) {

		int count=0;

		Iterator<T> iterator=collection.iterator();
		while(iterator.hasNext()){
			if(iterator.next().toString().contains(element))
				count++;
		}

		return count;

	}







	/*
	 * Transformation
	 */
	public static <T> String concat(Collection<T> collection, String separator) {

		String string="";

		Iterator<T> iterator=collection.iterator();
		while(iterator.hasNext()){
			string=string.length()==0 ?
				iterator.next().toString() : string+separator+iterator.next();
		}

		return string;

	}


	public static <T> void removeContaining(Collection<T> collection, String searchFor){

		Collection<T> removeList=new ArrayList();

		Iterator<T> iterator=collection.iterator();
		while(iterator.hasNext()) {
			T element=iterator.next();
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


	public static <T> void addDistinct(Collection<T> addTo, Collection<T> compareWith) {

		Iterator<T> iterator=compareWith.iterator();
		while(iterator.hasNext()){
			addTo.add(iterator.next());
		}

	}


	public static <T> void removeDuplicated(Collection<T> removeFrom, Collection<T> compareWith) {

		Iterator<T> iterator=compareWith.iterator();
		while(iterator.hasNext()){
			removeFrom.remove(iterator.next());
		}

	}


	public static <T> Collection<T> remove(List<T> list, int[] indexes) {

		Collection<T> removeList=new ArrayList(indexes.length);

		for(int i=0; i<indexes.length; i++){
			removeList.add(list.get(indexes[i]));
		}

		list.removeAll(removeList);

		return removeList;

	}


	public static <T> Collection<T> insert(List<T> into, List<T> from, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int i=0; i<indexes.length; i++){
			insertList.add(from.get(indexes[i]));
		}

		into.addAll(position, insertList);

		return insertList;

	}


	public static <T> void moveDown(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int i=0; i<indexes.length; i++){
			insertList.add(list.get(indexes[i]));
		}

		remove(list, indexes);
		list.addAll(position, insertList);

	}


	public static <T> void moveUp(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int i=0; i<indexes.length; i++){
			insertList.add(list.get(indexes[i]));
		}

		remove(list, indexes);
		list.addAll(position, insertList);

	}


	public static void main(String[] argvs){
	}


}