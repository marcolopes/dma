package pt.gov.portaldasfinancas.servicos.documentosTransporte;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 *
 */
@WebServiceClient(
	name = "documentosTransporte",
	targetNamespace = "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/",
	wsdlLocation = "file:documentosTransporte.wsdl")
public class DocumentosTransporte_Service
	extends Service
{

	private final static URL DOCUMENTOSTRANSPORTE_WSDL_LOCATION;
	private final static WebServiceException DOCUMENTOSTRANSPORTE_EXCEPTION;
	private final static QName DOCUMENTOSTRANSPORTE_QNAME = new QName("https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", "documentosTransporte");

	static{
		URL url = null;
		WebServiceException e = null;
		try{
			url = new URL("file:documentosTransporte.wsdl");
		}catch(MalformedURLException ex){
			e = new WebServiceException(ex);
		}
		DOCUMENTOSTRANSPORTE_WSDL_LOCATION = url;
		DOCUMENTOSTRANSPORTE_EXCEPTION = e;
	}

	public DocumentosTransporte_Service(){
		super(__getWsdlLocation(), DOCUMENTOSTRANSPORTE_QNAME);
	}

	/*
	public DocumentosTransporte_Service(WebServiceFeature... features){
		super(__getWsdlLocation(), DOCUMENTOSTRANSPORTE_QNAME, features);
	}
	*/

	public DocumentosTransporte_Service(URL wsdlLocation){
		super(wsdlLocation, DOCUMENTOSTRANSPORTE_QNAME);
	}

	/*
	public DocumentosTransporte_Service(URL wsdlLocation, WebServiceFeature... features){
		super(wsdlLocation, DOCUMENTOSTRANSPORTE_QNAME, features);
	}

	public DocumentosTransporte_Service(URL wsdlLocation, QName serviceName){
		super(wsdlLocation, serviceName);
	}

	public DocumentosTransporte_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features){
		super(wsdlLocation, serviceName, features);
	}
	*/

	/**
	 *
	 * @return
	 *         returns DocumentosTransporte
	 */
	@WebEndpoint(name = "documentosTransporteSOAP")
	public DocumentosTransporte getDocumentosTransporteSOAP() {
		return super.getPort(new QName("https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", "documentosTransporteSOAP"), DocumentosTransporte.class);
	}

	/**
	 *
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return
	 *         returns DocumentosTransporte
	 */
	@WebEndpoint(name = "documentosTransporteSOAP")
	public DocumentosTransporte getDocumentosTransporteSOAP(WebServiceFeature... features) {
		return super.getPort(new QName("https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", "documentosTransporteSOAP"), DocumentosTransporte.class, features);
	}

	private static URL __getWsdlLocation() {
		if(DOCUMENTOSTRANSPORTE_EXCEPTION != null){
			throw DOCUMENTOSTRANSPORTE_EXCEPTION;
		}
		return DOCUMENTOSTRANSPORTE_WSDL_LOCATION;
	}

}
