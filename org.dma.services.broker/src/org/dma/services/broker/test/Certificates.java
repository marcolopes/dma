/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.broker.test;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;

public class Certificates {

	@Deprecated
	/** Trusted Store Certificate */
	public static final JKSCertificate TrustStoreAT = new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/TrustStoreAT.jks", "123456", "portaldasfinancas");

	/** Saphety Doc Certificate */
	public static final JKSCertificate SaphetyDoc = new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/saphetydoc.jks", "123456");


}
