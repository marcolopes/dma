/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache.codec;

import org.apache.commons.codec.binary.Base64;

public class EncodingUtils extends Base64 {

	/*
	 * Encodes to BASE64
	 * lineLength in CHARS (0=no limit)
	 */
	public static String BASE64Encode(byte[] message, int lineLength) {

		Base64 encoder = new Base64(lineLength);
		return encoder.encodeToString(message);

	}


	public static String BASE64EncodeFromString(String message, int lineLength) {

		return BASE64Encode(message.getBytes(), lineLength);

	}


	/*
	 * Decodes from BASE64
	 */
	public static byte[] BASE64Decode(String base64) {

		Base64 decoder = new Base64();
		return decoder.decode(base64);

	}


	public static String BASE64DecodeToString(String base64) {

		byte[] message = BASE64Decode(base64);
		if (message == null)
			return "";

		return new String(message);

	}


	public static void main(String[] args) {

		final String message="The quick brown fox jumps over the lazy dog.";
		System.out.println("message: " + message);

		String base64 = BASE64EncodeFromString(message,0);
		System.out.println("base64: " + base64+"\n");

		String message2 = BASE64DecodeToString(base64);
		System.out.println("message2: " + message2);


	}

}

