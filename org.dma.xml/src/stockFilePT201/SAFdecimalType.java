/*
 * XML Type:  SAFdecimalType
 * Namespace: urn:StockFile:PT_2_01
 * Java type: stockFilePT201.SAFdecimalType
 *
 * Automatically generated - do not modify.
 */
package stockFilePT201;


/**
 * An XML SAFdecimalType(@urn:StockFile:PT_2_01).
 *
 * This is an atomic type that is a restriction of stockFilePT201.SAFdecimalType.
 */
public interface SAFdecimalType extends org.apache.xmlbeans.XmlDecimal
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SAFdecimalType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FEADA075163D98187D9DF3A0C311B79").resolveHandle("safdecimaltype27b4type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static stockFilePT201.SAFdecimalType newValue(java.lang.Object obj) {
          return (stockFilePT201.SAFdecimalType) type.newValue( obj ); }
        
        public static stockFilePT201.SAFdecimalType newInstance() {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static stockFilePT201.SAFdecimalType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static stockFilePT201.SAFdecimalType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static stockFilePT201.SAFdecimalType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static stockFilePT201.SAFdecimalType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static stockFilePT201.SAFdecimalType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static stockFilePT201.SAFdecimalType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static stockFilePT201.SAFdecimalType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static stockFilePT201.SAFdecimalType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT201.SAFdecimalType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static stockFilePT201.SAFdecimalType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stockFilePT201.SAFdecimalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
