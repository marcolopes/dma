/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.services.vies;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.Holder;

import eu.europa.ec.taxud.vies.services.checkvat.CheckVatPortType;
import eu.europa.ec.taxud.vies.services.checkvat.CheckVatService;

public class CheckVatNumber {

	public static CheckVatResult run(String countryCode, String vatNumber) {

		try{
			CheckVatService service=new CheckVatService();

			System.out.println("Please read disclaimer from service provider at:");
			System.out.println(service.getWSDLDocumentLocation());
			System.out.println("Querying VAT Information Exchange System (VIES) via web service...");
			System.out.println("Country: "+countryCode);
			System.out.println("Vat Number: "+vatNumber);

			Holder<Boolean> valid=new Holder(new Boolean(true));
			Holder<String> name=new Holder(new String());
			Holder<String> address=new Holder(new String());

			CheckVatPortType servicePort=service.getCheckVatPort();
			servicePort.checkVat(new Holder(countryCode), new Holder(vatNumber),
					new Holder(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar())),
					valid, name, address);

			return new CheckVatResult(valid.value, name.value, address.value);

		}catch(DatatypeConfigurationException e){
			e.printStackTrace();
		}

		return null;

	}


	public static void main(String[] args) {

		CheckVatResult result=run("PT", "505636700");
		System.out.println(result);

	}


}