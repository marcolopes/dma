/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.dma.java.input.FieldFormat.SEPARATOR;

public class StringList extends ArrayList<String> {

	private static final long serialVersionUID = 1L;

	public static <T> StringList valueOf(T...array) {
		return valueOf(Arrays.asList(array));
	}

	public static <T> StringList valueOf(Collection<T> col) {
		StringList list=new StringList(col.size());
		for(Object element: col){
			list.add(element.toString());
		}return list;
	}

	public StringList() {super();}
	public StringList(Collection<String> col) {super(col);}
	public StringList(int initialCapacity) {super(initialCapacity);}
	public StringList(String...array) {this(Arrays.asList(array));}

	/*
	 * Conversion
	 */
	@Override
	public String[] toArray() {
		return toArray(new String[size()]);
	}


	@Override
	public StringList subList(int fromIndex, int toIndex) {
		return fromIndex<0 || fromIndex>toIndex ?
				new StringList(0) : new StringList(super.subList(
						fromIndex, toIndex>size() ? size() : toIndex));
	}


	public StringList subList(int fromIndex) {
		return subList(fromIndex, size());
	}


	public List<String> unmodifiable() {
		return Collections.unmodifiableList(this);
	}



	/*
	 * Analysis
	 */
	/** Returns the size in BYTES */
	public int byteSize() {

		try{ByteArrayOutputStream out=new ByteArrayOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(out);
			try{oos.writeObject(this);
			}finally{
				oos.close();
			}return out.size();
		}catch(IOException e){
			e.printStackTrace();
		}return 0;

	}


	/** Returns the number of occurences */
	public int occurences(String searchFor) {

		int count=0;
		for(String string: this){
			if (string.contains(searchFor)) count++;
		}return count;

	}


	/** Returns a random element */
	public String random() {

		int index=new RandomValue().nextInt(size());
		for(String string: this){
			if (--index<0) return string;
		}return null;

	}


	/** Returns the larger element, or null if empty */
	public String larger() {

		if (isEmpty()) return null;

		String result=get(0);
		for(int index=1; index<size(); index++){
			String string=get(index);
			if (string.length()>result.length()) result=string;
		}return result;

	}


	/** Returns the index of the first element found, or -1 if none */
	public int startedWith(String searchFor) {

		if (searchFor!=null && !searchFor.isEmpty()){
			int i=0;
			for(String string: this){
				if (string.startsWith(searchFor)) return i;
				i++;
			}
		}return -1;

	}


	/** Returns a new list with the specified indices */
	public StringList indices(int...indices) {

		//ensure exact capacity
		StringList result=new StringList(indices.length);
		for(int index: indices){
			result.add(get(index));
		}return result;

	}



	/*
	 * Transformation
	 */
	/** Capitalizes all elements */
	public StringList capitalize() {

		int index=0;
		for(String string: this){
			set(index++, StringUtils.capitalize(string));
		}return this;

	}


	/** Uncapitalizes all elements */
	public StringList uncapitalize() {

		int index=0;
		for(String string: this){
			set(index++, StringUtils.uncapitalize(string));
		}return this;

	}


	/** Adds the prefix to all elements */
	public StringList addPrefix(String prefix) {

		int index=0;
		for(String string: this){
			set(index++, prefix + string);
		}return this;

	}


	/** Adds the suffix to all elements */
	public StringList addSuffix(String suffix) {

		int index=0;
		for(String string: this){
			set(index++, string + suffix);
		}return this;

	}


	/** Inserts all elements into this list */
	public StringList insert(int index, String...element) {

		if (element.length==1) add(index, element[0]);
		else addAll(index, Arrays.asList(element));
		return this;

	}


	/** Appends all elements to this list */
	public StringList append(String...element) {

		if (element.length==1) add(element[0]);
		else addAll(Arrays.asList(element));
		return this;

	}


	/** Removes all the indices from this list */
	public StringList remove(int...indices) {

		//ensure exact capacity
		StringList remove=new StringList(indices.length);
		for(int index: indices){
			remove.add(get(index));
		}removeAll(remove);
		return this;

	}


	/** Removes all element occurences from this list */
	public StringList remove(String element) {

		while(contains(element)){
			super.remove(element);
		}return this;

	}


	/** Trims all elements */
	public StringList trim() {

		int index=0;
		for(String string: this){
			set(index++, string.trim());
		}return this;

	}


	/** Removes all trimmed-empty elements */
	public StringList compact() {

		StringList remove=new StringList();
		for(String string: this){
			if (string.trim().isEmpty()) remove.add(string);
		}removeAll(remove);
		return this;

	}


	/** Returns all elements concatenated */
	public String concat(String separator) {

		StringBuilder result=new StringBuilder();
		for(int index=0; index<size(); index++){
			if (index>0) result.append(separator);
			result.append(get(index));
		}return result.toString();

	}


	public String toString(String separator) {
		return concat(separator);
	}

	@Override
	public String toString() {
		return toString(SEPARATOR.LINE.value);
	}


	public static void main(String[] args) {

		StringList list=new StringList(StringUtils.words("The quick brown fox jumps over the lazy dog")){
			@Override
			public String toString() {
				return "["+toString("|")+"]";
			}
		};

		String format="%15s";

		System.out.printf(format, "byteSize: "); System.out.println(list.byteSize());
		System.out.printf(format, "string: "); System.out.println(list);
		System.out.printf(format, "capitalize: "); System.out.println(list.capitalize());
		System.out.printf(format, "uncapitalize: "); System.out.println(list.uncapitalize());
		System.out.printf(format, "addPrefix: "); System.out.println(list.addPrefix("*"));
		System.out.printf(format, "addSuffix: "); System.out.println(list.addSuffix("*"));
		System.out.printf(format, "remove: "); System.out.println(list.remove(1, 7));
		System.out.printf(format, "insert: "); System.out.println(list.insert(1, " quick ", " lazy ").insert(0, " "));
		System.out.printf(format, "append: "); System.out.println(list.append(" "));
		System.out.printf(format, "trim: "); System.out.println(list.trim());
		System.out.printf(format, "compact: "); System.out.println(list.compact());
		System.out.printf(format, "concat: "); System.out.println(list.concat(":"));
		System.out.printf(format, "byteSize: "); System.out.println(list.byteSize());

	}


}