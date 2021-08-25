
package com.generixgroup.pt.messaging.webservice;

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
@WebServiceClient(name = "WebserviceService", targetNamespace = "http://webservice.messaging.pt.generixgroup.com/", wsdlLocation = "file:/C:/workspace/dev/org.dma.services.feap/wsdl/NetixMessaging-1.2.0.wsdl")
public class WebserviceService
    extends Service
{

    private final static URL WEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICESERVICE_EXCEPTION;
    private final static QName WEBSERVICESERVICE_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "WebserviceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/workspace/dev/org.dma.services.feap/wsdl/NetixMessaging-1.2.0.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICESERVICE_WSDL_LOCATION = url;
        WEBSERVICESERVICE_EXCEPTION = e;
    }

    public WebserviceService() {
        super(__getWsdlLocation(), WEBSERVICESERVICE_QNAME);
    }

    public WebserviceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICESERVICE_QNAME, features);
    }

    public WebserviceService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICESERVICE_QNAME);
    }

    public WebserviceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICESERVICE_QNAME, features);
    }

    public WebserviceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebserviceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Webservice
     */
    @WebEndpoint(name = "WebservicePort")
    public Webservice getWebservicePort() {
        return super.getPort(new QName("http://webservice.messaging.pt.generixgroup.com/", "WebservicePort"), Webservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Webservice
     */
    @WebEndpoint(name = "WebservicePort")
    public Webservice getWebservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.messaging.pt.generixgroup.com/", "WebservicePort"), Webservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICESERVICE_EXCEPTION!= null) {
            throw WEBSERVICESERVICE_EXCEPTION;
        }
        return WEBSERVICESERVICE_WSDL_LOCATION;
    }

}
