/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigDecimal;

import org.dma.java.security.ServiceCertificates;
import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.proxy.FaturasServiceHandler;

import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceResponseType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType.DocumentTotals;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType.Line;
import pt.gov.portaldasfinancas.servicos.faturas.Tax;

/**
 * Teste de comunicacao de FACTURAS
 */
public class FaturasServiceTest extends FaturasServiceHandler {

	public static final Integer RequesterTaxID = 599999993;

	public static final String InvoiceDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd");

	public static final ServiceCertificates ServiceCertificates = new ServiceCertificates(Certificates.ChavePublicaAT, Certificates.TesteWebservices);

	public FaturasServiceTest() {
		super(RequesterTaxID+"/0037", "testes1234", ServiceCertificates, ENDPOINTS.TEST);
	}

	public static RegisterInvoiceType build() throws Exception {

		RegisterInvoiceType type = new RegisterInvoiceType();

		type.setTaxRegistrationNumber(RequesterTaxID);
		type.setInvoiceNo("CFA 2012/"+new RandomValue().integer(6));
		type.setInvoiceDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceDate));
		type.setInvoiceType("FT");
		type.setInvoiceStatus("N");
		type.setCustomerTaxID(999999990);

		Tax tax = new Tax();
		tax.setTaxType("IVA");
		tax.setTaxCountryRegion("PT");
		tax.setTaxPercentage(new BigDecimal(23));

		Line line = new Line();
		line.setDebitAmount(new BigDecimal(100));
		line.setTax(tax);
		type.getLine().add(line);

		DocumentTotals documentTotals = new DocumentTotals();
		documentTotals.setTaxPayable(new BigDecimal(23));
		documentTotals.setNetTotal(new BigDecimal(100));
		documentTotals.setGrossTotal(new BigDecimal(123));

		type.setDocumentTotals(documentTotals);

		return type;

	}


	public static void main(String[] argvs) {

		try{
			FaturasServiceTest service = new FaturasServiceTest();

			RegisterInvoiceResponseType response = service.register(build());

			System.out.println(response.getReturnCode());
			System.out.println(response.getReturnMessage());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
