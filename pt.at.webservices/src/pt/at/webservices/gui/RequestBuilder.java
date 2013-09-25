package pt.at.webservices.gui;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import pt.at.webservices.factemipf.client.RegisterInvoiceType;
import pt.at.webservices.factemipf.client.Tax;
import pt.at.webservices.sgdt.client.AddressStructurePT;
import pt.at.webservices.sgdt.client.Line;
import pt.at.webservices.sgdt.client.MovementStatus;
import pt.at.webservices.sgdt.client.MovementType;
import pt.at.webservices.sgdt.client.StockMovement;

/**
 * Cria um request bean para a operação de registo de factura.
 * Este bean é criado de forma a forçar um erro de validação do lado do servidor.
 * Apenas se pretende testar a comunicação com o servidor, pelo que não faz sentido inserir uma factura.
 *
 * @author ricardo
 */
public final class RequestBuilder {
	private static final long DEFAULT_NIF = 599999993;
	private RequestBuilder() {
	}

	public static RegisterInvoiceType buildRegisterInvoiceRequest() throws DatatypeConfigurationException {
		RegisterInvoiceType registerInvoiceRequest = new RegisterInvoiceType();

		registerInvoiceRequest.setTaxRegistrationNumber((int)DEFAULT_NIF);
		registerInvoiceRequest.setInvoiceNo("- /1");
		registerInvoiceRequest.setInvoiceDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-05-05"));
		registerInvoiceRequest.setInvoiceType("FT");
		registerInvoiceRequest.setInvoiceStatus("N");
		registerInvoiceRequest.setCustomerTaxID(299999998);


		RegisterInvoiceType.Line line = new RegisterInvoiceType.Line();
		line.setCreditAmount(new BigDecimal(100));

		Tax taxa = new Tax();
		taxa.setTaxType("IVA");
		taxa.setTaxCountryRegion("PT");
		taxa.setTaxPercentage(new BigDecimal(23));

		line.setTax(taxa);
		registerInvoiceRequest.getLine().add(line);

		RegisterInvoiceType.DocumentTotals documentTotals = new RegisterInvoiceType.DocumentTotals();
		documentTotals.setTaxPayable(new BigDecimal(23));
		documentTotals.setNetTotal(new BigDecimal(100));
		documentTotals.setGrossTotal(new BigDecimal(123));

		registerInvoiceRequest.setDocumentTotals(documentTotals);

		return registerInvoiceRequest;
	}

	public static StockMovement buildEnvioDocumentoTransporteRequest(String user) throws DatatypeConfigurationException {
		int nif, index;

		if ((index = user.indexOf("/")) != -1) {
			nif = new Integer(user.substring(0, index));
		} else {
			nif = new Integer(user);
		}
		StockMovement request = new StockMovement();
		request.setDocumentNumber("11");
		request.setCompanyName("Bla");
		request.setTaxRegistrationNumber(nif);
		request.setMovementStatus(MovementStatus.N);
		Calendar movementDate = Calendar.getInstance();
		request.setMovementDate(convertFromCalendar(movementDate));
		request.setMovementType(MovementType.GR);
		request.setCustomerTaxID(String.valueOf(nif));
		Calendar movementStartTime = (Calendar) movementDate.clone();
		movementStartTime.add(Calendar.MONTH, 1);
		request.setMovementStartTime(convertFromCalendar(movementStartTime));

		Calendar movementEndTimeCalendar = (Calendar) movementStartTime.clone();
		movementEndTimeCalendar.add(Calendar.HOUR, 1);
		request.setMovementEndTime(convertFromCalendar(movementEndTimeCalendar));
		request.setVehicleID("10-10-AA");

		AddressStructurePT companyAddress = new AddressStructurePT();
		companyAddress.setAddressdetail("Morada Empresa");
		companyAddress.setCity("Cidade Empresa");
		companyAddress.setPostalCode("1000-100");
		companyAddress.setCountry("PT");
		request.setCompanyAddress(companyAddress);

		AddressStructurePT customerAddress = new AddressStructurePT();
		customerAddress.setAddressdetail("Morada Cliente");
		customerAddress.setCity("Cidade Cliente");
		customerAddress.setPostalCode("1000-100");
		customerAddress.setCountry("PT");
		request.setCustomerAddress(customerAddress);

		AddressStructurePT addressTo = new AddressStructurePT();
		addressTo.setAddressdetail("Morada Descarga");
		addressTo.setCity("Cidade Descarga");
		addressTo.setPostalCode("1000-100");
		addressTo.setCountry("PT");
		request.setAddressTo(addressTo);

		AddressStructurePT addressFrom = new AddressStructurePT();
		addressFrom.setAddressdetail("Morada Carga");
		addressFrom.setCity("Cidade Carga");
		addressFrom.setPostalCode("1000-100");
		addressFrom.setCountry("PT");
		request.setAddressFrom(addressFrom);

		Line bem = new Line();
		bem.setProductDescription("Produto1");
		bem.setQuantity(BigDecimal.valueOf(1));
		bem.setUnitOfMeasure("KG");
		bem.setUnitPrice(BigDecimal.valueOf(1.1));
		request.getLine().add(bem);
		request.setTaxRegistrationNumber(nif);
		return request;
	}

	private static final XMLGregorianCalendar convertFromCalendar(Calendar calendar) throws DatatypeConfigurationException {
		GregorianCalendar gregCalendar = new GregorianCalendar();
		gregCalendar.setTimeInMillis(calendar.getTimeInMillis());
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCalendar);
	}
}