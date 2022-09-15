/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.broker.test;

import org.apache.commons.codec.binary.Base64;

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;

import org.dma.services.broker.CIUSExamples;
import org.dma.services.broker.proxy.GenerixServiceHandler;

public class GenerixServiceTest extends GenerixServiceHandler {

	public GenerixServiceTest() {
		super("USER", "PASS", ENDPOINTS.TEST);
	}

	public UploadDocResponse uploadDocument() throws Exception {

		//Credentials
		Credentials credentials=new Credentials();
		credentials.setUsername(username);
		credentials.setPassword(password);

		//Routing Info
		RoutingInfo info=new RoutingInfo();
		info.setDocumentType("type");
		info.setReceiver("receiver");
		info.setSender("sender");

		//Document
		String document=new Base64().encodeToString(CIUSExamples.FATURA);

		return uploadDocument("CIUS-PT.xml", credentials, info, document);

	}

	public static void main(String[] argvs) {

		try{
			GenerixServiceTest service=new GenerixServiceTest();

			UploadDocResponse response=service.uploadDocument();

			System.out.println(response.getStatusCode());
			System.out.println(response.getOperationInfo());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
