/**
 * TeamMatchPlayerListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TeamMatchPlayerListType  implements java.io.Serializable {
    private java.math.BigInteger playerCount;

    private java.math.BigInteger doubleTeamCount;

    private vttl.api.TeamMatchPlayerEntryType[] players;

    private vttl.api.TeamMatchDoubleTeamEntryType[] doubleTeams;

    public TeamMatchPlayerListType() {
    }

    public TeamMatchPlayerListType(
           java.math.BigInteger playerCount,
           java.math.BigInteger doubleTeamCount,
           vttl.api.TeamMatchPlayerEntryType[] players,
           vttl.api.TeamMatchDoubleTeamEntryType[] doubleTeams) {
           this.playerCount = playerCount;
           this.doubleTeamCount = doubleTeamCount;
           this.players = players;
           this.doubleTeams = doubleTeams;
    }


    /**
     * Gets the playerCount value for this TeamMatchPlayerListType.
     * 
     * @return playerCount
     */
    public java.math.BigInteger getPlayerCount() {
        return playerCount;
    }


    /**
     * Sets the playerCount value for this TeamMatchPlayerListType.
     * 
     * @param playerCount
     */
    public void setPlayerCount(java.math.BigInteger playerCount) {
        this.playerCount = playerCount;
    }


    /**
     * Gets the doubleTeamCount value for this TeamMatchPlayerListType.
     * 
     * @return doubleTeamCount
     */
    public java.math.BigInteger getDoubleTeamCount() {
        return doubleTeamCount;
    }


    /**
     * Sets the doubleTeamCount value for this TeamMatchPlayerListType.
     * 
     * @param doubleTeamCount
     */
    public void setDoubleTeamCount(java.math.BigInteger doubleTeamCount) {
        this.doubleTeamCount = doubleTeamCount;
    }


    /**
     * Gets the players value for this TeamMatchPlayerListType.
     * 
     * @return players
     */
    public vttl.api.TeamMatchPlayerEntryType[] getPlayers() {
        return players;
    }


    /**
     * Sets the players value for this TeamMatchPlayerListType.
     * 
     * @param players
     */
    public void setPlayers(vttl.api.TeamMatchPlayerEntryType[] players) {
        this.players = players;
    }

    public vttl.api.TeamMatchPlayerEntryType getPlayers(int i) {
        return this.players[i];
    }

    public void setPlayers(int i, vttl.api.TeamMatchPlayerEntryType _value) {
        this.players[i] = _value;
    }


    /**
     * Gets the doubleTeams value for this TeamMatchPlayerListType.
     * 
     * @return doubleTeams
     */
    public vttl.api.TeamMatchDoubleTeamEntryType[] getDoubleTeams() {
        return doubleTeams;
    }


    /**
     * Sets the doubleTeams value for this TeamMatchPlayerListType.
     * 
     * @param doubleTeams
     */
    public void setDoubleTeams(vttl.api.TeamMatchDoubleTeamEntryType[] doubleTeams) {
        this.doubleTeams = doubleTeams;
    }

    public vttl.api.TeamMatchDoubleTeamEntryType getDoubleTeams(int i) {
        return this.doubleTeams[i];
    }

    public void setDoubleTeams(int i, vttl.api.TeamMatchDoubleTeamEntryType _value) {
        this.doubleTeams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TeamMatchPlayerListType)) return false;
        TeamMatchPlayerListType other = (TeamMatchPlayerListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.playerCount==null && other.getPlayerCount()==null) || 
             (this.playerCount!=null &&
              this.playerCount.equals(other.getPlayerCount()))) &&
            ((this.doubleTeamCount==null && other.getDoubleTeamCount()==null) || 
             (this.doubleTeamCount!=null &&
              this.doubleTeamCount.equals(other.getDoubleTeamCount()))) &&
            ((this.players==null && other.getPlayers()==null) || 
             (this.players!=null &&
              java.util.Arrays.equals(this.players, other.getPlayers()))) &&
            ((this.doubleTeams==null && other.getDoubleTeams()==null) || 
             (this.doubleTeams!=null &&
              java.util.Arrays.equals(this.doubleTeams, other.getDoubleTeams())));
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
        if (getPlayerCount() != null) {
            _hashCode += getPlayerCount().hashCode();
        }
        if (getDoubleTeamCount() != null) {
            _hashCode += getDoubleTeamCount().hashCode();
        }
        if (getPlayers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlayers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlayers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDoubleTeams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDoubleTeams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDoubleTeams(), i);
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
        new org.apache.axis.description.TypeDesc(TeamMatchPlayerListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchPlayerListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playerCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PlayerCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleTeamCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DoubleTeamCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("players");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Players"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchPlayerEntryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DoubleTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDoubleTeamEntryType"));
        elemField.setMinOccurs(0);
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
