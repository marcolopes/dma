/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import java.security.PublicKey;

public class RSAPublicCipher extends CryptoCipher {

	public RSAPublicCipher(PublicKey key){
		super(key);
	}


	@Deprecated
	public String decrypt(byte[] buffer) {
		throw new RuntimeException("Decrypt not possible with PublicKey");
	}


}
