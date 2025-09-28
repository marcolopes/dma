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

import org.dma.java.util.RandomValue;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.ServiceCertificates;
import org.dma.services.at.proxy.StockMovementServiceHandler;

import pt.gov.portaldasfinancas.servicos.documentosTransporte.AddressStructurePT;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.Line;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementType;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.ResponseStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;
import pt.gov.portaldasfinancas.servicos.series.SeriesInfo;
import pt.gov.portaldasfinancas.servicos.series.types.MeioProcessamentoType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoDocType;
import pt.gov.portaldasfinancas.servicos.series.types.TipoSerieType;
import pt.gov.portaldasfinancas.servicos.series.types.requests.RegistarSeriesType;

/**
 * Teste de comunicacao de DOCUMENTOS TRANSPORTE
 */
public class StockMovementServiceTest extends StockMovementServiceHandler {

	public static final Integer RequesterTaxID = 599999993;

	public static final int DocumentNumberMax = 999999;

	public static final String InvoiceDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd");

	public static final String SystemEntryDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd'T'HH:mm:ss");

	public StockMovementServiceTest() {
		this(RequesterTaxID+"/0037", "testes1234");
	}

	public StockMovementServiceTest(String username, String password) {
		super(ENDPOINTS.TEST, username, password, ServiceCertificates.getInstance());
	}

	public static StockMovement build(int numero, SeriesInfo info) throws Exception {

		Line line = new Line();
		line.setProductDescription("Artigo");
		line.setQuantity(new BigDecimal(10));
		line.setUnitOfMeasure("UN");
		line.setUnitPrice(new BigDecimal(100));

		//--- REQUEST ---
		StockMovement request = new StockMovement();

		request.setTaxRegistrationNumber(RequesterTaxID);
		request.setCompanyName("Empresa");
		request.setCompanyAddress(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setDocumentNumber(info.getTipoDoc()+" "+info.getSerie()+"/"+numero);
		request.setATCUD(info.getCodValidacaoSerie()+"-"+numero);
		request.setMovementStatus(MovementStatus.N);
		request.setMovementType(MovementType.GT);
		request.setMovementDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceDate));
		request.setCustomerTaxID("999999990");
		request.setCustomerName("Cliente");
		request.setCustomerAddress(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setAddressTo(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setAddressFrom(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setMovementEndTime(TimeDateUtils.getXMLGregorianCalendar(SystemEntryDate));
		request.setMovementStartTime(TimeDateUtils.getXMLGregorianCalendar(SystemEntryDate));
		request.setVehicleID("XX-YY-ZZ");
		request.getLine().add(line);

		return request;

	}

	private static AddressStructurePT createAdressStructure(String addressdetail, String city, String postalCode, String country) throws Exception {

		AddressStructurePT addressStructure = new AddressStructurePT();
		//incluir o nome da rua, numero de policia e andar, se aplicavel.
		if (addressdetail!=null) addressStructure.setAddressdetail(addressdetail);
		if (city!=null) addressStructure.setCity(city);
		if (postalCode!=null) addressStructure.setPostalCode(postalCode);
		if (country!=null) addressStructure.setCountry(country);
		return addressStructure;

	}

	/*
	 * Print
	 */
	public static void print(StockMovementResponse response) {

		if (response!=null) try{

			System.out.println("Document Code: "+response.getATDocCodeID());
			System.out.println("Document Number: "+response.getDocumentNumber());
			for(ResponseStatus status: response.getResponseStatus()){
				System.out.print(status.getReturnCode());
				System.out.print(" - ");
				System.out.print(status.getReturnMessage());
				System.out.println();
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		try{
			StockMovement request=build(new RandomValue().nextInt(DocumentNumberMax)+1,
					new SeriesServiceTest().registar(new RegistarSeriesType(
							new RandomValue().numbers(SeriesServiceTest.SerieMaxLength),
							TipoSerieType.N, TipoDocType.GT, 1, TimeDateUtils.getCurrentDate(),
							SeriesServiceTest.NumCertSWFatur, MeioProcessamentoType.PI)));

			StockMovementServiceTest service=new StockMovementServiceTest();

			print(service.register(request));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
