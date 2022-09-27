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
