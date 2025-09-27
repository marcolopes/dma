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

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

import org.apache.commons.lang.WordUtils;

import org.dma.java.time.Chronograph;

public class StringUtils {

	/** Numeric digits [0-9] and dot (.) */
	public static final Pattern DECIMAL_PATTERN = Pattern.compile("[0-9[.]]+");
	/** Numeric digits only [0-9] */
	public static final Pattern NUMERIC_PATTERN = Pattern.compile("[0-9]+");
	/** Letter digits [A-Z] and [a-z] */
	public static final Pattern LETTERS_PATTERN = Pattern.compile("[A-Za-z]+");
	/** Uppercase letter digits [A-Z] */
	public static final Pattern UPPERCASE_PATTERN = Pattern.compile("[^a-z]+");
	/** Lowercase letter digits [a-z] */
	public static final Pattern LOWERCASE_PATTERN = Pattern.compile("[^A-Z]+");
	/** Diacritical Marks */
	public static final Pattern DIACRITICS_PATTERN = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

	public static final String DECIMAL_NUMBERS = "0123456789";
	public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String UPPERCASE_LETTERS = LOWERCASE_LETTERS.toUpperCase();
	public static final char[] HEX_DIGITS = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

	/*
	 * Conversion
	 */
	public static int val(String string) {

		try{return Integer.valueOf(string);
		}catch(NumberFormatException e){}

		return 0;

	}


	public static int num(char character) {

		//character-'0' for arabic chars only!
		return Character.getNumericValue(character);

	}


	public static String toHex(byte b) {

		return new String(new char[]{HEX_DIGITS[(b>>4) & 0x0f], HEX_DIGITS[b & 0x0f]});

	}


	/** @see Integer#toHexString */
	public static String toHexString(byte b) {

		String hexString=Integer.toHexString(0xff & b);

		return hexString.length()==1 ? "0"+hexString : hexString;

	}



	/*
	 * Analysis
	 */
	public static boolean isEmpty(String string) {

		return string==null || string.trim().isEmpty();

	}


	/** Is a 0 or a 1 */
	public static boolean isLogical(String string) {

		return string.equals("0") || string.equals("1");

	}


	/** Is a DECIMAL value (ex: "1.23") */
	public static boolean isDecimal(String string) {

		return !isEmpty(string) && ocurrences(string, '.')<=1 &&
				DECIMAL_PATTERN.matcher(string).matches();

	}


	/** Contains only DIGIT characters */
	public static boolean isNumeric(String string) {

		for(int i=0; i<string.length(); i++){
			if (!Character.isDigit(string.charAt(i))) return false;
		}return !isEmpty(string);
		//return NUMERIC_PATTERN.matcher(string).matches();

	}


	/** Contains only LETTER characters */
	public static boolean isLetters(String string) {

		for(int i=0; i<string.length(); i++){
			if (!Character.isLetter(string.charAt(i))) return false;
		}return !isEmpty(string);
		//return LETTERS_PATTERN.matcher(string).matches();

	}


	/** Does NOT contain LOWERcase characters */
	public static boolean isUppercase(String string) {

		for(int i=0; i<string.length(); i++){
			if (Character.isLowerCase(string.charAt(i))) return false;
		}return !isEmpty(string);
		//return UPPERCASE_PATTERN.matcher(string).matches();

	}


	/** Does NOT contain UPPERcase characters */
	public static boolean isLowercase(String string) {

		for(int i=0; i<string.length(); i++){
			if (Character.isUpperCase(string.charAt(i))) return false;
		}return !isEmpty(string);
		//return LOWERCASE_PATTERN.matcher(string).matches();

	}


	/** Is surrounded with QUOTE chars (default=COMMA) */
	public static boolean isQuoted(String string, char...quote) {

		if(quote.length==0) return isQuoted(string, '"');

		return string.length()>=2 &&
				string.charAt(0)==quote[0] &&
				string.charAt(string.length()-1)==quote[quote.length-1];

	}


	public static Collection<Integer> indexOf(String string, String searchFor) {

		Collection<Integer> col=new ArrayList();
		int index=0;
		while((index=string.indexOf(searchFor, index))!=-1) {
			col.add(index);
			index+=searchFor.length();
		}return col;

	}


	public static int ocurrences(String string, String searchFor) {

		return indexOf(string, searchFor).size();

	}


	public static int ocurrences(String string, char...searchFor) {

		int count=0;
		for(int i=0; i<string.length(); i++){
			for(char c: searchFor){
				if(string.charAt(i)==c) count++;
			}
		}return count;

	}


	public static boolean contains(String string, char...searchFor) {

		return ocurrences(string, searchFor)>0;

	}


	public static boolean contains(String string, String searchFor) {

		return ocurrences(string, searchFor)>0;

	}


	public static String left(String string, int length) {

		return string.length()<=length ? string : string.substring(0, length);

	}


	public static String right(String string, int length) {

		return string.length()<length ? string : string.substring(string.length()-length);

	}


	public static String chars(String string, int...indices) {

		StringBuilder result=new StringBuilder(string.length());
		for(int i=0; i<indices.length; i++){
			if(indices[i]<string.length())
				result.append(string.charAt(indices[i]));
		}return result.toString();

	}


	public static String numbers(String string) {

		StringBuilder result=new StringBuilder(string.length());
		final char[] CHARS=string.toCharArray();
		for(int i=0; i<CHARS.length; i++){
			if(CHARS[i]>='0' && CHARS[i]<='9') result.append(string.substring(i, i+1));
		}return result.toString();

	}


	public static String letters(String string) {

		StringBuilder result=new StringBuilder(string.length());
		final char[] CHARS=string.toCharArray();
		for(int i=0; i<CHARS.length; i++){
			if((CHARS[i]>='A' && CHARS[i]<='Z') || (CHARS[i]>='a' && CHARS[i]<='z'))
				result.append(string.substring(i, i+1));
		}return result.toString();

	}



	/*
	 * Creation
	 */
	public static String replicas(String string, int count) {

		StringBuilder result=new StringBuilder(count);
		for(int i=0; i<count; i++){
			result.append(string);
		}return result.toString();

	}



	/*
	 * Transformation
	 */
	public static String capitalize(String string) {

		return string.isEmpty() ? string : string.substring(0,1).toUpperCase() + string.substring(1);

	}


	public static String uncapitalize(String string) {

		return string.isEmpty() ? string : string.substring(0,1).toLowerCase() + string.substring(1);

	}


	/** Replaces accented characters */
	public static String unaccent(String string) {

	    String normalized=Normalizer.normalize(string, Normalizer.Form.NFKD);
	    if(!normalized.equals(string)) try{
			return new String(DIACRITICS_PATTERN.matcher(normalized).replaceAll("").getBytes("ascii"), "ascii");
			//return new String(normalized.replaceAll("\\p{M}", "").getBytes("ascii"), "ascii");
		}catch(Exception e){}
		return normalized;

	}


	/** Adds "escapes" to all the chars (default=BACKSLASH) */
	public static String escape(String string, char...searchFor) {

		if(searchFor.length==0) return escape(string, '\\');

		if(ocurrences(string, searchFor)==0) return string;

		StringBuilder result=new StringBuilder();
		for(int i=0; i<string.length(); i++) {
			char charAt=string.charAt(i);
			for(char c: searchFor){
				if(c==charAt) result.append('\\');
			}result.append(charAt);
		}return result.toString();

	}


	/** Removes "escapes" from all the chars (default=BACKSLASH) */
	public static String unescape(String string, char...searchFor) {

		if(searchFor.length==0) return unescape(string, '\\');

		if(ocurrences(string, searchFor)==0) return string;

		for(char c: searchFor){
			string=replaceAll(string, "\\"+c, String.valueOf(c));
		}return string;

	}


	/** Surrounds with QUOTE chars (default=COMMA) */
	public static String quote(String string, char...quote) {

		if(quote.length==0) return quote(string, '"');

		return new StringBuilder().
				append(quote[0]).
				append(string).
				append(quote[quote.length-1]).toString();

	}


	/** Removes surrounded QUOTE chars (default=COMMA) */
	public static String unquote(String string, char...quote) {

		if(quote.length==0) return unquote(string, '"');

		return !isQuoted(string, quote) ? string : string.substring(1, string.length()-1);

	}


	@Deprecated
	public static String indent(String text) {

		StringBuilder result=new StringBuilder();
		int count=0;
		for(String line: text.split("\n")) {
			if(line.contains("}")) count--;
			result.append(replicas("\t", count) + line + "\n");
			if(line.contains("{")) count++;
		}return result.toString();

	}


	/** Inserts chars on the left */
	public static String padLeft(String string, int length, char character) {

		return string.length()>=length ? string :
			replicas(String.valueOf(character), length-string.length()) + string;

	}


	/** Inserts chars on the right */
	public static String padRight(String string, int length, char character) {

		return string.length()>=length ? string :
			string + replicas(String.valueOf(character), length-string.length());

	}


	public static String center(String string, int size, char character) {

		int count=size-string.length();

		return count>0 ? padRight(padLeft(string, string.length()+count/2, character), size, character) : string;

	}


	public static String center(String string, int size) {

		return center(string, size, ' ');

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

		return replaceAll(string, searchFor, "");

	}


	/** Removes spaces from string */
	public static String compact(String string) {

		return removeAll(string, " ");

	}


	public static String removeAll(String string, char...searchFor) {

		StringBuilder result=new StringBuilder(string.length());
		final String CHARS=new String(searchFor);
		for(int i=0; i<string.length(); i++){
			char at=string.charAt(i);
			if(ocurrences(CHARS, at)==0) result.append(at);
		}return result.toString();

	}


	/** Splits string (NO regex) */
	public static StringList splitFirst(String string, String searchFor) {

		int index=string.indexOf(searchFor);
		return index==-1 ? new StringList(string) :
			new StringList(string.substring(0, index), string.substring(index+1));

	}


	/** Splits string (NO regex) */
	public static StringList splitLast(String string, String searchFor) {

		int index=string.lastIndexOf(searchFor);
		return index==-1 ? new StringList(string) :
			new StringList(string.substring(0, index), string.substring(index+1));

	}


	/** Adapted from JAVA 7 (NO REGEX!) */
	public static StringList split(String string, String searchFor) {

		int beginIndex=0;
		int endIndex=0;
		StringList list=new StringList();
		while((endIndex=string.indexOf(searchFor, beginIndex))!=-1){
		    list.add(string.substring(beginIndex, endIndex));
		    beginIndex=endIndex+1;
		}// If no match was found, return this
		if(beginIndex==0) return new StringList(string);
		// Add remaining segment
		list.add(string.substring(beginIndex, string.length()));
		// Construct result
		int resultSize=list.size();
		// Avoid last empty element?
		while(resultSize>0 && list.get(resultSize-1).length()==0) resultSize--;
		return list.subList(0, resultSize);

	}


	/** @see WordUtils#wrap(String, int, String, boolean) */
	public static StringList wrap(String string, int wrapLength, String newLineStr) {

		return split(WordUtils.wrap(string, wrapLength, newLineStr, true), newLineStr);

	}


	/** Splits string into words */
	public static StringList words(String string) {

		return split(string, " ");

	}


	public static void main(String[] args) {

		String format="%22s";

		System.out.printf(format, "toHex: "); System.out.println(toHex((byte)255));
		System.out.printf(format, "toHexString: "); System.out.println(toHexString((byte)255));
		System.out.println();

		/*StringBuilder sb=new StringBuilder(".");
		for(char c='a'; c<='z'; c++) sb.append(new char[]{c,'.'});
		String string=sb.toString();*/

		String string="口.水.雞.hello.Ä.Ã.Â.À.Á.ã.â.à.á.č.ć.đ.š.ž";
		System.out.printf(format, "quote(): "); System.out.println(quote(string, '{','}'));
		System.out.printf(format, "removeAccents(): "); System.out.println(unaccent(string));
		System.out.println();
		System.out.printf(format, "Pattern.split: "); System.out.println(Arrays.asList(Pattern.compile("\\.").split(string)));
		System.out.printf(format, "String.split: "); System.out.println(Arrays.asList(string.split("\\.")));
		System.out.printf(format, "splitFirst(): "); System.out.println(splitFirst(string, ".").concat(" "));
		System.out.printf(format, "splitLast(): "); System.out.println(splitLast(string, ".").concat(" "));
		System.out.printf(format, "split(): "); System.out.println(split(string, ".").concat(" "));
		System.out.printf(format, "words(): "); System.out.println(words("The quick brown fox jumps over the lazy dog").concat(" "));
		System.out.println();
		System.out.printf(format, "String.replaceAll: "); System.out.println(string.replaceAll("\\.", "**"));
		System.out.printf(format, "String.replace: "); System.out.println(string.replace(".", "**"));
		System.out.printf(format, "replaceAll(): "); System.out.println(replaceAll(string, ".", "**"));
		System.out.printf(format, "replace(-2): "); System.out.println(replace(string, ".", "**", -1));
		System.out.printf(format, "replace(2): "); System.out.println(replace(string, ".", "**", 2));
		System.out.printf(format, "replace(0): "); System.out.println(replace(string, ".", "**", 0));
		System.out.println();

		int repeat=1000000;
		Chronograph time=new Chronograph().start();
		for(int i=0; i<repeat; i++) Pattern.compile("\\.").split(string);
		System.out.printf(format, "Pattern.split(): "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) string.split("\\.");
		System.out.printf(format, "String.split(): "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) split(string, ".");
		System.out.printf(format, "split(): "); System.out.println(time);
		time.reset();

		System.out.println();
		for(int i=0; i<repeat; i++) string.replaceAll("z", "**");
		System.out.printf(format, "String.replaceAll(): "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) string.replace("z", "**");
		System.out.printf(format, "String.replace(): "); System.out.println(time);
		time.reset();
		for(int i=0; i<repeat; i++) replaceAll(string, "z", "**");
		System.out.printf(format, "replaceAll(): "); System.out.println(time);

	}


}