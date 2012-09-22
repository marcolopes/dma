/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache.codec;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
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

		}catch(NoSuchAlgorithmException e){
		}catch(NoSuchPaddingException e){
		}catch(InvalidKeyException e){
			e.printStackTrace();
		}
	}


	/**
	 * Encrypts using the initialized ALGORITHM
	 * <p>
	 * <b>Buffer is processed as follows:</b><br>
	 * - encrypted<br>
	 * - encoded to BASE64<br>
	 *
	 * @param buffer
	 */
	public String encrypt(byte[] buffer) {
		try{
			// Encrypt Bytes
			byte[] encrypted = cipher.doFinal(buffer);

			// Enconde Bytes to Base64 String
			return new Base64().encodeToString(encrypted);

		}catch(IllegalBlockSizeException e){
		}catch(BadPaddingException e){
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * Decrypts using the initialized ALGORITHM
	 * <p>
	 * <b>Buffer is processed as follows:</b><br>
	 * - decoded from BASE64<br>
	 * - decrypted<br>
	 * - converted to UTF8 String
	 *
	 * @param buffer - must be in BASE64
	 */
	public String decrypt(byte[] buffer) {
		try{
			// Decode Base64 String to Bytes
			byte[] bytes = new Base64().decode(buffer);

			// Decrypt Bytes
			byte[] decrypted = decipher.doFinal(bytes);

			// Convert Bytes to UTF8 String
			return new String(decrypted, "UTF8");

		}catch(IllegalBlockSizeException e){
		}catch(BadPaddingException e){
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		return null;
	}


}
