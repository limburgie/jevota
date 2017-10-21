/**
 * RankingEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class RankingEntryType  implements java.io.Serializable {
    private java.math.BigInteger position;

    private java.lang.String team;

    private java.math.BigInteger gamesPlayed;

    private java.math.BigInteger gamesWon;

    private java.math.BigInteger gamesLost;

    private java.math.BigInteger gamesDraw;

    private java.math.BigInteger individualMatchesWon;

    private java.math.BigInteger individualMatchesLost;

    private java.math.BigInteger individualSetsWon;

    private java.math.BigInteger individualSetsLost;

    private java.math.BigInteger points;

    private java.lang.String teamClub;

    public RankingEntryType() {
    }

    public RankingEntryType(
           java.math.BigInteger position,
           java.lang.String team,
           java.math.BigInteger gamesPlayed,
           java.math.BigInteger gamesWon,
           java.math.BigInteger gamesLost,
           java.math.BigInteger gamesDraw,
           java.math.BigInteger individualMatchesWon,
           java.math.BigInteger individualMatchesLost,
           java.math.BigInteger individualSetsWon,
           java.math.BigInteger individualSetsLost,
           java.math.BigInteger points,
           java.lang.String teamClub) {
           this.position = position;
           this.team = team;
           this.gamesPlayed = gamesPlayed;
           this.gamesWon = gamesWon;
           this.gamesLost = gamesLost;
           this.gamesDraw = gamesDraw;
           this.individualMatchesWon = individualMatchesWon;
           this.individualMatchesLost = individualMatchesLost;
           this.individualSetsWon = individualSetsWon;
           this.individualSetsLost = individualSetsLost;
           this.points = points;
           this.teamClub = teamClub;
    }


    /**
     * Gets the position value for this RankingEntryType.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this RankingEntryType.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the team value for this RankingEntryType.
     * 
     * @return team
     */
    public java.lang.String getTeam() {
        return team;
    }


    /**
     * Sets the team value for this RankingEntryType.
     * 
     * @param team
     */
    public void setTeam(java.lang.String team) {
        this.team = team;
    }


    /**
     * Gets the gamesPlayed value for this RankingEntryType.
     * 
     * @return gamesPlayed
     */
    public java.math.BigInteger getGamesPlayed() {
        return gamesPlayed;
    }


    /**
     * Sets the gamesPlayed value for this RankingEntryType.
     * 
     * @param gamesPlayed
     */
    public void setGamesPlayed(java.math.BigInteger gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }


    /**
     * Gets the gamesWon value for this RankingEntryType.
     * 
     * @return gamesWon
     */
    public java.math.BigInteger getGamesWon() {
        return gamesWon;
    }


    /**
     * Sets the gamesWon value for this RankingEntryType.
     * 
     * @param gamesWon
     */
    public void setGamesWon(java.math.BigInteger gamesWon) {
        this.gamesWon = gamesWon;
    }


    /**
     * Gets the gamesLost value for this RankingEntryType.
     * 
     * @return gamesLost
     */
    public java.math.BigInteger getGamesLost() {
        return gamesLost;
    }


    /**
     * Sets the gamesLost value for this RankingEntryType.
     * 
     * @param gamesLost
     */
    public void setGamesLost(java.math.BigInteger gamesLost) {
        this.gamesLost = gamesLost;
    }


    /**
     * Gets the gamesDraw value for this RankingEntryType.
     * 
     * @return gamesDraw
     */
    public java.math.BigInteger getGamesDraw() {
        return gamesDraw;
    }


    /**
     * Sets the gamesDraw value for this RankingEntryType.
     * 
     * @param gamesDraw
     */
    public void setGamesDraw(java.math.BigInteger gamesDraw) {
        this.gamesDraw = gamesDraw;
    }


    /**
     * Gets the individualMatchesWon value for this RankingEntryType.
     * 
     * @return individualMatchesWon
     */
    public java.math.BigInteger getIndividualMatchesWon() {
        return individualMatchesWon;
    }


    /**
     * Sets the individualMatchesWon value for this RankingEntryType.
     * 
     * @param individualMatchesWon
     */
    public void setIndividualMatchesWon(java.math.BigInteger individualMatchesWon) {
        this.individualMatchesWon = individualMatchesWon;
    }


    /**
     * Gets the individualMatchesLost value for this RankingEntryType.
     * 
     * @return individualMatchesLost
     */
    public java.math.BigInteger getIndividualMatchesLost() {
        return individualMatchesLost;
    }


    /**
     * Sets the individualMatchesLost value for this RankingEntryType.
     * 
     * @param individualMatchesLost
     */
    public void setIndividualMatchesLost(java.math.BigInteger individualMatchesLost) {
        this.individualMatchesLost = individualMatchesLost;
    }


    /**
     * Gets the individualSetsWon value for this RankingEntryType.
     * 
     * @return individualSetsWon
     */
    public java.math.BigInteger getIndividualSetsWon() {
        return individualSetsWon;
    }


    /**
     * Sets the individualSetsWon value for this RankingEntryType.
     * 
     * @param individualSetsWon
     */
    public void setIndividualSetsWon(java.math.BigInteger individualSetsWon) {
        this.individualSetsWon = individualSetsWon;
    }


    /**
     * Gets the individualSetsLost value for this RankingEntryType.
     * 
     * @return individualSetsLost
     */
    public java.math.BigInteger getIndividualSetsLost() {
        return individualSetsLost;
    }


    /**
     * Sets the individualSetsLost value for this RankingEntryType.
     * 
     * @param individualSetsLost
     */
    public void setIndividualSetsLost(java.math.BigInteger individualSetsLost) {
        this.individualSetsLost = individualSetsLost;
    }


    /**
     * Gets the points value for this RankingEntryType.
     * 
     * @return points
     */
    public java.math.BigInteger getPoints() {
        return points;
    }


    /**
     * Sets the points value for this RankingEntryType.
     * 
     * @param points
     */
    public void setPoints(java.math.BigInteger points) {
        this.points = points;
    }


    /**
     * Gets the teamClub value for this RankingEntryType.
     * 
     * @return teamClub
     */
    public java.lang.String getTeamClub() {
        return teamClub;
    }


    /**
     * Sets the teamClub value for this RankingEntryType.
     * 
     * @param teamClub
     */
    public void setTeamClub(java.lang.String teamClub) {
        this.teamClub = teamClub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RankingEntryType)) return false;
        RankingEntryType other = (RankingEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.team==null && other.getTeam()==null) || 
             (this.team!=null &&
              this.team.equals(other.getTeam()))) &&
            ((this.gamesPlayed==null && other.getGamesPlayed()==null) || 
             (this.gamesPlayed!=null &&
              this.gamesPlayed.equals(other.getGamesPlayed()))) &&
            ((this.gamesWon==null && other.getGamesWon()==null) || 
             (this.gamesWon!=null &&
              this.gamesWon.equals(other.getGamesWon()))) &&
            ((this.gamesLost==null && other.getGamesLost()==null) || 
             (this.gamesLost!=null &&
              this.gamesLost.equals(other.getGamesLost()))) &&
            ((this.gamesDraw==null && other.getGamesDraw()==null) || 
             (this.gamesDraw!=null &&
              this.gamesDraw.equals(other.getGamesDraw()))) &&
            ((this.individualMatchesWon==null && other.getIndividualMatchesWon()==null) || 
             (this.individualMatchesWon!=null &&
              this.individualMatchesWon.equals(other.getIndividualMatchesWon()))) &&
            ((this.individualMatchesLost==null && other.getIndividualMatchesLost()==null) || 
             (this.individualMatchesLost!=null &&
              this.individualMatchesLost.equals(other.getIndividualMatchesLost()))) &&
            ((this.individualSetsWon==null && other.getIndividualSetsWon()==null) || 
             (this.individualSetsWon!=null &&
              this.individualSetsWon.equals(other.getIndividualSetsWon()))) &&
            ((this.individualSetsLost==null && other.getIndividualSetsLost()==null) || 
             (this.individualSetsLost!=null &&
              this.individualSetsLost.equals(other.getIndividualSetsLost()))) &&
            ((this.points==null && other.getPoints()==null) || 
             (this.points!=null &&
              this.points.equals(other.getPoints()))) &&
            ((this.teamClub==null && other.getTeamClub()==null) || 
             (this.teamClub!=null &&
              this.teamClub.equals(other.getTeamClub())));
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
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getTeam() != null) {
            _hashCode += getTeam().hashCode();
        }
        if (getGamesPlayed() != null) {
            _hashCode += getGamesPlayed().hashCode();
        }
        if (getGamesWon() != null) {
            _hashCode += getGamesWon().hashCode();
        }
        if (getGamesLost() != null) {
            _hashCode += getGamesLost().hashCode();
        }
        if (getGamesDraw() != null) {
            _hashCode += getGamesDraw().hashCode();
        }
        if (getIndividualMatchesWon() != null) {
            _hashCode += getIndividualMatchesWon().hashCode();
        }
        if (getIndividualMatchesLost() != null) {
            _hashCode += getIndividualMatchesLost().hashCode();
        }
        if (getIndividualSetsWon() != null) {
            _hashCode += getIndividualSetsWon().hashCode();
        }
        if (getIndividualSetsLost() != null) {
            _hashCode += getIndividualSetsLost().hashCode();
        }
        if (getPoints() != null) {
            _hashCode += getPoints().hashCode();
        }
        if (getTeamClub() != null) {
            _hashCode += getTeamClub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RankingEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Team"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamesPlayed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GamesPlayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamesWon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GamesWon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamesLost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GamesLost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamesDraw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GamesDraw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualMatchesWon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualMatchesWon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualMatchesLost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualMatchesLost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualSetsWon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualSetsWon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualSetsLost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualSetsLost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("points");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamClub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamClub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
