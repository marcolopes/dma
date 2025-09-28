/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.ServiceCertificates;
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
import pt.gov.portaldasfinancas.servicos.documentos.types.DeleteReasonType;
import pt.gov.portaldasfinancas.servicos.documentos.types.InvoiceStatusType;
import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.types.MeioProcessamentoType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.RegistarSeriesType;

/**
 * Teste de comunicacao de DOCUMENTOS
 */
public class DocumentosServiceTest extends DocumentosServiceHandler {

	public static final Integer RequesterTaxID = 599999993;

	public static final int DocumentNumberMax = 999999;

	public static final String EFaturaMDVersion = "0.0.1";

	public static final String InvoiceDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd");

	public static final String InvoiceStatusDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd'T'HH:mm:ss");

	public static final String SystemEntryDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd'T'HH:mm:ss");

	public static final BigInteger SoftwareCertificateNumber = new BigInteger("0");

	public DocumentosServiceTest() {
		this(RequesterTaxID+"/0037", "testes1234");
	}

	public DocumentosServiceTest(String username, String password) {
		super(ENDPOINTS.TEST, username, password, ServiceCertificates.getInstance());
	}

	public static RegisterInvoiceRequest build(int numero, SeriesInfo info) throws Exception {

		InvoiceStatus status = new InvoiceStatus();
		status.setInvoiceStatus(InvoiceStatusType.N.value());
		status.setInvoiceStatusDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceStatusDate));

		InvoiceDataType invoice = new InvoiceDataType();
		invoice.setInvoiceNo(info.getTipoDoc()+" "+info.getSerie()+"/"+numero);
		invoice.setATCUD(info.getCodValidacaoSerie()+"-"+numero);
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

		//--- REQUEST ---
		RegisterInvoiceRequest request = new RegisterInvoiceRequest();

		request.setEFaturaMDVersion(EFaturaMDVersion);
		request.setAuditFileVersion("1.04_01");
		request.setTaxRegistrationNumber(RequesterTaxID);
		request.setTaxEntity("Global");
		request.setSoftwareCertificateNumber(SoftwareCertificateNumber);
		request.setInvoiceData(invoice);

		return request;

	}

	/*
	 * Print
	 */
	public static void print(ResponseType response) {

		if (response!=null) try{

			System.out.print(response.getCodigoResposta());
			System.out.print(" - ");
			System.out.print(response.getMensagem());
			System.out.println();

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {

		try{
			RegisterInvoiceRequest request=build(new RandomValue().nextInt(DocumentNumberMax)+1,
					new SeriesServiceTest().registar(new RegistarSeriesType(
							new RandomValue().numbers(SeriesServiceTest.SerieMaxLength),
							TipoSerieType.N, TipoDocType.FT, 1, TimeDateUtils.getCurrentDate(),
							SeriesServiceTest.NumCertSWFatur, MeioProcessamentoType.PI)));

			DocumentosServiceTest service=new DocumentosServiceTest();

			print(service.registerInvoice(request));
			print(service.changeInvoiceStatus(request, InvoiceStatusType.A));
			print(service.deleteInvoice(request, DeleteReasonType.ER));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
