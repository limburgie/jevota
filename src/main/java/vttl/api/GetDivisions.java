/**
 * GetDivisions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetDivisions  implements java.io.Serializable {
    private vttl.api.CredentialsType credentials;

    private java.math.BigInteger season;

    private java.math.BigInteger level;

    private vttl.api.ShowDivisionNameType showDivisionName;

    public GetDivisions() {
    }

    public GetDivisions(
           vttl.api.CredentialsType credentials,
           java.math.BigInteger season,
           java.math.BigInteger level,
           vttl.api.ShowDivisionNameType showDivisionName) {
           this.credentials = credentials;
           this.season = season;
           this.level = level;
           this.showDivisionName = showDivisionName;
    }


    /**
     * Gets the credentials value for this GetDivisions.
     * 
     * @return credentials
     */
    public vttl.api.CredentialsType getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetDivisions.
     * 
     * @param credentials
     */
    public void setCredentials(vttl.api.CredentialsType credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the season value for this GetDivisions.
     * 
     * @return season
     */
    public java.math.BigInteger getSeason() {
        return season;
    }


    /**
     * Sets the season value for this GetDivisions.
     * 
     * @param season
     */
    public void setSeason(java.math.BigInteger season) {
        this.season = season;
    }


    /**
     * Gets the level value for this GetDivisions.
     * 
     * @return level
     */
    public java.math.BigInteger getLevel() {
        return level;
    }


    /**
     * Sets the level value for this GetDivisions.
     * 
     * @param level
     */
    public void setLevel(java.math.BigInteger level) {
        this.level = level;
    }


    /**
     * Gets the showDivisionName value for this GetDivisions.
     * 
     * @return showDivisionName
     */
    public vttl.api.ShowDivisionNameType getShowDivisionName() {
        return showDivisionName;
    }


    /**
     * Sets the showDivisionName value for this GetDivisions.
     * 
     * @param showDivisionName
     */
    public void setShowDivisionName(vttl.api.ShowDivisionNameType showDivisionName) {
        this.showDivisionName = showDivisionName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDivisions)) return false;
        GetDivisions other = (GetDivisions) obj;
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
            ((this.season==null && other.getSeason()==null) || 
             (this.season!=null &&
              this.season.equals(other.getSeason()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.showDivisionName==null && other.getShowDivisionName()==null) || 
             (this.showDivisionName!=null &&
              this.showDivisionName.equals(other.getShowDivisionName())));
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
        if (getSeason() != null) {
            _hashCode += getSeason().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getShowDivisionName() != null) {
            _hashCode += getShowDivisionName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDivisions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CredentialsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("season");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Season"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showDivisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ShowDivisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ShowDivisionNameType"));
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
