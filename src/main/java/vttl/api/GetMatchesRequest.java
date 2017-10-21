/**
 * GetMatchesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetMatchesRequest  implements java.io.Serializable {
    private vttl.api.CredentialsType credentials;

    private java.math.BigInteger divisionId;

    private java.lang.String club;

    private java.lang.String team;

    private java.math.BigInteger divisionCategory;

    private java.math.BigInteger season;

    private java.lang.String weekName;

    private java.math.BigInteger level;

    private vttl.api.ShowDivisionNameType showDivisionName;

    private java.util.Calendar yearDateFrom;

    private java.util.Calendar yearDateTo;

    private java.lang.Boolean withDetails;

    private java.lang.String matchId;

    private java.lang.String matchUniqueId;

    public GetMatchesRequest() {
    }

    public GetMatchesRequest(
           vttl.api.CredentialsType credentials,
           java.math.BigInteger divisionId,
           java.lang.String club,
           java.lang.String team,
           java.math.BigInteger divisionCategory,
           java.math.BigInteger season,
           java.lang.String weekName,
           java.math.BigInteger level,
           vttl.api.ShowDivisionNameType showDivisionName,
           java.util.Calendar yearDateFrom,
           java.util.Calendar yearDateTo,
           java.lang.Boolean withDetails,
           java.lang.String matchId,
           java.lang.String matchUniqueId) {
           this.credentials = credentials;
           this.divisionId = divisionId;
           this.club = club;
           this.team = team;
           this.divisionCategory = divisionCategory;
           this.season = season;
           this.weekName = weekName;
           this.level = level;
           this.showDivisionName = showDivisionName;
           this.yearDateFrom = yearDateFrom;
           this.yearDateTo = yearDateTo;
           this.withDetails = withDetails;
           this.matchId = matchId;
           this.matchUniqueId = matchUniqueId;
    }


    /**
     * Gets the credentials value for this GetMatchesRequest.
     * 
     * @return credentials
     */
    public vttl.api.CredentialsType getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetMatchesRequest.
     * 
     * @param credentials
     */
    public void setCredentials(vttl.api.CredentialsType credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the divisionId value for this GetMatchesRequest.
     * 
     * @return divisionId
     */
    public java.math.BigInteger getDivisionId() {
        return divisionId;
    }


    /**
     * Sets the divisionId value for this GetMatchesRequest.
     * 
     * @param divisionId
     */
    public void setDivisionId(java.math.BigInteger divisionId) {
        this.divisionId = divisionId;
    }


    /**
     * Gets the club value for this GetMatchesRequest.
     * 
     * @return club
     */
    public java.lang.String getClub() {
        return club;
    }


    /**
     * Sets the club value for this GetMatchesRequest.
     * 
     * @param club
     */
    public void setClub(java.lang.String club) {
        this.club = club;
    }


    /**
     * Gets the team value for this GetMatchesRequest.
     * 
     * @return team
     */
    public java.lang.String getTeam() {
        return team;
    }


    /**
     * Sets the team value for this GetMatchesRequest.
     * 
     * @param team
     */
    public void setTeam(java.lang.String team) {
        this.team = team;
    }


    /**
     * Gets the divisionCategory value for this GetMatchesRequest.
     * 
     * @return divisionCategory
     */
    public java.math.BigInteger getDivisionCategory() {
        return divisionCategory;
    }


    /**
     * Sets the divisionCategory value for this GetMatchesRequest.
     * 
     * @param divisionCategory
     */
    public void setDivisionCategory(java.math.BigInteger divisionCategory) {
        this.divisionCategory = divisionCategory;
    }


    /**
     * Gets the season value for this GetMatchesRequest.
     * 
     * @return season
     */
    public java.math.BigInteger getSeason() {
        return season;
    }


    /**
     * Sets the season value for this GetMatchesRequest.
     * 
     * @param season
     */
    public void setSeason(java.math.BigInteger season) {
        this.season = season;
    }


    /**
     * Gets the weekName value for this GetMatchesRequest.
     * 
     * @return weekName
     */
    public java.lang.String getWeekName() {
        return weekName;
    }


    /**
     * Sets the weekName value for this GetMatchesRequest.
     * 
     * @param weekName
     */
    public void setWeekName(java.lang.String weekName) {
        this.weekName = weekName;
    }


    /**
     * Gets the level value for this GetMatchesRequest.
     * 
     * @return level
     */
    public java.math.BigInteger getLevel() {
        return level;
    }


    /**
     * Sets the level value for this GetMatchesRequest.
     * 
     * @param level
     */
    public void setLevel(java.math.BigInteger level) {
        this.level = level;
    }


    /**
     * Gets the showDivisionName value for this GetMatchesRequest.
     * 
     * @return showDivisionName
     */
    public vttl.api.ShowDivisionNameType getShowDivisionName() {
        return showDivisionName;
    }


    /**
     * Sets the showDivisionName value for this GetMatchesRequest.
     * 
     * @param showDivisionName
     */
    public void setShowDivisionName(vttl.api.ShowDivisionNameType showDivisionName) {
        this.showDivisionName = showDivisionName;
    }


    /**
     * Gets the yearDateFrom value for this GetMatchesRequest.
     * 
     * @return yearDateFrom
     */
    public java.util.Calendar getYearDateFrom() {
        return yearDateFrom;
    }


    /**
     * Sets the yearDateFrom value for this GetMatchesRequest.
     * 
     * @param yearDateFrom
     */
    public void setYearDateFrom(java.util.Calendar yearDateFrom) {
        this.yearDateFrom = yearDateFrom;
    }


    /**
     * Gets the yearDateTo value for this GetMatchesRequest.
     * 
     * @return yearDateTo
     */
    public java.util.Calendar getYearDateTo() {
        return yearDateTo;
    }


    /**
     * Sets the yearDateTo value for this GetMatchesRequest.
     * 
     * @param yearDateTo
     */
    public void setYearDateTo(java.util.Calendar yearDateTo) {
        this.yearDateTo = yearDateTo;
    }


    /**
     * Gets the withDetails value for this GetMatchesRequest.
     * 
     * @return withDetails
     */
    public java.lang.Boolean getWithDetails() {
        return withDetails;
    }


    /**
     * Sets the withDetails value for this GetMatchesRequest.
     * 
     * @param withDetails
     */
    public void setWithDetails(java.lang.Boolean withDetails) {
        this.withDetails = withDetails;
    }


    /**
     * Gets the matchId value for this GetMatchesRequest.
     * 
     * @return matchId
     */
    public java.lang.String getMatchId() {
        return matchId;
    }


    /**
     * Sets the matchId value for this GetMatchesRequest.
     * 
     * @param matchId
     */
    public void setMatchId(java.lang.String matchId) {
        this.matchId = matchId;
    }


    /**
     * Gets the matchUniqueId value for this GetMatchesRequest.
     * 
     * @return matchUniqueId
     */
    public java.lang.String getMatchUniqueId() {
        return matchUniqueId;
    }


    /**
     * Sets the matchUniqueId value for this GetMatchesRequest.
     * 
     * @param matchUniqueId
     */
    public void setMatchUniqueId(java.lang.String matchUniqueId) {
        this.matchUniqueId = matchUniqueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchesRequest)) return false;
        GetMatchesRequest other = (GetMatchesRequest) obj;
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
            ((this.club==null && other.getClub()==null) || 
             (this.club!=null &&
              this.club.equals(other.getClub()))) &&
            ((this.team==null && other.getTeam()==null) || 
             (this.team!=null &&
              this.team.equals(other.getTeam()))) &&
            ((this.divisionCategory==null && other.getDivisionCategory()==null) || 
             (this.divisionCategory!=null &&
              this.divisionCategory.equals(other.getDivisionCategory()))) &&
            ((this.season==null && other.getSeason()==null) || 
             (this.season!=null &&
              this.season.equals(other.getSeason()))) &&
            ((this.weekName==null && other.getWeekName()==null) || 
             (this.weekName!=null &&
              this.weekName.equals(other.getWeekName()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.showDivisionName==null && other.getShowDivisionName()==null) || 
             (this.showDivisionName!=null &&
              this.showDivisionName.equals(other.getShowDivisionName()))) &&
            ((this.yearDateFrom==null && other.getYearDateFrom()==null) || 
             (this.yearDateFrom!=null &&
              this.yearDateFrom.equals(other.getYearDateFrom()))) &&
            ((this.yearDateTo==null && other.getYearDateTo()==null) || 
             (this.yearDateTo!=null &&
              this.yearDateTo.equals(other.getYearDateTo()))) &&
            ((this.withDetails==null && other.getWithDetails()==null) || 
             (this.withDetails!=null &&
              this.withDetails.equals(other.getWithDetails()))) &&
            ((this.matchId==null && other.getMatchId()==null) || 
             (this.matchId!=null &&
              this.matchId.equals(other.getMatchId()))) &&
            ((this.matchUniqueId==null && other.getMatchUniqueId()==null) || 
             (this.matchUniqueId!=null &&
              this.matchUniqueId.equals(other.getMatchUniqueId())));
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
        if (getClub() != null) {
            _hashCode += getClub().hashCode();
        }
        if (getTeam() != null) {
            _hashCode += getTeam().hashCode();
        }
        if (getDivisionCategory() != null) {
            _hashCode += getDivisionCategory().hashCode();
        }
        if (getSeason() != null) {
            _hashCode += getSeason().hashCode();
        }
        if (getWeekName() != null) {
            _hashCode += getWeekName().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getShowDivisionName() != null) {
            _hashCode += getShowDivisionName().hashCode();
        }
        if (getYearDateFrom() != null) {
            _hashCode += getYearDateFrom().hashCode();
        }
        if (getYearDateTo() != null) {
            _hashCode += getYearDateTo().hashCode();
        }
        if (getWithDetails() != null) {
            _hashCode += getWithDetails().hashCode();
        }
        if (getMatchId() != null) {
            _hashCode += getMatchId().hashCode();
        }
        if (getMatchUniqueId() != null) {
            _hashCode += getMatchUniqueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMatchesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchesRequest"));
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
        elemField.setFieldName("team");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Team"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("weekName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "WeekName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "YearDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "YearDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "WithDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchUniqueId"));
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
