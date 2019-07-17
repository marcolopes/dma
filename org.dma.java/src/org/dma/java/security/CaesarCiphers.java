/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.security;

import org.dma.java.util.Debug;

public class CaesarCiphers {

	private final String message;

	public CaesarCiphers(String message) {
		this.message=message;
	}


	/**
	 * rot-13 is nothing more than a caesar cypher
	 * that involves only the alphabetical characters
	 * and uses a step of 13.
	 */
	public String rot13() {

		StringBuilder result=new StringBuilder() ;

		for(char c: message.toCharArray()) {
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
	public String rot47() {

		StringBuilder result=new StringBuilder() ;

		for(char c: message.toCharArray()){
			result.append(c += //avoids cast to char
					(c >= '!' && c <= 'O' ? 47 :
						(c >= 'P' && c <= '~' ? -47 : 0)));
		}

		return result.toString();

	}


	public static void main(String[] argvs) {

		String message="The quick brown fox jumps over the lazy dog.";
		System.out.println("PLAIN: "+message);

		try{
			CaesarCiphers cipher=new CaesarCiphers(message);
			System.out.println("ROT13: "+cipher.rot13());
			System.out.println("ROT13: "+new CaesarCiphers(cipher.rot13()).rot13());

			System.out.println("ROT47: "+cipher.rot47());
			System.out.println("ROT47: "+new CaesarCiphers(cipher.rot47()).rot47());

		}catch(Exception e){
			Debug.err(e);
		}

	}


}