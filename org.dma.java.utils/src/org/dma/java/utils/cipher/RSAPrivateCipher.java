/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.cipher;

import java.security.PrivateKey;


public class RSAPrivateCipher extends CryptoCipher {

	public RSAPrivateCipher(PrivateKey key){
		super(key);
	}


	@Deprecated
	public String encrypt(byte[] buffer, int lineLength) {
		throw new RuntimeException("Encrypt not possible with PrivateKey");
	}


}
