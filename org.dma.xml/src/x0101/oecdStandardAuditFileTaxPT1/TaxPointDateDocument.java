/*
 * An XML document type.
 * Localname: TaxPointDate
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one TaxPointDate(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public interface TaxPointDateDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaxPointDateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("taxpointdateb28fdoctype");
    
    /**
     * Gets the "TaxPointDate" element
     */
    java.util.Calendar getTaxPointDate();
    
    /**
     * Gets (as xml) the "TaxPointDate" element
     */
    x0101.oecdStandardAuditFileTaxPT1.SAFdateType xgetTaxPointDate();
    
    /**
     * Sets the "TaxPointDate" element
     */
    void setTaxPointDate(java.util.Calendar taxPointDate);
    
    /**
     * Sets (as xml) the "TaxPointDate" element
     */
    void xsetTaxPointDate(x0101.oecdStandardAuditFileTaxPT1.SAFdateType taxPointDate);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument newInstance() {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.TaxPointDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
