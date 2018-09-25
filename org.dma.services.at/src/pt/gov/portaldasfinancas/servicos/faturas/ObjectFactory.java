
package pt.gov.portaldasfinancas.servicos.faturas;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.gov.portaldasfinancas.servicos.faturas package. 
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

    private final static QName _TaxPayable_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "TaxPayable");
    private final static QName _NetTotal_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "NetTotal");
    private final static QName _InvoiceStatus_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "InvoiceStatus");
    private final static QName _InvoiceType_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "InvoiceType");
    private final static QName _InvoiceNo_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "InvoiceNo");
    private final static QName _TaxType_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "TaxType");
    private final static QName _RegisterInvoiceResponseElem_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "RegisterInvoiceResponseElem");
    private final static QName _DebitAmount_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "DebitAmount");
    private final static QName _RegisterInvoiceElem_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "RegisterInvoiceElem");
    private final static QName _CreditAmount_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "CreditAmount");
    private final static QName _GrossTotal_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "GrossTotal");
    private final static QName _TaxCountryRegion_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "TaxCountryRegion");
    private final static QName _TaxExemptionReason_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "TaxExemptionReason");
    private final static QName _TaxPercentage_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "TaxPercentage");
    private final static QName _InvoiceDate_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/faturas/", "InvoiceDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.gov.portaldasfinancas.servicos.faturas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterInvoiceType }
     * 
     */
    public RegisterInvoiceType createRegisterInvoiceType() {
        return new RegisterInvoiceType();
    }

    /**
     * Create an instance of {@link InternationalCustomerTaxID }
     * 
     */
    public InternationalCustomerTaxID createInternationalCustomerTaxID() {
        return new InternationalCustomerTaxID();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link RegisterInvoiceResponseType }
     * 
     */
    public RegisterInvoiceResponseType createRegisterInvoiceResponseType() {
        return new RegisterInvoiceResponseType();
    }

    /**
     * Create an instance of {@link RegisterInvoiceType.Line }
     * 
     */
    public RegisterInvoiceType.Line createRegisterInvoiceTypeLine() {
        return new RegisterInvoiceType.Line();
    }

    /**
     * Create an instance of {@link RegisterInvoiceType.DocumentTotals }
     * 
     */
    public RegisterInvoiceType.DocumentTotals createRegisterInvoiceTypeDocumentTotals() {
        return new RegisterInvoiceType.DocumentTotals();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "TaxPayable")
    public JAXBElement<BigDecimal> createTaxPayable(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TaxPayable_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "NetTotal")
    public JAXBElement<BigDecimal> createNetTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NetTotal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "InvoiceStatus")
    public JAXBElement<String> createInvoiceStatus(String value) {
        return new JAXBElement<String>(_InvoiceStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "InvoiceType")
    public JAXBElement<String> createInvoiceType(String value) {
        return new JAXBElement<String>(_InvoiceType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "InvoiceNo")
    public JAXBElement<String> createInvoiceNo(String value) {
        return new JAXBElement<String>(_InvoiceNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "TaxType")
    public JAXBElement<String> createTaxType(String value) {
        return new JAXBElement<String>(_TaxType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterInvoiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "RegisterInvoiceResponseElem")
    public JAXBElement<RegisterInvoiceResponseType> createRegisterInvoiceResponseElem(RegisterInvoiceResponseType value) {
        return new JAXBElement<RegisterInvoiceResponseType>(_RegisterInvoiceResponseElem_QNAME, RegisterInvoiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "DebitAmount")
    public JAXBElement<BigDecimal> createDebitAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DebitAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterInvoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "RegisterInvoiceElem")
    public JAXBElement<RegisterInvoiceType> createRegisterInvoiceElem(RegisterInvoiceType value) {
        return new JAXBElement<RegisterInvoiceType>(_RegisterInvoiceElem_QNAME, RegisterInvoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "CreditAmount")
    public JAXBElement<BigDecimal> createCreditAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "GrossTotal")
    public JAXBElement<BigDecimal> createGrossTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GrossTotal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "TaxCountryRegion")
    public JAXBElement<String> createTaxCountryRegion(String value) {
        return new JAXBElement<String>(_TaxCountryRegion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "TaxExemptionReason")
    public JAXBElement<String> createTaxExemptionReason(String value) {
        return new JAXBElement<String>(_TaxExemptionReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "TaxPercentage")
    public JAXBElement<BigDecimal> createTaxPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TaxPercentage_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/faturas/", name = "InvoiceDate")
    public JAXBElement<XMLGregorianCalendar> createInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

}
