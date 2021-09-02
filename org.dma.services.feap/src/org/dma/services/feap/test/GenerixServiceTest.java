/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap.test;

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;

import org.dma.services.feap.Certificates;
import org.dma.services.feap.proxy.GenerixServiceHandler;
import org.dma.services.feap.proxy.GenerixServiceHandler.ENDPOINTS;

public class GenerixServiceTest {

	public static final GenerixServiceHandler ServiceHandler=new GenerixServiceHandler(
			"Username", "Password", Certificates.SaphetyDoc, Certificates.TesteWebservices, ENDPOINTS.TESTES);

	public static void main(String[] argvs) {

		try{
			//Credentials
			Credentials credentials=new Credentials();
			credentials.setUsername("USER");
			credentials.setPassword("PASS");

			//Routing Info
			RoutingInfo info=new RoutingInfo();
			info.setDocumentType("type");
			info.setReceiver("receiver");
			info.setSender("sender");

			UploadDocResponse response=ServiceHandler.uploadDocument("teste.txt",
					credentials, info, new DocumentBuilder().toBase64());

			System.out.println(response.getStatusCode());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
