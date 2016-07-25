/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.security;

import org.dma.java.cipher.BlowfishCipher;

public class BlowfishPassword extends BlowfishCipher {

	public BlowfishPassword(String key) {
		super(key);
	}

	/** @see BlowfishCipher#BASE64encrypt(String, int) */
	public String encode(String password) {
		return BASE64encrypt(password, 0);
	}


	/** @see BlowfishCipher#BASE64decrypt(String) */
	public String decode(String password) {
		return BASE64decrypt(password);
	}


}