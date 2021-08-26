/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap.test;

import com.softlimits.clarinet.ArrayOfMessageOutputData;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.services.feap.proxy.EspapServiceHandler;
import org.dma.services.feap.proxy.EspapServiceHandler.ENDPOINTS;

public class EspapServiceTest {

	public static void main(String[] argvs) {

		try{//ambiente de testes
			EspapServiceHandler handler=new EspapServiceHandler(
				//Service Username / Password
				"Username", "Password",
				//Scheme Administrator Certificate
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/saphetydoc.jks", "123456"),
				//Software Developer Certificate
				new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "certificates/TesteWebservices.pfx", "TESTEwebservice"),
				//Endpoint address
				ENDPOINTS.TESTES);

			byte[] message=new DocumentBuilder().toByteArray();

			ArrayOfMessageOutputData response=handler.processMessage(message);

			System.out.println(response.getMessageOutputData());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
