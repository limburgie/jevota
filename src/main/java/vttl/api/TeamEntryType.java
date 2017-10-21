/**
 * TeamEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TeamEntryType  implements java.io.Serializable {
    private java.lang.String teamId;

    private java.lang.String team;

    private java.math.BigInteger divisionId;

    private java.lang.String divisionName;

    private java.math.BigInteger divisionCategory;

    private java.math.BigInteger matchType;

    public TeamEntryType() {
    }

    public TeamEntryType(
           java.lang.String teamId,
           java.lang.String team,
           java.math.BigInteger divisionId,
           java.lang.String divisionName,
           java.math.BigInteger divisionCategory,
           java.math.BigInteger matchType) {
           this.teamId = teamId;
           this.team = team;
           this.divisionId = divisionId;
           this.divisionName = divisionName;
           this.divisionCategory = divisionCategory;
           this.matchType = matchType;
    }


    /**
     * Gets the teamId value for this TeamEntryType.
     * 
     * @return teamId
     */
    public java.lang.String getTeamId() {
        return teamId;
    }


    /**
     * Sets the teamId value for this TeamEntryType.
     * 
     * @param teamId
     */
    public void setTeamId(java.lang.String teamId) {
        this.teamId = teamId;
    }


    /**
     * Gets the team value for this TeamEntryType.
     * 
     * @return team
     */
    public java.lang.String getTeam() {
        return team;
    }


    /**
     * Sets the team value for this TeamEntryType.
     * 
     * @param team
     */
    public void setTeam(java.lang.String team) {
        this.team = team;
    }


    /**
     * Gets the divisionId value for this TeamEntryType.
     * 
     * @return divisionId
     */
    public java.math.BigInteger getDivisionId() {
        return divisionId;
    }


    /**
     * Sets the divisionId value for this TeamEntryType.
     * 
     * @param divisionId
     */
    public void setDivisionId(java.math.BigInteger divisionId) {
        this.divisionId = divisionId;
    }


    /**
     * Gets the divisionName value for this TeamEntryType.
     * 
     * @return divisionName
     */
    public java.lang.String getDivisionName() {
        return divisionName;
    }


    /**
     * Sets the divisionName value for this TeamEntryType.
     * 
     * @param divisionName
     */
    public void setDivisionName(java.lang.String divisionName) {
        this.divisionName = divisionName;
    }


    /**
     * Gets the divisionCategory value for this TeamEntryType.
     * 
     * @return divisionCategory
     */
    public java.math.BigInteger getDivisionCategory() {
        return divisionCategory;
    }


    /**
     * Sets the divisionCategory value for this TeamEntryType.
     * 
     * @param divisionCategory
     */
    public void setDivisionCategory(java.math.BigInteger divisionCategory) {
        this.divisionCategory = divisionCategory;
    }


    /**
     * Gets the matchType value for this TeamEntryType.
     * 
     * @return matchType
     */
    public java.math.BigInteger getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this TeamEntryType.
     * 
     * @param matchType
     */
    public void setMatchType(java.math.BigInteger matchType) {
        this.matchType = matchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TeamEntryType)) return false;
        TeamEntryType other = (TeamEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teamId==null && other.getTeamId()==null) || 
             (this.teamId!=null &&
              this.teamId.equals(other.getTeamId()))) &&
            ((this.team==null && other.getTeam()==null) || 
             (this.team!=null &&
              this.team.equals(other.getTeam()))) &&
            ((this.divisionId==null && other.getDivisionId()==null) || 
             (this.divisionId!=null &&
              this.divisionId.equals(other.getDivisionId()))) &&
            ((this.divisionName==null && other.getDivisionName()==null) || 
             (this.divisionName!=null &&
              this.divisionName.equals(other.getDivisionName()))) &&
            ((this.divisionCategory==null && other.getDivisionCategory()==null) || 
             (this.divisionCategory!=null &&
              this.divisionCategory.equals(other.getDivisionCategory()))) &&
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType())));
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
        if (getTeamId() != null) {
            _hashCode += getTeamId().hashCode();
        }
        if (getTeam() != null) {
            _hashCode += getTeam().hashCode();
        }
        if (getDivisionId() != null) {
            _hashCode += getDivisionId().hashCode();
        }
        if (getDivisionName() != null) {
            _hashCode += getDivisionName().hashCode();
        }
        if (getDivisionCategory() != null) {
            _hashCode += getDivisionCategory().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TeamEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Team"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
