/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MovableList<T> extends LinkedList<T> {

	private static final long serialVersionUID = 1L;

	public MovableList() {
		super();
	}

	public MovableList(Collection<T> list) {
		super(list);
	}


	/** Returns removed elements */
	public List<T> remove(int...indexes) {

		List<T> removeList=new ArrayList(indexes.length);

		for(int index: indexes){
			removeList.add(get(index));
		}

		removeAll(removeList);

		return removeList;

	}


	/** Returns inserted elements */
	public List<T> insert(List<T> list, int position, int...indexes) {

		List<T> insertList=new ArrayList(indexes.length);

		Arrays.sort(indexes);
		for(int index: indexes){
			insertList.add(list.get(index));
		}

		addAll(position, insertList);

		return insertList;

	}


	/** Moves elements (ordered) */
	public void moveTo(int position, int...indexes) {

		Arrays.sort(indexes);
		addAll(position, remove(indexes));

	}


	public static void main(String[] argvs) {

		MovableList<Integer> list=new MovableList(Arrays.asList(1,2,3,4,5));
		System.out.println(list);

		list.moveTo(3, 0,1);
		System.out.println(list);

		list.moveTo(0, 1,2);
		System.out.println(list);

	}


}