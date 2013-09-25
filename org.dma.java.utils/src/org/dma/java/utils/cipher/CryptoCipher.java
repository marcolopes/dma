/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.cipher;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.binary.Base64;

public class CryptoCipher {

	private Cipher cipher;
	private Cipher decipher;

	private Key key;

	public CryptoCipher(Key key) {
		this(key, key.getAlgorithm());
	}

	public CryptoCipher(Key key, String transformation) {
		try{
			this.key = key;
			this.cipher = Cipher.getInstance(transformation);
			this.decipher = Cipher.getInstance(transformation);

			cipher.init(Cipher.ENCRYPT_MODE, key);
			decipher.init(Cipher.DECRYPT_MODE, key);

		}catch (NoSuchAlgorithmException e){
			System.out.println(e);
		}catch (NoSuchPaddingException e){
			System.out.println(e);
		}catch (InvalidKeyException e){
			System.out.println(e);
		}catch (Exception e){
			e.printStackTrace();
		}
	}


	/**
	 * Encrypts using the initialized ALGORITHM<br>
	 * <p>
	 * <b>Message is processed as follows:</b><br>
	 * - encrypted<br>
	 * - encoded to BASE64<br>
	 *
	 * @param messageBytes - the message to encrypt.
	 * <b>Use alternate method to encrypt Strings</b>
	 * @param lineLength - the lenghth of each text line.
	 * 0 = no line break
	 */
	public String encrypt(byte[] messageBytes, int lineLength) {
		try{
			// Encrypt Bytes
			byte[] encrypted = cipher.doFinal(messageBytes);
			// Enconde Bytes to Base64 String
			return new Base64(lineLength).encodeToString(encrypted);

		}catch (IllegalBlockSizeException e){
			System.out.println(e);
		}catch (BadPaddingException e){
			System.out.println(e);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * Encrypts using the initialized ALGORITHM
	 * <p>
	 * <b>Message is processed as follows:</b><br>
	 * - converted to UTF8 array<br>
	 * - encrypted<br>
	 * - encoded to BASE64<br>
	 *
	 * @param message - the message to encrypt.
	 * @param lineLength - the lenghth of each text line.
	 * 0 = no line break
	 */
	public String encrypt(String message, int lineLength) {
		try{
			// Convert String to UTF8 Array
			byte[] messageBytes = message.getBytes("UTF8");
			// Encrypt Bytes
			byte[] encrypted = cipher.doFinal(messageBytes);
			// Enconde Bytes to Base64 String
			return new Base64(lineLength).encodeToString(encrypted);

		}catch (UnsupportedEncodingException e){
			System.out.println(e);
		}catch (IllegalBlockSizeException e){
			System.out.println(e);
		}catch (BadPaddingException e){
			System.out.println(e);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * Decrypts using the initialized ALGORITHM
	 * <p>
	 * <b>Message is processed as follows:</b><br>
	 * - decoded from BASE64<br>
	 * - decrypted<br>
	 * - converted to UTF8 String
	 *
	 * @param messageBytes - the message to decrypt.
	 * <b>Must be in BASE64</b>
	 */
	public String decrypt(byte[] messageBytes) {
		try{
			// Decode Base64 String to Bytes
			byte[] bytes = new Base64(0).decode(messageBytes);
			// Decrypt Bytes
			byte[] decrypted = decipher.doFinal(bytes);
			// Convert Bytes to UTF8 String
			return new String(decrypted, "UTF8");

		}catch (UnsupportedEncodingException e){
			System.out.println(e);
		}catch (IllegalBlockSizeException e){
			System.out.println(e);
		}catch (BadPaddingException e){
			System.out.println(e);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}


	/*
	 * Getters and setters
	 */
	public Key getKey() {
		return key;
	}


}
