/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import javax.crypto.spec.SecretKeySpec;

public class BlowfishCipher extends CryptoCipher {

	public BlowfishCipher(String key) {
		super(new SecretKeySpec(key.getBytes(), "Blowfish"));
	}

}
