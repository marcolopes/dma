package pt.at.factemipf.gui;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import pt.at.factemipf.core.webservices.client.factemiws.RegisterInvoiceType;
import pt.at.factemipf.core.webservices.client.factemiws.Tax;

/**
 * Cria um request bean para a operacao de registo de factura.
 * Este bean e' criado de forma a forcar um erro de validacao do lado do
 * servidor.
 * Apenas se pretende testar a comunicacao com o servidor, pelo que nao faz
 * sentido inserir uma factura.
 *
 * @author ricardo
 */
public final class RequestBuilder {

	private RequestBuilder(){}

	public static RegisterInvoiceType buildRegisterInvoiceRequest() throws DatatypeConfigurationException {
		RegisterInvoiceType registerInvoiceRequest = new RegisterInvoiceType();

		registerInvoiceRequest.setTaxRegistrationNumber(599999993);
		registerInvoiceRequest.setInvoiceNo("- /1");
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

}
