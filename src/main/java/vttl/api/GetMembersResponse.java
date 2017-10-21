/**
 * GetMembersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetMembersResponse  implements java.io.Serializable {
    private java.math.BigInteger memberCount;

    private vttl.api.MemberEntryType[] memberEntries;

    public GetMembersResponse() {
    }

    public GetMembersResponse(
           java.math.BigInteger memberCount,
           vttl.api.MemberEntryType[] memberEntries) {
           this.memberCount = memberCount;
           this.memberEntries = memberEntries;
    }


    /**
     * Gets the memberCount value for this GetMembersResponse.
     * 
     * @return memberCount
     */
    public java.math.BigInteger getMemberCount() {
        return memberCount;
    }


    /**
     * Sets the memberCount value for this GetMembersResponse.
     * 
     * @param memberCount
     */
    public void setMemberCount(java.math.BigInteger memberCount) {
        this.memberCount = memberCount;
    }


    /**
     * Gets the memberEntries value for this GetMembersResponse.
     * 
     * @return memberEntries
     */
    public vttl.api.MemberEntryType[] getMemberEntries() {
        return memberEntries;
    }


    /**
     * Sets the memberEntries value for this GetMembersResponse.
     * 
     * @param memberEntries
     */
    public void setMemberEntries(vttl.api.MemberEntryType[] memberEntries) {
        this.memberEntries = memberEntries;
    }

    public vttl.api.MemberEntryType getMemberEntries(int i) {
        return this.memberEntries[i];
    }

    public void setMemberEntries(int i, vttl.api.MemberEntryType _value) {
        this.memberEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMembersResponse)) return false;
        GetMembersResponse other = (GetMembersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberCount==null && other.getMemberCount()==null) || 
             (this.memberCount!=null &&
              this.memberCount.equals(other.getMemberCount()))) &&
            ((this.memberEntries==null && other.getMemberEntries()==null) || 
             (this.memberEntries!=null &&
              java.util.Arrays.equals(this.memberEntries, other.getMemberEntries())));
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
        if (getMemberCount() != null) {
            _hashCode += getMemberCount().hashCode();
        }
        if (getMemberEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetMembersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMembersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MemberCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MemberEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MemberEntryType"));
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
