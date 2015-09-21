/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.security;

import java.util.Calendar;

import org.dma.java.util.StringUtils;

public class PasswordUtils {

	/**
	 * @return
	 * A 4 digit date-based password (MMDD)<br>
	 * MM=Current MONTH<br>
	 * DD=Current DAY
	 */
	public static String datePassword() {

		Calendar calendar=Calendar.getInstance();
		String month=StringUtils.padLeft(String.valueOf(calendar.get(Calendar.MONTH)+1),2,'0');
		String day=StringUtils.padLeft(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),2,'0');

		return month+day;

	}


	/**
	 * rot-13 is nothing more than a caesar cypher
	 * that involves only the alphabetical characters
	 * and uses a step of 13.
	 */
	public static String rot13(String string) {

		StringBuilder result=new StringBuilder() ;

		for(char c: string.toCharArray()) {
			char lc = Character.toLowerCase(c);
			result.append(c += //avoids cast to char
					(lc >= 'a' && lc <= 'm' ? 13 :
						(lc >= 'n' && lc <= 'z' ? -13 : 0)));
		}

		return result.toString();

	}


	/**
	 *  rot-47 rotates all characters
	 *  from "!" (the exclamation mark, ASCII code 33)
	 *  to "~" (the tilde, ASCII code 126).
	 *  Its advantage is that it also scrambles all
	 *  the numerals and quite a few punctuation marks
	 *  and special characters besides the plain letters.
	 */
	public static String rot47(String string) {

		StringBuilder result=new StringBuilder() ;

		for(char c: string.toCharArray()){
			result.append(c += //avoids cast to char
					(c >= '!' && c <= 'O' ? 47 :
						(c >= 'P' && c <= '~' ? -47 : 0)));
		}

		return result.toString();

	}


	public static void main(String[] argvs) {

		String message = "The quick brown fox jumps over the lazy dog.";
		System.out.println("PLAIN: "+message);

		try{
			String rot13=rot13(message);
			System.out.println("ROT13: "+rot13);
			System.out.println("ROT13: "+rot13(rot13));

			String rot47=rot47(message);
			System.out.println("ROT47: "+rot47);
			System.out.println("ROT47: "+rot47(rot47));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}