/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache.codec;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class CryptoCipher {

	public static final String BLOWFISH = "Blowfish";

	private Cipher cipher;
	private Cipher decipher;

	public CryptoCipher(String key, String algotithm) {
		try{
			this.cipher = Cipher.getInstance(algotithm);
			this.decipher = Cipher.getInstance(algotithm);

			SecretKeySpec secretkey = new SecretKeySpec(key.getBytes(), algotithm);

			cipher.init(Cipher.ENCRYPT_MODE, secretkey);
			decipher.init(Cipher.DECRYPT_MODE, secretkey);

		} catch (Exception e){
			e.printStackTrace();
		}
	}


	/**
	 * Encrypts a UTF8 text into a BASE64 text
	 * using the initialized ALGORITHM
	 */
	public String encrypt(String text) {
		try{
			// Convert UTF8 String to Bytes
			byte[] bytes = text.getBytes("UTF8");

			// Encrypt Bytes
			byte[] encrypted = cipher.doFinal(bytes);

			// Enconde Bytes to Base64 String
			return new Base64().encodeToString(encrypted);

		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * Decrypts BASE64 text into a UTF8 text
	 * using the initialized ALGORITHM
	 */
	public String decrypt(String text) {
		try{
			// Decode Base64 String to Bytes
			byte[] bytes = new Base64().decode(text);

			// Decrypt Bytes
			byte[] decrypted = decipher.doFinal(bytes);

			// Convert Bytes to UTF8 String
			return new String(decrypted, "UTF8");

		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}


}
