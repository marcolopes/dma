/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package dma.utils.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionUtils {

	/*
	 * Conversion
	 */
	public static String[] toStringArray(Collection<String> collection) {

		/*
		String[] array = new String[collection.size()];
		System.arraycopy(collection.toArray(), 0, array, 0, collection.size());
		return array;
		 */
		return collection.toArray(new String[collection.size()]);

	}


	public static Integer[] toIntegerArray(Collection<Integer> collection) {

		/*
		Integer[] array = new Integer[collection.size()];
		System.arraycopy(collection.toArray(), 0, array, 0, collection.size());
		return array;
		 */
		return collection.toArray(new Integer[collection.size()]);

	}


	public static Object[] toObjectArray(Collection<Object> collection) {

		return collection.toArray(new Object[collection.size()]);

	}






	/*
	 * Analysis
	 */
	public static int occurences(Collection<String> collection, String element) {

		int count=0;

		Iterator<String> iterator=collection.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().contains(element))
				count++;
		}

		return count;

	}







	/*
	 * Transformation
	 */
	public static String concat(Collection<String> collection, String separator) {

		String string="";

		Iterator<String> iterator=collection.iterator();
		while (iterator.hasNext()) {

			if (string.length()==0)
				string=iterator.next();
			else
				string+=separator+iterator.next();
		}

		return string;

	}


	public static void addDistinct(Collection<String> collection, String element) {

		if (!collection.contains(element))
			collection.add(element);

	}


	public static void addDistinct(Collection<String> collection, Collection<String> collection2) {

		Iterator<String> iterator=collection2.iterator();
		while (iterator.hasNext())
			addDistinct(collection, iterator.next());

	}


	public static void removeDuplicated(Collection<String> collection, Collection<String> collection2 ) {

		Iterator<String> iterator=collection2.iterator();
		while (iterator.hasNext())
			collection.remove(iterator.next());

	}


	public static void removeContaining(Collection<String> collection, String searchFor) {

		Collection<String> removeList=new ArrayList();

		Iterator<String> iterator=collection.iterator();
		while (iterator.hasNext()) {

			String string2=iterator.next();
			if (string2.contains(searchFor))
				removeList.add(string2);
		}

		collection.removeAll(removeList);

	}


	public static void removeContaining(Collection<String> collection, String[] searchFor) {

		for (int i=0; i<searchFor.length; i++)
			removeContaining(collection, searchFor[i]);

	}









	/*
	 * Generics
	 */
	public static <T> Collection<T> insert(List<T> into, List<T> from, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for (int i=0; i<indexes.length; i++)
			insertList.add(from.get(indexes[i]));

		into.addAll(position, insertList);

		return insertList;

	}


	public static <T> Collection<T> remove(List<T> list, int[] indexes) {

		Collection<T> removeList=new ArrayList(indexes.length);

		for (int i=0; i<indexes.length; i++)
			removeList.add(list.get(indexes[i]));

		list.removeAll(removeList);

		return removeList;

	}


	public static <T> void moveDown(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for (int i=0; i<indexes.length; i++)
			insertList.add(list.get(indexes[i]));

		remove(list, indexes);
		list.addAll(position, insertList);

	}



	public static <T> void moveUp(List<T> list, int[] indexes, int position) {

		Collection<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for (int i=0; i<indexes.length; i++)
			insertList.add(list.get(indexes[i]));

		remove(list, indexes);
		list.addAll(position, insertList);

	}


}
