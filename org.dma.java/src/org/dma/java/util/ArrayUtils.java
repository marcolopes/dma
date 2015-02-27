/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayUtils {

	/*
	 * Conversion
	 */
	public static byte[] toByteArray(int[] array) {

		byte[] result=new byte[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=(byte)array[i];
		}

		return result;

	}


	public static char[] toCharArray(int[] array) {

		char[] result=new char[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=(char)array[i];
		}

		return result;

	}


	public static int[] toIntArray(String[] array) {

		int[] result=new int[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=StringUtils.val(array[i]);
		}

		return result;

	}


	public static String[] toStringArray(int[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=String.valueOf(array[i]);
		}

		return result;

	}


	public static String[] toStringArray(char[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=String.valueOf(array[i]);
		}

		return result;

	}


	public static <T> String[] toStringArray(T[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=array[i].toString();
		}

		return result;

	}


	public static String toString(byte[] array) {

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
	public static <T> T last(T[] array) {

		return array[array.length-1];

	}


	public static String larger(String[] array) {

		if(array.length==0) return "";

		String result=array[0];

		for(int i=1; i<array.length; i++){
			if(array[i].length()>result.length()) result=array[i];
		}

		return result;

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


	public static <T> String[] removeFromAll(T[] array, String searchFor) {

		return CollectionUtils.removeFromAll(Arrays.asList(array), searchFor);

	}


	public static <T> String[] trim(T[] array) {

		return CollectionUtils.trim(Arrays.asList(array));

	}


	public static String trim(String[] array, String separator) {

		return concat(trim(array), separator);

	}


	public static <T> String concat(T[] array, String separator) {

		return CollectionUtils.concat(Arrays.asList(array), separator);

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


	public static <T> String[] compact(T[] array) {

		return CollectionUtils.compact(Arrays.asList(array));

	}


	public static <T> T[] insert(T[] intoArray, int position, T...element) {

		List<T> col=new ArrayList(Arrays.asList(intoArray));

		if (element.length==1){
			col.add(position, element[0]);
		}else{
			col.addAll(position, Arrays.asList(element));
		}

		return col.toArray(intoArray);

	}


	public static <T> T[] merge(T[] intoArray, T[] fromArray) {

		Collection<T> col=CollectionUtils.merge(
				Arrays.asList(intoArray),
				Arrays.asList(fromArray));

		return col.toArray(intoArray);

	}


	public static <T> String[] head(T[] array) {

		List<T> col=CollectionUtils.head(Arrays.asList(array));

		return col.toArray(new String[col.size()]);

	}


	public static <T> String[] tail(T[] array) {

		List<T> col=CollectionUtils.tail(Arrays.asList(array));

		return col.toArray(new String[col.size()]);

	}


	public static <T> String head(T[] array, String separator) {

		return concat(head(array), separator);

	}


	public static <T> String tail(T[] array, String separator) {

		return concat(tail(array), separator);

	}


	public static void main(String[] argvs) {

		byte[] hexArray=new byte[]{0x01, 0x0f};

		System.out.println("toHexArray: " + Arrays.asList(toHexArray(hexArray)));
		System.out.println("toHexString: " + toHexString(hexArray));

	}


}