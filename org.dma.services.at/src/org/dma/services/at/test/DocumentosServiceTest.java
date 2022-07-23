/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.Certificates;
import org.dma.services.at.proxy.DocumentosServiceHandler;

import pt.gov.portaldasfinancas.servicos.documentos.DebitCreditIndicator;
import pt.gov.portaldasfinancas.servicos.documentos.DocumentTotals;
import pt.gov.portaldasfinancas.servicos.documentos.InvoiceDataType;
import pt.gov.portaldasfinancas.servicos.documentos.InvoiceDataType.LineSummary;
import pt.gov.portaldasfinancas.servicos.documentos.InvoiceStatus;
import pt.gov.portaldasfinancas.servicos.documentos.InvoiceTypeType;
import pt.gov.portaldasfinancas.servicos.documentos.RegisterInvoiceRequest;
import pt.gov.portaldasfinancas.servicos.documentos.ResponseType;
import pt.gov.portaldasfinancas.servicos.documentos.Tax;
import pt.gov.portaldasfinancas.servicos.documentos.TaxType;

/**
 * Teste de comunicacao de DOCUMENTOS
 */
public class DocumentosServiceTest extends DocumentosServiceHandler {

	public static final Integer RequesterTaxID = 599999993;

	public static final String InvoiceDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd");

	public static final String InvoiceStatusDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd'T'HH:mm:ss");

	public static final String SystemEntryDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd'T'HH:mm:ss");

	public static final BigInteger SoftwareCertificateNumber = new BigInteger("0");

	public DocumentosServiceTest() {
		super(RequesterTaxID+"/0037", "testes1234", Certificates.ChavePublicaAT, Certificates.TesteWebservices, ENDPOINTS.TESTES);
	}

	public static RegisterInvoiceRequest build() throws Exception {

		RegisterInvoiceRequest type = new RegisterInvoiceRequest();

		type.setEFaturaMDVersion("0.0.1");
		type.setAuditFileVersion("1.04_01");
		type.setTaxRegistrationNumber(RequesterTaxID);
		type.setTaxEntity("Global");
		type.setSoftwareCertificateNumber(SoftwareCertificateNumber);

		InvoiceStatus status = new InvoiceStatus();
		status.setInvoiceStatus("N");
		status.setInvoiceStatusDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceStatusDate));

		InvoiceDataType invoice = new InvoiceDataType();
		invoice.setInvoiceNo("CFA 2022/"+new RandomValue().integer(6));
		invoice.setATCUD("0");
		invoice.setInvoiceDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceDate));
		invoice.setInvoiceType(InvoiceTypeType.FT);
		invoice.setSelfBillingIndicator(BigInteger.ZERO);
		invoice.setCustomerTaxID("999999990");
		invoice.setCustomerTaxIDCountry("PT");
		invoice.setDocumentStatus(status);
		invoice.setHashCharacters("0");
		invoice.setCashVATSchemeIndicator(0);
		invoice.setPaperLessIndicator(0);
		invoice.setSystemEntryDate(TimeDateUtils.getXMLGregorianCalendar(SystemEntryDate));

		Tax tax = new Tax();
		tax.setTaxType(TaxType.IVA);
		tax.setTaxCountryRegion("PT");
		tax.setTaxCode("NOR");
		tax.setTaxPercentage(new BigDecimal(23));

		LineSummary line = new LineSummary();
		line.setTaxPointDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceDate));
		line.setDebitCreditIndicator(DebitCreditIndicator.D);
		line.setAmount(new BigDecimal(100));
		line.setTax(tax);
		invoice.getLineSummary().add(line);

		DocumentTotals documentTotals = new DocumentTotals();
		documentTotals.setTaxPayable(new BigDecimal(23));
		documentTotals.setNetTotal(new BigDecimal(100));
		documentTotals.setGrossTotal(new BigDecimal(123));

		invoice.setDocumentTotals(documentTotals);

		type.setInvoiceData(invoice);

		return type;

	}


	public static void main(String[] argvs) {

		try{
			DocumentosServiceTest service = new DocumentosServiceTest();

			ResponseType response = service.register(build());

			System.out.println(response.getCodigoResposta());
			System.out.println(response.getMensagem());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
