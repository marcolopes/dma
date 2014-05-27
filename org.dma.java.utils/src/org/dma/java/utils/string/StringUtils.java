/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.string;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import org.dma.java.utils.array.ArrayUtils;
import org.dma.java.utils.timedate.TimeChronograph;

public class StringUtils {

	public static final Pattern NUMERIC_PATTERN = Pattern.compile("^[0-9]+$");
	public static final Pattern DECIMAL_PATTERN = Pattern.compile("^[0-9[.]]+$");
	public static final Pattern UPPERCASE_PATTERN = Pattern.compile("^[^a-z]+$");

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

		//return Integer.toString(b, 16);
		char[] HEX_DIGIT = {
			'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		char[] array = {HEX_DIGIT[(b >> 4) & 0x0f], HEX_DIGIT[b & 0x0f]};

		return new String(array);

	}





	/*
	 * Creation
	 */
	public static String replicate(String string, int replicas) {

		StringBuilder result=new StringBuilder();

		for(int i=0; i<replicas; i++){
			result.append(string);
		}

		return result.toString();

	}


	public static String replicate(char character, int replicas) {

		StringBuilder result=new StringBuilder();

		for(int i=0; i<replicas; i++){
			result.append(character);
		}

		return result.toString();

	}


	public static String random(String string, int length) {

		char[] chars=new char[length];

		Random random=new Random();
		for (int i=0; i<chars.length; i++){
			chars[i]=string.charAt(random.nextInt(string.length()));
		}

		return new String(chars);

	}


	public static String randomLetters(int length) {

		return random("abcdefghijklmnopqrstuvwxyz", length);

	}


	public static String randomNumbers(int length) {

		return random("0123456789", length);

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


	public static boolean isUppercase(String string) {

		return UPPERCASE_PATTERN.matcher(string).matches();

	}


	public static int startsWith(String string, String[] searchFor) {

		for(int i=0; i<searchFor.length; i++){
			if (string.startsWith(searchFor[i])) return i;
		}

		return -1;

	}


	public static List<Integer> indexOf(String string, String searchFor) {

		List<Integer> result=new ArrayList();

		int index=0;
		while((index=string.indexOf(searchFor, index))!=-1) {
			result.add(index);
			index+=searchFor.length();
		}

		return result;

	}


	public static int ocurrences(String string, String searchFor) {

		int count=0;

		int index=0;
		while((index=string.indexOf(searchFor, index))!=-1) {
			index+=searchFor.length();
			count++;
		}

		return count;

	}


	public static boolean isQuoted(String string, char...quotes) {

		return quotes.length>=2 &&
				string.length()>=2 &&
				string.startsWith(String.valueOf(quotes[0])) &&
				string.endsWith(String.valueOf(quotes[1]));

	}


	public static boolean isQuoted(String string, char quote) {

		return isQuoted(string, quote, quote);

	}





	/*
	 * Transformation
	 */
	public static String trimAll(String string) {

		return remove(string, " ");

	}


	public static String[] trim(String string, String separator) {

		return ArrayUtils.trim(string.split(separator));

	}


	/** Ensure the ESCAPE (\) char is escaped! */
	public static String escape(String string) {

		return string.replace("\\","\\\\");

	}


	/** Escape and surround with QUOTE chars */
	public static String quote(String string, char quote) {

		return quote + escape(string).replace("\"","\\\"") + quote;

	}


	/** Escape and surround with COMMA (") chars */
	public static String quote(String string) {

		return quote(string, '\"');

	}


	/** Remove any surrounded QUOTE chars */
	public static String unquote(String string, char quote) {

		return !isQuoted(string, quote) ?
				string : string.substring(1, string.length()-1);

	}

	/** Remove any surrounded COMMA (") chars */
	public static String unquote(String string) {

		return unquote(string, '\"');

	}


	public static String capitalize(String string) {

		return string.isEmpty() ? string :
			string.substring(0,1).toUpperCase()+string.substring(1);

	}


	public static String uncapitalize(String string) {

		return string.isEmpty() ? string :
			string.substring(0,1).toLowerCase()+string.substring(1);

	}


	public static String numbers(String string) {

		StringBuilder result=new StringBuilder();

		char[] chars=string.toCharArray();
		for(int i=0; i<chars.length; i++){
			if (chars[i]>='0' && chars[i]<='9')
				result.append(string.substring(i, i+1));
		}

		return result.toString();

	}


	public static String letters(String string) {

		StringBuilder result=new StringBuilder();

		char[] chars = string.toCharArray();
		for(int i=0; i<chars.length; i++){
			if ((chars[i]>='A' && chars[i]<='Z') || (chars[i]>='a' && chars[i]<='z'))
				result.append(string.substring(i, i+1));
		}

		return result.toString();

	}


	public static String chars(String string, int...indices) {

		StringBuilder result=new StringBuilder();

		for (int i=0; i<indices.length; i++){
			if (indices[i]<string.length())
				result.append(string.charAt(indices[i]));
		}

		return result.toString();

	}


	public static String left(String string, int lenght) {

		return string.length()<=lenght ?
				string : string.substring(0,lenght);

	}


	public static String right(String string, int lenght) {

		return string.length()<lenght ?
				string : string.substring(string.length()-lenght);

	}


	public static String padLeft(String string, int lenght, String character) {

		return string.length()>=lenght ?
				string : replicate(character, lenght-string.length())+string;

	}


	public static String padRight(String string, int lenght, String character) {

		return string.length()>=lenght ?
				string : string+replicate(character, lenght-string.length());

	}


	public static String addIfEmpy(String string, String toAdd) {

		return string.isEmpty() ? toAdd : string;

	}


	public static String addIfNotEmpy(String string, String toAdd) {

		return string.isEmpty() ? string : string+toAdd;

	}


	public static String remove(String string, String searchFor) {

		return string.replace(searchFor, "");

	}


	public static String remove(String string, char searchFor) {

		return remove(string, String.valueOf(searchFor));

	}


	public static String remove(String string, char[] searchFor) {

		for(int i=0; i<searchFor.length; i++){
			string=remove(string, searchFor[i]);
		}

		return string;

	}


	public static String removeChars(String string, String searchFor) {

		for(int i=0; i<searchFor.length(); i++){
			string=remove(string, searchFor.charAt(i));
		}

		return string;

	}


	public static String replaceFirst(String string, String searchFor, String replaceWith) {

		int index=string.indexOf(searchFor);
		return index==-1 ? string :
			string.substring(0, index) + replaceWith +
				string.substring(index+searchFor.length());

	}


	public static String removeFirst(String string, String searchFor) {

		return replaceFirst(string, searchFor, "");

	}


	public static String indent(String text) {

		String[] lines=text.split("\n");
		StringBuilder result=new StringBuilder();

		int tabCount=0;
		for(int i=0; i<lines.length; i++) {
			if (lines[i].contains("}")) tabCount--;
			result.append(replicate("\t", tabCount) + lines[i] + "\n");
			if (lines[i].contains("{")) tabCount++;
		}

		return result.toString();

	}


	/** Removes accents and illegal characters */
	public static String normalize(String string) {

		final char[] ILLEGAL_CHARS =
			{'/','\\','`','?','*','<','>','|','\"',':','\n','\r','\t','\0','\f'};
		//decompose accented letters into LETTERS + ACCENTS
		return remove(Normalizer.normalize(string, Normalizer.Form.NFD).
				//remove accents
				replaceAll("\\p{InCombiningDiacriticalMarks}+", ""),
				//remove illegal characters
				ILLEGAL_CHARS);

	}


	/** Adapted from JAVA 7 native String split */
	public static String[] fastSplit(String string, String searchFor) {

		int beginIndex=0;
		int endIndex=0;
		List<String> list=new ArrayList();
		while((endIndex=string.indexOf(searchFor, beginIndex))!=-1) {
		    list.add(string.substring(beginIndex, endIndex));
		    beginIndex=endIndex+1;
		}
		// If no match was found, return this
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

		String string=".a.b.c.";
		int repeat=1000000;
		TimeChronograph time=new TimeChronograph();

		time.start();
		System.out.println(Arrays.asList(string.split("\\.")));
		for(int i=0; i<repeat; i++) string.split("\\.");
		time.stop();
		System.out.println(time);

		time.reset();
		time.start();
		System.out.println(Arrays.asList(fastSplit(string, ".")));
		for(int i=0; i<repeat; i++) fastSplit(string, ".");
		time.stop();
		System.out.println(time);

	}


}