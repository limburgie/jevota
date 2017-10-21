/**
 * GetClubsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetClubsResponse  implements java.io.Serializable {
    private java.math.BigInteger clubCount;

    private vttl.api.ClubEntryType[] clubEntries;

    public GetClubsResponse() {
    }

    public GetClubsResponse(
           java.math.BigInteger clubCount,
           vttl.api.ClubEntryType[] clubEntries) {
           this.clubCount = clubCount;
           this.clubEntries = clubEntries;
    }


    /**
     * Gets the clubCount value for this GetClubsResponse.
     * 
     * @return clubCount
     */
    public java.math.BigInteger getClubCount() {
        return clubCount;
    }


    /**
     * Sets the clubCount value for this GetClubsResponse.
     * 
     * @param clubCount
     */
    public void setClubCount(java.math.BigInteger clubCount) {
        this.clubCount = clubCount;
    }


    /**
     * Gets the clubEntries value for this GetClubsResponse.
     * 
     * @return clubEntries
     */
    public vttl.api.ClubEntryType[] getClubEntries() {
        return clubEntries;
    }


    /**
     * Sets the clubEntries value for this GetClubsResponse.
     * 
     * @param clubEntries
     */
    public void setClubEntries(vttl.api.ClubEntryType[] clubEntries) {
        this.clubEntries = clubEntries;
    }

    public vttl.api.ClubEntryType getClubEntries(int i) {
        return this.clubEntries[i];
    }

    public void setClubEntries(int i, vttl.api.ClubEntryType _value) {
        this.clubEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClubsResponse)) return false;
        GetClubsResponse other = (GetClubsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clubCount==null && other.getClubCount()==null) || 
             (this.clubCount!=null &&
              this.clubCount.equals(other.getClubCount()))) &&
            ((this.clubEntries==null && other.getClubEntries()==null) || 
             (this.clubEntries!=null &&
              java.util.Arrays.equals(this.clubEntries, other.getClubEntries())));
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
        if (getClubCount() != null) {
            _hashCode += getClubCount().hashCode();
        }
        if (getClubEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClubEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClubEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetClubsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clubCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ClubCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clubEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ClubEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ClubEntryType"));
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
