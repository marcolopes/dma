/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.broker.test;

import com.softlimits.clarinet.ArrayOfMessageOutputData;

import org.dma.services.broker.CIUSExamples;
import org.dma.services.broker.Certificates;
import org.dma.services.broker.proxy.EspapServiceHandler;

public class EspapServiceTest extends EspapServiceHandler {

	public EspapServiceTest() {
		super("Username", "Password", Certificates.SaphetyDoc, ENDPOINTS.TESTES);
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
