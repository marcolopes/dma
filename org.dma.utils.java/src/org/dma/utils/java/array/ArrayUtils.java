/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dma.utils.java.string.StringUtils;

public class ArrayUtils {

	/*
	 * Conversion
	 */
	public static <T> Set<T> toSet(T[] array) {

		Set<T> set=new HashSet(array.length);

		for(int i=0; i<array.length; i++)
			set.add(array[i]);

		return set;

	}


	public static <T> List<T> toList(T[] array) {

		List<T> list=new ArrayList(array.length);

		for(int i=0; i<array.length; i++)
			list.add(array[i]);

		return list;

	}


	public static char[] toCharArray(String[] array) {

		char[] array2=new char[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=(char)StringUtils.val(array[i]);

		return array2;

	}


	public static byte[] toByteArray(String[] array) {

		byte[] array2=new byte[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=(byte)StringUtils.val(array[i]);

		return array2;

	}


	public static int[] toIntArray(String[] array) {

		int[] array2=new int[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=StringUtils.val(array[i]);

		return array2;

	}


	public static String[] toStringArray(char[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=String.valueOf(array[i]);

		return array2;

	}


	public static String[] toStringArray(byte[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=String.valueOf(array[i]);

		return array2;

	}


	public static String[] toStringArray(int[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=String.valueOf(array[i]);

		return array2;

	}


	public static String[] toStringArray(Enum[] array) {

		String[] array2=new String[array.length];

		for(Enum e:array){
			array2[e.ordinal()]=e.name();
		}

		return array2;

	}


	public static String toString(byte[] array) {

		String string="";

		for(int i=0; i<array.length; i++)
			string+=array[i];

		return string;

	}


	public static String toHex(byte[] array) {

		String string="";

		for (byte b: array)
			string+=StringUtils.toHex(b);

		return string;

	}


	public static String toHexString(byte[] array) {

		String string="";

		for (byte b: array) {
			String hexString=Integer.toHexString(0x00FF & b);
			string+=hexString.length()==1 ? "0"+hexString : hexString;
		}

		return string;

	}


	public static String[] createEmpty() {

		return new String[]{""};

	}






	/*
	 * Analysis
	 */
	public static String bigger(String[] array){

		String bigger="";

		for (int i=0; i<array.length; i++)
			if(array[i].length()>bigger.length())
				bigger=array[i];

		return bigger;

	}


	public static int bigger(int[] array) {

		if (array.length==0)
			return 0;

		int bigger=array[0];

		for(int i=0; i<array.length; i++)
			if (array[i]>bigger)
				bigger=array[i];

		return bigger;

	}


	public static int smaller(int[] array) {

		if (array.length==0)
			return 0;

		int lower=array[0];

		for(int i=0; i<array.length; i++)
			if (array[i]<lower)
				lower=array[i];

		return lower;

	}


	public static int startsWith(String[] array, String element) {

		if(element!=null && element.length()>0)
			for(int i=0; i<array.length; i++)
				if(array[i].startsWith(element))
					return i;

		return -1;

	}


	public static int startsWithOrFirst(String[] array, String element) {

		int index=startsWith(array, element);

		return index==-1 ? 0 : index;

	}


	public static <T> T last(T[] array) {

		return array[array.length-1];

	}


	public static <T> int indexOrFirst(T[] array, T element) {

		int index=indexOf(array, element);

		return index==-1 ? 0 : index;

	}


	public static <T> boolean contains(T[] array, T element) {

		return indexOf(array, element)!=-1;

	}


	public static <T> int indexOf(T[] array, T element) {

		for(int i=0; i<array.length; i++)
			if(array[i].equals(element))
				return i;

		return -1;

	}






	/*
	 * Transformation
	 */
	public static String[] trim(String string, String separator) {

		return trim(string.split(separator));

	}


	public static String trim(String[] array, String separator) {

		return concat(trim(array), separator);

	}


	public static String[] trim(String[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=array[i].trim();

		return array2;

	}


	public static String[] compact(String[] array){

		Collection<String> list=new ArrayList(array.length);

		for(int i=0; i<array.length; i++)
			if(array[i].trim().length()>0)
				list.add(array[i]);

		return CollectionUtils.toArray(list,String.class);

	}


	public static String[] numbers(String[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=StringUtils.numbers(array[i]);

		return array2;

	}


	public static String[] capitalize(String[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=StringUtils.capitalize(array[i]);

		return array2;

	}


	public static String[] uncapitalize(String[] array) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=StringUtils.uncapitalize(array[i]);

		return array2;

	}


	public static String[] addPrefix(String[] array, String prefix) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=prefix+array[i];

		return array2;

	}


	public static String[] addSuffix(String[] array, String suffix) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=array[i]+suffix;

		return array2;

	}


	public static String[] removeFromAll(String[] array, String searchFor) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=StringUtils.remove(array[i], searchFor);

		return array2;

	}


	public static String[] removeContaining(String[] array, String searchFor){

		List<String> list=ArrayUtils.toList(array);
		CollectionUtils.removeContaining(list, searchFor);

		return CollectionUtils.toArray(list,String.class);

	}


	public static String[] removeContaining(String[] array, String[] searchFor){

		List<String> list=ArrayUtils.toList(array);
		CollectionUtils.removeContaining(list, searchFor);

		return CollectionUtils.toArray(list,String.class);

	}


	public static String[] insert(String[] array, String element, int position) {

		List<String> list=toList(array);
		list.add(position, element);

		return CollectionUtils.toArray(list,String.class);

	}


	public static String[] merge(String[] array, String[] array2) {

		if(array==null || array.length==0)
			return array2;
		if(array2==null || array2.length==0)
			return array;

		List<String> list=toList(array);

		for(int i=0; i<array2.length; i++)
			if (!list.contains(array2[i]))
				list.add(array2[i]);

		return CollectionUtils.toArray(list,String.class);

	}


	public static String[] subArray(String[][] array, int index) {

		String[] array2=new String[array.length];

		for(int i=0; i<array.length; i++)
			array2[i]=array[i][index];

		return array2;

	}


	public static String[] tailArray(String[] array) {

		String[] array2=new String[array.length-1];

		for(int i=1; i<array.length; i++)
			array2[i-1]=array[i];

		return array2;

	}


	public static String tailArray(String[] array, String separator) {

		return concat(tailArray(array), separator);

	}


	public static String[] headArray(String[] array) {

		String[] array2=new String[array.length-1];

		for(int i=0; i<array.length-1; i++)
			array2[i]=array[i];

		return array2;

	}


	public static String headArray(String[] array, String separator) {

		return concat(headArray(array), separator);

	}


	public static String concat(String[] array, String separator) {

		return concat(array,0,array.length-1,separator);

	}


	public static String concat(char[] array, String separator) {

		return concat(toStringArray(array),separator);

	}


	public static String concatUpto(String[] array, int toIndex, String separator) {

		return concat(array,0,toIndex,separator);

	}


	public static String concatFrom(String[] array, int fromIndex, String separator) {

		return concat(array,fromIndex,array.length-1,separator);

	}


	public static String concat(String[] array, int fromIndex, int toIndex, String separator) {

		if(array.length==0 || fromIndex<0 || toIndex>=array.length || toIndex-fromIndex<0)
			return "";

		String string=array[fromIndex];

		for(int i=fromIndex+1; i<=toIndex; i++)
			string+=separator+array[i];

		return string;

	}


	public static void main(String[] argvs){
	}


}