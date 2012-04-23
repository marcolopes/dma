/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache.codec;

public class BlowfishCipher extends CryptoCipher {

	public BlowfishCipher(String key) {
		super(key, BLOWFISH);
	}

}
