/**
 * GetMatchesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetMatchesResponse  implements java.io.Serializable {
    private java.math.BigInteger matchCount;

    private vttl.api.TeamMatchEntryType[] teamMatchesEntries;

    public GetMatchesResponse() {
    }

    public GetMatchesResponse(
           java.math.BigInteger matchCount,
           vttl.api.TeamMatchEntryType[] teamMatchesEntries) {
           this.matchCount = matchCount;
           this.teamMatchesEntries = teamMatchesEntries;
    }


    /**
     * Gets the matchCount value for this GetMatchesResponse.
     * 
     * @return matchCount
     */
    public java.math.BigInteger getMatchCount() {
        return matchCount;
    }


    /**
     * Sets the matchCount value for this GetMatchesResponse.
     * 
     * @param matchCount
     */
    public void setMatchCount(java.math.BigInteger matchCount) {
        this.matchCount = matchCount;
    }


    /**
     * Gets the teamMatchesEntries value for this GetMatchesResponse.
     * 
     * @return teamMatchesEntries
     */
    public vttl.api.TeamMatchEntryType[] getTeamMatchesEntries() {
        return teamMatchesEntries;
    }


    /**
     * Sets the teamMatchesEntries value for this GetMatchesResponse.
     * 
     * @param teamMatchesEntries
     */
    public void setTeamMatchesEntries(vttl.api.TeamMatchEntryType[] teamMatchesEntries) {
        this.teamMatchesEntries = teamMatchesEntries;
    }

    public vttl.api.TeamMatchEntryType getTeamMatchesEntries(int i) {
        return this.teamMatchesEntries[i];
    }

    public void setTeamMatchesEntries(int i, vttl.api.TeamMatchEntryType _value) {
        this.teamMatchesEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchesResponse)) return false;
        GetMatchesResponse other = (GetMatchesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchCount==null && other.getMatchCount()==null) || 
             (this.matchCount!=null &&
              this.matchCount.equals(other.getMatchCount()))) &&
            ((this.teamMatchesEntries==null && other.getTeamMatchesEntries()==null) || 
             (this.teamMatchesEntries!=null &&
              java.util.Arrays.equals(this.teamMatchesEntries, other.getTeamMatchesEntries())));
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
        if (getMatchCount() != null) {
            _hashCode += getMatchCount().hashCode();
        }
        if (getTeamMatchesEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeamMatchesEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeamMatchesEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetMatchesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamMatchesEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchesEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchEntryType"));
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
