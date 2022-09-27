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

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.ServiceCertificates;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.series.ConsultarSeriesResp;
import pt.gov.portaldasfinancas.servicos.series.SeriesResp;
import pt.gov.portaldasfinancas.servicos.series.SeriesWS;
import pt.gov.portaldasfinancas.servicos.series.SeriesWSService;
import pt.gov.portaldasfinancas.servicos.series.types.requests.AnularSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.ConsultarSeriesType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.FinalizarSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.RegistarSeriesType;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class SeriesServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		PROD ("https://servicos.portaldasfinancas.gov.pt:422/SeriesWSService"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:722/SeriesWSService");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final SeriesWS service = new SeriesWSService().getSeriesWSPort();

	private SeriesWS getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public SeriesServiceHandler(String username, String password, ServiceCertificates cert, ENDPOINTS endpoint) {
		super(username, password, cert);
		this.endpoint = endpoint;
	}


	/**
	 * Esta funcionalidade tem como objetivo permitir a comunicação das Séries à AT,
	 * através do registo das mesmas, de modo a que seja atribuído um
	 * código único de validação da Série.
	 */
	public SeriesResp registarSerie(RegistarSeriesType request) throws WebServiceException {
		return getService().registarSerie(request.serie, request.tipoSerie.value(),
				request.tipoDoc.classeDoc.value(), request.tipoDoc.value(),
				request.numInicialSeq, request.dataInicioPrevUtiliz, request.numCertSWFatur,
				request.meioProcessamento==null ? null : request.meioProcessamento.value());
	}

	/**
	 * Esta funcionalidade tem como objetivo disponibilizar a ação de anular
	 * a comunicação de uma Série anteriormente comunicada, por erro.
	 */
	public SeriesResp anularSerie(AnularSerieType request) throws WebServiceException {
		return getService().anularSerie(request.serie,
				request.tipoDoc.classeDoc.value(), request.tipoDoc.value(),
				request.codigoValidacao, request.motivo.value(), request.declaracaoNaoEmissao);
	}

	/**
	 * Esta funcionalidade tem como objetivo indicar que uma Série foi válida
	 * para um conjunto de documentos, mas que a mesma já não será usada a partir
	 * do último documento comunicado.
	 */
	public SeriesResp finalizarSerie(FinalizarSerieType request) throws WebServiceException {
		return getService().finalizarSerie(request.serie,
				request.tipoDoc.classeDoc.value(), request.tipoDoc.value(),
				request.codValidacaoSerie, request.seqUltimoDocEmitido, request.justificacao);
	}

	/**
	 * Esta funcionalidade tem como objetivo disponibilizar a consulta das Séries comunicadas.
	 */
	public ConsultarSeriesResp consultarSeries(ConsultarSeriesType request) throws WebServiceException {
		return getService().consultarSeries(request.getSerie(),
				request.getTipoSerie()==null ? null : request.getTipoSerie().value(),
				request.getClasseDoc()==null ? null : request.getClasseDoc().value(),
				request.getTipoDoc()==null ? null : request.getTipoDoc().value(),
				request.getCodValidacaoSerie(),
				request.getDataRegistoDe(), request.getDataRegistoAte(),
				request.getEstado()==null ? null : request.getEstado().value(),
				request.getMeioProcessamento()==null ? null : request.getMeioProcessamento().value());
	}


}