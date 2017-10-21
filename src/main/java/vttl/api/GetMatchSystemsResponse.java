/**
 * GetMatchSystemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetMatchSystemsResponse  implements java.io.Serializable {
    private java.math.BigInteger matchSystemCount;

    private vttl.api.MatchSystemEntryType[] matchSystemEntries;

    public GetMatchSystemsResponse() {
    }

    public GetMatchSystemsResponse(
           java.math.BigInteger matchSystemCount,
           vttl.api.MatchSystemEntryType[] matchSystemEntries) {
           this.matchSystemCount = matchSystemCount;
           this.matchSystemEntries = matchSystemEntries;
    }


    /**
     * Gets the matchSystemCount value for this GetMatchSystemsResponse.
     * 
     * @return matchSystemCount
     */
    public java.math.BigInteger getMatchSystemCount() {
        return matchSystemCount;
    }


    /**
     * Sets the matchSystemCount value for this GetMatchSystemsResponse.
     * 
     * @param matchSystemCount
     */
    public void setMatchSystemCount(java.math.BigInteger matchSystemCount) {
        this.matchSystemCount = matchSystemCount;
    }


    /**
     * Gets the matchSystemEntries value for this GetMatchSystemsResponse.
     * 
     * @return matchSystemEntries
     */
    public vttl.api.MatchSystemEntryType[] getMatchSystemEntries() {
        return matchSystemEntries;
    }


    /**
     * Sets the matchSystemEntries value for this GetMatchSystemsResponse.
     * 
     * @param matchSystemEntries
     */
    public void setMatchSystemEntries(vttl.api.MatchSystemEntryType[] matchSystemEntries) {
        this.matchSystemEntries = matchSystemEntries;
    }

    public vttl.api.MatchSystemEntryType getMatchSystemEntries(int i) {
        return this.matchSystemEntries[i];
    }

    public void setMatchSystemEntries(int i, vttl.api.MatchSystemEntryType _value) {
        this.matchSystemEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchSystemsResponse)) return false;
        GetMatchSystemsResponse other = (GetMatchSystemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchSystemCount==null && other.getMatchSystemCount()==null) || 
             (this.matchSystemCount!=null &&
              this.matchSystemCount.equals(other.getMatchSystemCount()))) &&
            ((this.matchSystemEntries==null && other.getMatchSystemEntries()==null) || 
             (this.matchSystemEntries!=null &&
              java.util.Arrays.equals(this.matchSystemEntries, other.getMatchSystemEntries())));
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
        if (getMatchSystemCount() != null) {
            _hashCode += getMatchSystemCount().hashCode();
        }
        if (getMatchSystemEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchSystemEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchSystemEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetMatchSystemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchSystemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchSystemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchSystemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchSystemEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchSystemEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchSystemEntryType"));
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
