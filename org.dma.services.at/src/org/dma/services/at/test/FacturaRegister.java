package org.dma.services.at.test;

import java.math.BigDecimal;
import java.util.Random;

import javax.xml.datatype.DatatypeFactory;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.services.at.proxy.FaturasProxy;
import org.dma.services.at.proxy.FaturasProxy.A10_ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceResponseType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType.DocumentTotals;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType.Line;
import pt.gov.portaldasfinancas.servicos.faturas.Tax;
/**
 * Teste de envio de FACTURAS
 *
 * @author marcolopes@netc.pt
 *
 */
public class FacturaRegister {

	public static RegisterInvoiceType buildRequest() throws Exception {

		RegisterInvoiceType request = new RegisterInvoiceType();

		request.setTaxRegistrationNumber(599999993);
		request.setInvoiceNo("CFA 2013/"+new Random().nextInt(999999));
		request.setInvoiceDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-05-05"));
		request.setInvoiceType("FT");
		request.setInvoiceStatus("N");
		request.setCustomerTaxID(999999990);

		Tax tax = new Tax();
		tax.setTaxType("IVA");
		tax.setTaxCountryRegion("PT");
		tax.setTaxPercentage(new BigDecimal(23));

		Line line = new Line();
		line.setDebitAmount(new BigDecimal(100));
		line.setTax(tax);
		request.getLine().add(line);

		DocumentTotals documentTotals = new DocumentTotals();
		documentTotals.setTaxPayable(new BigDecimal(23));
		documentTotals.setNetTotal(new BigDecimal(100));
		documentTotals.setGrossTotal(new BigDecimal(123));

		request.setDocumentTotals(documentTotals);

		return request;

	}


	public static void main(String[] argvs) {

		try{
			//ambiente de testes
			FaturasProxy proxy=new FaturasProxy(
				//Service Username / Password
				"599999993/0037", "testes1234",
				//Scheme Administrator Certificate - BUG? implementacao AT nao aceita chave de testes
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "saPubKey.jks", "saKeyPubPass", "sapubkey.prod"),
				//Software Developer Certificate
				new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "TesteWebServices.pfx", "TESTEwebservice", null),
				//Endpoint address
				A10_ENDPOINTS.TESTES);

			RegisterInvoiceResponseType response=proxy.register(buildRequest());

			System.out.println(response.getReturnCode());
			System.out.println(response.getReturnMessage());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
