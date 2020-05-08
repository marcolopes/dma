/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtils {

	/*
	 * Conversion
	 */
	public static byte[] toByteArray(int[] array) {

		byte[] result=new byte[array.length];

		int index=0;
		for(int i: array){
			result[index++]=(byte)i;
		}

		return result;

	}


	public static char[] toCharArray(int[] array) {

		char[] result=new char[array.length];

		int index=0;
		for(int i: array){
			result[index++]=(char)i;
		}

		return result;

	}


	public static String[] toStringArray(int[] array) {

		String[] result=new String[array.length];

		int index=0;
		for(int i: array){
			result[index++]=String.valueOf(i);
		}

		return result;

	}


	public static String[] toStringArray(char[] array) {

		String[] result=new String[array.length];

		int index=0;
		for(char c: array){
			result[index++]=String.valueOf(c);
		}

		return result;

	}


	public static <T> String[] toStringArray(T[] array) {

		String[] result=new String[array.length];

		int index=0;
		for(T element: array){
			result[index++]=element.toString();
		}

		return result;

	}


	public static String toCharString(byte[] array) {

		StringBuilder result=new StringBuilder();

		for(byte b: array){
			result.append((char)b);
		}

		return result.toString();

	}


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





	/*
	 * Analysis
	 */
	public static <T> int lenght(T[]...array) {

		int lenght=0;

		for(T[] element: array){
			if (element!=null) lenght+=element.length;
		}

		return lenght;

	}


	public static int greater(int[] array) {

		if(array.length==0) return 0;

		int result=array[0];

		for(int i=1; i<array.length; i++){
			if(array[i]>result) result=array[i];
		}

		return result;

	}


	public static int smaller(int[] array) {

		if(array.length==0) return 0;

		int result=array[0];

		for(int i: array){
			if(i<result) result=i;
		}

		return result;

	}


	public static String larger(String[] array) {

		if(array.length==0) return "";

		String result=array[0];

		for(int i=1; i<array.length; i++){
			if(array[i].length()>result.length()) result=array[i];
		}

		return result;

	}


	public static int startedWith(String[] array, String searchFor) {

		if(searchFor!=null && !searchFor.isEmpty()){
			for(int i=0; i<array.length; i++){
				if(array[i].startsWith(searchFor)) return i;
			}
		}

		return -1;

	}


	public static int startedOrFirst(String[] array, String searchFor) {

		int index=startedWith(array, searchFor);

		return index==-1 ? 0 : index;

	}


	public static <T> int indexOf(T[] array, T searchFor) {

		return Arrays.asList(array).indexOf(searchFor);

	}


	public static <T> int indexOrFirst(T[] array, T searchFor) {

		int index=indexOf(array, searchFor);

		return index==-1 ? 0 : index;

	}


	public static <T> boolean contains(T[] array, T searchFor) {

		return indexOf(array, searchFor)!=-1;

	}





	/*
	 * Transformation
	 */
	public static <T> String[] numbers(T[] array) {

		return CollectionUtils.numbers(Arrays.asList(array));

	}


	public static <T> String[] capitalize(T[] array) {

		return CollectionUtils.capitalize(Arrays.asList(array));

	}


	public static <T> String[] uncapitalize(T[] array) {

		return CollectionUtils.uncapitalize(Arrays.asList(array));

	}


	public static <T> String[] addPrefix(T[] array, String prefix) {

		return CollectionUtils.addPrefix(Arrays.asList(array), prefix);

	}


	public static <T> String[] addSuffix(T[] array, String suffix) {

		return CollectionUtils.addSuffix(Arrays.asList(array), suffix);

	}


	public static <T> String[] removeAll(T[] array, String searchFor) {

		return CollectionUtils.removeAll(Arrays.asList(array), searchFor);

	}


	public static <T> String[] trim(T[] array) {

		return CollectionUtils.trim(Arrays.asList(array));

	}


	public static String trim(String[] array, String separator) {

		return concat(trim(array), separator);

	}


	public static <T> String[] compact(T[] array) {

		return CollectionUtils.compact(Arrays.asList(array));

	}


	public static <T> String concat(T[] array, String separator) {

		return CollectionUtils.concat(Arrays.asList(array), separator);

	}


	public static <T> String concat(T[] array) {

		return concat(array, "");

	}


	public static <T> String concat(T[] array, int fromIndex, int toIndex, String separator) {

		return CollectionUtils.concat(Arrays.asList(array), fromIndex, toIndex, separator);

	}


	public static <T> String concatFrom(T[] array, int fromIndex, String separator) {

		return CollectionUtils.concatFrom(Arrays.asList(array), fromIndex, separator);

	}


	public static <T> String concatUpto(T[] array, int toIndex, String separator) {

		return CollectionUtils.concatUpto(Arrays.asList(array), toIndex, separator);

	}


	public static <T> String[] head(T[] array) {

		List<T> result=CollectionUtils.head(Arrays.asList(array));

		//result can be empty!
		return result.toArray(new String[result.size()]);

	}


	public static <T> String head(T[] array, String separator) {

		return concat(head(array), separator);

	}


	public static <T> String[] tail(T[] array) {

		List<T> result=CollectionUtils.tail(Arrays.asList(array));

		//result can be empty!
		return result.toArray(new String[result.size()]);

	}


	public static <T> String tail(T[] array, String separator) {

		return concat(tail(array), separator);

	}


	public static <T> T[] insert(T[] array, int index, T...element) {

		//ensure exact capacity
		List<T> result=new ArrayList(array.length+element.length);

		result.addAll(Arrays.asList(array));
		result.addAll(index, Arrays.asList(element));

		return CollectionUtils.toArray(result);

	}


	public static <T> T[] append(T[] array, T...element) {

		return insert(array, array.length, element);

	}


	public static <T> T[] remove(T[] array, int index) {

		List<T> result=new ArrayList(Arrays.asList(array));

		result.remove(index);

		//result can be empty!
		return CollectionUtils.toArray(result, array[0].getClass());

	}


	public static <T> T[] remove(T[] array, Integer...index) {

		List<T> result=new ArrayList(Arrays.asList(array));

		result.removeAll(Arrays.asList(index(array, index)));

		//result can be empty!
		return CollectionUtils.toArray(result, array[0].getClass());

	}


	/** Returns null if all arrays are empty */
	public static <T> T[] merge(T[]...array) {

		//ensure exact capacity
		List<T> result=new ArrayList(lenght(array));

		for(T[] a: array){
			if (a!=null) result.addAll(Arrays.asList(a));
		}

		return CollectionUtils.toArray(result);

	}


	public static <T> T[] index(T[] array, Integer...index) {

		List<T> result=CollectionUtils.index(Arrays.asList(array), Arrays.asList(index));

		return CollectionUtils.toArray(result);

	}


	public static void main(String[] argvs) {

		byte[] hexArray=new byte[]{0x01, 0x0f};
		System.out.println("toHexArray: " + Arrays.asList(toHexArray(hexArray)));
		System.out.println("toHexString: " + toHexString(hexArray));

		String[] array=new String[]{"a=0", "b=1", "c=2"};
		System.out.println("ARRAY: " + Arrays.asList(array));
		System.out.println("concat: " + concat(array, ":"));
		System.out.println("head: " + Arrays.asList(head(array)));
		System.out.println("tail: " + Arrays.asList(tail(array)));
		System.out.println("insert: " + Arrays.asList(array=insert(array, 0, "' '")));
		System.out.println("append: " + Arrays.asList(array=append(array, "' '")));
		System.out.println("removeAll: " + Arrays.asList(array=removeAll(array, "'")));
		System.out.println("trim: " + Arrays.asList(array=trim(array)));
		System.out.println("compact: " + Arrays.asList(array=compact(array)));
		System.out.println("numbers: " + Arrays.asList(array=numbers(array)));
		System.out.println("addPrefix: " + Arrays.asList(array=addPrefix(array, "-")));
		System.out.println("addSuffix: " + Arrays.asList(array=addSuffix(array, "+")));
		System.out.println("remove: " + Arrays.asList(array=remove(array, 0,1,2)));

		String[] array1=new String[]{"0", "1", "2"};
		String[] array2=new String[]{"3", "4", "5"};
		String[] array3=new String[]{"6", "7", "8"};
		System.out.println("lenght: " + lenght(array1, array2, array3));
		System.out.println("merge: " + Arrays.asList(merge(array1, array2, array3)));
		System.out.println("merge: " + Arrays.asList(merge(array1, array2)));
		System.out.println("merge: " + Arrays.asList(merge(array1, null)));
		System.out.println("merge: " + Arrays.asList(merge(null, array2)));
		System.out.println("merge: " + merge(new String[0]));

		int repeat=10000;
		Chronograph time=new Chronograph();
		time.start();
		for(int i=0; i<repeat; i++) array=insert(array, 0, "0");
		time.stop();
		System.out.println("insert: "+time);
		time.reset();
		time.start();
		for(int i=0; i<repeat; i++) remove(array, 0);
		time.stop();
		System.out.println("remove: "+time);

		time.reset();
		time.start();
		for(int i=0; i<repeat; i++) remove(array, 0,1);
		time.stop();
		System.out.println("remove: "+time);


	}


}