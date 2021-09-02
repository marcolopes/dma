/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigDecimal;
import java.util.Random;

import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.Certificates;
import org.dma.services.at.proxy.StockMovementServiceHandler;
import org.dma.services.at.proxy.StockMovementServiceHandler.ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.documentosTransporte.AddressStructurePT;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.Line;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementType;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.ResponseStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;

/**
 * Teste de envio de DOCUMENTOS TRANSPORTE
 */
public class StockMovementServiceTest {

	public static final Integer RequesterTaxID = 599999993;
	public static final String InvoiceDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd");
	public static final String SystemEntryDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd'T'HH:mm:ss");

	public static final String ServiceUsername = RequesterTaxID+"/0037";
	public static final String ServicePassword = "testes1234";

	public static final StockMovementServiceHandler ServiceHandler = new StockMovementServiceHandler(
			ServiceUsername, ServicePassword, Certificates.ChavePublicaAT, Certificates.TesteWebservices, ENDPOINTS.TESTES);

	public static StockMovement buildRequest() throws Exception {

		StockMovement request=new StockMovement();

		request.setTaxRegistrationNumber(RequesterTaxID);
		request.setCompanyName("Empresa");
		request.setCompanyAddress(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setDocumentNumber("CGT 2013/"+new Random().nextInt(999999));
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

		Line line = new Line();
		line.setProductDescription("Artigo");
		line.setQuantity(new BigDecimal(10));
		line.setUnitOfMeasure("UN");
		line.setUnitPrice(new BigDecimal(100));
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


	public static void main(String[] argvs) {

		try{
			StockMovementResponse response=ServiceHandler.register(buildRequest());

			System.out.println(response.getATDocCodeID());
			System.out.println(response.getDocumentNumber());
			for(ResponseStatus status: response.getResponseStatus()){
				System.out.println(status.getReturnCode());
				System.out.println(status.getReturnMessage());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
