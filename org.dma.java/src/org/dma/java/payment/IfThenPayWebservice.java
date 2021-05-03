/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.payment;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import org.dma.java.io.URLFile;
import org.dma.java.time.DatePeriod;
import org.dma.java.util.Debug;

/*
 * Os parametros a passar na chamada do metodo sao:
 *
 * Chavebackoffice: Chave fornecida pela IFTHEN na assinatura do contrato.
 * Obrigatorio.
 * Entidade: Entidade (5 digitos) fornecida pela IFTHEN na assinatura do contrato.
 * Obrigatorio.
 * Subentidade: Sub-Entidade (3 digitos) fornecida pela IFTHEN na assinatura do contrato.
 * Obrigatorio.
 * dtHrInicio: Data/Hora inicial dos pagamentos pretendidos no formato dd-MM-yyyy HH:mm:ss.
 * Facultativo.
 * dtHrFim: Data/Hora final dos pagamentos pretendidos no formato dd-MM-yyyy HH:mm:ss.
 * Facultativo.
 * Referencia: Referencia multibanco (9 digitos) sobre a qual se pretende saber a informacao do pagamento.
 * Facultativo.
 * Valor: Valor em euros dos pagamentos que se pretende obter informacao.
 * Facultativo.
 * Sandbox: Devem indicar 1 ou 0 no caso de utilizarem ou nao a plataforma de testes.
 * Obrigatorio.
 */
public class IfThenPayWebservice {

	public static final String URL = "https://www.ifthenpay.com/IfmbWS/WsIfmb.asmx/GetPaymentsXml";

	public final String entidade;
	public final String subentidade;
	public final String chavebackoffice;
	public final String sandbox;

	public IfThenPayWebservice(String entidade, String subentidade, String chavebackoffice) {
		this.entidade=entidade;
		this.subentidade=subentidade;
		this.chavebackoffice=chavebackoffice;
		this.sandbox="0";
	}

	private URL getURL(DatePeriod periodo, String referencia, String valor) throws Exception {
		StringBuilder url=new StringBuilder(URL+"?");
		url.append("chavebackoffice=" + chavebackoffice);
		url.append("&entidade=" + entidade);
		url.append("&subentidade=" + subentidade);
		url.append("&dtHrInicio=" + (periodo==null ? "" : periodo.getStartDate("dd-MM-yyyy")+" 00:00:00"));
		url.append("&dtHrFim=" + (periodo==null ? "" : periodo.getEndDate("dd-MM-yyyy")+" 23:59:59"));
		url.append("&referencia=" + (referencia==null ? "" : referencia));
		url.append("&valor=" + (valor==null ? "" : valor));
		url.append("&sandbox=" + sandbox);
		//http://www.w3.org/Addressing/URL/uri-spec.html
		return new URL(URLFile.normalize(url.toString()));
	}

	public Collection<IfThenPayWebserviceResponseType> getPayments() throws Exception {
		return getPayments(null, null);
	}

	public Collection<IfThenPayWebserviceResponseType> getPayments(String referencia, String valor) throws Exception {
		return getPayments(getURL(null, referencia, valor));
	}

	public Collection<IfThenPayWebserviceResponseType> getPayments(DatePeriod periodo) throws Exception {
		return getPayments(getURL(periodo, null, null));
	}

	private Collection<IfThenPayWebserviceResponseType> getPayments(URL url) throws Exception {

		Debug.err(url);

		Collection<IfThenPayWebserviceResponseType> col=new ArrayList();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document=builder.parse(url.openStream());
		document.getDocumentElement().normalize();

		NodeList nodes = document.getElementsByTagName("Ifmb");
		for (int index=0; index<nodes.getLength(); index++){

			Element element = (Element)nodes.item(index);

			IfThenPayWebserviceResponseType response=new IfThenPayWebserviceResponseType(
					element.getAttribute("Entidade"),
					element.getElementsByTagName("Referencia").item(0).getTextContent(),
					element.getElementsByTagName("Valor").item(0).getTextContent(),
					element.getElementsByTagName("Id").item(0).getTextContent(),
					element.getElementsByTagName("DtHrPagamento").item(0).getTextContent(),
					element.getElementsByTagName("Processamento").item(0).getTextContent(),
					element.getElementsByTagName("Terminal").item(0).getTextContent(),
					element.getElementsByTagName("Tarifa").item(0).getTextContent(),
					element.getElementsByTagName("ValorLiquido").item(0).getTextContent(),
					element.getElementsByTagName("CodigoErro").item(0).getTextContent(),
					element.getElementsByTagName("MensagemErro").item(0).getTextContent());

			if (response.codigoErro!=0) throw new Exception(response.mensagemErro);

			col.add(response);
		}

		return col;

	}

}