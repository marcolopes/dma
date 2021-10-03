
package com.generixgroup.pt.messaging.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.generixgroup.pt.messaging.webservice package. 
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

    private final static QName _ListDocuments_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "listDocuments");
    private final static QName _MalformedURLException_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "MalformedURLException");
    private final static QName _GetDocumentResponse_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "getDocumentResponse");
    private final static QName _GetDocument_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "getDocument");
    private final static QName _ListDocumentsResponse_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "listDocumentsResponse");
    private final static QName _UploadDocumentResponse_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "uploadDocumentResponse");
    private final static QName _Version_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "version");
    private final static QName _VersionResponse_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "versionResponse");
    private final static QName _DeleteDocumentResponse_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "deleteDocumentResponse");
    private final static QName _DeleteDocument_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "deleteDocument");
    private final static QName _UploadDocument_QNAME = new QName("http://webservice.messaging.pt.generixgroup.com/", "uploadDocument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.generixgroup.pt.messaging.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link ListDocuments }
     * 
     */
    public ListDocuments createListDocuments() {
        return new ListDocuments();
    }

    /**
     * Create an instance of {@link DeleteDocumentResponse }
     * 
     */
    public DeleteDocumentResponse createDeleteDocumentResponse() {
        return new DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link UploadDocument }
     * 
     */
    public UploadDocument createUploadDocument() {
        return new UploadDocument();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link GetDocument }
     * 
     */
    public GetDocument createGetDocument() {
        return new GetDocument();
    }

    /**
     * Create an instance of {@link ListDocumentsResponse }
     * 
     */
    public ListDocumentsResponse createListDocumentsResponse() {
        return new ListDocumentsResponse();
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link UploadDocumentResponse }
     * 
     */
    public UploadDocumentResponse createUploadDocumentResponse() {
        return new UploadDocumentResponse();
    }

    /**
     * Create an instance of {@link RoutingInfo }
     * 
     */
    public RoutingInfo createRoutingInfo() {
        return new RoutingInfo();
    }

    /**
     * Create an instance of {@link UploadDocResponse }
     * 
     */
    public UploadDocResponse createUploadDocResponse() {
        return new UploadDocResponse();
    }

    /**
     * Create an instance of {@link ListDocResponse }
     * 
     */
    public ListDocResponse createListDocResponse() {
        return new ListDocResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link GetDocResponse }
     * 
     */
    public GetDocResponse createGetDocResponse() {
        return new GetDocResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "listDocuments")
    public JAXBElement<ListDocuments> createListDocuments(ListDocuments value) {
        return new JAXBElement<ListDocuments>(_ListDocuments_QNAME, ListDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "getDocumentResponse")
    public JAXBElement<GetDocumentResponse> createGetDocumentResponse(GetDocumentResponse value) {
        return new JAXBElement<GetDocumentResponse>(_GetDocumentResponse_QNAME, GetDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "getDocument")
    public JAXBElement<GetDocument> createGetDocument(GetDocument value) {
        return new JAXBElement<GetDocument>(_GetDocument_QNAME, GetDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "listDocumentsResponse")
    public JAXBElement<ListDocumentsResponse> createListDocumentsResponse(ListDocumentsResponse value) {
        return new JAXBElement<ListDocumentsResponse>(_ListDocumentsResponse_QNAME, ListDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "uploadDocumentResponse")
    public JAXBElement<UploadDocumentResponse> createUploadDocumentResponse(UploadDocumentResponse value) {
        return new JAXBElement<UploadDocumentResponse>(_UploadDocumentResponse_QNAME, UploadDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "version")
    public JAXBElement<Version> createVersion(Version value) {
        return new JAXBElement<Version>(_Version_QNAME, Version.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "deleteDocumentResponse")
    public JAXBElement<DeleteDocumentResponse> createDeleteDocumentResponse(DeleteDocumentResponse value) {
        return new JAXBElement<DeleteDocumentResponse>(_DeleteDocumentResponse_QNAME, DeleteDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "deleteDocument")
    public JAXBElement<DeleteDocument> createDeleteDocument(DeleteDocument value) {
        return new JAXBElement<DeleteDocument>(_DeleteDocument_QNAME, DeleteDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.messaging.pt.generixgroup.com/", name = "uploadDocument")
    public JAXBElement<UploadDocument> createUploadDocument(UploadDocument value) {
        return new JAXBElement<UploadDocument>(_UploadDocument_QNAME, UploadDocument.class, null, value);
    }

}
