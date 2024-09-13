
package ifthenpay.mbw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_ifthenpay package. 
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

    private final static QName _RespostaPedido_QNAME = new QName("https://www.ifthenpay.com/", "RespostaPedido");
    private final static QName _RespostaPedidoEstado_QNAME = new QName("https://www.ifthenpay.com/", "RespostaPedidoEstado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_ifthenpay
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetPedidoResponse }
     * 
     */
    public SetPedidoResponse createSetPedidoResponse() {
        return new SetPedidoResponse();
    }

    /**
     * Create an instance of {@link RespostaPedido }
     * 
     */
    public RespostaPedido createRespostaPedido() {
        return new RespostaPedido();
    }

    /**
     * Create an instance of {@link SetPedidoSync }
     * 
     */
    public SetPedidoSync createSetPedidoSync() {
        return new SetPedidoSync();
    }

    /**
     * Create an instance of {@link SetPedido }
     * 
     */
    public SetPedido createSetPedido() {
        return new SetPedido();
    }

    /**
     * Create an instance of {@link EstadoPedidosResponse }
     * 
     */
    public EstadoPedidosResponse createEstadoPedidosResponse() {
        return new EstadoPedidosResponse();
    }

    /**
     * Create an instance of {@link RespostaPedidoEstado }
     * 
     */
    public RespostaPedidoEstado createRespostaPedidoEstado() {
        return new RespostaPedidoEstado();
    }

    /**
     * Create an instance of {@link SetPedidoSyncJSON }
     * 
     */
    public SetPedidoSyncJSON createSetPedidoSyncJSON() {
        return new SetPedidoSyncJSON();
    }

    /**
     * Create an instance of {@link EstadoPedidosSyncJSONResponse }
     * 
     */
    public EstadoPedidosSyncJSONResponse createEstadoPedidosSyncJSONResponse() {
        return new EstadoPedidosSyncJSONResponse();
    }

    /**
     * Create an instance of {@link EstadoPedidosJSON }
     * 
     */
    public EstadoPedidosJSON createEstadoPedidosJSON() {
        return new EstadoPedidosJSON();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link SetPedidoJSON }
     * 
     */
    public SetPedidoJSON createSetPedidoJSON() {
        return new SetPedidoJSON();
    }

    /**
     * Create an instance of {@link SetPedidoSyncResponse }
     * 
     */
    public SetPedidoSyncResponse createSetPedidoSyncResponse() {
        return new SetPedidoSyncResponse();
    }

    /**
     * Create an instance of {@link EstadoPedidos }
     * 
     */
    public EstadoPedidos createEstadoPedidos() {
        return new EstadoPedidos();
    }

    /**
     * Create an instance of {@link EstadoPedidosSyncJSON }
     * 
     */
    public EstadoPedidosSyncJSON createEstadoPedidosSyncJSON() {
        return new EstadoPedidosSyncJSON();
    }

    /**
     * Create an instance of {@link SetPedidoJSONResponse }
     * 
     */
    public SetPedidoJSONResponse createSetPedidoJSONResponse() {
        return new SetPedidoJSONResponse();
    }

    /**
     * Create an instance of {@link EstadoPedidosJSONResponse }
     * 
     */
    public EstadoPedidosJSONResponse createEstadoPedidosJSONResponse() {
        return new EstadoPedidosJSONResponse();
    }

    /**
     * Create an instance of {@link SetPedidoSyncJSONResponse }
     * 
     */
    public SetPedidoSyncJSONResponse createSetPedidoSyncJSONResponse() {
        return new SetPedidoSyncJSONResponse();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link ArrayOfPedido }
     * 
     */
    public ArrayOfPedido createArrayOfPedido() {
        return new ArrayOfPedido();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespostaPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.ifthenpay.com/", name = "RespostaPedido")
    public JAXBElement<RespostaPedido> createRespostaPedido(RespostaPedido value) {
        return new JAXBElement<RespostaPedido>(_RespostaPedido_QNAME, RespostaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespostaPedidoEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.ifthenpay.com/", name = "RespostaPedidoEstado")
    public JAXBElement<RespostaPedidoEstado> createRespostaPedidoEstado(RespostaPedidoEstado value) {
        return new JAXBElement<RespostaPedidoEstado>(_RespostaPedidoEstado_QNAME, RespostaPedidoEstado.class, null, value);
    }

}
