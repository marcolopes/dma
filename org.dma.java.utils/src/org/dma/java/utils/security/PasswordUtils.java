/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

import org.dma.java.utils.string.StringUtils;

public final class PasswordUtils {

	/**
	 * <b>FOR DISCUSSION PURPOSES ONLY!</b>
	 * Convert a byte[] array to readable string format.
	 * This makes the "hex" readable!
	 * @return result String buffer in String format
	 * @param in byte[] buffer to convert to string format
	 */
	@Deprecated
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


	/**
	 * This was written for compatibility ONLY!<br>
	 * Original method should convert the byte array to HEX.<br>
	 * Please use ArrayUtils.toHex on new implementations
	 */
	@Deprecated
	private static String binaryToReadable(byte in[]) {

		String pseudo[]={
			"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
			"A", "B", "C", "D", "E", "F"};

		String out="";
		for(int i=0; i<in.length; i++) {
			out += pseudo[0] + pseudo[in[i] & 0x0F];
		}

		return out;

	}


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
	 * MD5 Password<br>
	 * REPLACE deprecated return method for new implementations
	 */
	public static String MD5PasswordEnconde(String password) {

		try{
			MessageDigest md=MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			return /*ArrayUtils.toHex(md.digest())*/
					binaryToReadable(md.digest());

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