
package pt.gov.portaldasfinancas.servicos.taxfree;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.gov.portaldasfinancas.servicos.etaxfree.taxfreeservice package. 
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

    private final static QName _TaxFreeAnnulmentRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeAnnulmentRequest");
    private final static QName _DomesticCertificationSubmissionResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "DomesticCertificationSubmissionResponse");
    private final static QName _TaxFreeAnnulmentResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeAnnulmentResponse");
    private final static QName _ForeignCertificationSubmissionResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "ForeignCertificationSubmissionResponse");
    private final static QName _RefundQueryByRefundCompanyResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "RefundQueryByRefundCompanyResponse");
    private final static QName _ContingencySubmissionResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "ContingencySubmissionResponse");
    private final static QName _TaxFreeSubmissionRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeSubmissionRequest");
    private final static QName _ContingencySubmissionRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "ContingencySubmissionRequest");
    private final static QName _TaxFreeSubmissionResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeSubmissionResponse");
    private final static QName _TaxFreeCommQueryResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeCommQueryResponse");
    private final static QName _TaxFreeSearchRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeSearchRequest");
    private final static QName _ForeignCertificationSubmissionRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "ForeignCertificationSubmissionRequest");
    private final static QName _DomesticCertificationSubmissionRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "DomesticCertificationSubmissionRequest");
    private final static QName _RefundQueryByRefundCompanyRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "RefundQueryByRefundCompanyRequest");
    private final static QName _TaxFreeSearchResponse_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeSearchResponse");
    private final static QName _TaxFreeCommQueryRequest_QNAME = new QName("http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", "TaxFreeCommQueryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.gov.portaldasfinancas.servicos.etaxfree.taxfreeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RefundQueryByRefundCompanyRequestType }
     * 
     */
    public RefundQueryByRefundCompanyRequestType createRefundQueryByRefundCompanyRequestType() {
        return new RefundQueryByRefundCompanyRequestType();
    }

    /**
     * Create an instance of {@link TaxFreeSearchResponseType }
     * 
     */
    public TaxFreeSearchResponseType createTaxFreeSearchResponseType() {
        return new TaxFreeSearchResponseType();
    }

    /**
     * Create an instance of {@link TaxFreeCommQueryRequestType }
     * 
     */
    public TaxFreeCommQueryRequestType createTaxFreeCommQueryRequestType() {
        return new TaxFreeCommQueryRequestType();
    }

    /**
     * Create an instance of {@link ForeignCertificationSubmissionRequestType }
     * 
     */
    public ForeignCertificationSubmissionRequestType createForeignCertificationSubmissionRequestType() {
        return new ForeignCertificationSubmissionRequestType();
    }

    /**
     * Create an instance of {@link DomesticCertificationSubmissionRequestType }
     * 
     */
    public DomesticCertificationSubmissionRequestType createDomesticCertificationSubmissionRequestType() {
        return new DomesticCertificationSubmissionRequestType();
    }

    /**
     * Create an instance of {@link TaxFreeSearchRequestType }
     * 
     */
    public TaxFreeSearchRequestType createTaxFreeSearchRequestType() {
        return new TaxFreeSearchRequestType();
    }

    /**
     * Create an instance of {@link TaxFreeCommQueryResponseType }
     * 
     */
    public TaxFreeCommQueryResponseType createTaxFreeCommQueryResponseType() {
        return new TaxFreeCommQueryResponseType();
    }

    /**
     * Create an instance of {@link TaxFreeSubmissionResponseType }
     * 
     */
    public TaxFreeSubmissionResponseType createTaxFreeSubmissionResponseType() {
        return new TaxFreeSubmissionResponseType();
    }

    /**
     * Create an instance of {@link ContingencySubmissionRequestType }
     * 
     */
    public ContingencySubmissionRequestType createContingencySubmissionRequestType() {
        return new ContingencySubmissionRequestType();
    }

    /**
     * Create an instance of {@link TaxFreeSubmissionRequestType }
     * 
     */
    public TaxFreeSubmissionRequestType createTaxFreeSubmissionRequestType() {
        return new TaxFreeSubmissionRequestType();
    }

    /**
     * Create an instance of {@link ContingencySubmissionResponseType }
     * 
     */
    public ContingencySubmissionResponseType createContingencySubmissionResponseType() {
        return new ContingencySubmissionResponseType();
    }

    /**
     * Create an instance of {@link RefundQueryByRefundCompanyResponseType }
     * 
     */
    public RefundQueryByRefundCompanyResponseType createRefundQueryByRefundCompanyResponseType() {
        return new RefundQueryByRefundCompanyResponseType();
    }

    /**
     * Create an instance of {@link CertificationSubmissionResponseType }
     * 
     */
    public CertificationSubmissionResponseType createCertificationSubmissionResponseType() {
        return new CertificationSubmissionResponseType();
    }

    /**
     * Create an instance of {@link TaxFreeAnnulmentResponseType }
     * 
     */
    public TaxFreeAnnulmentResponseType createTaxFreeAnnulmentResponseType() {
        return new TaxFreeAnnulmentResponseType();
    }

    /**
     * Create an instance of {@link TaxFreeAnnulmentRequestType }
     * 
     */
    public TaxFreeAnnulmentRequestType createTaxFreeAnnulmentRequestType() {
        return new TaxFreeAnnulmentRequestType();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link CalculatedTaxType }
     * 
     */
    public CalculatedTaxType createCalculatedTaxType() {
        return new CalculatedTaxType();
    }

    /**
     * Create an instance of {@link InvoiceDetailType }
     * 
     */
    public InvoiceDetailType createInvoiceDetailType() {
        return new InvoiceDetailType();
    }

    /**
     * Create an instance of {@link InvoiceLineDetailType }
     * 
     */
    public InvoiceLineDetailType createInvoiceLineDetailType() {
        return new InvoiceLineDetailType();
    }

    /**
     * Create an instance of {@link DateIntervalType }
     * 
     */
    public DateIntervalType createDateIntervalType() {
        return new DateIntervalType();
    }

    /**
     * Create an instance of {@link InvoicesDetailType }
     * 
     */
    public InvoicesDetailType createInvoicesDetailType() {
        return new InvoicesDetailType();
    }

    /**
     * Create an instance of {@link CertifiedInvoiceType }
     * 
     */
    public CertifiedInvoiceType createCertifiedInvoiceType() {
        return new CertifiedInvoiceType();
    }

    /**
     * Create an instance of {@link TaxFreeSearchResultType }
     * 
     */
    public TaxFreeSearchResultType createTaxFreeSearchResultType() {
        return new TaxFreeSearchResultType();
    }

    /**
     * Create an instance of {@link CurrentStatusCriteriaType }
     * 
     */
    public CurrentStatusCriteriaType createCurrentStatusCriteriaType() {
        return new CurrentStatusCriteriaType();
    }

    /**
     * Create an instance of {@link DomesticExportCertificateType }
     * 
     */
    public DomesticExportCertificateType createDomesticExportCertificateType() {
        return new DomesticExportCertificateType();
    }

    /**
     * Create an instance of {@link SerialNumbersListType }
     * 
     */
    public SerialNumbersListType createSerialNumbersListType() {
        return new SerialNumbersListType();
    }

    /**
     * Create an instance of {@link TaxFreeSearchCriteriaType }
     * 
     */
    public TaxFreeSearchCriteriaType createTaxFreeSearchCriteriaType() {
        return new TaxFreeSearchCriteriaType();
    }

    /**
     * Create an instance of {@link CertifiedInvoicesType }
     * 
     */
    public CertifiedInvoicesType createCertifiedInvoicesType() {
        return new CertifiedInvoicesType();
    }

    /**
     * Create an instance of {@link ForeignExportCertificateType }
     * 
     */
    public ForeignExportCertificateType createForeignExportCertificateType() {
        return new ForeignExportCertificateType();
    }

    /**
     * Create an instance of {@link PreviousTaxFreeCommType }
     * 
     */
    public PreviousTaxFreeCommType createPreviousTaxFreeCommType() {
        return new PreviousTaxFreeCommType();
    }

    /**
     * Create an instance of {@link TaxFreeSearchResultsType }
     * 
     */
    public TaxFreeSearchResultsType createTaxFreeSearchResultsType() {
        return new TaxFreeSearchResultsType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link CurrentStatusType }
     * 
     */
    public CurrentStatusType createCurrentStatusType() {
        return new CurrentStatusType();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link IdentityDocType }
     * 
     */
    public IdentityDocType createIdentityDocType() {
        return new IdentityDocType();
    }

    /**
     * Create an instance of {@link CalculatedTaxesType }
     * 
     */
    public CalculatedTaxesType createCalculatedTaxesType() {
        return new CalculatedTaxesType();
    }

    /**
     * Create an instance of {@link SimpleBuyerType }
     * 
     */
    public SimpleBuyerType createSimpleBuyerType() {
        return new SimpleBuyerType();
    }

    /**
     * Create an instance of {@link InvoiceLineType }
     * 
     */
    public InvoiceLineType createInvoiceLineType() {
        return new InvoiceLineType();
    }

    /**
     * Create an instance of {@link ReturnInfoType }
     * 
     */
    public ReturnInfoType createReturnInfoType() {
        return new ReturnInfoType();
    }

    /**
     * Create an instance of {@link TaxFreeCommType }
     * 
     */
    public TaxFreeCommType createTaxFreeCommType() {
        return new TaxFreeCommType();
    }

    /**
     * Create an instance of {@link InvoiceIdentifiersType }
     * 
     */
    public InvoiceIdentifiersType createInvoiceIdentifiersType() {
        return new InvoiceIdentifiersType();
    }

    /**
     * Create an instance of {@link SoftwareProviderType }
     * 
     */
    public SoftwareProviderType createSoftwareProviderType() {
        return new SoftwareProviderType();
    }

    /**
     * Create an instance of {@link RefundType }
     * 
     */
    public RefundType createRefundType() {
        return new RefundType();
    }

    /**
     * Create an instance of {@link ContingencySubmissionType }
     * 
     */
    public ContingencySubmissionType createContingencySubmissionType() {
        return new ContingencySubmissionType();
    }

    /**
     * Create an instance of {@link InvoiceLinesListType }
     * 
     */
    public InvoiceLinesListType createInvoiceLinesListType() {
        return new InvoiceLinesListType();
    }

    /**
     * Create an instance of {@link TaxFreeCommDetailType }
     * 
     */
    public TaxFreeCommDetailType createTaxFreeCommDetailType() {
        return new TaxFreeCommDetailType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link InvoiceLinesListDetailType }
     * 
     */
    public InvoiceLinesListDetailType createInvoiceLinesListDetailType() {
        return new InvoiceLinesListDetailType();
    }

    /**
     * Create an instance of {@link InvoicesListDetailType }
     * 
     */
    public InvoicesListDetailType createInvoicesListDetailType() {
        return new InvoicesListDetailType();
    }

    /**
     * Create an instance of {@link VatNumberInfoType }
     * 
     */
    public VatNumberInfoType createVatNumberInfoType() {
        return new VatNumberInfoType();
    }

    /**
     * Create an instance of {@link TaxFreeCommRegistrationType }
     * 
     */
    public TaxFreeCommRegistrationType createTaxFreeCommRegistrationType() {
        return new TaxFreeCommRegistrationType();
    }

    /**
     * Create an instance of {@link InvoicesType }
     * 
     */
    public InvoicesType createInvoicesType() {
        return new InvoicesType();
    }

    /**
     * Create an instance of {@link RefundQueryResultsType }
     * 
     */
    public RefundQueryResultsType createRefundQueryResultsType() {
        return new RefundQueryResultsType();
    }

    /**
     * Create an instance of {@link InvoicesListType }
     * 
     */
    public InvoicesListType createInvoicesListType() {
        return new InvoicesListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeAnnulmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeAnnulmentRequest")
    public JAXBElement<TaxFreeAnnulmentRequestType> createTaxFreeAnnulmentRequest(TaxFreeAnnulmentRequestType value) {
        return new JAXBElement<TaxFreeAnnulmentRequestType>(_TaxFreeAnnulmentRequest_QNAME, TaxFreeAnnulmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificationSubmissionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "DomesticCertificationSubmissionResponse")
    public JAXBElement<CertificationSubmissionResponseType> createDomesticCertificationSubmissionResponse(CertificationSubmissionResponseType value) {
        return new JAXBElement<CertificationSubmissionResponseType>(_DomesticCertificationSubmissionResponse_QNAME, CertificationSubmissionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeAnnulmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeAnnulmentResponse")
    public JAXBElement<TaxFreeAnnulmentResponseType> createTaxFreeAnnulmentResponse(TaxFreeAnnulmentResponseType value) {
        return new JAXBElement<TaxFreeAnnulmentResponseType>(_TaxFreeAnnulmentResponse_QNAME, TaxFreeAnnulmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificationSubmissionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "ForeignCertificationSubmissionResponse")
    public JAXBElement<CertificationSubmissionResponseType> createForeignCertificationSubmissionResponse(CertificationSubmissionResponseType value) {
        return new JAXBElement<CertificationSubmissionResponseType>(_ForeignCertificationSubmissionResponse_QNAME, CertificationSubmissionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundQueryByRefundCompanyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "RefundQueryByRefundCompanyResponse")
    public JAXBElement<RefundQueryByRefundCompanyResponseType> createRefundQueryByRefundCompanyResponse(RefundQueryByRefundCompanyResponseType value) {
        return new JAXBElement<RefundQueryByRefundCompanyResponseType>(_RefundQueryByRefundCompanyResponse_QNAME, RefundQueryByRefundCompanyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingencySubmissionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "ContingencySubmissionResponse")
    public JAXBElement<ContingencySubmissionResponseType> createContingencySubmissionResponse(ContingencySubmissionResponseType value) {
        return new JAXBElement<ContingencySubmissionResponseType>(_ContingencySubmissionResponse_QNAME, ContingencySubmissionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeSubmissionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeSubmissionRequest")
    public JAXBElement<TaxFreeSubmissionRequestType> createTaxFreeSubmissionRequest(TaxFreeSubmissionRequestType value) {
        return new JAXBElement<TaxFreeSubmissionRequestType>(_TaxFreeSubmissionRequest_QNAME, TaxFreeSubmissionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingencySubmissionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "ContingencySubmissionRequest")
    public JAXBElement<ContingencySubmissionRequestType> createContingencySubmissionRequest(ContingencySubmissionRequestType value) {
        return new JAXBElement<ContingencySubmissionRequestType>(_ContingencySubmissionRequest_QNAME, ContingencySubmissionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeSubmissionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeSubmissionResponse")
    public JAXBElement<TaxFreeSubmissionResponseType> createTaxFreeSubmissionResponse(TaxFreeSubmissionResponseType value) {
        return new JAXBElement<TaxFreeSubmissionResponseType>(_TaxFreeSubmissionResponse_QNAME, TaxFreeSubmissionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeCommQueryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeCommQueryResponse")
    public JAXBElement<TaxFreeCommQueryResponseType> createTaxFreeCommQueryResponse(TaxFreeCommQueryResponseType value) {
        return new JAXBElement<TaxFreeCommQueryResponseType>(_TaxFreeCommQueryResponse_QNAME, TaxFreeCommQueryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeSearchRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeSearchRequest")
    public JAXBElement<TaxFreeSearchRequestType> createTaxFreeSearchRequest(TaxFreeSearchRequestType value) {
        return new JAXBElement<TaxFreeSearchRequestType>(_TaxFreeSearchRequest_QNAME, TaxFreeSearchRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignCertificationSubmissionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "ForeignCertificationSubmissionRequest")
    public JAXBElement<ForeignCertificationSubmissionRequestType> createForeignCertificationSubmissionRequest(ForeignCertificationSubmissionRequestType value) {
        return new JAXBElement<ForeignCertificationSubmissionRequestType>(_ForeignCertificationSubmissionRequest_QNAME, ForeignCertificationSubmissionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomesticCertificationSubmissionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "DomesticCertificationSubmissionRequest")
    public JAXBElement<DomesticCertificationSubmissionRequestType> createDomesticCertificationSubmissionRequest(DomesticCertificationSubmissionRequestType value) {
        return new JAXBElement<DomesticCertificationSubmissionRequestType>(_DomesticCertificationSubmissionRequest_QNAME, DomesticCertificationSubmissionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundQueryByRefundCompanyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "RefundQueryByRefundCompanyRequest")
    public JAXBElement<RefundQueryByRefundCompanyRequestType> createRefundQueryByRefundCompanyRequest(RefundQueryByRefundCompanyRequestType value) {
        return new JAXBElement<RefundQueryByRefundCompanyRequestType>(_RefundQueryByRefundCompanyRequest_QNAME, RefundQueryByRefundCompanyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeSearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeSearchResponse")
    public JAXBElement<TaxFreeSearchResponseType> createTaxFreeSearchResponse(TaxFreeSearchResponseType value) {
        return new JAXBElement<TaxFreeSearchResponseType>(_TaxFreeSearchResponse_QNAME, TaxFreeSearchResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxFreeCommQueryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.portaldasfinancas.gov.pt/eTaxFree/TaxFreeService", name = "TaxFreeCommQueryRequest")
    public JAXBElement<TaxFreeCommQueryRequestType> createTaxFreeCommQueryRequest(TaxFreeCommQueryRequestType value) {
        return new JAXBElement<TaxFreeCommQueryRequestType>(_TaxFreeCommQueryRequest_QNAME, TaxFreeCommQueryRequestType.class, null, value);
    }

}
