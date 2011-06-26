/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.apache.codec;

import java.io.UnsupportedEncodingException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class BlowfishCipher {

	private static final String ALGORITHM="Blowfish";

	private Cipher cipher;
	private Cipher decipher;

	public BlowfishCipher(String key) {
		try {
			this.cipher = Cipher.getInstance(ALGORITHM);
			this.decipher = Cipher.getInstance(ALGORITHM);

			SecretKeySpec secretkey = new SecretKeySpec(key.getBytes(), ALGORITHM);

			cipher.init(Cipher.ENCRYPT_MODE, secretkey);
			decipher.init(Cipher.DECRYPT_MODE, secretkey);

		} catch (Exception e) {
		}
	}


	public String encrypt(String text) {
		try {
			byte[] utf8 = text.getBytes("UTF8");
			byte[] enc = cipher.doFinal(utf8);
		return new Base64().encodeToString(enc);

		} catch (BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}


	public String decrypt(String text) {
		try {
			// Decode base64 to get bytes
			byte[] dec = new Base64().decode(text);
			byte[] utf8 = decipher.doFinal(dec);
			return new String(utf8, "UTF8");

		} catch (BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}



}
