/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.cipher;

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

	public static final String BLOWFISH = "Blowfish";
	public static final String ECB_PKCS5Padding = "AES/ECB/PKCS5Padding";

	private final Key key;

	private Cipher cipher;
	private Cipher decipher;

	public CryptoCipher(Key key) {
		this(key, key.getAlgorithm());
	}

	public CryptoCipher(Key key, String transformation) {
		this.key=key;

		try{
			this.cipher=Cipher.getInstance(transformation);
			this.decipher=Cipher.getInstance(transformation);

			cipher.init(Cipher.ENCRYPT_MODE, key);
			decipher.init(Cipher.DECRYPT_MODE, key);

		}catch(NoSuchAlgorithmException e){
			System.out.println(e);
		}catch(NoSuchPaddingException e){
			System.out.println(e);
		}catch(InvalidKeyException e){
			System.out.println(e);
		}catch(Exception e){}
	}


	/**
	 * Encrypts using the initialized ALGORITHM<br>
	 * <b>NOTE: Use alternate method for Strings</b>
	 * <p>
	 * <b>Message is processed as follows:</b><br>
	 * - Encrypt Bytes<br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param messageBytes - the message to encrypt.
	 * @param lineLength - the lenghth of each text line.
	 * 0=no line break
	 */
	public String encrypt(byte[] messageBytes, int lineLength) {
		try{
			// Encrypt Bytes
			byte[] encrypted=cipher.doFinal(messageBytes);
			// Encode Bytes to BASE64
			byte[] base64Bytes=new Base64(lineLength).encode(encrypted);
			// Convert Bytes to String
			return new String(base64Bytes, "UTF8");

		}catch(IllegalBlockSizeException e){
			System.out.println(e);
		}catch(BadPaddingException e){
			System.out.println(e);
		}catch(Exception e){}
		return null;
	}


	/**
	 * Encrypts using the initialized ALGORITHM
	 * <p>
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Encrypt Bytes<br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param message - the message to encrypt.
	 * @param lineLength - the lenghth of each text line.
	 * 0=no line break
	 */
	public String encrypt(String message, int lineLength) {
		try{
			// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");

			return encrypt(messageBytes, lineLength);

		}catch(UnsupportedEncodingException e){
			System.out.println(e);
		}catch(Exception e){}
		return null;
	}


	/**
	 * Decrypts using the initialized ALGORITHM<br>
	 * <b>NOTE: Use alternate method for Strings</b>
	 * <p>
	 * <b>Message is processed as follows:</b><br>
	 * - Decode Bytes from BASE64<br>
	 * - Decrypt Bytes<br>
	 * - Convert Bytes to String (UTF8 charset)
	 *
	 * @param messageBytes - the message to decrypt.
	 * <b>Must be in BASE64</b>
	 */
	public String decrypt(byte[] messageBytes) {
		try{
			// Decode Bytes from BASE64
			byte[] base64Bytes=new Base64(0).decode(messageBytes);
			// Decrypt Bytes
			byte[] decrypted=decipher.doFinal(base64Bytes);
			// Convert Bytes to String
			return new String(decrypted, "UTF8");

		}catch(UnsupportedEncodingException e){
			System.out.println(e);
		}catch(IllegalBlockSizeException e){
			System.out.println(e);
		}catch(BadPaddingException e){
			System.out.println(e);
		}catch(Exception e){}
		return null;
	}


	/**
	 * Decrypts using the initialized ALGORITHM
	 * <p>
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Decode Bytes from BASE64<br>
	 * - Decrypt Bytes<br>
	 * - Convert Bytes to String (UTF8 charset)
	 *
	 * @param message - the message to decrypt.
	 * <b>Must be in BASE64</b>
	 */
	public String decrypt(String message) {
		try{
			// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");

			return decrypt(messageBytes);

		}catch(UnsupportedEncodingException e){
			System.out.println(e);
		}catch(Exception e){}
		return null;
	}


	/*
	 * Getters and setters
	 */
	public Key getKey() {
		return key;
	}


}
