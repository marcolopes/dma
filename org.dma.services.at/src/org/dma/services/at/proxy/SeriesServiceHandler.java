/*******************************************************************************
 * 2008-2022 Public Domain
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
import pt.gov.portaldasfinancas.servicos.series.types.AnularSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.ConsultarSeriesType;
import pt.gov.portaldasfinancas.servicos.series.types.FinalizarSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.RegistarSeriesType;

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
	public SeriesResp registarSerie(RegistarSeriesType type) throws WebServiceException {
		return getService().registarSerie(type.serie, type.tipoSerie.value(),
				type.tipoDoc.classeDoc.value(), type.tipoDoc.value(),
				type.numInicialSeq, type.dataInicioPrevUtiliz, type.numCertSWFatur,
				type.meioProcessamento==null ? null : type.meioProcessamento.value());
	}

	/**
	 * Esta funcionalidade tem como objetivo disponibilizar a ação de anular
	 * a comunicação de uma Série anteriormente comunicada, por erro.
	 */
	public SeriesResp anularSerie(AnularSerieType type) throws WebServiceException {
		return getService().anularSerie(type.serie,
				type.tipoDoc.classeDoc.value(), type.tipoDoc.value(),
				type.codigoValidacao, type.motivo.value(), type.declaracaoNaoEmissao);
	}

	/**
	 * Esta funcionalidade tem como objetivo indicar que uma Série foi válida
	 * para um conjunto de documentos, mas que a mesma já não será usada a partir
	 * do último documento comunicado.
	 */
	public SeriesResp finalizarSerie(FinalizarSerieType type) throws WebServiceException {
		return getService().finalizarSerie(type.serie,
				type.tipoDoc.classeDoc.value(), type.tipoDoc.value(),
				type.codValidacaoSerie, type.seqUltimoDocEmitido, type.justificacao);
	}

	/**
	 * Esta funcionalidade tem como objetivo disponibilizar a consulta das Séries comunicadas.
	 */
	public ConsultarSeriesResp consultarSeries(ConsultarSeriesType type) throws WebServiceException {
		return getService().consultarSeries(type.getSerie(),
				type.getTipoSerie()==null ? null : type.getTipoSerie().value(),
				type.getClasseDoc()==null ? null : type.getClasseDoc().value(),
				type.getTipoDoc()==null ? null : type.getTipoDoc().value(),
				type.getCodValidacaoSerie(),
				type.getDataRegistoDe(), type.getDataRegistoAte(),
				type.getEstado()==null ? null : type.getEstado().value(),
				type.getMeioProcessamento()==null ? null : type.getMeioProcessamento().value());
	}


}