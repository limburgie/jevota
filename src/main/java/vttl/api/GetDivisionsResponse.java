/**
 * GetDivisionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetDivisionsResponse  implements java.io.Serializable {
    private java.math.BigInteger divisionCount;

    private vttl.api.DivisionEntryType[] divisionEntries;

    public GetDivisionsResponse() {
    }

    public GetDivisionsResponse(
           java.math.BigInteger divisionCount,
           vttl.api.DivisionEntryType[] divisionEntries) {
           this.divisionCount = divisionCount;
           this.divisionEntries = divisionEntries;
    }


    /**
     * Gets the divisionCount value for this GetDivisionsResponse.
     * 
     * @return divisionCount
     */
    public java.math.BigInteger getDivisionCount() {
        return divisionCount;
    }


    /**
     * Sets the divisionCount value for this GetDivisionsResponse.
     * 
     * @param divisionCount
     */
    public void setDivisionCount(java.math.BigInteger divisionCount) {
        this.divisionCount = divisionCount;
    }


    /**
     * Gets the divisionEntries value for this GetDivisionsResponse.
     * 
     * @return divisionEntries
     */
    public vttl.api.DivisionEntryType[] getDivisionEntries() {
        return divisionEntries;
    }


    /**
     * Sets the divisionEntries value for this GetDivisionsResponse.
     * 
     * @param divisionEntries
     */
    public void setDivisionEntries(vttl.api.DivisionEntryType[] divisionEntries) {
        this.divisionEntries = divisionEntries;
    }

    public vttl.api.DivisionEntryType getDivisionEntries(int i) {
        return this.divisionEntries[i];
    }

    public void setDivisionEntries(int i, vttl.api.DivisionEntryType _value) {
        this.divisionEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDivisionsResponse)) return false;
        GetDivisionsResponse other = (GetDivisionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.divisionCount==null && other.getDivisionCount()==null) || 
             (this.divisionCount!=null &&
              this.divisionCount.equals(other.getDivisionCount()))) &&
            ((this.divisionEntries==null && other.getDivisionEntries()==null) || 
             (this.divisionEntries!=null &&
              java.util.Arrays.equals(this.divisionEntries, other.getDivisionEntries())));
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
        if (getDivisionCount() != null) {
            _hashCode += getDivisionCount().hashCode();
        }
        if (getDivisionEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDivisionEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDivisionEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDivisionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionEntryType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
