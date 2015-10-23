package org.dma.services.at.test;

import java.math.BigDecimal;
import java.util.Random;

import javax.xml.datatype.DatatypeFactory;

import org.dma.java.security.JKSCertificate;
import org.dma.java.security.JKSCertificate.CERTIFICATE_TYPE;
import org.dma.services.at.proxy.DocumentosTransporteProxy;
import org.dma.services.at.proxy.DocumentosTransporteProxy.A10_ENDPOINTS;

import pt.gov.portaldasfinancas.servicos.documentosTransporte.AddressStructurePT;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.Line;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.MovementType;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.ResponseStatus;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;
/**
 * Teste de envio de DOCUMENTOS TRANSPORTE
 *
 * @author marcolopes@netc.pt
 *
 */
public class DocumentoTransporteRegister {

	public static StockMovement buildRequest() throws Exception {

		StockMovement request=new StockMovement();

		request.setTaxRegistrationNumber(599999993);
		request.setCompanyName("Empresa");
		request.setCompanyAddress(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setDocumentNumber("CGT 2013/"+new Random().nextInt(999999));
		request.setMovementStatus(MovementStatus.N);
		request.setMovementDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-07-01"));
		request.setMovementType(MovementType.GT);
		request.setCustomerTaxID("999999990");
		request.setCustomerName("Cliente");
		request.setCustomerAddress(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setAddressTo(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setAddressFrom(createAdressStructure("Rua","Localidade","1000-001","PT"));
		request.setMovementEndTime(DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-07-01T23:59:59"));
		request.setMovementStartTime(DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-07-01T23:00:00"));
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


	public static void main(String[] argvs){

		try{
			//ambiente de testes
			DocumentosTransporteProxy proxy=new DocumentosTransporteProxy(
				//Service Username / Password
				"599999993/0037", "testes1234",
				//Scheme Administrator Certificate - BUG? implementacao AT nao aceita chave de testes
				new JKSCertificate(CERTIFICATE_TYPE.JKS, "saPubKey.jks", "saKeyPubPass", "sapubkey.prod"),
				//Software Developer Certificate
				new JKSCertificate(CERTIFICATE_TYPE.PKCS12, "TesteWebServices.pfx", "TESTEwebservice", null),
				//Endpoint address
				A10_ENDPOINTS.TESTES);

			StockMovementResponse response=proxy.register(buildRequest());

			System.out.println(response.getATDocCodeID());
			for(ResponseStatus status: response.getResponseStatus()){
				System.out.println(status.getReturnCode());
				System.out.println(status.getReturnMessage());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
