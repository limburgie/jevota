/**
 * GetDivisionRankingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetDivisionRankingResponse  implements java.io.Serializable {
    private java.lang.String divisionName;

    private vttl.api.RankingEntryType[] rankingEntries;

    public GetDivisionRankingResponse() {
    }

    public GetDivisionRankingResponse(
           java.lang.String divisionName,
           vttl.api.RankingEntryType[] rankingEntries) {
           this.divisionName = divisionName;
           this.rankingEntries = rankingEntries;
    }


    /**
     * Gets the divisionName value for this GetDivisionRankingResponse.
     * 
     * @return divisionName
     */
    public java.lang.String getDivisionName() {
        return divisionName;
    }


    /**
     * Sets the divisionName value for this GetDivisionRankingResponse.
     * 
     * @param divisionName
     */
    public void setDivisionName(java.lang.String divisionName) {
        this.divisionName = divisionName;
    }


    /**
     * Gets the rankingEntries value for this GetDivisionRankingResponse.
     * 
     * @return rankingEntries
     */
    public vttl.api.RankingEntryType[] getRankingEntries() {
        return rankingEntries;
    }


    /**
     * Sets the rankingEntries value for this GetDivisionRankingResponse.
     * 
     * @param rankingEntries
     */
    public void setRankingEntries(vttl.api.RankingEntryType[] rankingEntries) {
        this.rankingEntries = rankingEntries;
    }

    public vttl.api.RankingEntryType getRankingEntries(int i) {
        return this.rankingEntries[i];
    }

    public void setRankingEntries(int i, vttl.api.RankingEntryType _value) {
        this.rankingEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDivisionRankingResponse)) return false;
        GetDivisionRankingResponse other = (GetDivisionRankingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.divisionName==null && other.getDivisionName()==null) || 
             (this.divisionName!=null &&
              this.divisionName.equals(other.getDivisionName()))) &&
            ((this.rankingEntries==null && other.getRankingEntries()==null) || 
             (this.rankingEntries!=null &&
              java.util.Arrays.equals(this.rankingEntries, other.getRankingEntries())));
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
        if (getDivisionName() != null) {
            _hashCode += getDivisionName().hashCode();
        }
        if (getRankingEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRankingEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRankingEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetDivisionRankingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionRankingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rankingEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingEntryType"));
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
