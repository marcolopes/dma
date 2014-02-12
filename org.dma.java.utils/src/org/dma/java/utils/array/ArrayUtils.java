/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dma.java.utils.string.StringUtils;

public class ArrayUtils {

	/*
	 * Conversion
	 */
	public static <T> Set<T> toSet(T[] array) {

		Set<T> set=new HashSet(array.length);

		for(int i=0; i<array.length; i++){
			set.add(array[i]);
		}

		return set;

	}


	public static <T> List<T> toList(T[] array) {

		List<T> list=new ArrayList(array.length);

		for(int i=0; i<array.length; i++){
			list.add(array[i]);
		}

		return list;

	}


	public static char[] toCharArray(int[] array) {

		char[] array2=new char[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=(char)array[i];
		}

		return array2;

	}


	public static byte[] toByteArray(int[] array) {

		byte[] array2=new byte[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=(byte)array[i];
		}

		return array2;

	}


	public static int[] toIntArray(String[] array) {

		int[] array2=new int[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=StringUtils.val(array[i]);
		}

		return array2;

	}


	public static <T> String[] toStringArray(T[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=array[i].toString();
		}

		return array2;

	}


	public static String[] toStringArray(char[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=String.valueOf(array[i]);
		}

		return array2;

	}


	public static String[] toStringArray(int[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=String.valueOf(array[i]);
		}

		return array2;

	}


	public static String toString(byte[] array) {

		String string="";

		for(int i=0; i<array.length; i++){
			string+=array[i];
		}

		return string;

	}


	public static String toHex(byte[] array) {

		String string="";

		for (byte b: array){
			string+=StringUtils.toHex(b);
		}

		return string;

	}


	public static String toHexString(byte[] array) {

		String string="";

		for (byte b: array){
			String hexString=Integer.toHexString(0x00ff & b);
			string+=hexString.length()==1 ? "0"+hexString : hexString;
		}

		return string;

	}





	/*
	 * Analysis
	 */
	public static String larger(String[] array){

		if (array.length==0) return "";

		String larger=array[0];

		for (int i=1; i<array.length; i++){
			if(array[i].length()>larger.length()){
				larger=array[i];
			}
		}

		return larger;

	}


	public static int greater(int[] array) {

		if (array.length==0) return 0;

		int greater=array[0];

		for(int i=1; i<array.length; i++){
			if(array[i]>greater){
				greater=array[i];
			}
		}

		return greater;

	}


	public static int smaller(int[] array) {

		if (array.length==0) return 0;

		int smaller=array[0];

		for(int i=0; i<array.length; i++){
			if(array[i]<smaller){
				smaller=array[i];
			}
		}

		return smaller;

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

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=array[i].trim();
		}

		return array2;

	}


	public static String[] trim(String string, String separator) {

		return trim(string.split(separator));

	}


	public static String trim(String[] array, String separator) {

		return concat(trim(array), separator);

	}


	public static String[] compact(String[] array){

		Collection<String> list=new ArrayList(array.length);

		for(int i=0; i<array.length; i++){
			if(!array[i].trim().isEmpty()){
				list.add(array[i]);
			}
		}

		return CollectionUtils.toArray(list,String.class);

	}


	public static <T> String[] capitalize(T[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=StringUtils.capitalize(array[i].toString());
		}

		return array2;

	}


	public static <T> String[] uncapitalize(T[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=StringUtils.uncapitalize(array[i].toString());
		}

		return array2;

	}


	public static <T> String[] numbers(T[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=StringUtils.numbers(array[i].toString());
		}

		return array2;

	}


	public static <T> String[] subArray(T[][] array, int index) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=array[i][index].toString();
		}

		return array2;

	}


	public static <T> String[] headArray(T[] array) {

		String[] array2=new String[array.length-1];

		for(int i=0; i<array.length-1; i++){
			array2[i]=array[i].toString();
		}

		return array2;

	}


	public static <T> String headArray(T[] array, String separator) {

		return concat(headArray(array), separator);

	}


	public static <T> String[] tailArray(T[] array) {

		String[] array2=new String[array.length-1];

		for(int i=1; i<array.length; i++){
			array2[i-1]=array[i].toString();
		}

		return array2;

	}


	public static <T> String tailArray(T[] array, String separator) {

		return concat(tailArray(array), separator);

	}


	public static String[] removeFromAll(String[] array, String searchFor) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=StringUtils.remove(array[i], searchFor);
		}

		return array2;

	}



	public static <T> String concat(T[] array, int fromIndex, int toIndex, String separator) {

		if(array.length==0 ||
				fromIndex<0 ||
				toIndex>=array.length ||
				toIndex-fromIndex<0) return "";

		String string=array[fromIndex].toString();

		for(int i=fromIndex+1; i<=toIndex; i++){
			string+=separator+array[i];
		}

		return string;

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

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=prefix+array[i];
		}

		return array2;

	}


	public static <T> String[] addSuffix(T[] array, String suffix) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++){
			array2[i]=array[i]+suffix;
		}

		return array2;

	}


	public static <T> T[] insert(T[] array, T element, int position) {

		List<T> list=toList(array);

		list.add(position, element);

		return CollectionUtils.toArray(list,element.getClass());

	}


	public static <T> T[] removeContaining(T[] array, String searchFor){

		List<T> list=toList(array);

		CollectionUtils.removeContaining(list, searchFor);

		return CollectionUtils.toArray(list,array[0].getClass());

	}


	public static <T> T[] removeContaining(T[] array, String[] searchFor){

		List<T> list=toList(array);

		CollectionUtils.removeContaining(list, searchFor);

		return CollectionUtils.toArray(list,array[0].getClass());

	}


	public static <T> T[] merge(T[] intoArray, T[] fromArray) {

		if(fromArray==null || fromArray.length==0) return intoArray;
		if(intoArray==null || intoArray.length==0) return fromArray;

		List<T> list=toList(intoArray);

		for(int i=0; i<fromArray.length; i++){
			if (!list.contains(fromArray[i])){
				list.add(fromArray[i]);
			}
		}

		return CollectionUtils.toArray(list,intoArray[0].getClass());

	}


	public static void main(String[] argvs){
	}


}