/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.test;

import java.math.BigDecimal;
import java.util.Random;

import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.Certificates;
import org.dma.services.at.proxy.StockMovementServiceHandler;

import pt.gov.portaldasfinancas.servicos.documentosTransporte.AddressStructurePT;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.Line;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementType;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.ResponseStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;

/**
 * Teste de comunicacao de DOCUMENTOS TRANSPORTE
 */
public class StockMovementServiceTest extends StockMovementServiceHandler {

	public static final Integer RequesterTaxID = 599999993;

	public static final String InvoiceDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd");

	public static final String SystemEntryDate = TimeDateUtils.getDateFormatted("yyyy-MM-dd'T'HH:mm:ss");

	public StockMovementServiceTest() {
		super(RequesterTaxID+"/0037", "testes1234", Certificates.ChavePublicaAT, Certificates.TesteWebservices, ENDPOINTS.TESTES);
	}

	public static StockMovement build() throws Exception {

		StockMovement type = new StockMovement();

		type.setTaxRegistrationNumber(RequesterTaxID);
		type.setCompanyName("Empresa");
		type.setCompanyAddress(createAdressStructure("Rua","Localidade","1000-001","PT"));
		type.setDocumentNumber("CGT 2013/"+new Random().nextInt(999999));
		type.setMovementStatus(MovementStatus.N);
		type.setMovementType(MovementType.GT);
		type.setMovementDate(TimeDateUtils.getXMLGregorianCalendar(InvoiceDate));
		type.setCustomerTaxID("999999990");
		type.setCustomerName("Cliente");
		type.setCustomerAddress(createAdressStructure("Rua","Localidade","1000-001","PT"));
		type.setAddressTo(createAdressStructure("Rua","Localidade","1000-001","PT"));
		type.setAddressFrom(createAdressStructure("Rua","Localidade","1000-001","PT"));
		type.setMovementEndTime(TimeDateUtils.getXMLGregorianCalendar(SystemEntryDate));
		type.setMovementStartTime(TimeDateUtils.getXMLGregorianCalendar(SystemEntryDate));
		type.setVehicleID("XX-YY-ZZ");

		Line line = new Line();
		line.setProductDescription("Artigo");
		line.setQuantity(new BigDecimal(10));
		line.setUnitOfMeasure("UN");
		line.setUnitPrice(new BigDecimal(100));
		type.getLine().add(line);

		return type;

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
			StockMovementServiceTest service = new StockMovementServiceTest();

			StockMovementResponse response = service.register(build());

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
