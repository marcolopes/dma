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

import pt.gov.portaldasfinancas.servicos.faturas.Faturas;
import pt.gov.portaldasfinancas.servicos.faturas.FaturasService;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceResponseType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class FaturasServiceHandler extends ServiceHandler<Faturas> {

	public enum ENDPOINTS {

		//fews = Facturas Envio WebService?
		PROD ("https://servicos.portaldasfinancas.gov.pt:400/fews/faturas"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:700/fews/faturas");

		public final String name;

		private ENDPOINTS(String name) {
			this.name = name;
		}

	}

	private static Faturas getFaturasSOAP() {
		Thread.currentThread().setContextClassLoader(ServiceHandler.class.getClassLoader());
		return new FaturasService().getFaturasSOAP();
	}

	public FaturasServiceHandler(ENDPOINTS endpoint, String username, String password, ServiceCertificates cert) {
		this(endpoint, username, password, cert, null);
	}

	public FaturasServiceHandler(ENDPOINTS endpoint, String username, String password, ServiceCertificates cert, File output) {
		super(getFaturasSOAP(), endpoint.name, username, password, cert, output);
	}


	public RegisterInvoiceResponseType register(RegisterInvoiceType request) throws WebServiceException {
		return getService().registerInvoice(request);
	}


}