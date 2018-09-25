
package pt.gov.portaldasfinancas.servicos.documentosTransporte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.servicos_portaldasfinancas_gov_pt.sgdtws.documentostransporte package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnvioDocumentoTransporteRequestElem_QNAME = new QName("https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", "envioDocumentoTransporteRequestElem");
    private final static QName _EnvioDocumentoTransporteResponseElem_QNAME = new QName("https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", "envioDocumentoTransporteResponseElem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.servicos_portaldasfinancas_gov_pt.sgdtws.documentostransporte
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockMovementResponse }
     * 
     */
    public StockMovementResponse createStockMovementResponse() {
        return new StockMovementResponse();
    }

    /**
     * Create an instance of {@link StockMovement }
     * 
     */
    public StockMovement createStockMovement() {
        return new StockMovement();
    }

    /**
     * Create an instance of {@link OrderReferences }
     * 
     */
    public OrderReferences createOrderReferences() {
        return new OrderReferences();
    }

    /**
     * Create an instance of {@link AddressStructurePT }
     * 
     */
    public AddressStructurePT createAddressStructurePT() {
        return new AddressStructurePT();
    }

    /**
     * Create an instance of {@link ResponseStatus }
     * 
     */
    public ResponseStatus createResponseStatus() {
        return new ResponseStatus();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockMovement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", name = "envioDocumentoTransporteRequestElem")
    public JAXBElement<StockMovement> createEnvioDocumentoTransporteRequestElem(StockMovement value) {
        return new JAXBElement<StockMovement>(_EnvioDocumentoTransporteRequestElem_QNAME, StockMovement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockMovementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", name = "envioDocumentoTransporteResponseElem")
    public JAXBElement<StockMovementResponse> createEnvioDocumentoTransporteResponseElem(StockMovementResponse value) {
        return new JAXBElement<StockMovementResponse>(_EnvioDocumentoTransporteResponseElem_QNAME, StockMovementResponse.class, null, value);
    }

}
