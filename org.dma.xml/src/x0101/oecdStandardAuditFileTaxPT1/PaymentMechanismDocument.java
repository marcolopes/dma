/*
 * An XML document type.
 * Localname: PaymentMechanism
 * Namespace: urn:OECD:StandardAuditFile-Tax:PT_1.01_01
 * Java type: x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument
 *
 * Automatically generated - do not modify.
 */
package x0101.oecdStandardAuditFileTaxPT1;


/**
 * A document containing one PaymentMechanism(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01) element.
 *
 * This is a complex type.
 */
public interface PaymentMechanismDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentMechanismDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("paymentmechanism940fdoctype");
    
    /**
     * Gets the "PaymentMechanism" element
     */
    x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum getPaymentMechanism();
    
    /**
     * Gets (as xml) the "PaymentMechanism" element
     */
    x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism xgetPaymentMechanism();
    
    /**
     * Sets the "PaymentMechanism" element
     */
    void setPaymentMechanism(x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism.Enum paymentMechanism);
    
    /**
     * Sets (as xml) the "PaymentMechanism" element
     */
    void xsetPaymentMechanism(x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism paymentMechanism);
    
    /**
     * An XML PaymentMechanism(@urn:OECD:StandardAuditFile-Tax:PT_1.01_01).
     *
     * This is an atomic type that is a restriction of x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument$PaymentMechanism.
     */
    public interface PaymentMechanism extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentMechanism.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD333BD87CA6FBD44E91365563B1F8A20").resolveHandle("paymentmechanism0dc0elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum NU = Enum.forString("NU");
        static final Enum CH = Enum.forString("CH");
        static final Enum CD = Enum.forString("CD");
        static final Enum CC = Enum.forString("CC");
        static final Enum TB = Enum.forString("TB");
        static final Enum TR = Enum.forString("TR");
        
        static final int INT_NU = Enum.INT_NU;
        static final int INT_CH = Enum.INT_CH;
        static final int INT_CD = Enum.INT_CD;
        static final int INT_CC = Enum.INT_CC;
        static final int INT_TB = Enum.INT_TB;
        static final int INT_TR = Enum.INT_TR;
        
        /**
         * Enumeration value class for x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument$PaymentMechanism.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_NU
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_NU = 1;
            static final int INT_CH = 2;
            static final int INT_CD = 3;
            static final int INT_CC = 4;
            static final int INT_TB = 5;
            static final int INT_TR = 6;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("NU", INT_NU),
                    new Enum("CH", INT_CH),
                    new Enum("CD", INT_CD),
                    new Enum("CC", INT_CC),
                    new Enum("TB", INT_TB),
                    new Enum("TR", INT_TR),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism newValue(java.lang.Object obj) {
              return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism) type.newValue( obj ); }
            
            public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism newInstance() {
              return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument.PaymentMechanism) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument newInstance() {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0101.oecdStandardAuditFileTaxPT1.PaymentMechanismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
