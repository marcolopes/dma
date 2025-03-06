/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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

	public MovableList() {super();}
	public MovableList(T[] array) {this(Arrays.asList(array));}
	public MovableList(Collection<T> list) {super(list);}


	/** Returns removed elements */
	public List<T> remove(int...indices) {

		List<T> remove=new ArrayList(indices.length);

		for(int index: indices){
			remove.add(get(index));
		}removeAll(remove);

		return remove;

	}


	/** Returns inserted elements */
	public List<T> insert(List<T> list, int position, int...indices) {

		List<T> insert=new ArrayList(indices.length);

		Arrays.sort(indices);
		for(int index: indices){
			insert.add(list.get(index));
		}addAll(position, insert);

		return insert;

	}


	/** Moves elements (ordered) */
	public boolean moveTo(int position, int...indices) {

		Arrays.sort(indices);

		return addAll(position, remove(indices));

	}


	public static void main(String[] args) {

		MovableList<Integer> list=new MovableList(Arrays.asList(1,2,3,4,5));
		System.out.println(list);

		list.moveTo(3, 0,1);
		System.out.println(list);

		list.moveTo(0, 1,2);
		System.out.println(list);

	}


}