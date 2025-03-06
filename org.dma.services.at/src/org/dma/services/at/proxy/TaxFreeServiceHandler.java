/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.services.at.proxy;

import java.io.File;

import javax.xml.ws.WebServiceException;

import org.dma.services.at.ServiceCertificates;

import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeService;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeServiceImpl;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionRequestType;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionResponseType;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class TaxFreeServiceHandler extends ServiceHandler<TaxFreeService> {

	public enum ENDPOINTS {

		PROD ("https://servicos.portaldasfinancas.gov.pt:715/TaxFreeServiceImplService"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:715/TaxFreeServiceImplService");

		public final String name;

		private ENDPOINTS(String name) {
			this.name = name;
		}

	}

	private static TaxFreeService getTaxFreeServicePort() {
		Thread.currentThread().setContextClassLoader(ServiceHandler.class.getClassLoader());
		return new TaxFreeServiceImpl().getTaxFreeServicePort();
	}

	public TaxFreeServiceHandler(ENDPOINTS endpoint, String username, String password, ServiceCertificates cert) {
		this(endpoint, username, password, cert, null);
	}

	public TaxFreeServiceHandler(ENDPOINTS endpoint, String username, String password, ServiceCertificates cert, File output) {
		super(getTaxFreeServicePort(), endpoint.name, username, password, cert, output);
	}


	public TaxFreeSubmissionResponseType register(TaxFreeSubmissionRequestType request) throws WebServiceException {
		return getService().taxFreeSubmission(request);
	}


}