/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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

	public static void main(String[] args) {

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
