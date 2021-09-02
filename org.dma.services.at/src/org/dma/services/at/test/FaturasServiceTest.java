/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigDecimal;

import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.Certificates;
import org.dma.services.at.proxy.FaturasServiceHandler;
import org.dma.services.at.proxy.FaturasServiceHandler.ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceResponseType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType.DocumentTotals;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType.Line;
import pt.gov.portaldasfinancas.servicos.faturas.Tax;

/**
 * Teste de envio de FACTURAS
 */
public class FaturasServiceTest {

	public static final Integer RequesterTaxID = 599999993;
	public static final String InvoiceDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd");

	public static final String ServiceUsername = RequesterTaxID+"/0037";
	public static final String ServicePassword = "testes1234";

	public static final FaturasServiceHandler ServiceHandler = new FaturasServiceHandler(
			ServiceUsername, ServicePassword, Certificates.ChavePublicaAT, Certificates.TesteWebservices, ENDPOINTS.TESTES);

	public static RegisterInvoiceType buildRequest() throws Exception {

		RegisterInvoiceType request = new RegisterInvoiceType();

		request.setTaxRegistrationNumber(RequesterTaxID);
		request.setInvoiceNo("CFA 2018/"+new RandomValue().integer(6));
		request.setInvoiceDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceDate));
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
			RegisterInvoiceResponseType response=ServiceHandler.register(buildRequest());

			System.out.println(response.getReturnCode());
			System.out.println(response.getReturnMessage());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
