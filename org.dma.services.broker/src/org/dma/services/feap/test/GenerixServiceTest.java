/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap.test;

import org.apache.commons.codec.binary.Base64;

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;

import org.dma.services.feap.CIUSExamples;
import org.dma.services.feap.proxy.GenerixServiceHandler;
import org.dma.services.feap.proxy.GenerixServiceHandler.ENDPOINTS;

public class GenerixServiceTest {

	public static final GenerixServiceHandler ServiceHandler=new GenerixServiceHandler(ENDPOINTS.TESTES);

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

			//Document
			String document=new Base64().encodeToString(CIUSExamples.FATURA);

			UploadDocResponse response=ServiceHandler.uploadDocument("CIUS-PT.xml", credentials, info, document);

			System.out.println(response.getStatusCode());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
