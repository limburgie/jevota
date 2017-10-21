/**
 * GetDivisionRankingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetDivisionRankingRequest  implements java.io.Serializable {
    private vttl.api.CredentialsType credentials;

    private java.math.BigInteger divisionId;

    private java.lang.String weekName;

    private java.math.BigInteger rankingSystem;

    public GetDivisionRankingRequest() {
    }

    public GetDivisionRankingRequest(
           vttl.api.CredentialsType credentials,
           java.math.BigInteger divisionId,
           java.lang.String weekName,
           java.math.BigInteger rankingSystem) {
           this.credentials = credentials;
           this.divisionId = divisionId;
           this.weekName = weekName;
           this.rankingSystem = rankingSystem;
    }


    /**
     * Gets the credentials value for this GetDivisionRankingRequest.
     * 
     * @return credentials
     */
    public vttl.api.CredentialsType getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetDivisionRankingRequest.
     * 
     * @param credentials
     */
    public void setCredentials(vttl.api.CredentialsType credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the divisionId value for this GetDivisionRankingRequest.
     * 
     * @return divisionId
     */
    public java.math.BigInteger getDivisionId() {
        return divisionId;
    }


    /**
     * Sets the divisionId value for this GetDivisionRankingRequest.
     * 
     * @param divisionId
     */
    public void setDivisionId(java.math.BigInteger divisionId) {
        this.divisionId = divisionId;
    }


    /**
     * Gets the weekName value for this GetDivisionRankingRequest.
     * 
     * @return weekName
     */
    public java.lang.String getWeekName() {
        return weekName;
    }


    /**
     * Sets the weekName value for this GetDivisionRankingRequest.
     * 
     * @param weekName
     */
    public void setWeekName(java.lang.String weekName) {
        this.weekName = weekName;
    }


    /**
     * Gets the rankingSystem value for this GetDivisionRankingRequest.
     * 
     * @return rankingSystem
     */
    public java.math.BigInteger getRankingSystem() {
        return rankingSystem;
    }


    /**
     * Sets the rankingSystem value for this GetDivisionRankingRequest.
     * 
     * @param rankingSystem
     */
    public void setRankingSystem(java.math.BigInteger rankingSystem) {
        this.rankingSystem = rankingSystem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDivisionRankingRequest)) return false;
        GetDivisionRankingRequest other = (GetDivisionRankingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.divisionId==null && other.getDivisionId()==null) || 
             (this.divisionId!=null &&
              this.divisionId.equals(other.getDivisionId()))) &&
            ((this.weekName==null && other.getWeekName()==null) || 
             (this.weekName!=null &&
              this.weekName.equals(other.getWeekName()))) &&
            ((this.rankingSystem==null && other.getRankingSystem()==null) || 
             (this.rankingSystem!=null &&
              this.rankingSystem.equals(other.getRankingSystem())));
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
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getDivisionId() != null) {
            _hashCode += getDivisionId().hashCode();
        }
        if (getWeekName() != null) {
            _hashCode += getWeekName().hashCode();
        }
        if (getRankingSystem() != null) {
            _hashCode += getRankingSystem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDivisionRankingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionRankingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CredentialsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "WeekName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rankingSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
