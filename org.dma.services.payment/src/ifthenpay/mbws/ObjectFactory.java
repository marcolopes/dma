
package ifthenpay.mbws;

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

    private final static QName _ArrayOfIfmb_QNAME = new QName("https://www.ifthenpay.com/", "ArrayOfIfmb");
    private final static QName _String_QNAME = new QName("https://www.ifthenpay.com/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_ifthenpay
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaymentsJSON }
     * 
     */
    public GetPaymentsJSON createGetPaymentsJSON() {
        return new GetPaymentsJSON();
    }

    /**
     * Create an instance of {@link GetPaymentsJSONResponse }
     * 
     */
    public GetPaymentsJSONResponse createGetPaymentsJSONResponse() {
        return new GetPaymentsJSONResponse();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidadeJson }
     * 
     */
    public GetEntidadeSubentidadeJson createGetEntidadeSubentidadeJson() {
        return new GetEntidadeSubentidadeJson();
    }

    /**
     * Create an instance of {@link ArrayOfIfmb }
     * 
     */
    public ArrayOfIfmb createArrayOfIfmb() {
        return new ArrayOfIfmb();
    }

    /**
     * Create an instance of {@link GetPaymentsWithSandBox }
     * 
     */
    public GetPaymentsWithSandBox createGetPaymentsWithSandBox() {
        return new GetPaymentsWithSandBox();
    }

    /**
     * Create an instance of {@link GetPaymentsWithSandBoxResponse }
     * 
     */
    public GetPaymentsWithSandBoxResponse createGetPaymentsWithSandBoxResponse() {
        return new GetPaymentsWithSandBoxResponse();
    }

    /**
     * Create an instance of {@link GetPaymentsXML }
     * 
     */
    public GetPaymentsXML createGetPaymentsXML() {
        return new GetPaymentsXML();
    }

    /**
     * Create an instance of {@link GetPayments }
     * 
     */
    public GetPayments createGetPayments() {
        return new GetPayments();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidadeXml }
     * 
     */
    public GetEntidadeSubentidadeXml createGetEntidadeSubentidadeXml() {
        return new GetEntidadeSubentidadeXml();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidadeResponse }
     * 
     */
    public GetEntidadeSubentidadeResponse createGetEntidadeSubentidadeResponse() {
        return new GetEntidadeSubentidadeResponse();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidadeJsonV2Response }
     * 
     */
    public GetEntidadeSubentidadeJsonV2Response createGetEntidadeSubentidadeJsonV2Response() {
        return new GetEntidadeSubentidadeJsonV2Response();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidadeJsonV2 }
     * 
     */
    public GetEntidadeSubentidadeJsonV2 createGetEntidadeSubentidadeJsonV2() {
        return new GetEntidadeSubentidadeJsonV2();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidadeJsonResponse }
     * 
     */
    public GetEntidadeSubentidadeJsonResponse createGetEntidadeSubentidadeJsonResponse() {
        return new GetEntidadeSubentidadeJsonResponse();
    }

    /**
     * Create an instance of {@link GetPaymentsResponse }
     * 
     */
    public GetPaymentsResponse createGetPaymentsResponse() {
        return new GetPaymentsResponse();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidadeXmlResponse }
     * 
     */
    public GetEntidadeSubentidadeXmlResponse createGetEntidadeSubentidadeXmlResponse() {
        return new GetEntidadeSubentidadeXmlResponse();
    }

    /**
     * Create an instance of {@link GetPaymentsXMLResponse }
     * 
     */
    public GetPaymentsXMLResponse createGetPaymentsXMLResponse() {
        return new GetPaymentsXMLResponse();
    }

    /**
     * Create an instance of {@link GetEntidadeSubentidade }
     * 
     */
    public GetEntidadeSubentidade createGetEntidadeSubentidade() {
        return new GetEntidadeSubentidade();
    }

    /**
     * Create an instance of {@link Ifmb }
     * 
     */
    public Ifmb createIfmb() {
        return new Ifmb();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIfmb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.ifthenpay.com/", name = "ArrayOfIfmb")
    public JAXBElement<ArrayOfIfmb> createArrayOfIfmb(ArrayOfIfmb value) {
        return new JAXBElement<ArrayOfIfmb>(_ArrayOfIfmb_QNAME, ArrayOfIfmb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.ifthenpay.com/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
