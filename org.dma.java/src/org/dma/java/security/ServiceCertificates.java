/*******************************************************************************
 * 2008-2022 Public Domain
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