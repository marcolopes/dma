/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

public class MD5Password {

	private final String password;

	public MD5Password(String password) {
		this.password=password;
	}


	/**
	 * MD5 Password
	 * @return
	 * MD5 digested password encoded in BASE64
	 */
	public String encode() {

		try{
			MessageDigest md=MessageDigest.getInstance("MD5");
			md.update(password.getBytes("UTF8"));
			return new Base64(0).encodeToString(md.digest());

		}catch(UnsupportedEncodingException e){
			System.out.println(e);
		}catch(NoSuchAlgorithmException e){
			System.out.println(e);
		}

		return null;

	}


	public boolean test(String password) {

		return password.equals(encode());

	}


}