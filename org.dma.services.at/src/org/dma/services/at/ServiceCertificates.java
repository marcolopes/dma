/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.services.at;

import javax.xml.ws.WebServiceException;

import org.dma.java.security.JKSCertificate;
import org.dma.java.util.Debug;
import org.dma.java.util.MessageList;
import org.dma.services.at.test.Certificates;

public class ServiceCertificates {

	private static ServiceCertificates instance;

	public static ServiceCertificates getInstance() {
		if (instance==null) instance=new ServiceCertificates(
				Certificates.ChavePublicaAT,
				Certificates.TesteWebservices,
				Debug.STATUS ? Certificates.TrustStoreAT : null);
		return instance;
	}

	/** Scheme Administrator certificate */
	public final JKSCertificate sa;
	/** Software Developer certificate */
	public final JKSCertificate sw;
	/** Trusted Store certificate */
	public final JKSCertificate ts;

	/**
	 * @param sa Scheme Administrator certificate
	 * @param sw Software Developer certificate
	 */
	public ServiceCertificates(JKSCertificate sa, JKSCertificate sw) {
		this(sa, sw, null);
	}

	/**
	 * @param sa Scheme Administrator certificate
	 * @param sw Software Developer certificate
	 * @param ts Trusted Store certificate
	 */
	public ServiceCertificates(JKSCertificate sa, JKSCertificate sw, JKSCertificate ts) {
		this.sa = sa;
		this.sw = sw;
		this.ts = ts;
	}

	public void validate() throws WebServiceException {
		MessageList list=new MessageList();
		for(JKSCertificate cert: new JKSCertificate[]{sa, sw, ts}){
			if (cert!=null && !validate(cert)) list.add(cert.toString());
		}list.print();
		if (!list.isEmpty()) throw new WebServiceException("Invalid or expired certificates");
	}

	private boolean validate(JKSCertificate cert) {
		return cert.isValid() && !cert.isExpired();
	}

	@Override
	public String toString() {
		MessageList list=new MessageList();
		for(JKSCertificate cert: new JKSCertificate[]{sa, sw, ts}){
			if (cert!=null) list.add(cert.toString());
		}return list.toString();
	}

}