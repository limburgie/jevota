/**
 * GetMembersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetMembersRequest  implements java.io.Serializable {
    private vttl.api.CredentialsType credentials;

    private java.lang.String club;

    private java.math.BigInteger season;

    private java.math.BigInteger playerCategory;

    private java.math.BigInteger uniqueIndex;

    private java.lang.String nameSearch;

    private java.lang.Boolean extendedInformation;

    private java.lang.Boolean rankingPointsInformation;

    private java.lang.Boolean withResults;

    public GetMembersRequest() {
    }

    public GetMembersRequest(
           vttl.api.CredentialsType credentials,
           java.lang.String club,
           java.math.BigInteger season,
           java.math.BigInteger playerCategory,
           java.math.BigInteger uniqueIndex,
           java.lang.String nameSearch,
           java.lang.Boolean extendedInformation,
           java.lang.Boolean rankingPointsInformation,
           java.lang.Boolean withResults) {
           this.credentials = credentials;
           this.club = club;
           this.season = season;
           this.playerCategory = playerCategory;
           this.uniqueIndex = uniqueIndex;
           this.nameSearch = nameSearch;
           this.extendedInformation = extendedInformation;
           this.rankingPointsInformation = rankingPointsInformation;
           this.withResults = withResults;
    }


    /**
     * Gets the credentials value for this GetMembersRequest.
     * 
     * @return credentials
     */
    public vttl.api.CredentialsType getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetMembersRequest.
     * 
     * @param credentials
     */
    public void setCredentials(vttl.api.CredentialsType credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the club value for this GetMembersRequest.
     * 
     * @return club
     */
    public java.lang.String getClub() {
        return club;
    }


    /**
     * Sets the club value for this GetMembersRequest.
     * 
     * @param club
     */
    public void setClub(java.lang.String club) {
        this.club = club;
    }


    /**
     * Gets the season value for this GetMembersRequest.
     * 
     * @return season
     */
    public java.math.BigInteger getSeason() {
        return season;
    }


    /**
     * Sets the season value for this GetMembersRequest.
     * 
     * @param season
     */
    public void setSeason(java.math.BigInteger season) {
        this.season = season;
    }


    /**
     * Gets the playerCategory value for this GetMembersRequest.
     * 
     * @return playerCategory
     */
    public java.math.BigInteger getPlayerCategory() {
        return playerCategory;
    }


    /**
     * Sets the playerCategory value for this GetMembersRequest.
     * 
     * @param playerCategory
     */
    public void setPlayerCategory(java.math.BigInteger playerCategory) {
        this.playerCategory = playerCategory;
    }


    /**
     * Gets the uniqueIndex value for this GetMembersRequest.
     * 
     * @return uniqueIndex
     */
    public java.math.BigInteger getUniqueIndex() {
        return uniqueIndex;
    }


    /**
     * Sets the uniqueIndex value for this GetMembersRequest.
     * 
     * @param uniqueIndex
     */
    public void setUniqueIndex(java.math.BigInteger uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }


    /**
     * Gets the nameSearch value for this GetMembersRequest.
     * 
     * @return nameSearch
     */
    public java.lang.String getNameSearch() {
        return nameSearch;
    }


    /**
     * Sets the nameSearch value for this GetMembersRequest.
     * 
     * @param nameSearch
     */
    public void setNameSearch(java.lang.String nameSearch) {
        this.nameSearch = nameSearch;
    }


    /**
     * Gets the extendedInformation value for this GetMembersRequest.
     * 
     * @return extendedInformation
     */
    public java.lang.Boolean getExtendedInformation() {
        return extendedInformation;
    }


    /**
     * Sets the extendedInformation value for this GetMembersRequest.
     * 
     * @param extendedInformation
     */
    public void setExtendedInformation(java.lang.Boolean extendedInformation) {
        this.extendedInformation = extendedInformation;
    }


    /**
     * Gets the rankingPointsInformation value for this GetMembersRequest.
     * 
     * @return rankingPointsInformation
     */
    public java.lang.Boolean getRankingPointsInformation() {
        return rankingPointsInformation;
    }


    /**
     * Sets the rankingPointsInformation value for this GetMembersRequest.
     * 
     * @param rankingPointsInformation
     */
    public void setRankingPointsInformation(java.lang.Boolean rankingPointsInformation) {
        this.rankingPointsInformation = rankingPointsInformation;
    }


    /**
     * Gets the withResults value for this GetMembersRequest.
     * 
     * @return withResults
     */
    public java.lang.Boolean getWithResults() {
        return withResults;
    }


    /**
     * Sets the withResults value for this GetMembersRequest.
     * 
     * @param withResults
     */
    public void setWithResults(java.lang.Boolean withResults) {
        this.withResults = withResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMembersRequest)) return false;
        GetMembersRequest other = (GetMembersRequest) obj;
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
            ((this.club==null && other.getClub()==null) || 
             (this.club!=null &&
              this.club.equals(other.getClub()))) &&
            ((this.season==null && other.getSeason()==null) || 
             (this.season!=null &&
              this.season.equals(other.getSeason()))) &&
            ((this.playerCategory==null && other.getPlayerCategory()==null) || 
             (this.playerCategory!=null &&
              this.playerCategory.equals(other.getPlayerCategory()))) &&
            ((this.uniqueIndex==null && other.getUniqueIndex()==null) || 
             (this.uniqueIndex!=null &&
              this.uniqueIndex.equals(other.getUniqueIndex()))) &&
            ((this.nameSearch==null && other.getNameSearch()==null) || 
             (this.nameSearch!=null &&
              this.nameSearch.equals(other.getNameSearch()))) &&
            ((this.extendedInformation==null && other.getExtendedInformation()==null) || 
             (this.extendedInformation!=null &&
              this.extendedInformation.equals(other.getExtendedInformation()))) &&
            ((this.rankingPointsInformation==null && other.getRankingPointsInformation()==null) || 
             (this.rankingPointsInformation!=null &&
              this.rankingPointsInformation.equals(other.getRankingPointsInformation()))) &&
            ((this.withResults==null && other.getWithResults()==null) || 
             (this.withResults!=null &&
              this.withResults.equals(other.getWithResults())));
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
        if (getClub() != null) {
            _hashCode += getClub().hashCode();
        }
        if (getSeason() != null) {
            _hashCode += getSeason().hashCode();
        }
        if (getPlayerCategory() != null) {
            _hashCode += getPlayerCategory().hashCode();
        }
        if (getUniqueIndex() != null) {
            _hashCode += getUniqueIndex().hashCode();
        }
        if (getNameSearch() != null) {
            _hashCode += getNameSearch().hashCode();
        }
        if (getExtendedInformation() != null) {
            _hashCode += getExtendedInformation().hashCode();
        }
        if (getRankingPointsInformation() != null) {
            _hashCode += getRankingPointsInformation().hashCode();
        }
        if (getWithResults() != null) {
            _hashCode += getWithResults().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMembersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMembersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CredentialsType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("season");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Season"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playerCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PlayerCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "UniqueIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "NameSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ExtendedInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rankingPointsInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingPointsInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "WithResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
