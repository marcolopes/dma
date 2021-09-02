/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.proxy;

import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.java.util.Debug;
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
 * https://info.portaldasfinancas.gov.pt/pt/apoio_contribuinte/Faturacao/Comunicacao_Series_ATCUD/Paginas/default.aspx
 */
public class SeriesServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		PRODUCAO ("Ainda não definido à data de fecho da versão 1.0"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:722/SeriesWSService");

		public final String url;

		private ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final ENDPOINTS endpoint;

	public SeriesServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia o servico e inicializa o handler */
	private SeriesWS getService() throws Exception {

		// cria um novo servico
		SeriesWSService service = new SeriesWSService();
		// wsdlLocation esta' definido no servico
		Debug.out(service.getWSDLDocumentLocation());

		SeriesWS soapService = service.getSeriesWSPort();
		// inicializa handler
		initializeHandler((WSBindingProvider)soapService, endpoint.url, endpoint.isSecure());

		return soapService;

	}


	/**
	 * Esta funcionalidade tem como objetivo permitir a comunicação das Séries à AT,
	 * através do registo das mesmas, de modo a que seja atribuído um
	 * código único de validação da Série.
	 */
	public SeriesResp registarSerie(RegistarSeriesType type) throws Exception {

		return getService().registarSerie(type.serie, type.tipoSerie.value(),
				type.tipoDoc.classeDoc.value(), type.tipoDoc.value(),
				type.numInicialSeq, type.dataInicioPrevUtiliz, type.numCertSWFatur,
				type.meioProcessamento==null ? null : type.meioProcessamento.value());

	}

	/**
	 * Esta funcionalidade tem como objetivo disponibilizar a ação de anular
	 * a comunicação de uma Série anteriormente comunicada, por erro.
	 */
	public SeriesResp anularSerie(AnularSerieType type) throws Exception {

		return getService().anularSerie(type.serie,
				type.tipoDoc.classeDoc.value(), type.tipoDoc.value(),
				type.codigoValidacao, type.motivo.value(), type.declaracaoNaoEmissao);

	}

	/**
	 * Esta funcionalidade tem como objetivo indicar que uma Série foi válida
	 * para um conjunto de documentos, mas que a mesma já não será usada a partir
	 * do último documento comunicado.
	 */
	public SeriesResp finalizarSerie(FinalizarSerieType type) throws Exception {

		return getService().finalizarSerie(type.serie,
				type.tipoDoc.classeDoc.value(), type.tipoDoc.value(),
				type.codValidacaoSerie, type.seqUltimoDocEmitido, type.justificacao);

	}

	/**
	 * Esta funcionalidade tem como objetivo disponibilizar a consulta das Séries comunicadas.
	 */
	public ConsultarSeriesResp consultarSeries(ConsultarSeriesType type) throws Exception {

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