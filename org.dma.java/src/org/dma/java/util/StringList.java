/*******************************************************************************
 * 2008-2021 Public Domain
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
import java.util.Random;

public class StringList extends ArrayList<String> {

	private static final long serialVersionUID = 1L;

	public static <T> StringList valueOf(T[] array) {
		return valueOf(Arrays.asList(array));
	}

	public static <T> StringList valueOf(Collection<T> col) {
		StringList list=new StringList(col.size());
		for(Object element: col){
			list.add(element.toString());
		}return list;
	}

	public StringList() {
		super();
	}

	public StringList(String[] array) {
		this(array, array.length);
	}

	public StringList(String[] array, int initialCapacity) {
		this(initialCapacity);
		addAll(Arrays.asList(array));
	}

	public StringList(int initialCapacity) {
		super(initialCapacity);
	}

	public StringList(Collection<String> col) {
		super(col);
	}


	/*
	 * Conversion
	 */
	@Override
	public String[] toArray() {
		return super.toArray(new String[size()]);
	}


	@Override
	public StringList subList(int fromIndex, int toIndex) {
		return fromIndex<0 || toIndex>size() || fromIndex>toIndex ?
				new StringList(0) : new StringList(super.subList(fromIndex, toIndex));
	}



	/*
	 * Analysis
	 */
	/** Returns the size in BYTES */
	public int byteSize() {
		try{
			ByteArrayOutputStream stream=new ByteArrayOutputStream();
			ObjectOutputStream out=new ObjectOutputStream(stream);
			out.writeObject(this);
			out.close();
			return stream.size();

		}catch(IOException e){
			e.printStackTrace();
		}return 0;
	}

	/** Returns the number of occurences */
	public int occurences(String searchFor) {

		int count=0;

		for(String string: this){
			if (string.contains(searchFor)) count++;
		}

		return count;

	}

	/** Returns a random element */
	public String random() {

		int index=new Random().nextInt(size());

		for(String string: this){
			if (--index < 0) return string;
		}

		return null;

	}


	/** Returns a new list with the specified indices order */
	public StringList indices(int...indices) {

		//ensure exact capacity
		StringList result=new StringList(indices.length);

		for(int index: indices){
			result.add(get(index));
		}

		return result;

	}



	/*
	 * Transformation
	 */
	/** Returns a new list with all elements capitalized */
	public StringList capitalize() {

		StringList result=new StringList(size());

		for(String string: this){
			result.add(StringUtils.capitalize(string));
		}

		return result;

	}


	/** Returns a new list with all elements uncapitalized */
	public StringList uncapitalize() {

		StringList result=new StringList(size());

		for(String string: this){
			result.add(StringUtils.uncapitalize(string));
		}

		return result;

	}


	/** Returns a new list with all elements with the added prefix */
	public StringList addPrefix(String prefix) {

		StringList result=new StringList(size());

		for(String string: this){
			result.add(prefix+string);
		}

		return result;

	}


	/** Returns a new list with all elements with the added suffix */
	public StringList addSuffix(String suffix) {

		StringList result=new StringList(size());

		for(String string: this){
			result.add(string+suffix);
		}

		return result;

	}


	/** Removes and returns a new list with the removed elements */
	public StringList remove(int...indices) {

		//ensure exact capacity
		StringList remove=new StringList(indices.length);

		for(int index: indices){
			remove.add(get(index));
		}

		removeAll(remove);

		return remove;

	}


	/** Returns a new list with all elements trimmed */
	public StringList trim() {

		StringList result=new StringList(size());

		for(String string: this){
			result.add(string.trim());
		}

		return result;

	}


	/** Returns a new list with only TRIMMED non empty elements */
	public StringList compact() {

		StringList result=new StringList();

		for(String string: trim()){
			if (!string.isEmpty()) result.add(string);
		}

		return result;

	}


	/** Returns a string with TRIMMED non empty elements concatenated */
	public String concat(String separator) {

		StringBuilder result=new StringBuilder();

		for(String string: compact()){
			if (result.length()>0) result.append(separator);
			result.append(string);
		}

		return result.toString();

	}


}