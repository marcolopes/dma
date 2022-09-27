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

import com.softlimits.clarinet.ArrayOfMessageOutputData;

import org.dma.services.broker.CIUSExamples;
import org.dma.services.broker.proxy.EspapServiceHandler;

public class EspapServiceTest extends EspapServiceHandler {

	public EspapServiceTest() {
		super("Username", "Password", Certificates.SaphetyDoc, ENDPOINTS.TEST);
	}

	public ArrayOfMessageOutputData processMessage() throws Exception {

		return processMessage(CIUSExamples.FATURA);

	}

	public static void main(String[] argvs) {

		try{
			EspapServiceTest service=new EspapServiceTest();

			ArrayOfMessageOutputData response=service.processMessage();

			System.out.println(response.getMessageOutputData());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
