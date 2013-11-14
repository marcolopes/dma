/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.services.vies;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import eu.europa.ec.taxud.vies.services.checkvat.CheckVatPortType;
import eu.europa.ec.taxud.vies.services.checkvat.CheckVatService;

public class CheckVatNumber {

	public static CheckVatResult run(String countryCode, String vatNumber) {

		try{
			CheckVatService service = new CheckVatService();

			System.out.println("Please read disclaimer from service provider at:");
			System.out.println(service.getWSDLDocumentLocation());
			System.out.println("Querying VAT Information Exchange System (VIES) via web service...");
			System.out.println("Country: "+countryCode);
			System.out.println("Vat Number: "+vatNumber);

			Holder<String> holderCountryCode = new Holder(countryCode);
			Holder<String> holderVatNumber = new Holder(vatNumber);
			Holder<XMLGregorianCalendar> holderRequestDate = new Holder(DatatypeFactory.newInstance().
					newXMLGregorianCalendar(new GregorianCalendar()));
			Holder<Boolean> holderValid = new Holder(new Boolean(true));
			Holder<String> holderName = new Holder(new String());
			Holder<String> holderAddress = new Holder(new String());

			CheckVatPortType servicePort = service.getCheckVatPort();
			servicePort.checkVat(holderCountryCode, holderVatNumber,
					holderRequestDate, holderValid, holderName, holderAddress);

			CheckVatResult result = new CheckVatResult(holderValid.value, holderName.value, holderAddress.value);

			System.out.println(result);

			return result;

		}catch(DatatypeConfigurationException e){
			e.printStackTrace();
		}

		return null;

	}


	public static void main(String[] args) {

		run("PT", "505636700");

	}


}