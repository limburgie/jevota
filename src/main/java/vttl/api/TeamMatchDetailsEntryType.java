/**
 * TeamMatchDetailsEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TeamMatchDetailsEntryType  implements java.io.Serializable {
    private boolean detailsCreated;

    private org.apache.axis.types.Time startTime;

    private org.apache.axis.types.Time endTime;

    private java.math.BigInteger homeCaptain;

    private java.math.BigInteger awayCaptain;

    private java.math.BigInteger referee;

    private java.math.BigInteger hallCommissioner;

    private vttl.api.TeamMatchPlayerListType homePlayers;

    private vttl.api.TeamMatchPlayerListType awayPlayers;

    private vttl.api.IndividualMatchResultEntryType[] individualMatchResults;

    private java.math.BigInteger matchSystem;

    private java.math.BigInteger homeScore;

    private java.math.BigInteger awayScore;

    public TeamMatchDetailsEntryType() {
    }

    public TeamMatchDetailsEntryType(
           boolean detailsCreated,
           org.apache.axis.types.Time startTime,
           org.apache.axis.types.Time endTime,
           java.math.BigInteger homeCaptain,
           java.math.BigInteger awayCaptain,
           java.math.BigInteger referee,
           java.math.BigInteger hallCommissioner,
           vttl.api.TeamMatchPlayerListType homePlayers,
           vttl.api.TeamMatchPlayerListType awayPlayers,
           vttl.api.IndividualMatchResultEntryType[] individualMatchResults,
           java.math.BigInteger matchSystem,
           java.math.BigInteger homeScore,
           java.math.BigInteger awayScore) {
           this.detailsCreated = detailsCreated;
           this.startTime = startTime;
           this.endTime = endTime;
           this.homeCaptain = homeCaptain;
           this.awayCaptain = awayCaptain;
           this.referee = referee;
           this.hallCommissioner = hallCommissioner;
           this.homePlayers = homePlayers;
           this.awayPlayers = awayPlayers;
           this.individualMatchResults = individualMatchResults;
           this.matchSystem = matchSystem;
           this.homeScore = homeScore;
           this.awayScore = awayScore;
    }


    /**
     * Gets the detailsCreated value for this TeamMatchDetailsEntryType.
     * 
     * @return detailsCreated
     */
    public boolean isDetailsCreated() {
        return detailsCreated;
    }


    /**
     * Sets the detailsCreated value for this TeamMatchDetailsEntryType.
     * 
     * @param detailsCreated
     */
    public void setDetailsCreated(boolean detailsCreated) {
        this.detailsCreated = detailsCreated;
    }


    /**
     * Gets the startTime value for this TeamMatchDetailsEntryType.
     * 
     * @return startTime
     */
    public org.apache.axis.types.Time getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TeamMatchDetailsEntryType.
     * 
     * @param startTime
     */
    public void setStartTime(org.apache.axis.types.Time startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this TeamMatchDetailsEntryType.
     * 
     * @return endTime
     */
    public org.apache.axis.types.Time getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TeamMatchDetailsEntryType.
     * 
     * @param endTime
     */
    public void setEndTime(org.apache.axis.types.Time endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the homeCaptain value for this TeamMatchDetailsEntryType.
     * 
     * @return homeCaptain
     */
    public java.math.BigInteger getHomeCaptain() {
        return homeCaptain;
    }


    /**
     * Sets the homeCaptain value for this TeamMatchDetailsEntryType.
     * 
     * @param homeCaptain
     */
    public void setHomeCaptain(java.math.BigInteger homeCaptain) {
        this.homeCaptain = homeCaptain;
    }


    /**
     * Gets the awayCaptain value for this TeamMatchDetailsEntryType.
     * 
     * @return awayCaptain
     */
    public java.math.BigInteger getAwayCaptain() {
        return awayCaptain;
    }


    /**
     * Sets the awayCaptain value for this TeamMatchDetailsEntryType.
     * 
     * @param awayCaptain
     */
    public void setAwayCaptain(java.math.BigInteger awayCaptain) {
        this.awayCaptain = awayCaptain;
    }


    /**
     * Gets the referee value for this TeamMatchDetailsEntryType.
     * 
     * @return referee
     */
    public java.math.BigInteger getReferee() {
        return referee;
    }


    /**
     * Sets the referee value for this TeamMatchDetailsEntryType.
     * 
     * @param referee
     */
    public void setReferee(java.math.BigInteger referee) {
        this.referee = referee;
    }


    /**
     * Gets the hallCommissioner value for this TeamMatchDetailsEntryType.
     * 
     * @return hallCommissioner
     */
    public java.math.BigInteger getHallCommissioner() {
        return hallCommissioner;
    }


    /**
     * Sets the hallCommissioner value for this TeamMatchDetailsEntryType.
     * 
     * @param hallCommissioner
     */
    public void setHallCommissioner(java.math.BigInteger hallCommissioner) {
        this.hallCommissioner = hallCommissioner;
    }


    /**
     * Gets the homePlayers value for this TeamMatchDetailsEntryType.
     * 
     * @return homePlayers
     */
    public vttl.api.TeamMatchPlayerListType getHomePlayers() {
        return homePlayers;
    }


    /**
     * Sets the homePlayers value for this TeamMatchDetailsEntryType.
     * 
     * @param homePlayers
     */
    public void setHomePlayers(vttl.api.TeamMatchPlayerListType homePlayers) {
        this.homePlayers = homePlayers;
    }


    /**
     * Gets the awayPlayers value for this TeamMatchDetailsEntryType.
     * 
     * @return awayPlayers
     */
    public vttl.api.TeamMatchPlayerListType getAwayPlayers() {
        return awayPlayers;
    }


    /**
     * Sets the awayPlayers value for this TeamMatchDetailsEntryType.
     * 
     * @param awayPlayers
     */
    public void setAwayPlayers(vttl.api.TeamMatchPlayerListType awayPlayers) {
        this.awayPlayers = awayPlayers;
    }


    /**
     * Gets the individualMatchResults value for this TeamMatchDetailsEntryType.
     * 
     * @return individualMatchResults
     */
    public vttl.api.IndividualMatchResultEntryType[] getIndividualMatchResults() {
        return individualMatchResults;
    }


    /**
     * Sets the individualMatchResults value for this TeamMatchDetailsEntryType.
     * 
     * @param individualMatchResults
     */
    public void setIndividualMatchResults(vttl.api.IndividualMatchResultEntryType[] individualMatchResults) {
        this.individualMatchResults = individualMatchResults;
    }

    public vttl.api.IndividualMatchResultEntryType getIndividualMatchResults(int i) {
        return this.individualMatchResults[i];
    }

    public void setIndividualMatchResults(int i, vttl.api.IndividualMatchResultEntryType _value) {
        this.individualMatchResults[i] = _value;
    }


    /**
     * Gets the matchSystem value for this TeamMatchDetailsEntryType.
     * 
     * @return matchSystem
     */
    public java.math.BigInteger getMatchSystem() {
        return matchSystem;
    }


    /**
     * Sets the matchSystem value for this TeamMatchDetailsEntryType.
     * 
     * @param matchSystem
     */
    public void setMatchSystem(java.math.BigInteger matchSystem) {
        this.matchSystem = matchSystem;
    }


    /**
     * Gets the homeScore value for this TeamMatchDetailsEntryType.
     * 
     * @return homeScore
     */
    public java.math.BigInteger getHomeScore() {
        return homeScore;
    }


    /**
     * Sets the homeScore value for this TeamMatchDetailsEntryType.
     * 
     * @param homeScore
     */
    public void setHomeScore(java.math.BigInteger homeScore) {
        this.homeScore = homeScore;
    }


    /**
     * Gets the awayScore value for this TeamMatchDetailsEntryType.
     * 
     * @return awayScore
     */
    public java.math.BigInteger getAwayScore() {
        return awayScore;
    }


    /**
     * Sets the awayScore value for this TeamMatchDetailsEntryType.
     * 
     * @param awayScore
     */
    public void setAwayScore(java.math.BigInteger awayScore) {
        this.awayScore = awayScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TeamMatchDetailsEntryType)) return false;
        TeamMatchDetailsEntryType other = (TeamMatchDetailsEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.detailsCreated == other.isDetailsCreated() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.homeCaptain==null && other.getHomeCaptain()==null) || 
             (this.homeCaptain!=null &&
              this.homeCaptain.equals(other.getHomeCaptain()))) &&
            ((this.awayCaptain==null && other.getAwayCaptain()==null) || 
             (this.awayCaptain!=null &&
              this.awayCaptain.equals(other.getAwayCaptain()))) &&
            ((this.referee==null && other.getReferee()==null) || 
             (this.referee!=null &&
              this.referee.equals(other.getReferee()))) &&
            ((this.hallCommissioner==null && other.getHallCommissioner()==null) || 
             (this.hallCommissioner!=null &&
              this.hallCommissioner.equals(other.getHallCommissioner()))) &&
            ((this.homePlayers==null && other.getHomePlayers()==null) || 
             (this.homePlayers!=null &&
              this.homePlayers.equals(other.getHomePlayers()))) &&
            ((this.awayPlayers==null && other.getAwayPlayers()==null) || 
             (this.awayPlayers!=null &&
              this.awayPlayers.equals(other.getAwayPlayers()))) &&
            ((this.individualMatchResults==null && other.getIndividualMatchResults()==null) || 
             (this.individualMatchResults!=null &&
              java.util.Arrays.equals(this.individualMatchResults, other.getIndividualMatchResults()))) &&
            ((this.matchSystem==null && other.getMatchSystem()==null) || 
             (this.matchSystem!=null &&
              this.matchSystem.equals(other.getMatchSystem()))) &&
            ((this.homeScore==null && other.getHomeScore()==null) || 
             (this.homeScore!=null &&
              this.homeScore.equals(other.getHomeScore()))) &&
            ((this.awayScore==null && other.getAwayScore()==null) || 
             (this.awayScore!=null &&
              this.awayScore.equals(other.getAwayScore())));
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
        _hashCode += (isDetailsCreated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getHomeCaptain() != null) {
            _hashCode += getHomeCaptain().hashCode();
        }
        if (getAwayCaptain() != null) {
            _hashCode += getAwayCaptain().hashCode();
        }
        if (getReferee() != null) {
            _hashCode += getReferee().hashCode();
        }
        if (getHallCommissioner() != null) {
            _hashCode += getHallCommissioner().hashCode();
        }
        if (getHomePlayers() != null) {
            _hashCode += getHomePlayers().hashCode();
        }
        if (getAwayPlayers() != null) {
            _hashCode += getAwayPlayers().hashCode();
        }
        if (getIndividualMatchResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndividualMatchResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndividualMatchResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatchSystem() != null) {
            _hashCode += getMatchSystem().hashCode();
        }
        if (getHomeScore() != null) {
            _hashCode += getHomeScore().hashCode();
        }
        if (getAwayScore() != null) {
            _hashCode += getAwayScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TeamMatchDetailsEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDetailsEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailsCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DetailsCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeCaptain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomeCaptain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayCaptain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayCaptain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Referee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hallCommissioner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HallCommissioner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePlayers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomePlayers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchPlayerListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayPlayers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayPlayers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchPlayerListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualMatchResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualMatchResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualMatchResultEntryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomeScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayScore"));
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
