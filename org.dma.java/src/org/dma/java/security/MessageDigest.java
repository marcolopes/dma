/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.security;

import org.apache.commons.codec.binary.Base64;

public class MessageDigest {

	/**
	 * https://docs.oracle.com/javase/7/docs/api/java/security/MessageDigest.html
	 */
	public enum ALGORITHMS {

		MD5 ("MD5"),
		SHA1 ("SHA-1"),
		SHA256 ("SHA-256");

		public String name;

		private ALGORITHMS(String name) {
			this.name=name;
		}

	}

	public static java.security.MessageDigest getDigest(String algorithm) {
		try{return java.security.MessageDigest.getInstance(algorithm);
		}catch(Exception e){
			System.err.println(e);
		}return null;

	}

	private final java.security.MessageDigest md;

	public MessageDigest(ALGORITHMS algorithm) {
		this(algorithm.name);
	}

	public MessageDigest(String algorithm) {
		this.md=getDigest(algorithm);
	}


	/** @see java.security.MessageDigest#digest(byte[]) */
	public byte[] digest(byte[] message) {

		try{// Digest Bytes
			return md.digest(message);

		}catch(Exception e){
			System.err.println(e);
		}return new byte[0];

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Digest Bytes<br>
	 *
	 * @param message The message to digest
	 * @return The digested message
	 */
	public byte[] digest(String message) {

		try{// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");
			// Digest Bytes
			return digest(messageBytes);

		}catch(Exception e){
			System.err.println(e);
		}return new byte[0];

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Digest Bytes<br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param message The message to digest
	 * @return The digested message encoded in BASE64
	 */
	public String BASE64digest(String message) {

		try{// Encode Bytes to BASE64
			byte[] base64Bytes=new Base64().encode(digest(message));
			// Convert Bytes to String
			return new String(base64Bytes, "UTF8");

		}catch(Exception e){
			System.err.println(e);
		}return "";

	}


}