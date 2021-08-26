/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap.test;

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.services.feap.proxy.GenerixServiceHandler;
import org.dma.services.feap.proxy.GenerixServiceHandler.ENDPOINTS;

public class GenerixServiceTest {

	public static void main(String[] argvs) {

		try{//ambiente de testes
			GenerixServiceHandler handler=new GenerixServiceHandler(
				//Service Username / Password
				"Username", "Password",
				//Scheme Administrator Certificate
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/saphetydoc.jks", "123456"),
				//Software Developer Certificate
				new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "certificates/TesteWebservices.pfx", "TESTEwebservice"),
				//Endpoint address
				ENDPOINTS.TESTES);

			//Credentials
			Credentials credentials=new Credentials();
			credentials.setUsername("USER");
			credentials.setPassword("PASS");
			//Routing Info
			RoutingInfo info=new RoutingInfo();
			info.setDocumentType("type");
			info.setReceiver("receiver");
			info.setSender("sender");
			//Document
			String document=new DocumentBuilder().toBase64();

			UploadDocResponse response=handler.uploadDocument("teste.txt", credentials, info, document);
			System.out.println(response.getStatusCode());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
