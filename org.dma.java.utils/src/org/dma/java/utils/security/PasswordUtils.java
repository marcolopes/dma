/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

import org.apache.commons.codec.binary.Base64;
import org.dma.java.utils.cipher.BlowfishCipher;
import org.dma.java.utils.string.StringUtils;

public class PasswordUtils {

	/**
	 * @return
	 * A date-based password composed with 4 digits<br>
	 * Format: MMDD<br>
	 * MM=Current MONTH<br>
	 * DD=Current DAY
	 */
	public static String datePassword() {

		Calendar calendar=Calendar.getInstance();
		String month=StringUtils.padLeft(String.valueOf(calendar.get(Calendar.MONTH)+1),2,"0");
		String day=StringUtils.padLeft(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),2,"0");

		return month+day;

	}


	/**
	 * MD5 Password
	 * @return
	 * MD5 digested password encoded in BASE64
	 */
	public static String MD5PasswordEnconde(String password) {

		try{
			MessageDigest md=MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			return new Base64(0).encodeToString(md.digest());

		} catch (NoSuchAlgorithmException e){
			e.printStackTrace();
		}

		return null;

	}


	public static boolean MD5PasswordTest(String encodedPassword, String clearPassword) {

		return encodedPassword.equals(MD5PasswordEnconde(clearPassword));

	}


	/**
	 * Blowfish Password
	 */
	public static String BlowfishPasswordEnconde(String password, String key) {

		BlowfishCipher cipher=new BlowfishCipher(key);
		return cipher.encrypt(password, 0);

	}


	public static String BlowfishPasswordDecode(String password, String key) {

		BlowfishCipher cipher=new BlowfishCipher(key);
		return cipher.decrypt(password.getBytes());

	}


}