/*******************************************************************************
 * Copyright 2008-2016 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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