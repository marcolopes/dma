/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.proxy;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.ServiceCertificates;
import org.dma.java.util.TimeDateUtils;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.documentos.ChangeInvoiceStatusRequest;
import pt.gov.portaldasfinancas.servicos.documentos.ChangePaymentStatusRequest;
import pt.gov.portaldasfinancas.servicos.documentos.ChangeWorkStatusRequest;
import pt.gov.portaldasfinancas.servicos.documentos.DeleteInvoiceRequest;
import pt.gov.portaldasfinancas.servicos.documentos.DeletePaymentRequest;
import pt.gov.portaldasfinancas.servicos.documentos.DeleteWorkRequest;
import pt.gov.portaldasfinancas.servicos.documentos.FatcorewsPort;
import pt.gov.portaldasfinancas.servicos.documentos.FatcorewsPortService;
import pt.gov.portaldasfinancas.servicos.documentos.InvoiceHeaderType;
import pt.gov.portaldasfinancas.servicos.documentos.ListInvoiceDocumentsType;
import pt.gov.portaldasfinancas.servicos.documentos.NewInvoiceStatusType;
import pt.gov.portaldasfinancas.servicos.documentos.RegisterInvoiceRequest;
import pt.gov.portaldasfinancas.servicos.documentos.RegisterPaymentRequest;
import pt.gov.portaldasfinancas.servicos.documentos.RegisterWorkRequest;
import pt.gov.portaldasfinancas.servicos.documentos.ResponseType;
import pt.gov.portaldasfinancas.servicos.documentos.types.DeleteReasonType;
import pt.gov.portaldasfinancas.servicos.documentos.types.InvoiceStatusType;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class DocumentosServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		PROD ("https://servicos.portaldasfinancas.gov.pt:423/fatcorews/ws/"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:723/fatcorews/ws/");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final FatcorewsPort service = new FatcorewsPortService().getFatcorewsPortSoap11();

	private FatcorewsPort getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public DocumentosServiceHandler(String username, String password, ServiceCertificates cert, ENDPOINTS endpoint) {
		super(username, password, cert);
		this.endpoint = endpoint;
	}


	/*
	 * Invoice
	 */
	public ResponseType registerInvoice(RegisterInvoiceRequest request) throws WebServiceException {
		return getService().registerInvoice(request).getResponse();
	}

	public ResponseType changeInvoiceStatus(ChangeInvoiceStatusRequest request) throws WebServiceException {
		return getService().changeInvoiceStatus(request).getResponse();
	}

	public ResponseType changeInvoiceStatus(RegisterInvoiceRequest request, InvoiceStatusType status) throws WebServiceException {
		ChangeInvoiceStatusRequest newRequest = new ChangeInvoiceStatusRequest();

		newRequest.setEFaturaMDVersion(request.getEFaturaMDVersion());
		newRequest.setTaxRegistrationNumber(request.getTaxRegistrationNumber());

		InvoiceHeaderType header = new InvoiceHeaderType();
		header.setInvoiceNo(request.getInvoiceData().getInvoiceNo());
		header.setATCUD(request.getInvoiceData().getATCUD());
		header.setInvoiceDate(request.getInvoiceData().getInvoiceDate());
		header.setInvoiceType(request.getInvoiceData().getInvoiceType());
		header.setSelfBillingIndicator(request.getInvoiceData().getSelfBillingIndicator());
		header.setCustomerTaxID(request.getInvoiceData().getCustomerTaxID());
		header.setCustomerTaxIDCountry(request.getInvoiceData().getCustomerTaxIDCountry());
		newRequest.setInvoiceHeader(header);

		NewInvoiceStatusType newStatus = new NewInvoiceStatusType();
		newStatus.setInvoiceStatus(status.value());
		newStatus.setInvoiceStatusDate(TimeDateUtils.getXMLGregorianCalendar());
		newRequest.setInvoiceStatus(newStatus);

		return changeInvoiceStatus(newRequest);
	}

	public ResponseType deleteInvoice(DeleteInvoiceRequest request) throws WebServiceException {
		return getService().deleteInvoice(request).getResponse();
	}

	public ResponseType deleteInvoice(RegisterInvoiceRequest request, DeleteReasonType reason) throws WebServiceException {
		DeleteInvoiceRequest newRequest = new DeleteInvoiceRequest();

		newRequest.setEFaturaMDVersion(request.getEFaturaMDVersion());
		newRequest.setTaxRegistrationNumber(request.getTaxRegistrationNumber());

		InvoiceHeaderType header = new InvoiceHeaderType();
		header.setInvoiceNo(request.getInvoiceData().getInvoiceNo());
		header.setATCUD(request.getInvoiceData().getATCUD());
		header.setInvoiceDate(request.getInvoiceData().getInvoiceDate());
		header.setInvoiceType(request.getInvoiceData().getInvoiceType());
		header.setSelfBillingIndicator(request.getInvoiceData().getSelfBillingIndicator());
		header.setCustomerTaxID(request.getInvoiceData().getCustomerTaxID());
		header.setCustomerTaxIDCountry(request.getInvoiceData().getCustomerTaxIDCountry());

		ListInvoiceDocumentsType list = new ListInvoiceDocumentsType();
		list.getInvoice().add(header);
		newRequest.setDocumentsList(list);

		newRequest.setReason(reason.value());

		return deleteInvoice(newRequest);
	}


	/*
	 * Work
	 */
	public ResponseType registerWork(RegisterWorkRequest request) throws WebServiceException {
		return getService().registerWork(request).getResponse();
	}

	public ResponseType changeWorkStatus(ChangeWorkStatusRequest request) throws WebServiceException {
		return getService().changeWorkStatus(request).getResponse();
	}

	public ResponseType deleteWork(DeleteWorkRequest request) throws WebServiceException {
		return getService().deleteWork(request).getResponse();
	}


	/*
	 * Payment
	 */
	public ResponseType registerPayment(RegisterPaymentRequest request) throws WebServiceException {
		return getService().registerPayment(request).getResponse();
	}

	public ResponseType changePaymentStatus(ChangePaymentStatusRequest request) throws WebServiceException {
		return getService().changePaymentStatus(request).getResponse();
	}

	public ResponseType deletePayment(DeletePaymentRequest request) throws WebServiceException {
		return getService().deletePayment(request).getResponse();
	}


}