/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.ServiceCertificates;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporte;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporteService;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class StockMovementServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		//sgdtws = Servico de Gestao de Documentos de Transporte WebService?
		PROD ("https://servicos.portaldasfinancas.gov.pt:401/sgdtws/documentosTransporte"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:701/sgdtws/documentosTransporte");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final DocumentosTransporte service = new DocumentosTransporteService().getDocumentosTransporteSOAP();

	private DocumentosTransporte getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public StockMovementServiceHandler(String username, String password, ServiceCertificates cert, ENDPOINTS endpoint) {
		this(username, password, cert, endpoint, null);
	}

	public StockMovementServiceHandler(String username, String password, ServiceCertificates cert, ENDPOINTS endpoint, File output) {
		super(username, password, cert, output);
		this.endpoint = endpoint;
	}


	public StockMovementResponse register(StockMovement request) throws WebServiceException {
		return getService().envioDocumentoTransporte(request);
	}


}