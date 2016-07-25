/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.cipher;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
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

		public final String algorithm, mode, padding;
		/** algorithm/mode/padding */
		public final String transformation;
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

		public SecretKey generateKey(int keySize) {
			try{
				KeyGenerator generator=KeyGenerator.getInstance(algorithm);
				generator.init(keySize);
				return generator.generateKey();

			}catch(Exception e){
				System.out.println(e);
			}
			return null;
		}

	}

	private final Key key;

	private Cipher cipher;
	private Cipher decipher;

	public CryptoCipher(byte[] key, CIPHERS cipher) {
		this(key, cipher.algorithm, cipher.transformation);
	}

	public CryptoCipher(byte[] key, String algorithm, String transformation) {
		this(new SecretKeySpec(key, algorithm), transformation);
	}

	/** Uses algorithm as transformation */
	public CryptoCipher(byte[] key, String algorithm) {
		this(new SecretKeySpec(key, algorithm));
	}

	/** Uses algorithm as transformation */
	public CryptoCipher(Key key) {
		this(key, key.getAlgorithm());
	}

	public CryptoCipher(CIPHERS cipher) {
		this(cipher, cipher.keySize());
	}

	public CryptoCipher(CIPHERS cipher, int keySize) {
		this(cipher.generateKey(keySize), cipher.transformation);
	}

	public CryptoCipher(Key key, CIPHERS cipher) {
		this(key, cipher.transformation);
	}

	/** @see CIPHERS#transformation */
	public CryptoCipher(Key key, String transformation) {
		this.key=key;

		try{
			cipher=Cipher.getInstance(transformation);
			cipher.init(Cipher.ENCRYPT_MODE, key);

			decipher=Cipher.getInstance(transformation);
			decipher.init(Cipher.DECRYPT_MODE, key);

		}catch(Exception e){
			System.out.println(e);
		}
	}


	/** @see Cipher#doFinal(byte[]) */
	public byte[] encrypt(byte[] messageBytes) {

		try{
			// Encrypt Bytes
			return cipher.doFinal(messageBytes);

		}catch(Exception e){
			System.out.println(e);
		}

		return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Encrypt Bytes<br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param messageBytes - the message to encrypt.
	 * @param lineLength - the lenghth of each text line.
	 * 0=no line break
	 */
	public String BASE64encrypt(byte[] messageBytes, int lineLength) {

		try{
			// Encrypt Bytes
			byte[] encrypted=encrypt(messageBytes);
			// Encode Bytes to BASE64
			byte[] base64Bytes=new Base64(lineLength).encode(encrypted);
			// Convert Bytes to String
			return new String(base64Bytes, "UTF8");

		}catch(Exception e){
			System.out.println(e);
		}

		return null;

	}


	/**
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
	public String BASE64encrypt(String message, int lineLength) {

		try{
			// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");
			// Encrypt Bytes
			return BASE64encrypt(messageBytes, lineLength);

		}catch(Exception e){
			System.out.println(e);
		}

		return null;

	}


	/** @see Cipher#doFinal(byte[]) */
	public byte[] decrypt(byte[] messageBytes) {

		try{
			// Decrypt Bytes
			return decipher.doFinal(messageBytes);

		}catch(Exception e){
			System.out.println(e);
		}

		return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Decode Bytes from BASE64<br>
	 * - Decrypt Bytes<br>
	 * - Convert Bytes to String (UTF8 charset)
	 *
	 * @param messageBytes - the message to decrypt.
	 * <b>Must be in BASE64</b>
	 */
	public String BASE64decrypt(byte[] messageBytes) {

		try{
			// Decode Bytes from BASE64
			byte[] base64Bytes=new Base64(0).decode(messageBytes);
			// Decrypt Bytes
			byte[] decrypted=decrypt(base64Bytes);
			// Convert Bytes to String
			return new String(decrypted, "UTF8");

		}catch(Exception e){
			System.out.println(e);
		}

		return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Decode Bytes from BASE64<br>
	 * - Decrypt Bytes<br>
	 * - Convert Bytes to String (UTF8 charset)
	 *
	 * @param message - the message to decrypt.
	 * <b>Must be in BASE64</b>
	 */
	public String BASE64decrypt(String message) {

		try{
			// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");
			// Decrypt Bytes
			return BASE64decrypt(messageBytes);

		}catch(Exception e){
			System.out.println(e);
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
