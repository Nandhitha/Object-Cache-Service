/**
 * GetCacheResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObjectCachePackage;

public class GetCacheResponse  implements java.io.Serializable {
    private java.lang.Object getCacheReturn;

    public GetCacheResponse() {
    }

    public GetCacheResponse(
           java.lang.Object getCacheReturn) {
           this.getCacheReturn = getCacheReturn;
    }


    /**
     * Gets the getCacheReturn value for this GetCacheResponse.
     * 
     * @return getCacheReturn
     */
    public java.lang.Object getGetCacheReturn() {
        return getCacheReturn;
    }


    /**
     * Sets the getCacheReturn value for this GetCacheResponse.
     * 
     * @param getCacheReturn
     */
    public void setGetCacheReturn(java.lang.Object getCacheReturn) {
        this.getCacheReturn = getCacheReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCacheResponse)) return false;
        GetCacheResponse other = (GetCacheResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCacheReturn==null && other.getGetCacheReturn()==null) || 
             (this.getCacheReturn!=null &&
              this.getCacheReturn.equals(other.getGetCacheReturn())));
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
        if (getGetCacheReturn() != null) {
            _hashCode += getGetCacheReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCacheResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ObjectCachePackage", ">getCacheResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCacheReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObjectCachePackage", "getCacheReturn"));
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
