/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.cipher;

import org.apache.commons.codec.binary.Base64;
import org.dma.java.util.Debug;

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
		try{
			return java.security.MessageDigest.getInstance(algorithm);

		}catch(Exception e){
			Debug.err(e);
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

		try{
			// Digest Bytes
			return md.digest(message);

		}catch(Exception e){
			Debug.err(e);
		}

		return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Digest Bytes<br>
	 *
	 * @param message - the message to digest
	 * @return digested message
	 */
	public byte[] digest(String message) {

		try{
			// Convert String to Bytes
			byte[] messageBytes=message.getBytes("UTF8");
			// Digest Bytes
			return digest(messageBytes);

		}catch(Exception e){
			Debug.err(e);
		}

		return null;

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Digest Bytes<br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param message - the message to digest
	 * @return digested message encoded in BASE64
	 */
	public String BASE64digest(String message) {

		try{
			// Encode Bytes to BASE64
			byte[] base64Bytes=new Base64(0).encode(digest(message));
			// Convert Bytes to String
			return new String(base64Bytes, "UTF8");

		}catch(Exception e){
			Debug.err(e);
		}

		return null;

	}


}