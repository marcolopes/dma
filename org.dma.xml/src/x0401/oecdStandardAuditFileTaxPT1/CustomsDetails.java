/*
 * XML Type:  CustomsDetails
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.04_01
 * Java type: x0401.oecdStandardAuditFileTaxPT1.CustomsDetails
 *
 * Automatically generated - do not modify.
 */
package x0401.oecdStandardAuditFileTaxPT1;


/**
 * An XML CustomsDetails(@urn:OECD:StandardAuditFile-Tax:PT_1.04_01).
 *
 * This is a complex type.
 */
public interface CustomsDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomsDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25593249777A7B590168EB7C07CF83EB").resolveHandle("customsdetails19e9type");
    
    /**
     * Gets a List of "CNCode" elements
     */
    java.util.List<java.lang.String> getCNCodeList();
    
    /**
     * Gets array of all "CNCode" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getCNCodeArray();
    
    /**
     * Gets ith "CNCode" element
     */
    java.lang.String getCNCodeArray(int i);
    
    /**
     * Gets (as xml) a List of "CNCode" elements
     */
    java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode> xgetCNCodeList();
    
    /**
     * Gets (as xml) array of all "CNCode" elements
     * @deprecated
     */
    @Deprecated
    x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode[] xgetCNCodeArray();
    
    /**
     * Gets (as xml) ith "CNCode" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode xgetCNCodeArray(int i);
    
    /**
     * Returns number of "CNCode" element
     */
    int sizeOfCNCodeArray();
    
    /**
     * Sets array of all "CNCode" element
     */
    void setCNCodeArray(java.lang.String[] cnCodeArray);
    
    /**
     * Sets ith "CNCode" element
     */
    void setCNCodeArray(int i, java.lang.String cnCode);
    
    /**
     * Sets (as xml) array of all "CNCode" element
     */
    void xsetCNCodeArray(x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode[] cnCodeArray);
    
    /**
     * Sets (as xml) ith "CNCode" element
     */
    void xsetCNCodeArray(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode cnCode);
    
    /**
     * Inserts the value as the ith "CNCode" element
     */
    void insertCNCode(int i, java.lang.String cnCode);
    
    /**
     * Appends the value as the last "CNCode" element
     */
    void addCNCode(java.lang.String cnCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CNCode" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode insertNewCNCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CNCode" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTCNCode addNewCNCode();
    
    /**
     * Removes the ith "CNCode" element
     */
    void removeCNCode(int i);
    
    /**
     * Gets a List of "UNNumber" elements
     */
    java.util.List<java.lang.String> getUNNumberList();
    
    /**
     * Gets array of all "UNNumber" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getUNNumberArray();
    
    /**
     * Gets ith "UNNumber" element
     */
    java.lang.String getUNNumberArray(int i);
    
    /**
     * Gets (as xml) a List of "UNNumber" elements
     */
    java.util.List<x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber> xgetUNNumberList();
    
    /**
     * Gets (as xml) array of all "UNNumber" elements
     * @deprecated
     */
    @Deprecated
    x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber[] xgetUNNumberArray();
    
    /**
     * Gets (as xml) ith "UNNumber" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber xgetUNNumberArray(int i);
    
    /**
     * Returns number of "UNNumber" element
     */
    int sizeOfUNNumberArray();
    
    /**
     * Sets array of all "UNNumber" element
     */
    void setUNNumberArray(java.lang.String[] unNumberArray);
    
    /**
     * Sets ith "UNNumber" element
     */
    void setUNNumberArray(int i, java.lang.String unNumber);
    
    /**
     * Sets (as xml) array of all "UNNumber" element
     */
    void xsetUNNumberArray(x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber[] unNumberArray);
    
    /**
     * Sets (as xml) ith "UNNumber" element
     */
    void xsetUNNumberArray(int i, x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber unNumber);
    
    /**
     * Inserts the value as the ith "UNNumber" element
     */
    void insertUNNumber(int i, java.lang.String unNumber);
    
    /**
     * Appends the value as the last "UNNumber" element
     */
    void addUNNumber(java.lang.String unNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UNNumber" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber insertNewUNNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UNNumber" element
     */
    x0401.oecdStandardAuditFileTaxPT1.SAFPTUNNumber addNewUNNumber();
    
    /**
     * Removes the ith "UNNumber" element
     */
    void removeUNNumber(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails newInstance() {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0401.oecdStandardAuditFileTaxPT1.CustomsDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0401.oecdStandardAuditFileTaxPT1.CustomsDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
