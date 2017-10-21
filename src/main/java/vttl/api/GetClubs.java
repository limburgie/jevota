/**
 * GetClubs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetClubs  implements java.io.Serializable {
    private vttl.api.CredentialsType credentials;

    private java.math.BigInteger season;

    private java.math.BigInteger clubCategory;

    private java.lang.String club;

    public GetClubs() {
    }

    public GetClubs(
           vttl.api.CredentialsType credentials,
           java.math.BigInteger season,
           java.math.BigInteger clubCategory,
           java.lang.String club) {
           this.credentials = credentials;
           this.season = season;
           this.clubCategory = clubCategory;
           this.club = club;
    }


    /**
     * Gets the credentials value for this GetClubs.
     * 
     * @return credentials
     */
    public vttl.api.CredentialsType getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetClubs.
     * 
     * @param credentials
     */
    public void setCredentials(vttl.api.CredentialsType credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the season value for this GetClubs.
     * 
     * @return season
     */
    public java.math.BigInteger getSeason() {
        return season;
    }


    /**
     * Sets the season value for this GetClubs.
     * 
     * @param season
     */
    public void setSeason(java.math.BigInteger season) {
        this.season = season;
    }


    /**
     * Gets the clubCategory value for this GetClubs.
     * 
     * @return clubCategory
     */
    public java.math.BigInteger getClubCategory() {
        return clubCategory;
    }


    /**
     * Sets the clubCategory value for this GetClubs.
     * 
     * @param clubCategory
     */
    public void setClubCategory(java.math.BigInteger clubCategory) {
        this.clubCategory = clubCategory;
    }


    /**
     * Gets the club value for this GetClubs.
     * 
     * @return club
     */
    public java.lang.String getClub() {
        return club;
    }


    /**
     * Sets the club value for this GetClubs.
     * 
     * @param club
     */
    public void setClub(java.lang.String club) {
        this.club = club;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClubs)) return false;
        GetClubs other = (GetClubs) obj;
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
            ((this.clubCategory==null && other.getClubCategory()==null) || 
             (this.clubCategory!=null &&
              this.clubCategory.equals(other.getClubCategory()))) &&
            ((this.club==null && other.getClub()==null) || 
             (this.club!=null &&
              this.club.equals(other.getClub())));
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
        if (getClubCategory() != null) {
            _hashCode += getClubCategory().hashCode();
        }
        if (getClub() != null) {
            _hashCode += getClub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClubs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubs"));
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
        elemField.setFieldName("clubCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ClubCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("club");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Club"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
