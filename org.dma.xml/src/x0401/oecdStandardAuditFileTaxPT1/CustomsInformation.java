/*
 * XML Type:  CustomsInformation
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CustomsInformation
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1;


/**
 * An XML CustomsInformation(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public interface CustomsInformation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomsInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("customsinformationbcd3type");
    
    /**
     * Gets a List of "ARCNo" elements
     */
    java.util.List<java.lang.String> getARCNoList();
    
    /**
     * Gets array of all "ARCNo" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getARCNoArray();
    
    /**
     * Gets ith "ARCNo" element
     */
    java.lang.String getARCNoArray(int i);
    
    /**
     * Gets (as xml) a List of "ARCNo" elements
     */
    java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car> xgetARCNoList();
    
    /**
     * Gets (as xml) array of all "ARCNo" elements
     * @deprecated
     */
    @Deprecated
    x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car[] xgetARCNoArray();
    
    /**
     * Gets (as xml) ith "ARCNo" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car xgetARCNoArray(int i);
    
    /**
     * Returns number of "ARCNo" element
     */
    int sizeOfARCNoArray();
    
    /**
     * Sets array of all "ARCNo" element
     */
    void setARCNoArray(java.lang.String[] arcNoArray);
    
    /**
     * Sets ith "ARCNo" element
     */
    void setARCNoArray(int i, java.lang.String arcNo);
    
    /**
     * Sets (as xml) array of all "ARCNo" element
     */
    void xsetARCNoArray(x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car[] arcNoArray);
    
    /**
     * Sets (as xml) ith "ARCNo" element
     */
    void xsetARCNoArray(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car arcNo);
    
    /**
     * Inserts the value as the ith "ARCNo" element
     */
    void insertARCNo(int i, java.lang.String arcNo);
    
    /**
     * Appends the value as the last "ARCNo" element
     */
    void addARCNo(java.lang.String arcNo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ARCNo" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car insertNewARCNo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ARCNo" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax21Car addNewARCNo();
    
    /**
     * Removes the ith "ARCNo" element
     */
    void removeARCNo(int i);
    
    /**
     * Gets the "IECAmount" element
     */
    java.math.BigDecimal getIECAmount();
    
    /**
     * Gets (as xml) the "IECAmount" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType xgetIECAmount();
    
    /**
     * True if has "IECAmount" element
     */
    boolean isSetIECAmount();
    
    /**
     * Sets the "IECAmount" element
     */
    void setIECAmount(java.math.BigDecimal iecAmount);
    
    /**
     * Sets (as xml) the "IECAmount" element
     */
    void xsetIECAmount(x0401.oecdStandardAuditFileTaxPT1.SAFmonetaryType iecAmount);
    
    /**
     * Unsets the "IECAmount" element
     */
    void unsetIECAmount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation newInstance() {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsInformation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
