/*
 * An XML document type.
 * Localname: Period
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.PeriodDocument
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one Period(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01) element.
 *
 * This is a complex type.
 */
public interface PeriodDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PeriodDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("periodb8badoctype");
    
    /**
     * Gets the "Period" element
     */
    int getPeriod();
    
    /**
     * Gets (as xml) the "Period" element
     */
    x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period xgetPeriod();
    
    /**
     * Sets the "Period" element
     */
    void setPeriod(int period);
    
    /**
     * Sets (as xml) the "Period" element
     */
    void xsetPeriod(x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period period);
    
    /**
     * An XML Period(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
     *
     * This is an atomic type that is a restriction of x0401.oecdStandardAuditFileTaxPT1.PeriodDocument$Period.
     */
    public interface Period extends org.apache.xmlbeans.XmlInteger
    {
        int getIntValue();
        void setIntValue(int i);
        /** @deprecated */
        @Deprecated
        int intValue();
        /** @deprecated */
        @Deprecated
        void set(int i);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Period.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("period811delemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period newValue(java.lang.Object obj) {
              return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period) type.newValue( obj ); }
            
            public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period newInstance() {
              return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument.Period) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument newInstance() {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.PeriodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.PeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
