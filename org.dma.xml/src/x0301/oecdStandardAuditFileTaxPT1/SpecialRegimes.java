/*
 * XML Type:  SpecialRegimes
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1;


/**
 * An XML SpecialRegimes(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
 *
 * This is a complex type.
 */
public interface SpecialRegimes extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpecialRegimes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("specialregimesf4f7type");
    
    /**
     * Gets the "SelfBillingIndicator" element
     */
    int getSelfBillingIndicator();
    
    /**
     * Gets (as xml) the "SelfBillingIndicator" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator xgetSelfBillingIndicator();
    
    /**
     * Sets the "SelfBillingIndicator" element
     */
    void setSelfBillingIndicator(int selfBillingIndicator);
    
    /**
     * Sets (as xml) the "SelfBillingIndicator" element
     */
    void xsetSelfBillingIndicator(x0301.oecdStandardAuditFileTaxPT1.SelfBillingIndicatorDocument.SelfBillingIndicator selfBillingIndicator);
    
    /**
     * Gets the "CashVATSchemeIndicator" element
     */
    int getCashVATSchemeIndicator();
    
    /**
     * Gets (as xml) the "CashVATSchemeIndicator" element
     */
    x0301.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator xgetCashVATSchemeIndicator();
    
    /**
     * Sets the "CashVATSchemeIndicator" element
     */
    void setCashVATSchemeIndicator(int cashVATSchemeIndicator);
    
    /**
     * Sets (as xml) the "CashVATSchemeIndicator" element
     */
    void xsetCashVATSchemeIndicator(x0301.oecdStandardAuditFileTaxPT1.CashVATSchemeIndicatorDocument.CashVATSchemeIndicator cashVATSchemeIndicator);
    
    /**
     * Gets the "ThirdPartiesBillingIndicator" element
     */
    int getThirdPartiesBillingIndicator();
    
    /**
     * Gets (as xml) the "ThirdPartiesBillingIndicator" element
     */
    x0301.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator xgetThirdPartiesBillingIndicator();
    
    /**
     * Sets the "ThirdPartiesBillingIndicator" element
     */
    void setThirdPartiesBillingIndicator(int thirdPartiesBillingIndicator);
    
    /**
     * Sets (as xml) the "ThirdPartiesBillingIndicator" element
     */
    void xsetThirdPartiesBillingIndicator(x0301.oecdStandardAuditFileTaxPT1.ThirdPartiesBillingIndicatorDocument.ThirdPartiesBillingIndicator thirdPartiesBillingIndicator);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes newInstance() {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.SpecialRegimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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