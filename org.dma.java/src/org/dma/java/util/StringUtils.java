/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import org.dma.java.time.Chronograph;

public class StringUtils {

	public static final Pattern NUMERIC_PATTERN = Pattern.compile("[0-9]+");
	public static final Pattern DECIMAL_PATTERN = Pattern.compile("[0-9[.]]+");
	public static final Pattern LETTERS_PATTERN = Pattern.compile("[A-Za-z]+");
	public static final Pattern UPPERCASE_PATTERN = Pattern.compile("[^a-z]+");
	public static final Pattern LOWERCASE_PATTERN = Pattern.compile("[^A-Z]+");
	public static final Pattern DIACRITICS_PATTERN = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

	public static final String DECIMAL_NUMBERS = "0123456789";
	public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String UPPERCASE_LETTERS = LOWERCASE_LETTERS.toUpperCase();

	/*
	 * Conversion
	 */
	public static int val(String string) {

		try{
			return Integer.valueOf(string);

		}catch(NumberFormatException e){}

		return 0;

	}


	public static int num(char character) {

		//character-'0' for arabic chars only!
		return Character.getNumericValue(character);

	}


	public static String toHex(byte b) {

		final char[] HEX_DIGITS={
			'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

		return new String(new char[]{
			HEX_DIGITS[(b>>4) & 0x0f],
			HEX_DIGITS[b & 0x0f]});

	}


	/** @see Integer#toHexString */
	public static String toHexString(byte b) {

		String hexString=Integer.toHexString(0xff & b);

		return hexString.length()==1 ? "0"+hexString : hexString;

	}





	/*
	 * Creation
	 */
	public static String replicas(String string, int replicas) {

		StringBuilder result=new StringBuilder(replicas);

		for(int i=0; i<replicas; i++){
			result.append(string);
		}

		return result.toString();

	}





	/*
	 * Analysis
	 */
	public static int hashCode(String string) {

		return string==null ? 0 : string.hashCode();

	}


	public static boolean isEmpty(String string) {

		return string==null || string.trim().isEmpty();

	}


	public static boolean isLogical(String string) {

		return string.equals("0") || string.equals("1");

	}


	public static boolean isNumeric(String string) {

		return NUMERIC_PATTERN.matcher(string).matches();

	}


	public static boolean isDecimal(String string) {

		return DECIMAL_PATTERN.matcher(string).matches();

	}


	public static boolean isLetters(String string) {

		return LETTERS_PATTERN.matcher(string).matches();

	}


	public static boolean isUppercase(String string) {

		return UPPERCASE_PATTERN.matcher(string).matches();

	}


	public static boolean isLowercase(String string) {

		return LOWERCASE_PATTERN.matcher(string).matches();

	}


	@Deprecated
	public static int equals(String string, String...searchFor) {

		for(int i=0; i<searchFor.length; i++){
			if (string.equals(searchFor[i])) return i;
		}return -1;

	}


	@Deprecated
	public static int startsWith(String string, String...searchFor) {

		for(int i=0; i<searchFor.length; i++){
			if (string.startsWith(searchFor[i])) return i;
		}return -1;

	}


	public static Collection<Integer> indexOf(String string, String searchFor) {

		Collection<Integer> result=new ArrayList();

		int index=0;
		while((index=string.indexOf(searchFor, index))!=-1) {
			result.add(index);
			index+=searchFor.length();
		}

		return result;

	}


	public static int ocurrences(String string, char...searchFor) {

		int count=0;

		for(int i=0; i<string.length(); i++){
			for(char c: searchFor){
				if (string.charAt(i)==c) count++;
			}
		}

		return count;

	}


	public static int ocurrences(String string, String searchFor) {

		return indexOf(string, searchFor).size();

	}


	public static boolean contains(String string, char...searchFor) {

		return ocurrences(string, searchFor)>0;

	}


	public static boolean contains(String string, String searchFor) {

		return ocurrences(string, searchFor)>0;

	}


	public static boolean isQuoted(String string, char...quotes) {

		return string.length()>=2 &&
				string.charAt(0)==quotes[0] &&
				string.charAt(string.length()-1)==quotes[1];

	}


	public static boolean isQuoted(String string, char quote) {

		return isQuoted(string, quote, quote);

	}





	/*
	 * Transformation
	 */
	public static String left(String string, int length) {

		return string.length()<=length ?
				string : string.substring(0, length);

	}


	public static String right(String string, int length) {

		return string.length()<length ?
				string : string.substring(string.length()-length);

	}


	public static String numbers(String string) {

		StringBuilder result=new StringBuilder(string.length());

		final char[] CHARS=string.toCharArray();
		for(int i=0; i<CHARS.length; i++){
			if (CHARS[i]>='0' && CHARS[i]<='9')
				result.append(string.substring(i, i+1));
		}

		return result.toString();

	}


	public static String letters(String string) {

		StringBuilder result=new StringBuilder(string.length());

		final char[] CHARS=string.toCharArray();
		for(int i=0; i<CHARS.length; i++){
			if ((CHARS[i]>='A' && CHARS[i]<='Z') || (CHARS[i]>='a' && CHARS[i]<='z'))
				result.append(string.substring(i, i+1));
		}

		return result.toString();

	}


	public static String chars(String string, int...indices) {

		StringBuilder result=new StringBuilder(string.length());

		for (int i=0; i<indices.length; i++){
			if (indices[i]<string.length())
				result.append(string.charAt(indices[i]));
		}

		return result.toString();

	}


	/** No limit if count < 0 */
	public static String replace(String string, String searchFor, String replaceWith, int count) {

		StringBuilder result=new StringBuilder();

		int index=0;
		int beginIndex=index;
		while((index=string.indexOf(searchFor, index))!=-1 && count!=0){
			result.append(string.substring(beginIndex, index)+replaceWith);
			index+=searchFor.length();
			beginIndex=index;
			count--;
		}result.append(string.substring(beginIndex, string.length()));

		return result.toString();

	}


	public static String replaceFirst(String string, String searchFor, String replaceWith) {

		return replace(string, searchFor, replaceWith, 1);

	}


	public static String replaceAll(String string, String searchFor, String replaceWith) {

		return replace(string, searchFor, replaceWith, -1);

	}


	public static String removeFirst(String string, String searchFor) {

		return replaceFirst(string, searchFor, "");

	}


	public static String removeAll(String string, String searchFor) {

		return replace(string, searchFor, "", -1);

	}


	public static String removeChars(String string, char...searchFor) {

		StringBuilder result=new StringBuilder(string.length());

		final String CHARS=new String(searchFor);
		for(int i=0; i<string.length(); i++){
			char at=string.charAt(i);
			if (ocurrences(CHARS, at)==0) result.append(at);
		}

		return result.toString();

	}


	public static String removeChars(String string, String searchFor) {

		return removeChars(string, searchFor.toCharArray());

	}


	public static String compact(String string) {

		return removeAll(string, " ");

	}


	@Deprecated
	public static String appendIfEmpy(String string, String toAdd) {

		return string.isEmpty() ? toAdd : string;

	}


	@Deprecated
	public static String appendIfNotEmpy(String string, String toAdd) {

		return string.isEmpty() ? string : string+toAdd;

	}


	public static String padLeft(String string, int length, char character) {

		return string.length()>=length ? string :
			replicas(String.valueOf(character), length-string.length())+string;

	}


	public static String padRight(String string, int length, char character) {

		return string.length()>=length ? string :
			string+replicas(String.valueOf(character), length-string.length());

	}


	public static String capitalize(String string) {

		return string.isEmpty() ? string :
			string.substring(0,1).toUpperCase() + string.substring(1);

	}


	public static String uncapitalize(String string) {

		return string.isEmpty() ? string :
			string.substring(0,1).toLowerCase() + string.substring(1);

	}


	/** Ensure the ESCAPE char is escaped! */
	public static String escape(String string) {

		//ensure double backslash
		return string.replace("\\", "\\\\");

	}


	/** Escape and surround with QUOTE chars */
	public static String quote(String string, char...quote) {

		StringBuilder sb=new StringBuilder();

		//start quote
		sb.append(quote.length==0 ? '"' : quote[0]);
		//escape DOUBLE QUOTES!
		sb.append(escape(string).replace("\"", "\\\""));
		//end quote
		sb.append(quote.length==0 ? '"' : quote[quote.length-1]);

		return sb.toString();

	}


	/** Remove surrounded QUOTE chars */
	public static String unquote(String string, char...quotes) {

		return !isQuoted(string, quotes) ? string : string.substring(1, string.length()-1);

	}

	/** Remove surrounded QUOTE chars */
	public static String unquote(String string, char quote) {

		return unquote(string, quote, quote);

	}

	/** Remove surrounded COMMA (") chars */
	public static String unquote(String string) {

		return unquote(string, '\"');

	}


	public static String indent(String text) {

		StringBuilder result=new StringBuilder();

		int count=0;
		for(String line: text.split("\n")) {
			if (line.contains("}")) count--;
			result.append(replicas("\t", count) + line + "\n");
			if (line.contains("{")) count++;
		}

		return result.toString();

	}


	/** Replaces accented characters */
	public static String unaccent(String string) {

	    String normalized=Normalizer.normalize(string, Normalizer.Form.NFKD);
	    if (!normalized.equals(string)) try{
			return new String(DIACRITICS_PATTERN.matcher(normalized).replaceAll("").getBytes("ascii"), "ascii");
			//return new String(normalized.replaceAll("\\p{M}", "").getBytes("ascii"), "ascii");
		}catch(Exception e){}
		return normalized;

	}


	@Deprecated
	public static String[] splitAndTrim(String string, String regex) {

		return ArrayUtils.trim(string.split(regex));

	}


	public static String[] splitFirstIndex(String string, String separator) {

		int index=string.indexOf(separator);

		return index==-1 ? new String[]{string} :
			new String[]{string.substring(0, index), string.substring(index+1)};

	}


	public static String[] splitLastIndex(String string, String separator) {

		int index=string.lastIndexOf(separator);

		return index==-1 ? new String[]{string} :
			new String[]{string.substring(0, index), string.substring(index+1)};

	}


	/** Adapted from JAVA 7 (NO REGEX!) */
	public static String[] split(String string, String searchFor) {

		int beginIndex=0;
		int endIndex=0;
		List<String> list=new ArrayList();
		while((endIndex=string.indexOf(searchFor, beginIndex))!=-1) {
		    list.add(string.substring(beginIndex, endIndex));
		    beginIndex=endIndex+1;
		}// If no match was found, return this
		if (beginIndex==0) return new String[]{string};
		// Add remaining segment
		list.add(string.substring(beginIndex, string.length()));
		// Construct result
		int resultSize=list.size();
		// Avoid last empty element?
		while(resultSize>0 && list.get(resultSize-1).length()==0) resultSize--;
		return list.subList(0, resultSize).toArray(new String[resultSize]);

	}


	public static void main(String[] argvs) {

		String format="%20s";

		System.out.printf(format, "toHex: "); System.out.println(toHex((byte)255));
		System.out.printf(format, "toHexString: "); System.out.println(toHexString((byte)255));
		System.out.printf(format, "unaccent: "); System.out.println(unaccent("口水雞,hello,Ä,Ã,Â,À,Á,ã,â,à,á,č,ć,đ,š,ž"));

		StringBuilder sb=new StringBuilder(".");
		for(char c='a'; c<='z'; c++) sb.append(new char[]{c,'.'});
		String string=sb.toString();
		System.out.printf(format, "STRING: "); System.out.println(string);
		System.out.printf(format, "java7.split: "); System.out.println(Arrays.asList(split(string, ".")));
		System.out.printf(format, "pattern.split: "); System.out.println(Arrays.asList(Pattern.compile("\\.").split(string)));
		System.out.printf(format, "string.split: "); System.out.println(Arrays.asList(string.split("\\.")));
		System.out.printf(format, "replaceAll: "); System.out.println(replaceAll(string, ".", "**"));
		System.out.printf(format, "string.replaceAll: "); System.out.println(string.replaceAll("\\.", "**"));
		System.out.printf(format, "replace: "); System.out.println(replace(string, ".", "**", 0));
		System.out.printf(format, "replace: "); System.out.println(replace(string, ".", "**", 3));
		System.out.printf(format, "replace: "); System.out.println(replace(string, ".", "**", -1));
		System.out.printf(format, "string.replace: "); System.out.println(string.replace(".", "**"));

		int repeat=1000000;
		Chronograph time=new Chronograph().start();
		for(int i=0; i<repeat; i++) Pattern.compile("\\.").split(string);
		System.out.printf(format, "pattern.split: "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) string.split("\\.");
		System.out.printf(format, "string.split: "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) split(string, ".");
		System.out.printf(format, "java7.split: "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) string.replace("z", "**");
		System.out.printf(format, "string.replace: "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) string.replaceAll("z", "**");
		System.out.printf(format, "string.replaceAll: "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) replaceAll(string, "z", "**");
		System.out.printf(format, "replaceAll: "); System.out.println(time);

	}


}