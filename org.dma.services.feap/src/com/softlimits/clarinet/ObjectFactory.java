
package com.softlimits.clarinet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.softlimits.clarinet package.
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

    private final static QName _Sender_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "Sender");
    private final static QName _MessageIdList_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "MessageIdList");
    private final static QName _MessageDataList_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "MessageDataList");
    private final static QName _MessageId_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "MessageId");
    private final static QName _ArrayOfMessageOutputData_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "ArrayOfMessageOutputData");
    private final static QName _Filename_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "Filename");
    private final static QName _Receiver_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "Receiver");
    private final static QName _MessageOutputData_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "MessageOutputData");
    private final static QName _ContentType_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "ContentType");
    private final static QName _ArrayOfMessageOutputIdentification_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "ArrayOfMessageOutputIdentification");
    private final static QName _Message_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "Message");
    private final static QName _MessageOutputIdentification_QNAME = new QName("http://www.softlimits.com/Clarinet.Trade", "MessageOutputIdentification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.softlimits.clarinet
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfMessageOutputData }
     *
     */
    public ArrayOfMessageOutputData createArrayOfMessageOutputData() {
        return new ArrayOfMessageOutputData();
    }

    /**
     * Create an instance of {@link ArrayOfMessageOutputIdentification }
     *
     */
    public ArrayOfMessageOutputIdentification createArrayOfMessageOutputIdentification() {
        return new ArrayOfMessageOutputIdentification();
    }

    /**
     * Create an instance of {@link MessageOutputIdentification }
     *
     */
    public MessageOutputIdentification createMessageOutputIdentification() {
        return new MessageOutputIdentification();
    }

    /**
     * Create an instance of {@link MessageOutputData }
     *
     */
    public MessageOutputData createMessageOutputData() {
        return new MessageOutputData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "Sender")
    public JAXBElement<String> createSender(String value) {
        return new JAXBElement<String>(_Sender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageOutputIdentification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "MessageIdList")
    public JAXBElement<ArrayOfMessageOutputIdentification> createMessageIdList(ArrayOfMessageOutputIdentification value) {
        return new JAXBElement<ArrayOfMessageOutputIdentification>(_MessageIdList_QNAME, ArrayOfMessageOutputIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageOutputData }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "MessageDataList")
    public JAXBElement<ArrayOfMessageOutputData> createMessageDataList(ArrayOfMessageOutputData value) {
        return new JAXBElement<ArrayOfMessageOutputData>(_MessageDataList_QNAME, ArrayOfMessageOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<String>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageOutputData }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "ArrayOfMessageOutputData")
    public JAXBElement<ArrayOfMessageOutputData> createArrayOfMessageOutputData(ArrayOfMessageOutputData value) {
        return new JAXBElement<ArrayOfMessageOutputData>(_ArrayOfMessageOutputData_QNAME, ArrayOfMessageOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "Filename")
    public JAXBElement<String> createFilename(String value) {
        return new JAXBElement<String>(_Filename_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "Receiver")
    public JAXBElement<String> createReceiver(String value) {
        return new JAXBElement<String>(_Receiver_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageOutputData }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "MessageOutputData")
    public JAXBElement<MessageOutputData> createMessageOutputData(MessageOutputData value) {
        return new JAXBElement<MessageOutputData>(_MessageOutputData_QNAME, MessageOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "ContentType")
    public JAXBElement<String> createContentType(String value) {
        return new JAXBElement<String>(_ContentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageOutputIdentification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "ArrayOfMessageOutputIdentification")
    public JAXBElement<ArrayOfMessageOutputIdentification> createArrayOfMessageOutputIdentification(ArrayOfMessageOutputIdentification value) {
        return new JAXBElement<ArrayOfMessageOutputIdentification>(_ArrayOfMessageOutputIdentification_QNAME, ArrayOfMessageOutputIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte}{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "Message")
    public JAXBElement<byte[]> createMessage(byte[] value) {
        return new JAXBElement<byte[]>(_Message_QNAME, byte[].class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageOutputIdentification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "MessageOutputIdentification")
    public JAXBElement<MessageOutputIdentification> createMessageOutputIdentification(MessageOutputIdentification value) {
        return new JAXBElement<MessageOutputIdentification>(_MessageOutputIdentification_QNAME, MessageOutputIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "MessageId", scope = MessageOutputData.class)
    public JAXBElement<String> createMessageOutputDataMessageId(String value) {
        return new JAXBElement<String>(_MessageId_QNAME, String.class, MessageOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.softlimits.com/Clarinet.Trade", name = "Filename", scope = MessageOutputData.class)
    public JAXBElement<String> createMessageOutputDataFilename(String value) {
        return new JAXBElement<String>(_Filename_QNAME, String.class, MessageOutputData.class, value);
    }

}
