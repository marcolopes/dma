
package pt.gov.portaldasfinancas.servicos.documentos;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.min_financas.at.factemi.documents package. 
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

    private final static QName _WorkType_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "WorkType");
    private final static QName _TaxPointDate_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "TaxPointDate");
    private final static QName _SoftwareCertificateNumber_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "SoftwareCertificateNumber");
    private final static QName _EFaturaMDVersion_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "eFaturaMDVersion");
    private final static QName _Reference_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "Reference");
    private final static QName _CashVATSchemeIndicator_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "CashVATSchemeIndicator");
    private final static QName _OriginatingON_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "OriginatingON");
    private final static QName _InvoiceType_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "InvoiceType");
    private final static QName _PaymentType_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "PaymentType");
    private final static QName _ATCUD_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "ATCUD");
    private final static QName _DebitCreditIndicator_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "DebitCreditIndicator");
    private final static QName _PaperLessIndicator_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "PaperLessIndicator");
    private final static QName _Tax_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "Tax");
    private final static QName _SourceDocumentID_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "SourceDocumentID");
    private final static QName _TotalTaxBase_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "TotalTaxBase");
    private final static QName _SystemEntryDate_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "SystemEntryDate");
    private final static QName _TaxEntity_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "TaxEntity");
    private final static QName _OrderReferences_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "OrderReferences");
    private final static QName _HashCharacters_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "HashCharacters");
    private final static QName _Amount_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "Amount");
    private final static QName _TaxExemptionCode_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "TaxExemptionCode");
    private final static QName _PaymentRefNo_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "PaymentRefNo");
    private final static QName _CustomerTaxID_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "CustomerTaxID");
    private final static QName _InvoiceNo_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "InvoiceNo");
    private final static QName _TaxRegistrationNumber_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "TaxRegistrationNumber");
    private final static QName _WorkDate_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "WorkDate");
    private final static QName _TransactionDate_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "TransactionDate");
    private final static QName _EACCode_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "EACCode");
    private final static QName _InvoiceDate_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "InvoiceDate");
    private final static QName _DocumentNumber_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "DocumentNumber");
    private final static QName _CustomerTaxIDCountry_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "CustomerTaxIDCountry");
    private final static QName _AuditFileVersion_QNAME = new QName("http://factemi.at.min_financas.pt/documents", "AuditFileVersion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.min_financas.at.factemi.documents
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentDataType }
     * 
     */
    public PaymentDataType createPaymentDataType() {
        return new PaymentDataType();
    }

    /**
     * Create an instance of {@link WorkDataType }
     * 
     */
    public WorkDataType createWorkDataType() {
        return new WorkDataType();
    }

    /**
     * Create an instance of {@link InvoiceDataType }
     * 
     */
    public InvoiceDataType createInvoiceDataType() {
        return new InvoiceDataType();
    }

    /**
     * Create an instance of {@link ChangeWorkStatusRequest }
     * 
     */
    public ChangeWorkStatusRequest createChangeWorkStatusRequest() {
        return new ChangeWorkStatusRequest();
    }

    /**
     * Create an instance of {@link WorkHeaderType }
     * 
     */
    public WorkHeaderType createWorkHeaderType() {
        return new WorkHeaderType();
    }

    /**
     * Create an instance of {@link NewWorkStatusType }
     * 
     */
    public NewWorkStatusType createNewWorkStatusType() {
        return new NewWorkStatusType();
    }

    /**
     * Create an instance of {@link ChannelType }
     * 
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link ChangeWorkStatusResponse }
     * 
     */
    public ChangeWorkStatusResponse createChangeWorkStatusResponse() {
        return new ChangeWorkStatusResponse();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link DeletePaymentRequest }
     * 
     */
    public DeletePaymentRequest createDeletePaymentRequest() {
        return new DeletePaymentRequest();
    }

    /**
     * Create an instance of {@link ListPaymentDocumentsType }
     * 
     */
    public ListPaymentDocumentsType createListPaymentDocumentsType() {
        return new ListPaymentDocumentsType();
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link ChangeInvoiceStatusResponse }
     * 
     */
    public ChangeInvoiceStatusResponse createChangeInvoiceStatusResponse() {
        return new ChangeInvoiceStatusResponse();
    }

    /**
     * Create an instance of {@link OrderReferences }
     * 
     */
    public OrderReferences createOrderReferences() {
        return new OrderReferences();
    }

    /**
     * Create an instance of {@link ChangePaymentStatusResponse }
     * 
     */
    public ChangePaymentStatusResponse createChangePaymentStatusResponse() {
        return new ChangePaymentStatusResponse();
    }

    /**
     * Create an instance of {@link SourceDocumentID }
     * 
     */
    public SourceDocumentID createSourceDocumentID() {
        return new SourceDocumentID();
    }

    /**
     * Create an instance of {@link ChangePaymentStatusRequest }
     * 
     */
    public ChangePaymentStatusRequest createChangePaymentStatusRequest() {
        return new ChangePaymentStatusRequest();
    }

    /**
     * Create an instance of {@link PaymentHeaderType }
     * 
     */
    public PaymentHeaderType createPaymentHeaderType() {
        return new PaymentHeaderType();
    }

    /**
     * Create an instance of {@link NewPaymentStatusType }
     * 
     */
    public NewPaymentStatusType createNewPaymentStatusType() {
        return new NewPaymentStatusType();
    }

    /**
     * Create an instance of {@link RegisterPaymentResponse }
     * 
     */
    public RegisterPaymentResponse createRegisterPaymentResponse() {
        return new RegisterPaymentResponse();
    }

    /**
     * Create an instance of {@link RegisterWorkResponse }
     * 
     */
    public RegisterWorkResponse createRegisterWorkResponse() {
        return new RegisterWorkResponse();
    }

    /**
     * Create an instance of {@link RegisterInvoiceResponse }
     * 
     */
    public RegisterInvoiceResponse createRegisterInvoiceResponse() {
        return new RegisterInvoiceResponse();
    }

    /**
     * Create an instance of {@link DeleteInvoiceRequest }
     * 
     */
    public DeleteInvoiceRequest createDeleteInvoiceRequest() {
        return new DeleteInvoiceRequest();
    }

    /**
     * Create an instance of {@link ListInvoiceDocumentsType }
     * 
     */
    public ListInvoiceDocumentsType createListInvoiceDocumentsType() {
        return new ListInvoiceDocumentsType();
    }

    /**
     * Create an instance of {@link ChangeInvoiceStatusRequest }
     * 
     */
    public ChangeInvoiceStatusRequest createChangeInvoiceStatusRequest() {
        return new ChangeInvoiceStatusRequest();
    }

    /**
     * Create an instance of {@link InvoiceHeaderType }
     * 
     */
    public InvoiceHeaderType createInvoiceHeaderType() {
        return new InvoiceHeaderType();
    }

    /**
     * Create an instance of {@link NewInvoiceStatusType }
     * 
     */
    public NewInvoiceStatusType createNewInvoiceStatusType() {
        return new NewInvoiceStatusType();
    }

    /**
     * Create an instance of {@link RegisterInvoiceRequest }
     * 
     */
    public RegisterInvoiceRequest createRegisterInvoiceRequest() {
        return new RegisterInvoiceRequest();
    }

    /**
     * Create an instance of {@link RegisterWorkRequest }
     * 
     */
    public RegisterWorkRequest createRegisterWorkRequest() {
        return new RegisterWorkRequest();
    }

    /**
     * Create an instance of {@link DeleteWorkResponse }
     * 
     */
    public DeleteWorkResponse createDeleteWorkResponse() {
        return new DeleteWorkResponse();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link DeletePaymentResponse }
     * 
     */
    public DeletePaymentResponse createDeletePaymentResponse() {
        return new DeletePaymentResponse();
    }

    /**
     * Create an instance of {@link DeleteWorkRequest }
     * 
     */
    public DeleteWorkRequest createDeleteWorkRequest() {
        return new DeleteWorkRequest();
    }

    /**
     * Create an instance of {@link ListWorkDocumentsType }
     * 
     */
    public ListWorkDocumentsType createListWorkDocumentsType() {
        return new ListWorkDocumentsType();
    }

    /**
     * Create an instance of {@link RegisterPaymentRequest }
     * 
     */
    public RegisterPaymentRequest createRegisterPaymentRequest() {
        return new RegisterPaymentRequest();
    }

    /**
     * Create an instance of {@link DeleteInvoiceResponse }
     * 
     */
    public DeleteInvoiceResponse createDeleteInvoiceResponse() {
        return new DeleteInvoiceResponse();
    }

    /**
     * Create an instance of {@link WorkStatus }
     * 
     */
    public WorkStatus createWorkStatus() {
        return new WorkStatus();
    }

    /**
     * Create an instance of {@link WithholdingTax }
     * 
     */
    public WithholdingTax createWithholdingTax() {
        return new WithholdingTax();
    }

    /**
     * Create an instance of {@link InvoiceStatus }
     * 
     */
    public InvoiceStatus createInvoiceStatus() {
        return new InvoiceStatus();
    }

    /**
     * Create an instance of {@link DocumentTotals }
     * 
     */
    public DocumentTotals createDocumentTotals() {
        return new DocumentTotals();
    }

    /**
     * Create an instance of {@link PaymentStatus }
     * 
     */
    public PaymentStatus createPaymentStatus() {
        return new PaymentStatus();
    }

    /**
     * Create an instance of {@link PaymentDataType.LineSummary }
     * 
     */
    public PaymentDataType.LineSummary createPaymentDataTypeLineSummary() {
        return new PaymentDataType.LineSummary();
    }

    /**
     * Create an instance of {@link WorkDataType.LineSummary }
     * 
     */
    public WorkDataType.LineSummary createWorkDataTypeLineSummary() {
        return new WorkDataType.LineSummary();
    }

    /**
     * Create an instance of {@link InvoiceDataType.LineSummary }
     * 
     */
    public InvoiceDataType.LineSummary createInvoiceDataTypeLineSummary() {
        return new InvoiceDataType.LineSummary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "WorkType")
    public JAXBElement<WorkTypeType> createWorkType(WorkTypeType value) {
        return new JAXBElement<WorkTypeType>(_WorkType_QNAME, WorkTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "TaxPointDate")
    public JAXBElement<XMLGregorianCalendar> createTaxPointDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TaxPointDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "SoftwareCertificateNumber")
    public JAXBElement<BigInteger> createSoftwareCertificateNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_SoftwareCertificateNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "eFaturaMDVersion")
    public JAXBElement<String> createEFaturaMDVersion(String value) {
        return new JAXBElement<String>(_EFaturaMDVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "Reference")
    public JAXBElement<String> createReference(String value) {
        return new JAXBElement<String>(_Reference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "CashVATSchemeIndicator")
    public JAXBElement<Integer> createCashVATSchemeIndicator(Integer value) {
        return new JAXBElement<Integer>(_CashVATSchemeIndicator_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "OriginatingON")
    public JAXBElement<String> createOriginatingON(String value) {
        return new JAXBElement<String>(_OriginatingON_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "InvoiceType")
    public JAXBElement<InvoiceTypeType> createInvoiceType(InvoiceTypeType value) {
        return new JAXBElement<InvoiceTypeType>(_InvoiceType_QNAME, InvoiceTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "PaymentType")
    public JAXBElement<PaymentTypeType> createPaymentType(PaymentTypeType value) {
        return new JAXBElement<PaymentTypeType>(_PaymentType_QNAME, PaymentTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "ATCUD")
    public JAXBElement<String> createATCUD(String value) {
        return new JAXBElement<String>(_ATCUD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitCreditIndicator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "DebitCreditIndicator")
    public JAXBElement<DebitCreditIndicator> createDebitCreditIndicator(DebitCreditIndicator value) {
        return new JAXBElement<DebitCreditIndicator>(_DebitCreditIndicator_QNAME, DebitCreditIndicator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "PaperLessIndicator", defaultValue = "0")
    public JAXBElement<Integer> createPaperLessIndicator(Integer value) {
        return new JAXBElement<Integer>(_PaperLessIndicator_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "Tax")
    public JAXBElement<Tax> createTax(Tax value) {
        return new JAXBElement<Tax>(_Tax_QNAME, Tax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceDocumentID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "SourceDocumentID")
    public JAXBElement<SourceDocumentID> createSourceDocumentID(SourceDocumentID value) {
        return new JAXBElement<SourceDocumentID>(_SourceDocumentID_QNAME, SourceDocumentID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "TotalTaxBase")
    public JAXBElement<BigDecimal> createTotalTaxBase(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalTaxBase_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "SystemEntryDate")
    public JAXBElement<XMLGregorianCalendar> createSystemEntryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SystemEntryDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "TaxEntity")
    public JAXBElement<String> createTaxEntity(String value) {
        return new JAXBElement<String>(_TaxEntity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderReferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "OrderReferences")
    public JAXBElement<OrderReferences> createOrderReferences(OrderReferences value) {
        return new JAXBElement<OrderReferences>(_OrderReferences_QNAME, OrderReferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "HashCharacters")
    public JAXBElement<String> createHashCharacters(String value) {
        return new JAXBElement<String>(_HashCharacters_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "Amount")
    public JAXBElement<BigDecimal> createAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "TaxExemptionCode")
    public JAXBElement<String> createTaxExemptionCode(String value) {
        return new JAXBElement<String>(_TaxExemptionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "PaymentRefNo")
    public JAXBElement<String> createPaymentRefNo(String value) {
        return new JAXBElement<String>(_PaymentRefNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "CustomerTaxID")
    public JAXBElement<String> createCustomerTaxID(String value) {
        return new JAXBElement<String>(_CustomerTaxID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "InvoiceNo")
    public JAXBElement<String> createInvoiceNo(String value) {
        return new JAXBElement<String>(_InvoiceNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "TaxRegistrationNumber")
    public JAXBElement<Integer> createTaxRegistrationNumber(Integer value) {
        return new JAXBElement<Integer>(_TaxRegistrationNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "WorkDate")
    public JAXBElement<XMLGregorianCalendar> createWorkDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "TransactionDate")
    public JAXBElement<XMLGregorianCalendar> createTransactionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "EACCode")
    public JAXBElement<String> createEACCode(String value) {
        return new JAXBElement<String>(_EACCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "InvoiceDate")
    public JAXBElement<XMLGregorianCalendar> createInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvoiceDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "DocumentNumber")
    public JAXBElement<String> createDocumentNumber(String value) {
        return new JAXBElement<String>(_DocumentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "CustomerTaxIDCountry")
    public JAXBElement<String> createCustomerTaxIDCountry(String value) {
        return new JAXBElement<String>(_CustomerTaxIDCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://factemi.at.min_financas.pt/documents", name = "AuditFileVersion")
    public JAXBElement<String> createAuditFileVersion(String value) {
        return new JAXBElement<String>(_AuditFileVersion_QNAME, String.class, null, value);
    }

}
