/*
 * XML Type:  AddressStructurePT
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.02_01
 * Java type: x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT
 *
 * Automatically generated - do not modify.
 */
package x0201.oecdStandardAuditFileTaxPT1;


/**
 * An XML AddressStructurePT(@urn:OECD:StandardAuditFile-Tax:PT_1.02_01).
 *
 * This is a complex type.
 */
public interface AddressStructurePT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressStructurePT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6807A875E02E61D8569B452CCBF2BB75").resolveHandle("addressstructurept0e4etype");
    
    /**
     * Gets the "BuildingNumber" element
     */
    java.lang.String getBuildingNumber();
    
    /**
     * Gets (as xml) the "BuildingNumber" element
     */
    x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car xgetBuildingNumber();
    
    /**
     * True if has "BuildingNumber" element
     */
    boolean isSetBuildingNumber();
    
    /**
     * Sets the "BuildingNumber" element
     */
    void setBuildingNumber(java.lang.String buildingNumber);
    
    /**
     * Sets (as xml) the "BuildingNumber" element
     */
    void xsetBuildingNumber(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax10Car buildingNumber);
    
    /**
     * Unsets the "BuildingNumber" element
     */
    void unsetBuildingNumber();
    
    /**
     * Gets the "StreetName" element
     */
    java.lang.String getStreetName();
    
    /**
     * Gets (as xml) the "StreetName" element
     */
    x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car xgetStreetName();
    
    /**
     * True if has "StreetName" element
     */
    boolean isSetStreetName();
    
    /**
     * Sets the "StreetName" element
     */
    void setStreetName(java.lang.String streetName);
    
    /**
     * Sets (as xml) the "StreetName" element
     */
    void xsetStreetName(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax90Car streetName);
    
    /**
     * Unsets the "StreetName" element
     */
    void unsetStreetName();
    
    /**
     * Gets the "AddressDetail" element
     */
    java.lang.String getAddressDetail();
    
    /**
     * Gets (as xml) the "AddressDetail" element
     */
    x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car xgetAddressDetail();
    
    /**
     * Sets the "AddressDetail" element
     */
    void setAddressDetail(java.lang.String addressDetail);
    
    /**
     * Sets (as xml) the "AddressDetail" element
     */
    void xsetAddressDetail(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax100Car addressDetail);
    
    /**
     * Gets the "City" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "City" element
     */
    x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetCity();
    
    /**
     * Sets the "City" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "City" element
     */
    void xsetCity(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car city);
    
    /**
     * Gets the "PostalCode" element
     */
    java.lang.String getPostalCode();
    
    /**
     * Gets (as xml) the "PostalCode" element
     */
    x0201.oecdStandardAuditFileTaxPT1.PostalCodePT xgetPostalCode();
    
    /**
     * Sets the "PostalCode" element
     */
    void setPostalCode(java.lang.String postalCode);
    
    /**
     * Sets (as xml) the "PostalCode" element
     */
    void xsetPostalCode(x0201.oecdStandardAuditFileTaxPT1.PostalCodePT postalCode);
    
    /**
     * Gets the "Region" element
     */
    java.lang.String getRegion();
    
    /**
     * Gets (as xml) the "Region" element
     */
    x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetRegion();
    
    /**
     * True if has "Region" element
     */
    boolean isSetRegion();
    
    /**
     * Sets the "Region" element
     */
    void setRegion(java.lang.String region);
    
    /**
     * Sets (as xml) the "Region" element
     */
    void xsetRegion(x0201.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car region);
    
    /**
     * Unsets the "Region" element
     */
    void unsetRegion();
    
    /**
     * Gets the "Country" element
     */
    org.apache.xmlbeans.XmlObject getCountry();
    
    /**
     * Sets the "Country" element
     */
    void setCountry(org.apache.xmlbeans.XmlObject country);
    
    /**
     * Appends and returns a new empty "Country" element
     */
    org.apache.xmlbeans.XmlObject addNewCountry();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT newInstance() {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0201.oecdStandardAuditFileTaxPT1.AddressStructurePT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
