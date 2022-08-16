/*
 * XML Type:  ShippingPointStructure
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.03_01
 * Java type: x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure
 *
 * Automatically generated - do not modify.
 */
package x0301.oecdStandardAuditFileTaxPT1;


/**
 * An XML ShippingPointStructure(@urn:OECD:StandardAuditFile-Tax:PT_1.03_01).
 *
 * This is a complex type.
 */
public interface ShippingPointStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShippingPointStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB56920DEA176B941910A868497F4EE85").resolveHandle("shippingpointstructureb59btype");
    
    /**
     * Gets a List of "DeliveryID" elements
     */
    java.util.List<java.lang.String> getDeliveryIDList();
    
    /**
     * Gets array of all "DeliveryID" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getDeliveryIDArray();
    
    /**
     * Gets ith "DeliveryID" element
     */
    java.lang.String getDeliveryIDArray(int i);
    
    /**
     * Gets (as xml) a List of "DeliveryID" elements
     */
    java.util.List<x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car> xgetDeliveryIDList();
    
    /**
     * Gets (as xml) array of all "DeliveryID" elements
     * @deprecated
     */
    @Deprecated
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car[] xgetDeliveryIDArray();
    
    /**
     * Gets (as xml) ith "DeliveryID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car xgetDeliveryIDArray(int i);
    
    /**
     * Returns number of "DeliveryID" element
     */
    int sizeOfDeliveryIDArray();
    
    /**
     * Sets array of all "DeliveryID" element
     */
    void setDeliveryIDArray(java.lang.String[] deliveryIDArray);
    
    /**
     * Sets ith "DeliveryID" element
     */
    void setDeliveryIDArray(int i, java.lang.String deliveryID);
    
    /**
     * Sets (as xml) array of all "DeliveryID" element
     */
    void xsetDeliveryIDArray(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car[] deliveryIDArray);
    
    /**
     * Sets (as xml) ith "DeliveryID" element
     */
    void xsetDeliveryIDArray(int i, x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car deliveryID);
    
    /**
     * Inserts the value as the ith "DeliveryID" element
     */
    void insertDeliveryID(int i, java.lang.String deliveryID);
    
    /**
     * Appends the value as the last "DeliveryID" element
     */
    void addDeliveryID(java.lang.String deliveryID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DeliveryID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car insertNewDeliveryID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DeliveryID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax255Car addNewDeliveryID();
    
    /**
     * Removes the ith "DeliveryID" element
     */
    void removeDeliveryID(int i);
    
    /**
     * Gets the "DeliveryDate" element
     */
    java.util.Calendar getDeliveryDate();
    
    /**
     * Gets (as xml) the "DeliveryDate" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFdateType xgetDeliveryDate();
    
    /**
     * True if has "DeliveryDate" element
     */
    boolean isSetDeliveryDate();
    
    /**
     * Sets the "DeliveryDate" element
     */
    void setDeliveryDate(java.util.Calendar deliveryDate);
    
    /**
     * Sets (as xml) the "DeliveryDate" element
     */
    void xsetDeliveryDate(x0301.oecdStandardAuditFileTaxPT1.SAFdateType deliveryDate);
    
    /**
     * Unsets the "DeliveryDate" element
     */
    void unsetDeliveryDate();
    
    /**
     * Gets a List of "WarehouseID" elements
     */
    java.util.List<java.lang.String> getWarehouseIDList();
    
    /**
     * Gets array of all "WarehouseID" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getWarehouseIDArray();
    
    /**
     * Gets ith "WarehouseID" element
     */
    java.lang.String getWarehouseIDArray(int i);
    
    /**
     * Gets (as xml) a List of "WarehouseID" elements
     */
    java.util.List<x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car> xgetWarehouseIDList();
    
    /**
     * Gets (as xml) array of all "WarehouseID" elements
     * @deprecated
     */
    @Deprecated
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car[] xgetWarehouseIDArray();
    
    /**
     * Gets (as xml) ith "WarehouseID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car xgetWarehouseIDArray(int i);
    
    /**
     * Returns number of "WarehouseID" element
     */
    int sizeOfWarehouseIDArray();
    
    /**
     * Sets array of all "WarehouseID" element
     */
    void setWarehouseIDArray(java.lang.String[] warehouseIDArray);
    
    /**
     * Sets ith "WarehouseID" element
     */
    void setWarehouseIDArray(int i, java.lang.String warehouseID);
    
    /**
     * Sets (as xml) array of all "WarehouseID" element
     */
    void xsetWarehouseIDArray(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car[] warehouseIDArray);
    
    /**
     * Sets (as xml) ith "WarehouseID" element
     */
    void xsetWarehouseIDArray(int i, x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car warehouseID);
    
    /**
     * Inserts the value as the ith "WarehouseID" element
     */
    void insertWarehouseID(int i, java.lang.String warehouseID);
    
    /**
     * Appends the value as the last "WarehouseID" element
     */
    void addWarehouseID(java.lang.String warehouseID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "WarehouseID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car insertNewWarehouseID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "WarehouseID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax50Car addNewWarehouseID();
    
    /**
     * Removes the ith "WarehouseID" element
     */
    void removeWarehouseID(int i);
    
    /**
     * Gets a List of "LocationID" elements
     */
    java.util.List<java.lang.String> getLocationIDList();
    
    /**
     * Gets array of all "LocationID" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getLocationIDArray();
    
    /**
     * Gets ith "LocationID" element
     */
    java.lang.String getLocationIDArray(int i);
    
    /**
     * Gets (as xml) a List of "LocationID" elements
     */
    java.util.List<x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car> xgetLocationIDList();
    
    /**
     * Gets (as xml) array of all "LocationID" elements
     * @deprecated
     */
    @Deprecated
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[] xgetLocationIDArray();
    
    /**
     * Gets (as xml) ith "LocationID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car xgetLocationIDArray(int i);
    
    /**
     * Returns number of "LocationID" element
     */
    int sizeOfLocationIDArray();
    
    /**
     * Sets array of all "LocationID" element
     */
    void setLocationIDArray(java.lang.String[] locationIDArray);
    
    /**
     * Sets ith "LocationID" element
     */
    void setLocationIDArray(int i, java.lang.String locationID);
    
    /**
     * Sets (as xml) array of all "LocationID" element
     */
    void xsetLocationIDArray(x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car[] locationIDArray);
    
    /**
     * Sets (as xml) ith "LocationID" element
     */
    void xsetLocationIDArray(int i, x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car locationID);
    
    /**
     * Inserts the value as the ith "LocationID" element
     */
    void insertLocationID(int i, java.lang.String locationID);
    
    /**
     * Appends the value as the last "LocationID" element
     */
    void addLocationID(java.lang.String locationID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car insertNewLocationID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationID" element
     */
    x0301.oecdStandardAuditFileTaxPT1.SAFPTtextTypeMandatoryMax30Car addNewLocationID();
    
    /**
     * Removes the ith "LocationID" element
     */
    void removeLocationID(int i);
    
    /**
     * Gets the "Address" element
     */
    x0301.oecdStandardAuditFileTaxPT1.AddressStructure getAddress();
    
    /**
     * True if has "Address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(x0301.oecdStandardAuditFileTaxPT1.AddressStructure address);
    
    /**
     * Appends and returns a new empty "Address" element
     */
    x0301.oecdStandardAuditFileTaxPT1.AddressStructure addNewAddress();
    
    /**
     * Unsets the "Address" element
     */
    void unsetAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure newInstance() {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0301.oecdStandardAuditFileTaxPT1.ShippingPointStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
