/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
import java.util.Random;

import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.ServiceCertificates;
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
		this(RequesterTaxID+"/0037", "testes1234");
	}

	public FaturasServiceTest(String username, String password) {
		super(ENDPOINTS.TEST, username, password, ServiceCertificates);
	}

	public static RegisterInvoiceType build(int numero) throws Exception {

		Tax tax = new Tax();
		tax.setTaxType("IVA");
		tax.setTaxCountryRegion("PT");
		tax.setTaxPercentage(new BigDecimal(23));

		Line line = new Line();
		line.setDebitAmount(new BigDecimal(100));
		line.setTax(tax);

		DocumentTotals documentTotals = new DocumentTotals();
		documentTotals.setTaxPayable(new BigDecimal(23));
		documentTotals.setNetTotal(new BigDecimal(100));
		documentTotals.setGrossTotal(new BigDecimal(123));

		//--- REQUEST ---
		RegisterInvoiceType request = new RegisterInvoiceType();

		request.setTaxRegistrationNumber(RequesterTaxID);
		request.setInvoiceNo("CFA 2012/"+numero);
		request.setInvoiceDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceDate));
		request.setInvoiceType("FT");
		request.setInvoiceStatus("N");
		request.setCustomerTaxID(999999990);
		request.getLine().add(line);
		request.setDocumentTotals(documentTotals);

		return request;

	}

	/*
	 * Print
	 */
	public static void print(RegisterInvoiceResponseType response) {

		if (response!=null) try{

			System.out.print(response.getReturnCode());
			System.out.print(" - ");
			System.out.print(response.getReturnMessage());
			System.out.println();

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {

		try{
			RegisterInvoiceType request=build(new Random().nextInt(999999));

			FaturasServiceTest service=new FaturasServiceTest();

			print(service.register(request));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
