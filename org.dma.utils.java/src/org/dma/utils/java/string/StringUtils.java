/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.string;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Pattern;

import org.dma.utils.java.array.ArrayUtils;
import org.dma.utils.java.array.CollectionUtils;

public class StringUtils {

	public static final Pattern NUMERIC_PATTERN=Pattern.compile("^[0-9]+$");
	public static final Pattern DECIMAL_PATTERN=Pattern.compile("^[0-9[.]]+$");
	public static final Pattern UPPERCASE_PATTERN=Pattern.compile("^[^a-z]+$");

	/*
	 * Conversion
	 */
	public static int val(String string) {

		try{
			return Integer.valueOf(string);

		} catch (NumberFormatException e){}

		return 0;

	}


	public static int num(char character) {

		return character-48;

	}


	public static String toHex(byte b) {
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

		String result="";

		for(int i=0; i<replicas; i++){
			result+=string;
		}

		return result;

	}


	public static String replicate(char character, int replicas) {

		String result="";

		for(int i=0; i<replicas; i++){
			result+=character;
		}

		return result;

	}


	public static String random(String string, int length) {

		char[] chars=new char[length];

		Random random=new Random();
		for (int i=0; i<chars.length; i++){
			chars[i]=string.charAt(random.nextInt(string.length()));
		}

		return new String(chars);

	}


	public static String random(int length) {

		return random("abcdefghijklmnopqrstuvwxyz", length);

	}







	/*
	 * Analysis
	 */
	public static int hashCode(String string) {

		return string==null ? 0 : string.hashCode();

	}


	public static boolean isEmpty(String string) {

		return string==null || string.trim().length()==0;

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
			if (string.startsWith(searchFor[i]))
				return i;
		}

		return -1;

	}


	public static Integer[] indexOf(String string, String searchFor) {

		Collection<Integer> result=new ArrayList();

		int index=0;
		while((index=string.indexOf(searchFor, index))!=-1) {
			result.add(index);
			index+=searchFor.length();
		}

		return CollectionUtils.toArray(result,Integer.class);

	}


	public static int ocurrences(String string, String searchFor) {

		int count=0;

		int index=0;
		while((index=string.indexOf(searchFor, index))!=-1) {
			count++;
			index+=searchFor.length();
		}

		return count;

	}


	public static boolean isQuoted(String string, Character[] quote) {

		return string.length()>=2 &&
			string.startsWith(quote[0].toString()) &&
				string.endsWith(quote[1].toString());

	}


	public static boolean isQuoted(String string, Character quote) {

		return isQuoted(string, new Character[]{quote,quote});

	}








	/*
	 * Transformation
	 */
	public static String trimAll(String string) {

		return remove(string, " ");

	}


	public static String escape(String string) {

		return string.replace("\\","\\\\");

	}


	public static String quote(String string, Character quote) {

		return quote + string.replace("\"","\\\"") + quote;

	}


	public static String quote(String string) {

		return quote(string, '\"');

	}


	public static String unquote(String string, Character quote) {

		return !isQuoted(string, quote) ?
				string : string.substring(1, string.length()-1);

	}


	public static String unquote(String string) {

		return unquote(string, '\"');

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

		return string.length()==0 ? toAdd : string;

	}


	public static String addIfNotEmpy(String string, String toAdd) {

		return string.length()>0 ? string+toAdd : string;

	}


	public static String chars(String string, int[] indices) {

		String string2="";

		for (int i=0; i<indices.length; i++){
			if (indices[i]<string.length())
				string2+=string.charAt(indices[i]);
		}

		return string2;

	}


	public static String concatChars(String string, int[] indices, String separator) {

		return concatChars(chars(string, indices), separator);

	}


	public static String concatChars(String string, String separator) {

		return ArrayUtils.concat(string.toCharArray(), separator);

	}


	public static String replaceChars(String string, String searchFor, char replaceWith) {

		for(int i=0; i<searchFor.length(); i++){
			string=string.replace(searchFor.charAt(i), replaceWith);
		}

		return string;

	}


	public static String replaceFirst(String string, String searchFor, String replaceWith) {

		int index=string.indexOf(searchFor);
		return index==-1 ? string :
			string.substring(0, index) + replaceWith +
				string.substring(index+searchFor.length());

	}


	public static <T> String remove(String string, T[] searchFor) {

		return remove(string, searchFor, "");

	}


	public static <T> String remove(String string, T[] searchFor, String delimiter) {

		for(int i=0; i<searchFor.length; i++){
			string=remove(string, delimiter+searchFor[i]+delimiter);
		}

		return string;

	}


	public static String remove(String string, Character searchFor) {

		return remove(string, searchFor.toString());

	}


	public static String removeChars(String string, String searchFor) {

		for(int i=0; i<searchFor.length(); i++){
			string=remove(string, searchFor.substring(i,i+1));
		}

		return string;

	}


	public static String remove(String string, String searchFor) {

		return string.replace(searchFor, "");

	}


	public static String numbers(String string) {

		String numbers="";

		char[] chars=string.toCharArray();
		for(int i=0; i<chars.length; i++){
			if (chars[i]>='0' && chars[i]<='9')
				numbers+=string.substring(i, i+1);
		}

		return numbers;

	}


	public static String letters(String string) {

		String letters="";

		char[] chars = string.toCharArray();
		for(int i=0; i<chars.length; i++){
			if ((chars[i]>='A' && chars[i]<='Z') || (chars[i]>='a' && chars[i]<='z'))
				letters+=string.substring(i, i+1);
		}

		return letters;

	}


	public static String capitalize(String string) {

		return string.length()==0 ? string :
			string.substring(0,1).toUpperCase()+string.substring(1);

	}


	public static String uncapitalize(String string) {

		return string.length()==0 ? string :
			string.substring(0,1).toLowerCase()+string.substring(1);

	}


	public static String indent(String text) {

		String[] lines=text.split("\n");
		text="";

		int tabCount=0;
		for(int i=0; i<lines.length; i++) {
			if (lines[i].contains("}")) tabCount--;
			text+=replicate("\t", tabCount) + lines[i] + "\n";
			if (lines[i].contains("{")) tabCount++;
		}

		return text;

	}


	/**
	 * Removes accents and illegal characters
	 */
	public static String normalize(String string) {

		final Character[] ILLEGAL_CHARACTERS =
			{'/','\\','`','?','*','<','>','|','\"',':','\n','\r','\t','\0','\f'};
		//decompose accented letters into LETTERS + ACCENTS
		return remove(Normalizer.normalize(string, Normalizer.Form.NFD).
				//remove accents
				replaceAll("\\p{InCombiningDiacriticalMarks}+", ""),
				//remove illegal characters
				ILLEGAL_CHARACTERS);

	}


	public static void main(String[] argvs) {
	}


}