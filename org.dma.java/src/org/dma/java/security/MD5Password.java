/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.security;

import org.dma.java.cipher.MessageDigest;

public class MD5Password extends MessageDigest {

	private final String password;

	public MD5Password(String password) {
		super(ALGORITHMS.MD5);
		this.password=password;
	}


	/** @see MessageDigest#BASE64digest(String) */
	public String encode() {
		return BASE64digest(password);
	}


	public boolean test(String password) {
		return password.equals(encode());
	}


}