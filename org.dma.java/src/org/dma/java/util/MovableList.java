/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
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

	public MovableList(T[] array) {
		this(Arrays.asList(array));
	}

	public MovableList(Collection<T> list) {
		super(list);
	}


	/** Returns removed elements */
	public Collection<T> remove(int...indices) {

		Collection<T> remove=new ArrayList(indices.length);

		for(int index: indices){
			remove.add(get(index));
		}

		removeAll(remove);

		return remove;

	}


	/** Returns inserted elements */
	public Collection<T> insert(List<T> list, int position, int...indices) {

		Collection<T> insert=new ArrayList(indices.length);

		Arrays.sort(indices);
		for(int index: indices){
			insert.add(list.get(index));
		}

		addAll(position, insert);

		return insert;

	}


	/** Moves elements (ordered) */
	public void moveTo(int position, int...indices) {

		Arrays.sort(indices);
		addAll(position, remove(indices));

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