/*
 * XML Type:  PaymentMethod
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.PaymentMethod
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1;


/**
 * An XML PaymentMethod(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
 *
 * This is a complex type.
 */
public interface PaymentMethod extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("paymentmethodbe5ftype");
    
    /**
     * Gets the "PaymentMechanism" element
     */
    x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum getPaymentMechanism();
    
    /**
     * Gets (as xml) the "PaymentMechanism" element
     */
    x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism xgetPaymentMechanism();
    
    /**
     * Sets the "PaymentMechanism" element
     */
    void setPaymentMechanism(x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum paymentMechanism);
    
    /**
     * Sets (as xml) the "PaymentMechanism" element
     */
    void xsetPaymentMechanism(x0301.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism paymentMechanism);
    
    /**
     * Gets the "PaymentAmount" element
     */
    java.math.BigDecimal getPaymentAmount();
    
    /**
     * Gets (as xml) the "PaymentAmount" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetPaymentAmount();
    
    /**
     * Sets the "PaymentAmount" element
     */
    void setPaymentAmount(java.math.BigDecimal paymentAmount);
    
    /**
     * Sets (as xml) the "PaymentAmount" element
     */
    void xsetPaymentAmount(x0301.oecdStandardAuditFileTaxPT1.SAFmonetaryType paymentAmount);
    
    /**
     * Gets the "PaymentDate" element
     */
    java.util.Calendar getPaymentDate();
    
    /**
     * Gets (as xml) the "PaymentDate" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetPaymentDate();
    
    /**
     * Sets the "PaymentDate" element
     */
    void setPaymentDate(java.util.Calendar paymentDate);
    
    /**
     * Sets (as xml) the "PaymentDate" element
     */
    void xsetPaymentDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType paymentDate);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod newInstance() {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.PaymentMethod parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.PaymentMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
