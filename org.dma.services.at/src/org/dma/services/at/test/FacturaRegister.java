package org.dma.services.at.test;

import java.math.BigDecimal;
import java.util.Random;

import javax.xml.datatype.DatatypeFactory;

import org.dma.services.at.SOAPMessageHandler.CERTIFICATE_TYPE;
import org.dma.services.at.SOAPMessageHandler.Certificate;
import org.dma.services.at.proxy.FaturasProxy;
import org.dma.services.at.proxy.FaturasProxy.A10_ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceResponseType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType;
import pt.gov.portaldasfinancas.servicos.faturas.Tax;
/**
 * Teste de envio de FACTURAS
 *
 * @author marcolopes@netc.pt
 *
 */
public class FacturaRegister {

	public static RegisterInvoiceType buildRegisterInvoiceRequest() throws Exception {

		RegisterInvoiceType registerInvoiceRequest = new RegisterInvoiceType();

		registerInvoiceRequest.setTaxRegistrationNumber(599999993);
		registerInvoiceRequest.setInvoiceNo("CFA 2013/"+new Random().nextInt(999999));
		registerInvoiceRequest.setInvoiceDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-05-05"));
		registerInvoiceRequest.setInvoiceType("FT");
		registerInvoiceRequest.setInvoiceStatus("N");
		registerInvoiceRequest.setCustomerTaxID(299999998);

		RegisterInvoiceType.Line line = new RegisterInvoiceType.Line();
		line.setDebitAmount(new BigDecimal(100));

		Tax taxa = new Tax();
		taxa.setTaxType("IVA");
		taxa.setTaxCountryRegion("PT");
		taxa.setTaxPercentage(new BigDecimal(23));

		line.setTax(taxa);
		registerInvoiceRequest.getLine().add(line);

		RegisterInvoiceType.DocumentTotals documentTotals = new RegisterInvoiceType.DocumentTotals();
		documentTotals.setTaxPayable(new BigDecimal(23));
		documentTotals.setNetTotal(new BigDecimal(100));
		documentTotals.setGrossTotal(new BigDecimal(123));

		registerInvoiceRequest.setDocumentTotals(documentTotals);

		return registerInvoiceRequest;
	}


	public static void main(String[] argvs){

		try{
			//ambiente de testes
			FaturasProxy proxy=new FaturasProxy(
				"599999993/0037", "testes1234",
				//BUG? implementacao AT nao aceita chave de testes
				new Certificate(CERTIFICATE_TYPE.JKS,
						"saPubKey.jks", "saKeyPubPass", "sapubkey.prod"),
				new Certificate(CERTIFICATE_TYPE.PKCS12,
						"TestesWebServices.pfx", "TESTEwebservice", null),
				A10_ENDPOINTS.TESTES);

			RegisterInvoiceResponseType response=proxy.register(buildRegisterInvoiceRequest());

			System.out.println(response.getReturnCode());
			System.out.println(response.getReturnMessage());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
