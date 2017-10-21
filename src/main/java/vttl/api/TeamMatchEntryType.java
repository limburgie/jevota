/**
 * TeamMatchEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TeamMatchEntryType  implements java.io.Serializable {
    private java.lang.String divisionName;

    private java.lang.String matchId;

    private java.lang.String weekName;

    private java.util.Date date;

    private org.apache.axis.types.Time time;

    private java.math.BigInteger venue;

    private java.lang.String homeClub;

    private java.lang.String homeTeam;

    private java.lang.String awayClub;

    private java.lang.String awayTeam;

    private java.lang.String score;

    private java.math.BigInteger matchUniqueId;

    private java.lang.String nextWeekName;

    private java.lang.String previousWeekName;

    private java.lang.Boolean isHomeForfeited;

    private java.lang.Boolean isAwayForfeited;

    private vttl.api.TeamMatchDetailsEntryType matchDetails;

    public TeamMatchEntryType() {
    }

    public TeamMatchEntryType(
           java.lang.String divisionName,
           java.lang.String matchId,
           java.lang.String weekName,
           java.util.Date date,
           org.apache.axis.types.Time time,
           java.math.BigInteger venue,
           java.lang.String homeClub,
           java.lang.String homeTeam,
           java.lang.String awayClub,
           java.lang.String awayTeam,
           java.lang.String score,
           java.math.BigInteger matchUniqueId,
           java.lang.String nextWeekName,
           java.lang.String previousWeekName,
           java.lang.Boolean isHomeForfeited,
           java.lang.Boolean isAwayForfeited,
           vttl.api.TeamMatchDetailsEntryType matchDetails) {
           this.divisionName = divisionName;
           this.matchId = matchId;
           this.weekName = weekName;
           this.date = date;
           this.time = time;
           this.venue = venue;
           this.homeClub = homeClub;
           this.homeTeam = homeTeam;
           this.awayClub = awayClub;
           this.awayTeam = awayTeam;
           this.score = score;
           this.matchUniqueId = matchUniqueId;
           this.nextWeekName = nextWeekName;
           this.previousWeekName = previousWeekName;
           this.isHomeForfeited = isHomeForfeited;
           this.isAwayForfeited = isAwayForfeited;
           this.matchDetails = matchDetails;
    }


    /**
     * Gets the divisionName value for this TeamMatchEntryType.
     * 
     * @return divisionName
     */
    public java.lang.String getDivisionName() {
        return divisionName;
    }


    /**
     * Sets the divisionName value for this TeamMatchEntryType.
     * 
     * @param divisionName
     */
    public void setDivisionName(java.lang.String divisionName) {
        this.divisionName = divisionName;
    }


    /**
     * Gets the matchId value for this TeamMatchEntryType.
     * 
     * @return matchId
     */
    public java.lang.String getMatchId() {
        return matchId;
    }


    /**
     * Sets the matchId value for this TeamMatchEntryType.
     * 
     * @param matchId
     */
    public void setMatchId(java.lang.String matchId) {
        this.matchId = matchId;
    }


    /**
     * Gets the weekName value for this TeamMatchEntryType.
     * 
     * @return weekName
     */
    public java.lang.String getWeekName() {
        return weekName;
    }


    /**
     * Sets the weekName value for this TeamMatchEntryType.
     * 
     * @param weekName
     */
    public void setWeekName(java.lang.String weekName) {
        this.weekName = weekName;
    }


    /**
     * Gets the date value for this TeamMatchEntryType.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this TeamMatchEntryType.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the time value for this TeamMatchEntryType.
     * 
     * @return time
     */
    public org.apache.axis.types.Time getTime() {
        return time;
    }


    /**
     * Sets the time value for this TeamMatchEntryType.
     * 
     * @param time
     */
    public void setTime(org.apache.axis.types.Time time) {
        this.time = time;
    }


    /**
     * Gets the venue value for this TeamMatchEntryType.
     * 
     * @return venue
     */
    public java.math.BigInteger getVenue() {
        return venue;
    }


    /**
     * Sets the venue value for this TeamMatchEntryType.
     * 
     * @param venue
     */
    public void setVenue(java.math.BigInteger venue) {
        this.venue = venue;
    }


    /**
     * Gets the homeClub value for this TeamMatchEntryType.
     * 
     * @return homeClub
     */
    public java.lang.String getHomeClub() {
        return homeClub;
    }


    /**
     * Sets the homeClub value for this TeamMatchEntryType.
     * 
     * @param homeClub
     */
    public void setHomeClub(java.lang.String homeClub) {
        this.homeClub = homeClub;
    }


    /**
     * Gets the homeTeam value for this TeamMatchEntryType.
     * 
     * @return homeTeam
     */
    public java.lang.String getHomeTeam() {
        return homeTeam;
    }


    /**
     * Sets the homeTeam value for this TeamMatchEntryType.
     * 
     * @param homeTeam
     */
    public void setHomeTeam(java.lang.String homeTeam) {
        this.homeTeam = homeTeam;
    }


    /**
     * Gets the awayClub value for this TeamMatchEntryType.
     * 
     * @return awayClub
     */
    public java.lang.String getAwayClub() {
        return awayClub;
    }


    /**
     * Sets the awayClub value for this TeamMatchEntryType.
     * 
     * @param awayClub
     */
    public void setAwayClub(java.lang.String awayClub) {
        this.awayClub = awayClub;
    }


    /**
     * Gets the awayTeam value for this TeamMatchEntryType.
     * 
     * @return awayTeam
     */
    public java.lang.String getAwayTeam() {
        return awayTeam;
    }


    /**
     * Sets the awayTeam value for this TeamMatchEntryType.
     * 
     * @param awayTeam
     */
    public void setAwayTeam(java.lang.String awayTeam) {
        this.awayTeam = awayTeam;
    }


    /**
     * Gets the score value for this TeamMatchEntryType.
     * 
     * @return score
     */
    public java.lang.String getScore() {
        return score;
    }


    /**
     * Sets the score value for this TeamMatchEntryType.
     * 
     * @param score
     */
    public void setScore(java.lang.String score) {
        this.score = score;
    }


    /**
     * Gets the matchUniqueId value for this TeamMatchEntryType.
     * 
     * @return matchUniqueId
     */
    public java.math.BigInteger getMatchUniqueId() {
        return matchUniqueId;
    }


    /**
     * Sets the matchUniqueId value for this TeamMatchEntryType.
     * 
     * @param matchUniqueId
     */
    public void setMatchUniqueId(java.math.BigInteger matchUniqueId) {
        this.matchUniqueId = matchUniqueId;
    }


    /**
     * Gets the nextWeekName value for this TeamMatchEntryType.
     * 
     * @return nextWeekName
     */
    public java.lang.String getNextWeekName() {
        return nextWeekName;
    }


    /**
     * Sets the nextWeekName value for this TeamMatchEntryType.
     * 
     * @param nextWeekName
     */
    public void setNextWeekName(java.lang.String nextWeekName) {
        this.nextWeekName = nextWeekName;
    }


    /**
     * Gets the previousWeekName value for this TeamMatchEntryType.
     * 
     * @return previousWeekName
     */
    public java.lang.String getPreviousWeekName() {
        return previousWeekName;
    }


    /**
     * Sets the previousWeekName value for this TeamMatchEntryType.
     * 
     * @param previousWeekName
     */
    public void setPreviousWeekName(java.lang.String previousWeekName) {
        this.previousWeekName = previousWeekName;
    }


    /**
     * Gets the isHomeForfeited value for this TeamMatchEntryType.
     * 
     * @return isHomeForfeited
     */
    public java.lang.Boolean getIsHomeForfeited() {
        return isHomeForfeited;
    }


    /**
     * Sets the isHomeForfeited value for this TeamMatchEntryType.
     * 
     * @param isHomeForfeited
     */
    public void setIsHomeForfeited(java.lang.Boolean isHomeForfeited) {
        this.isHomeForfeited = isHomeForfeited;
    }


    /**
     * Gets the isAwayForfeited value for this TeamMatchEntryType.
     * 
     * @return isAwayForfeited
     */
    public java.lang.Boolean getIsAwayForfeited() {
        return isAwayForfeited;
    }


    /**
     * Sets the isAwayForfeited value for this TeamMatchEntryType.
     * 
     * @param isAwayForfeited
     */
    public void setIsAwayForfeited(java.lang.Boolean isAwayForfeited) {
        this.isAwayForfeited = isAwayForfeited;
    }


    /**
     * Gets the matchDetails value for this TeamMatchEntryType.
     * 
     * @return matchDetails
     */
    public vttl.api.TeamMatchDetailsEntryType getMatchDetails() {
        return matchDetails;
    }


    /**
     * Sets the matchDetails value for this TeamMatchEntryType.
     * 
     * @param matchDetails
     */
    public void setMatchDetails(vttl.api.TeamMatchDetailsEntryType matchDetails) {
        this.matchDetails = matchDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TeamMatchEntryType)) return false;
        TeamMatchEntryType other = (TeamMatchEntryType) obj;
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
            ((this.matchId==null && other.getMatchId()==null) || 
             (this.matchId!=null &&
              this.matchId.equals(other.getMatchId()))) &&
            ((this.weekName==null && other.getWeekName()==null) || 
             (this.weekName!=null &&
              this.weekName.equals(other.getWeekName()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.venue==null && other.getVenue()==null) || 
             (this.venue!=null &&
              this.venue.equals(other.getVenue()))) &&
            ((this.homeClub==null && other.getHomeClub()==null) || 
             (this.homeClub!=null &&
              this.homeClub.equals(other.getHomeClub()))) &&
            ((this.homeTeam==null && other.getHomeTeam()==null) || 
             (this.homeTeam!=null &&
              this.homeTeam.equals(other.getHomeTeam()))) &&
            ((this.awayClub==null && other.getAwayClub()==null) || 
             (this.awayClub!=null &&
              this.awayClub.equals(other.getAwayClub()))) &&
            ((this.awayTeam==null && other.getAwayTeam()==null) || 
             (this.awayTeam!=null &&
              this.awayTeam.equals(other.getAwayTeam()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.matchUniqueId==null && other.getMatchUniqueId()==null) || 
             (this.matchUniqueId!=null &&
              this.matchUniqueId.equals(other.getMatchUniqueId()))) &&
            ((this.nextWeekName==null && other.getNextWeekName()==null) || 
             (this.nextWeekName!=null &&
              this.nextWeekName.equals(other.getNextWeekName()))) &&
            ((this.previousWeekName==null && other.getPreviousWeekName()==null) || 
             (this.previousWeekName!=null &&
              this.previousWeekName.equals(other.getPreviousWeekName()))) &&
            ((this.isHomeForfeited==null && other.getIsHomeForfeited()==null) || 
             (this.isHomeForfeited!=null &&
              this.isHomeForfeited.equals(other.getIsHomeForfeited()))) &&
            ((this.isAwayForfeited==null && other.getIsAwayForfeited()==null) || 
             (this.isAwayForfeited!=null &&
              this.isAwayForfeited.equals(other.getIsAwayForfeited()))) &&
            ((this.matchDetails==null && other.getMatchDetails()==null) || 
             (this.matchDetails!=null &&
              this.matchDetails.equals(other.getMatchDetails())));
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
        if (getMatchId() != null) {
            _hashCode += getMatchId().hashCode();
        }
        if (getWeekName() != null) {
            _hashCode += getWeekName().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getVenue() != null) {
            _hashCode += getVenue().hashCode();
        }
        if (getHomeClub() != null) {
            _hashCode += getHomeClub().hashCode();
        }
        if (getHomeTeam() != null) {
            _hashCode += getHomeTeam().hashCode();
        }
        if (getAwayClub() != null) {
            _hashCode += getAwayClub().hashCode();
        }
        if (getAwayTeam() != null) {
            _hashCode += getAwayTeam().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getMatchUniqueId() != null) {
            _hashCode += getMatchUniqueId().hashCode();
        }
        if (getNextWeekName() != null) {
            _hashCode += getNextWeekName().hashCode();
        }
        if (getPreviousWeekName() != null) {
            _hashCode += getPreviousWeekName().hashCode();
        }
        if (getIsHomeForfeited() != null) {
            _hashCode += getIsHomeForfeited().hashCode();
        }
        if (getIsAwayForfeited() != null) {
            _hashCode += getIsAwayForfeited().hashCode();
        }
        if (getMatchDetails() != null) {
            _hashCode += getMatchDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TeamMatchEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "WeekName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Venue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeClub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomeClub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomeTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayClub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayClub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextWeekName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "NextWeekName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousWeekName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PreviousWeekName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHomeForfeited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IsHomeForfeited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAwayForfeited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IsAwayForfeited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDetailsEntryType"));
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
