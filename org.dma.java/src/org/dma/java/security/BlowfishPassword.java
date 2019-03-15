/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.security;

import org.dma.java.cipher.BlowfishCipher;

public class BlowfishPassword extends BlowfishCipher {

	public BlowfishPassword(String key) {
		super(key);
	}

	/**
	 * BASE64encrypt with NO line break!
	 * @see BlowfishCipher#BASE64encrypt(String, int)
	 */
	public String encode(String password) {
		return BASE64encrypt(password, 0);
	}


	/**
	 * BASE64decrypt alias! (pair with encode)
	 * @see BlowfishCipher#BASE64decrypt(String)
	 */
	public String decode(String password) {
		return BASE64decrypt(password);
	}


}