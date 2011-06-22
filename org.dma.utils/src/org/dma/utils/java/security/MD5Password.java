/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Password {

	public static String encondePassword(String password) {

		try {
			MessageDigest md=MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			//convert digest into readable format
			return binaryToReadable(md.digest());
			//return ArrayUtils.toHex(md.digest());

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return null;

	}


	public static boolean testPassword(String clearPassword, String encodedPassword) {

		String encodedTestPassword = MD5Password.encondePassword(clearPassword);
		return encodedTestPassword.equals(encodedPassword);

	}


	private static String binaryToReadable(byte in[]) {

		String pseudo[]={ "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
			"A", "B", "C", "D", "E", "F"};

		String out="";
		for(int i=0; i<in.length; i++) {
			out += pseudo[0] + pseudo[in[i] & 0x0F];
		}
		return out;
	}


	//REMOVE USERS: Implementado de forma simplificada
	/*
	 * Convert a byte[] array to readable string format. This makes the "hex" readable!
	 * @return result String buffer in String format
	 * @param in byte[] buffer to convert to string format
	 */
	private static String binaryToHexString(byte in[]) {

		if (in == null || in.length <= 0)
			return null;

		String pseudo[] = {
			"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
			"A", "B", "C", "D", "E", "F"};
		StringBuffer out = new StringBuffer(in.length * 2);

		byte ch = 0x00;
		int i = 0;
		while (i < in.length) {
			//Strip off high nibble ch = (byte) (ch >>> 4);
			ch = (byte) (in[i] & 0xF0);
			//shift the bits down
			ch = (byte) (ch & 0x0F);
			//must do this is high order bit is on!
			out.append(pseudo[ch]);
			//convert the nibble to a String Character
			ch = (byte) (in[i] & 0x0F);
			//Strip off low nibble
			out.append(pseudo[ch]);
			//convert the nibble to a String Character
			i++;
		}
		return new String(out);
	}


}
