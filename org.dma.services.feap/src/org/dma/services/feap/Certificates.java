/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;

public class Certificates {

	/** Scheme Administrator Certificate */
	public static final JKSCertificate SaphetyDoc = new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/saphetydoc.jks", "123456");

	/** Software Developer Certificate */
	public static final JKSCertificate TesteWebservices = new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "certificates/TesteWebservices.pfx", "TESTEwebservice");

	@Deprecated
	/** Trusted Store Certificate */
	public static final JKSCertificate TrustStoreAT = new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/TrustStoreAT.jks", "123456", "portaldasfinancas");


}
