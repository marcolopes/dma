/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
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

		/*
		 * Advanced Encryption Standard as specified by NIST in FIPS 197.
		 */
		AES_CBC ("AES", "CBC", "NoPadding", 128),
		AES_CBC_PKCS5 ("AES", "CBC", "PKCS5Padding", 128),
		AES_ECB ("AES", "ECB", "NoPadding", 128),
		AES_ECB_PKCS5 ("AES", "ECB", "PKCS5Padding", 128),
		/*
		 * The Digital Encryption Standard as described in FIPS PUB 46-3.
		 */
		DES_CBC ("DES", "CBC", "NoPadding", 56),
		DES_CBC_PKCS5 ("DES", "CBC", "PKCS5Padding", 56),
		DES_ECB ("DES", "ECB", "NoPadding", 56),
		DES_ECB_PKCS5 ("DES", "ECB", "PKCS5Padding", 56),
		/*
		 * Triple DES Encryption (also known as DES-EDE, 3DES, or Triple-DES).
		 */
		DESede_CBC ("DESede", "CBC", "NoPadding", 168),
		DESede_CBC_PKCS5 ("DESede", "CBC", "PKCS5Padding", 168),
		DESede_ECB ("DESede", "ECB", "NoPadding", 168),
		DESede_ECB_PKCS5 ("DESede", "ECB", "PKCS5Padding", 168),
		/*
		 * The RSA encryption algorithm as defined in PKCS #1
		 */
		RSA_ECB_PKCS1 ("RSA", "ECB", "PKCS1Padding", 2048, 1024),
		RSA_ECB_OAEPWithSHA_1AndMGF1 ("RSA", "ECB", "OAEPWithSHA-1AndMGF1Padding", 2048, 1024),
		RSA_ECB_OAEPWithSHA_256AndMGF1 ("RSA", "ECB", "OAEPWithSHA-256AndMGF1Padding", 2048, 1024);

		public final String algorithm;
		public final String transformation;
		public final int keysize;

		/** transformation = algorithm */
		private CIPHERS(String algorithm) {
			this(algorithm, algorithm);
		}

		/** transformation = algorithm/mode/padding */
		private CIPHERS(String algorithm, String mode, String padding, int...keysize) {
			this(algorithm, algorithm+"/"+mode+"/"+padding, keysize);
		}

		private CIPHERS(String algorithm, String transformation, int...keysize) {
			this.algorithm=algorithm;
			this.transformation=transformation;
			this.keysize=keysize[0];
		}

		public SecretKey generateKey(int keySize) {
			try{KeyGenerator generator=KeyGenerator.getInstance(algorithm);
				generator.init(keySize);
				return generator.generateKey();

			}catch(Exception e){
				System.err.println(e);
			}return null;
		}

	}

	private final Key key;
	private Cipher cipher;
	private Cipher decipher;

	public Key getKey() {return key;}

	/** Uses algorithm as transformation */
	public CryptoCipher(byte[] key, String algorithm) {
		this(key, algorithm, algorithm);
	}

	/** Uses {@link CIPHERS#transformation} */
	public CryptoCipher(byte[] key, CIPHERS cipher) {
		this(key, cipher.algorithm, cipher.transformation);
	}

	public CryptoCipher(byte[] key, String algorithm, String transformation) {
		this(new SecretKeySpec(key, algorithm), transformation);
	}

	/** Uses algorithm as transformation */
	public CryptoCipher(Key key) {
		this(key, key.getAlgorithm());
	}

	/** Uses {@link CIPHERS#transformation} */
	public CryptoCipher(Key key, CIPHERS cipher) {
		this(key, cipher.transformation);
	}

	/** Uses {@link CIPHERS#transformation} */
	public CryptoCipher(CIPHERS cipher) {
		this(cipher, cipher.keysize);
	}

	/** Uses {@link CIPHERS#transformation} */
	public CryptoCipher(CIPHERS cipher, int keySize) {
		this(cipher.generateKey(keySize), cipher.transformation);
	}

	public CryptoCipher(Key key, String transformation) {
		this.key=key;

		try{cipher=Cipher.getInstance(transformation);
			cipher.init(Cipher.ENCRYPT_MODE, key);

			decipher=Cipher.getInstance(transformation);
			decipher.init(Cipher.DECRYPT_MODE, key);

		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}


	/** @see Cipher#doFinal(byte[]) */
	public byte[] encrypt(byte[] messageBytes) {

		if (messageBytes!=null) try{
			// Encrypt Bytes
			return cipher.doFinal(messageBytes);

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Encrypt Bytes<br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param messageBytes The message to encrypt.
	 * @param lineLength The length of each text line.
	 * 0=no line break
	 */
	public String BASE64encrypt(byte[] messageBytes, int lineLength) {

		if (messageBytes!=null) try{
			// Encrypt Bytes
			byte[] encrypted=encrypt(messageBytes);
			// Encode Bytes to BASE64
			byte[] base64Bytes=new Base64(lineLength).encode(encrypted);
			// Convert Bytes to String
			return new String(base64Bytes, "UTF8");

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Encrypt Bytes<br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param message The message to encrypt.
	 * @param lineLength The length of each text line.
	 * 0=no line break
	 */
	public String BASE64encrypt(String message, int lineLength) {

		if (message!=null) try{
			// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");
			// Encrypt Bytes
			return BASE64encrypt(messageBytes, lineLength);

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


	/** @see Cipher#doFinal(byte[]) */
	public byte[] decrypt(byte[] messageBytes) {

		if (messageBytes!=null) try{
			// Decrypt Bytes
			return decipher.doFinal(messageBytes);

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Decode Bytes from BASE64<br>
	 * - Decrypt Bytes<br>
	 * - Convert Bytes to String (UTF8 charset)
	 *
	 * @param messageBytes The message to decrypt.
	 * <b>Must be in BASE64</b>
	 */
	public String BASE64decrypt(byte[] messageBytes) {

		if (messageBytes!=null) try{
			// Decode Bytes from BASE64
			byte[] base64Bytes=new Base64().decode(messageBytes);
			// Decrypt Bytes
			byte[] decrypted=decrypt(base64Bytes);
			// Convert Bytes to String
			return new String(decrypted, "UTF8");

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Decode Bytes from BASE64<br>
	 * - Decrypt Bytes<br>
	 * - Convert Bytes to String (UTF8 charset)
	 *
	 * @param message The message to decrypt.
	 * <b>Must be in BASE64</b>
	 */
	public String BASE64decrypt(String message) {

		if (message!=null) try{
			// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");
			// Decrypt Bytes
			return BASE64decrypt(messageBytes);

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


}
