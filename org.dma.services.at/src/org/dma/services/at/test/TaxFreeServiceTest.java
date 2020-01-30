/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigDecimal;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.proxy.TaxFreeServiceHandler;
import org.dma.services.at.proxy.TaxFreeServiceHandler.ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.taxfree.BuyerType;
import pt.gov.portaldasfinancas.servicos.taxfree.CalculatedTaxType;
import pt.gov.portaldasfinancas.servicos.taxfree.CalculatedTaxesType;
import pt.gov.portaldasfinancas.servicos.taxfree.CompanyType;
import pt.gov.portaldasfinancas.servicos.taxfree.IdentityDocType;
import pt.gov.portaldasfinancas.servicos.taxfree.InvoiceIdentifiersType;
import pt.gov.portaldasfinancas.servicos.taxfree.InvoiceLineType;
import pt.gov.portaldasfinancas.servicos.taxfree.InvoiceLinesListType;
import pt.gov.portaldasfinancas.servicos.taxfree.InvoiceType;
import pt.gov.portaldasfinancas.servicos.taxfree.InvoicesListType;
import pt.gov.portaldasfinancas.servicos.taxfree.InvoicesType;
import pt.gov.portaldasfinancas.servicos.taxfree.RefundType;
import pt.gov.portaldasfinancas.servicos.taxfree.RequestHeaderType;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeCommType;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionRequestType;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionResponseType;
/**
 * Teste de eTaxFree
 */
public class TaxFreeServiceTest {

	public static final Integer RequesterTaxID = 599999993;

	public static TaxFreeSubmissionRequestType buildRequest() throws Exception {

		//--- HEADER ---
		RequestHeaderType header = new RequestHeaderType();
		header.setRequesterTaxID(RequesterTaxID);

		//--- COMPANY ---
		CompanyType company = new CompanyType();
		company.setTaxRegistrationNumber(RequesterTaxID);
		company.setBusinessName("Empresa");
		company.setEmail("tax@empresa.com");

		//--- BUYER ---
		BuyerType buyer = new BuyerType();
		buyer.setName("Turista nao europeu");
		buyer.setResidenceCountryCode("BR");
		buyer.setTaxRegistrationNumber(123456789);
		buyer.setBirthDate(TimeDateUtils.getXMLGregorianCalendar("2001-09-11"));

		IdentityDocType identity = new IdentityDocType();
		identity.setType("PASSAPORTE");
		identity.setNumber(new RandomValue().numbers(9));
		identity.setCountryCode("BR");
		buyer.setIdentityDoc(identity);

		//--- REFUND ---
		RefundType refund = new RefundType();
		refund.setGuaranteeTotal(new BigDecimal("0.00"));
		refund.setCalculatedTaxTotal(new BigDecimal("46.00"));

		//--- INVOICES ---
		InvoicesType invoices = new InvoicesType();
		invoices.setNumberOfEntries(1);
		//invoices.setInvoicesGrossTotal(new BigDecimal("200.00"));
		//invoices.setCalculatedTaxes(taxes);

		InvoiceIdentifiersType invoiceIdentifiers = new InvoiceIdentifiersType();
		invoiceIdentifiers.setInvoiceNo("CFA 2018/"+new RandomValue().numbers(6));
		invoiceIdentifiers.setHashTermination(new RandomValue().letters(4));

		/*
		SimpleBuyerType simpleBuyer = new SimpleBuyerType();
		simpleBuyer.setCompanyName("Turista nao europeu");
		VatNumberInfoType vatNumberInfo = new VatNumberInfoType();
		vatNumberInfo.setCustomerTaxID("123456789");
		vatNumberInfo.setCountryCode("BR");
		simpleBuyer.setVatNumberInfo(vatNumberInfo);
		*/

		CalculatedTaxesType taxes = new CalculatedTaxesType();
		CalculatedTaxType tax = new CalculatedTaxType();
		tax.setTaxPercentage(new BigDecimal("23.00"));
		tax.setTaxAmount(new BigDecimal("46.00"));
		taxes.getCalculatedTax().add(tax);

		InvoiceType invoice = new InvoiceType();
		//invoice.setATCUD(StringUtils.numbers(100));
		invoice.setInvoiceIdentifiers(invoiceIdentifiers);
		invoice.setInvoiceType("FT");
		invoice.setInvoiceDate(TimeDateUtils.getXMLGregorianCalendar(/*"2018-12-31"*/));
		//invoice.setBuyer(simpleBuyer);
		invoice.setGrossTotal(new BigDecimal("246.00"));
		invoice.setRefundableAmount(new BigDecimal("46.00"));
		invoice.setCalculatedTaxes(taxes);

		//--- INVOICE LINES ---
		InvoiceLineType invoiceLine = new InvoiceLineType();
		invoiceLine.setProductClass("ALI");
		invoiceLine.setProductDescription("Vinho do Porto");
		invoiceLine.setQuantity(new BigDecimal("1.00"));
		invoiceLine.setTaxBaseTotal(new BigDecimal("200.00"));

		InvoiceLinesListType invoiceLinesList = new InvoiceLinesListType();
		invoiceLinesList.getInvoiceLine().add(invoiceLine);
		invoice.setInvoiceLinesList(invoiceLinesList);

		//--- INVOICES LIST ---
		InvoicesListType invoicesList = new InvoicesListType();
		invoicesList.getInvoice().add(invoice);
		invoices.setInvoicesList(invoicesList);

		//--- TAX FREE ---
		TaxFreeCommType taxFree = new TaxFreeCommType();
		taxFree.setIdentifier(new RandomValue().numbers(9));
		taxFree.setSeller(company);
		taxFree.setBuyer(buyer);
		taxFree.setRefund(refund);
		taxFree.setInvoices(invoices);

		//--- REQUEST ---
		TaxFreeSubmissionRequestType request = new TaxFreeSubmissionRequestType();
		request.setRequestHeader(header);
		request.setTaxFreeComm(taxFree);

		return request;

	}


	public static void main(String[] argvs) {

		try{
			//ambiente de testes
			TaxFreeServiceHandler handler=new TaxFreeServiceHandler(
				//Service Username / Password
				RequesterTaxID+"/0037", "testes1234",
				//Scheme Administrator Certificate - BUG? implementacao AT nao aceita chave de testes
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/saPubKey.jks", "saKeyPubPass", "sapubkey.prod"),
				//Software Developer Certificate
				new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "certificates/TesteWebservices.pfx", "TESTEwebservice"),
				//Trusted Store Certificate
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "certificates/TrustStoreAT.jks", "123456", "portaldasfinancas"),
				//Endpoint address
				ENDPOINTS.TESTES);

			TaxFreeSubmissionResponseType response=handler.register(buildRequest());

			System.out.println(response.getReturnInfo().getReturnCode());
			System.out.println(response.getReturnInfo().getReturnMessage());
			if (response.getTaxFreeCommRegistration()!=null){
				System.out.println(response.getTaxFreeCommRegistration().getTaxFreeCommCode());
				System.out.println(response.getTaxFreeCommRegistration().getQRCodeContent());
				System.out.println(response.getTaxFreeCommRegistration().getRegistrationDateTime());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
