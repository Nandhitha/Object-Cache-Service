/**
 * PutCache.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObjectCachePackage;

public class PutCache  implements java.io.Serializable {
    private java.lang.Object k;

    private java.lang.Object v;

    public PutCache() {
    }

    public PutCache(
           java.lang.Object k,
           java.lang.Object v) {
           this.k = k;
           this.v = v;
    }


    /**
     * Gets the k value for this PutCache.
     * 
     * @return k
     */
    public java.lang.Object getK() {
        return k;
    }


    /**
     * Sets the k value for this PutCache.
     * 
     * @param k
     */
    public void setK(java.lang.Object k) {
        this.k = k;
    }


    /**
     * Gets the v value for this PutCache.
     * 
     * @return v
     */
    public java.lang.Object getV() {
        return v;
    }


    /**
     * Sets the v value for this PutCache.
     * 
     * @param v
     */
    public void setV(java.lang.Object v) {
        this.v = v;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PutCache)) return false;
        PutCache other = (PutCache) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.k==null && other.getK()==null) || 
             (this.k!=null &&
              this.k.equals(other.getK()))) &&
            ((this.v==null && other.getV()==null) || 
             (this.v!=null &&
              this.v.equals(other.getV())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getK() != null) {
            _hashCode += getK().hashCode();
        }
        if (getV() != null) {
            _hashCode += getV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PutCache.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ObjectCachePackage", ">putCache"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("k");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObjectCachePackage", "k"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObjectCachePackage", "v"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
