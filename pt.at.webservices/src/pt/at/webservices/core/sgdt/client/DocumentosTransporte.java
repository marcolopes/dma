
package pt.at.webservices.core.sgdt.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "documentosTransporte", targetNamespace = "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DocumentosTransporte {


    /**
     * 
     * @param stockMovement
     * @return
     *     returns pt.at.sgdt.ws.client.StockMovementResponse
     */
    @WebMethod(action = "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/")
    @WebResult(name = "envioDocumentoTransporteResponseElem", targetNamespace = "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", partName = "StockMovementResponse")
    public StockMovementResponse envioDocumentoTransporte(
        @WebParam(name = "envioDocumentoTransporteRequestElem", targetNamespace = "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", partName = "StockMovement")
        StockMovement stockMovement);

}
