/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.security;

import org.dma.java.cipher.BlowfishCipher;

public class BlowfishPassword extends BlowfishCipher {

	public BlowfishPassword(String key) {
		super(key);
	}

	/** @see BlowfishCipher#encrypt(String, int) */
	public String encode(String password) {
		return encrypt(password, 0);
	}


	/** @see BlowfishCipher#decrypt(String) */
	public String decode(String password) {
		return decrypt(password);
	}


}