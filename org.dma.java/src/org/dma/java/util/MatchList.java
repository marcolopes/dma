/*******************************************************************************
 * Copyright 2008-2018 Marco Lopes (marcolopespt@gmail.com)
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

/**
 * Extends <tt>UniqueArrayList</tt> and guarantees no duplicate elements
 */
public class MatchList extends UniqueArrayList<String> {

	private static final long serialVersionUID = 1L;

	/** Used by addAll methods */
	private Collection<String> trim(Collection<? extends String> col) {
		Collection<String> result=new ArrayList();
		for(String element: col){
			result.add(element.trim());
		}return result;
	}

	public MatchList() {super();}
	public MatchList(String[] array) {this(Arrays.asList(array));}
	public MatchList(Collection<? extends String> col) {addAll(col);}


	@Override
	public void add(int index, String e) {
		super.add(index, e.trim());
	}

	@Override
	public boolean add(String e) {
		return super.add(e.trim());
	}

	@Override
	public boolean addAll(Collection<? extends String> col) {
		return super.addAll(trim(col));
	}

	@Override
	public boolean addAll(int index, Collection<? extends String> col) {
		return super.addAll(index, trim(col));
	}

	@Override
	public String set(int index, String e) {
		return super.set(index, e.trim());
	}


	/** Checks if any element matches the given regex */
	public boolean matches(String regex) {
		for(String element: this){
			if (element.matches(regex)) return true;
		}return false;
	}


	/** Collection may contain REGEX elements */
	public boolean matchesAny(Collection<String> col) {
		for(String regex: col){
			if (matches(regex)) return true;
		}return false;
	}

}