/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dma.java.utils.string.StringUtils;

public class ArrayUtils {

	/*
	 * Conversion
	 */
	public static <T> Set<T> toSet(T[] array) {

		Set<T> result=new HashSet(array.length);

		for(int i=0; i<array.length; i++){
			result.add(array[i]);
		}

		return result;

	}


	public static <T> Set<String> toStringSet(T[] array) {

		Set<String> result=new HashSet(array.length);

		for(int i=0; i<array.length; i++){
			result.add(array[i].toString());
		}

		return result;

	}


	public static <T> List<T> toList(T[] array) {

		List<T> result=new ArrayList(array.length);

		for(int i=0; i<array.length; i++){
			result.add(array[i]);
		}

		return result;

	}


	public static <T> List<String> toStringList(T[] array) {

		List<String> result=new ArrayList(array.length);

		for(int i=0; i<array.length; i++){
			result.add(array[i].toString());
		}

		return result;

	}


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


	public static <T> String[] toStringArray(T[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=array[i].toString();
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


	public static String[] toStringArray(int[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=String.valueOf(array[i]);
		}

		return result;

	}


	public static String toString(byte[] array) {

		StringBuilder result=new StringBuilder();

		for(int i=0; i<array.length; i++){
			result.append((char)array[i]);
		}

		return result.toString();

	}


	public static String toString(char[] array) {

		StringBuilder result=new StringBuilder();

		for(int i=0; i<array.length; i++){
			result.append(array[i]);
		}

		return result.toString();

	}


	public static String toHex(byte[] array) {

		StringBuilder result=new StringBuilder();

		for (byte b: array){
			result.append(StringUtils.toHex(b));
		}

		return result.toString();

	}


	public static String toHexString(byte[] array) {

		StringBuilder result=new StringBuilder();

		for (byte b: array){
			String hexString=Integer.toHexString(0x00ff & b);
			result.append(hexString.length()==1 ? "0"+hexString : hexString);
		}

		return result.toString();

	}


	public static String[] toHexArray(byte[] array) {

		String[] result=new String[array.length];

		int index=0;
		for (byte b: array){
			String hexString=Integer.toHexString(0x00ff & b);
			result[index++]=hexString.length()==1 ? "0"+hexString : hexString;
		}

		return result;

	}





	/*
	 * Analysis
	 */
	public static String larger(String[] array) {

		if (array.length==0) return "";

		String result=array[0];

		for (int i=1; i<array.length; i++){
			if(array[i].length()>result.length()) result=array[i];
		}

		return result;

	}


	public static int greater(int[] array) {

		if (array.length==0) return 0;

		int result=array[0];

		for(int i=1; i<array.length; i++){
			if(array[i]>result) result=array[i];
		}

		return result;

	}


	public static int smaller(int[] array) {

		if (array.length==0) return 0;

		int result=array[0];

		for(int i=0; i<array.length; i++){
			if(array[i]<result) result=array[i];
		}

		return result;

	}


	public static int startsWith(String[] array, String element) {

		if(element!=null && !element.isEmpty()){
			for(int i=0; i<array.length; i++){
				if(array[i].startsWith(element)) return i;
			}
		}

		return -1;

	}


	public static int startsWithOrFirst(String[] array, String element) {

		int index=startsWith(array, element);

		return index==-1 ? 0 : index;

	}


	public static <T> T last(T[] array) {

		return array[array.length-1];

	}


	public static <T> int indexOf(T[] array, T element) {

		for(int i=0; i<array.length; i++){
			if(array[i].equals(element)) return i;
		}

		return -1;

	}


	public static <T> int indexOrFirst(T[] array, T element) {

		int index=indexOf(array, element);

		return index==-1 ? 0 : index;

	}


	public static <T> boolean contains(T[] array, T element) {

		return indexOf(array, element)!=-1;

	}





	/*
	 * Transformation
	 */
	public static String[] trim(String[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=array[i].trim();
		}

		return result;

	}


	public static String trim(String[] array, String separator) {

		return concat(trim(array), separator);

	}


	public static String[] compact(String[] array){

		List<String> result=new ArrayList(array.length);

		for(int i=0; i<array.length; i++){
			if(!array[i].trim().isEmpty()) result.add(array[i]);
		}

		return CollectionUtils.toArray(result,String.class);

	}


	public static <T> String[] capitalize(T[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=StringUtils.capitalize(array[i].toString());
		}

		return result;

	}


	public static <T> String[] uncapitalize(T[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=StringUtils.uncapitalize(array[i].toString());
		}

		return result;

	}


	public static <T> String[] numbers(T[] array) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=StringUtils.numbers(array[i].toString());
		}

		return result;

	}


	public static <T> String[] subArray(T[][] array, int index) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=array[i][index].toString();
		}

		return result;

	}


	public static <T> String[] headArray(T[] array) {

		String[] result=new String[array.length-1];

		for(int i=0; i<array.length-1; i++){
			result[i]=array[i].toString();
		}

		return result;

	}


	public static <T> String headArray(T[] array, String separator) {

		return concat(headArray(array), separator);

	}


	public static <T> String[] tailArray(T[] array) {

		String[] result=new String[array.length-1];

		for(int i=1; i<array.length; i++){
			result[i-1]=array[i].toString();
		}

		return result;

	}


	public static <T> String tailArray(T[] array, String separator) {

		return concat(tailArray(array), separator);

	}


	public static String[] removeFromAll(String[] array, String searchFor) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=StringUtils.removeAll(array[i], searchFor);
		}

		return result;

	}



	public static <T> String concat(T[] array, int fromIndex, int toIndex, String separator) {

		if(array.length==0 ||
				fromIndex<0 ||
				toIndex>=array.length ||
				toIndex-fromIndex<0) return "";

		StringBuilder result=new StringBuilder(array[fromIndex].toString());

		for(int i=fromIndex+1; i<=toIndex; i++){
			result.append(separator + array[i].toString());
		}

		return result.toString();

	}


	public static <T> String concat(T[] array, String separator) {

		return concat(array,0,array.length-1,separator);

	}


	public static <T> String concatFrom(T[] array, int fromIndex, String separator) {

		return concat(array,fromIndex,array.length-1,separator);

	}


	public static <T> String concatUpto(T[] array, int toIndex, String separator) {

		return concat(array,0,toIndex,separator);

	}


	public static <T> String[] addPrefix(T[] array, String prefix) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=prefix+array[i];
		}

		return result;

	}


	public static <T> String[] addSuffix(T[] array, String suffix) {

		String[] result=new String[array.length];

		for(int i=0; i<array.length; i++){
			result[i]=array[i]+suffix;
		}

		return result;

	}


	public static <T> T[] insert(T[] array, T element, int position) {

		List<T> result=toList(array);

		result.add(position, element);

		return CollectionUtils.toArray(result,element.getClass());

	}


	public static <T> T[] removeContaining(T[] array, String searchFor) {

		List<T> result=toList(array);

		CollectionUtils.removeContaining(result, searchFor);

		return CollectionUtils.toArray(result,array[0].getClass());

	}


	public static <T> T[] removeContaining(T[] array, String[] searchFor) {

		List<T> result=toList(array);

		CollectionUtils.removeContaining(result, searchFor);

		return CollectionUtils.toArray(result,array[0].getClass());

	}


	public static <T> T[] merge(T[] intoArray, T[] fromArray) {

		if(fromArray==null || fromArray.length==0) return intoArray;
		if(intoArray==null || intoArray.length==0) return fromArray;

		List<T> result=toList(intoArray);

		for(T element: fromArray){
			if (!result.contains(element)) result.add(element);
		}

		return CollectionUtils.toArray(result,intoArray[0].getClass());

	}


	public static void main(String[] argvs) {}


}