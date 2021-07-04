/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.util.Arrays;

import org.dma.java.time.Chronograph;

public class ArrayUtils {

	/*
	 * Conversion
	 */
	public static String[] toHexArray(byte[] array) {

		String[] result=new String[array.length];

		int index=0;
		for(byte b: array){
			result[index++]=StringUtils.toHex(b);
		}

		return result;

	}


	public static String toHexString(byte[] array) {

		StringBuilder result=new StringBuilder();

		for(String s: toHexArray(array)){
			result.append(s);
		}

		return result.toString();

	}


	static String[] toStringArray(char[] array) {

		String[] result=new String[array.length];

		int index=0;
		for(char c: array){
			result[index++]=String.valueOf(c);
		}

		return result;

	}


	@Deprecated
	static String[] toStringArray(Enum[] array) {

		String[] result=new String[array.length];

		int index=0;
		for(Enum element: array){
			result[index++]=element.name();
		}

		return result;

	}



	/*
	 * Analysis
	 */
	/** Returns the length of all arrays */
	public static <T> int length(T[]...array) {

		int length=0;

		for(T[] element: array){
			length+=element.length;
		}

		return length;

	}


	/** Returns the sum of all elements */
	public static int sum(int[] array) {

		int result=0;

		for(int value: array){
			result+=value;
		}

		return result;

	}


	/** Returns the smaller number, or -1 if empty */
	public static int smaller(int[] array) {

		if (array.length==0) return -1;

		int result=array[0];

		for(int value: array){
			if (value<result) result=value;
		}

		return result;

	}


	/** Returns the greater number, or -1 if empty */
	public static int greater(int[] array) {

		if (array.length==0) return -1;

		int result=array[0];

		for(int value: array){
			if (value>result) result=value;
		}

		return result;

	}


	/** Returns the larger string, or -1 if empty */
	public static String larger(String[] array) {

		if (array.length==0) return "";

		String result=array[0];

		for(int i=1; i<array.length; i++){
			if (array[i].length()>result.length()) result=array[i];
		}

		return result;

	}


	/** Returns the index of the first element found, or -1 if none */
	public static int startedWith(String[] array, String searchFor) {

		if (searchFor!=null && !searchFor.isEmpty()){
			for(int i=0; i<array.length; i++){
				if (array[i].startsWith(searchFor)) return i;
			}
		}return -1;

	}


	/** Returns the index of the first element found, or -1 if none */
	public static <T> int indexOf(T[] array, T searchFor) {

		return Arrays.asList(array).indexOf(searchFor);

	}


	/** Returns true if the element is found */
	public static <T> boolean contains(T[] array, T searchFor) {

		return indexOf(array, searchFor)!=-1;

	}


	/** Returns the elements in the specified indices order */
	public static String[] indices(String[] array, int...indices) {

		return new StringList(array).indices(indices).toArray();

	}





	/*
	 * Transformation
	 */
	/** Returns all elements capitalized */
	public static String[] capitalize(String[] array) {

		return new StringList(array).capitalize().toArray();

	}


	/** Returns all elements uncapitalized */
	public static String[] uncapitalize(String[] array) {

		return new StringList(array).uncapitalize().toArray();

	}


	/** Returns all elements with the added prefix */
	public static String[] addPrefix(String[] array, String prefix) {

		return new StringList(array).addPrefix(prefix).toArray();

	}


	/** Returns all elements with the added suffix */
	public static String[] addSuffix(String[] array, String suffix) {

		return new StringList(array).addSuffix(suffix).toArray();

	}


	/** Inserts a new element into the specified index */
	public static String[] insert(String[] array, int index, String...element) {

		//ensure exact capacity
		StringList result=new StringList(array.length+element.length, array);

		result.addAll(index, Arrays.asList(element));

		return result.toArray();

	}


	/** Appends a new element to the end of the array */
	public static String[] append(String[] array, String...element) {

		//ensure exact capacity
		StringList result=new StringList(array.length+element.length, array);

		result.addAll(Arrays.asList(element));

		return result.toArray();

	}


	/** Returns the elements without the specified index */
	public static String[] remove(String[] array, int index) {

		StringList result=new StringList(array);

		result.remove(index);

		return result.toArray();

	}


	/** Returns the elements without the specified indices */
	static String[] remove(String[] array, int...indices) {

		StringList result=new StringList(array);

		result.remove(indices);

		return result.toArray();

	}


	/** Returns all elements trimmed */
	public static String[] trim(String[] array) {

		return new StringList(array).trim().toArray();

	}


	/** Returns only TRIMMED non empty elements */
	public static String[] compact(String[] array) {

		return new StringList(array).compact().toArray();

	}


	/** Returns a string with TRIMMED non empty elements concatenated */
	public static String concat(String[] array, String separator) {

		return new StringList(array).concat(separator);

	}


	/** Returns a string with TRIMMED non empty elements concatenated */
	public static String concat(String[] array) {

		return concat(array, "");

	}


	/** Returns a string with TRIMMED non empty elements concatenated */
	public static String concat(String[] array, int fromIndex, int toIndex, String separator) {

		return new StringList(array).subList(fromIndex, toIndex).concat(separator);

	}


	/** Returns a string with TRIMMED non empty elements concatenated */
	public static String concatFrom(String[] array, int fromIndex, String separator) {

		return concat(array, fromIndex, array.length-1, separator);

	}


	/** Returns a string with TRIMMED non empty elements concatenated */
	public static String concatUpto(String[] array, int toIndex, String separator) {

		return concat(array, 0, toIndex, separator);

	}


	public static void main(String[] argvs) {

		String format="%15s";

		byte[] hexArray=new byte[]{0x01, 0x0f};
		System.out.printf(format, "toHexArray: "); System.out.println(Arrays.asList(toHexArray(hexArray)));
		System.out.printf(format, "toHexString: "); System.out.println(toHexString(hexArray));

		String[] array=new String[]{"a=0", "b=1", "c=2"};
		System.out.printf(format, "ARRAY: "); System.out.println(Arrays.asList(array));
		System.out.printf(format, "capitalize: "); System.out.println(Arrays.asList(array=capitalize(array)));
		System.out.printf(format, "uncapitalize: "); System.out.println(Arrays.asList(array=uncapitalize(array)));
		System.out.printf(format, "addPrefix: "); System.out.println(Arrays.asList(array=addPrefix(array, "<")));
		System.out.printf(format, "addSuffix: "); System.out.println(Arrays.asList(array=addSuffix(array, ">")));
		System.out.printf(format, "insert: "); System.out.println(Arrays.asList(array=insert(array, 0, " ")));
		System.out.printf(format, "append: "); System.out.println(Arrays.asList(array=append(array, " ")));
		System.out.printf(format, "remove: "); System.out.println(Arrays.asList(array=remove(array, 1)));
		System.out.printf(format, "trim: "); System.out.println(Arrays.asList(array=trim(array)));
		System.out.printf(format, "compact: "); System.out.println(Arrays.asList(array=compact(array)));
		System.out.printf(format, "concat: "); System.out.println(concat(array, ":"));

		int repeat=10000;
		Chronograph time=new Chronograph();
		time.start();

		for(int i=0; i<repeat; i++) array=insert(array, 0, "0");
		System.out.printf(format, "insert: "); System.out.println(time);		time.reset();
		for(int i=0; i<repeat; i++) append(array, "0");
		System.out.printf(format, "append: "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) remove(array, 0);
		System.out.printf(format, "remove: "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) remove(array, 0,1);
		System.out.printf(format, "remove: "); System.out.println(time);


	}


}