/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.feap.test;

import com.softlimits.clarinet.ArrayOfMessageOutputData;

import org.dma.services.feap.CIUSExamples;
import org.dma.services.feap.Certificates;
import org.dma.services.feap.proxy.EspapServiceHandler;
import org.dma.services.feap.proxy.EspapServiceHandler.ENDPOINTS;

public class EspapServiceTest {

	public static final EspapServiceHandler ServiceHandler=new EspapServiceHandler(
			"Username", "Password", Certificates.SaphetyDoc, ENDPOINTS.TESTES);

	public static void main(String[] argvs) {

		try{
			ArrayOfMessageOutputData response=ServiceHandler.processMessage(CIUSExamples.FATURA);

			System.out.println(response.getMessageOutputData());

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
