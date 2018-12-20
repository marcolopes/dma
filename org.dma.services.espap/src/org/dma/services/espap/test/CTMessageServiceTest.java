/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.espap.test;

import com.softlimits.clarinet.ArrayOfMessageOutputData;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.services.espap.proxy.CTMessageServiceHandler;
import org.dma.services.espap.proxy.CTMessageServiceHandler.A10_ENDPOINTS;

public class CTMessageServiceTest {

	public static void main(String[] argvs) {

		try{
			//ambiente de testes
			CTMessageServiceHandler handler=new CTMessageServiceHandler(
				//Service Username / Password
				"Username", "Password",
				//Scheme Administrator Certificate
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "saphetydoc.jks", "123456"),
				//Software Developer Certificate
				new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "TesteWebServices.pfx", "TESTEwebservice"),
				//Endpoint address
				A10_ENDPOINTS.TESTES);

			ArrayOfMessageOutputData response=handler.register(
					"The quick brown fox jumps over the lazy dog.".getBytes("UTF8"));

			System.out.println(response.getMessageOutputData());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
