/*******************************************************************************
 * 2008-2016 Public Domain
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
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class CryptoCipher {

	/**
	 * https://docs.oracle.com/javase/7/docs/api/javax/crypto/Cipher.html
	 */
	public enum CIPHERS {

		AES_CBC ("AES", "CBC", 128),
		AES_CBC_PKCS5 ("AES", "CBC", "PKCS5Padding", 128),
		AES_ECB ("AES", "ECB", 128),
		AES_ECB_PKCS5 ("AES", "ECB", "PKCS5Padding", 128),
		DES_CBC ("DES", "CBC", 56),
		DES_CBC_PKCS5 ("DES", "CBC", "PKCS5Padding", 56),
		DES_ECB ("DES", "ECB", 56),
		DES_ECB_PKCS5 ("DES", "ECB", "PKCS5Padding", 56),
		DESede_CBC ("DESede", "CBC", 168),
		DESede_CBC_PKCS5 ("DESede", "CBC", "PKCS5Padding", 168),
		DESede_ECB ("DESede", "ECB", 168),
		DESede_ECB_PKCS5 ("DESede", "ECB", "PKCS5Padding", 168),
		RSA_ECB_PKCS1 ("RSA", "ECB", "PKCS1Padding", 1024, 2048),
		RSA_ECB_OAEPWithSHA_1AndMGF1 ("RSA", "ECB", "OAEPWithSHA-1AndMGF1Padding", 1024, 2048),
		RSA_ECB_OAEPWithSHA_256AndMGF1 ("RSA", "ECB", "OAEPWithSHA-256AndMGF1Padding", 1024, 2048);

		public final String algorithm, mode, padding, transformation;
		public final int[] keysize;

		private CIPHERS(String algorithm, String mode, int...keysize) {
			this(algorithm, mode, "NoPadding", keysize);
		}

		private CIPHERS(String algorithm, String mode, String padding, int...keysize) {
			this.algorithm=algorithm;
			this.mode=mode;
			this.padding=padding;
			this.transformation=algorithm+"/"+mode+"/"+padding;
			this.keysize=keysize;
		}

		/** MAX key size */
		public int keySize() {
			return keysize[keysize.length-1];
		}

	}

	private Cipher cipher;
	private Cipher decipher;

	private final Key key;

	public CryptoCipher(byte[] key, CIPHERS cipher) {
		this(key, cipher.algorithm, cipher.transformation);
	}

	public CryptoCipher(byte[] key, String algorithm, String transformation) {
		this(new SecretKeySpec(key, algorithm), transformation);
	}

	/** transformation = algorithm */
	public CryptoCipher(byte[] key, String algorithm) {
		this(new SecretKeySpec(key, algorithm));
	}

	/** transformation = algorithm */
	public CryptoCipher(Key key) {
		this(key, key.getAlgorithm());
	}

	public CryptoCipher(Key key, CIPHERS cipher) {
		this(key, cipher.transformation);
	}

	public CryptoCipher(Key key, String transformation) {
		this.key=key;

		try{
			cipher=Cipher.getInstance(transformation);
			cipher.init(Cipher.ENCRYPT_MODE, key);

			decipher=Cipher.getInstance(transformation);
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
