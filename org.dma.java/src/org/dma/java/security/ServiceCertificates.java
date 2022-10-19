/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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

import java.util.ArrayList;
import java.util.Collection;

import org.dma.java.util.MessageList;

public class ServiceCertificates {

	/** Scheme Administrator Certificate */
	public final JKSCertificate sa;
	/** Software Developer Certificate */
	public final JKSCertificate sw;
	/** Trusted Store Certificate */
	public final JKSCertificate ts;

	/**
	 * @param sa - Scheme Administrator Certificate
	 * @param sw - Software Developer Certificate
	 */
	public ServiceCertificates(JKSCertificate sa, JKSCertificate sw) {
		this(sa, sw, null);
	}

	/**
	 * @param sa - Scheme Administrator Certificate
	 * @param sw - Software Developer Certificate
	 * @param ts - Trusted Store Certificate
	 */
	public ServiceCertificates(JKSCertificate sa, JKSCertificate sw, JKSCertificate ts) {
		this.sa = sa;
		this.sw = sw;
		this.ts = ts;
	}

	public void validate() throws Exception {
		Collection<JKSCertificate> col=new ArrayList();
		for(JKSCertificate cert: new JKSCertificate[]{sa, sw, ts}){
			if (cert!=null && !validate(cert)) col.add(cert);
		}MessageList list=message(col);
		list.print();
		if (!list.isEmpty()) throw new Exception("Invalid or expired certificates");
	}

	private MessageList message(Collection<JKSCertificate> col) {
		MessageList list=new MessageList();
		for(JKSCertificate cert: col){
			list.add(cert.toString());
		}return list;
	}

	private boolean validate(JKSCertificate cert) {
		return cert.isValid() && !cert.isExpired();
	}

}