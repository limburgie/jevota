/**
 * TeamMatchDoubleTeamEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TeamMatchDoubleTeamEntryType  implements java.io.Serializable {
    private java.math.BigInteger position;

    private java.lang.String team;

    private java.lang.Boolean isForfeited;

    public TeamMatchDoubleTeamEntryType() {
    }

    public TeamMatchDoubleTeamEntryType(
           java.math.BigInteger position,
           java.lang.String team,
           java.lang.Boolean isForfeited) {
           this.position = position;
           this.team = team;
           this.isForfeited = isForfeited;
    }


    /**
     * Gets the position value for this TeamMatchDoubleTeamEntryType.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TeamMatchDoubleTeamEntryType.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the team value for this TeamMatchDoubleTeamEntryType.
     * 
     * @return team
     */
    public java.lang.String getTeam() {
        return team;
    }


    /**
     * Sets the team value for this TeamMatchDoubleTeamEntryType.
     * 
     * @param team
     */
    public void setTeam(java.lang.String team) {
        this.team = team;
    }


    /**
     * Gets the isForfeited value for this TeamMatchDoubleTeamEntryType.
     * 
     * @return isForfeited
     */
    public java.lang.Boolean getIsForfeited() {
        return isForfeited;
    }


    /**
     * Sets the isForfeited value for this TeamMatchDoubleTeamEntryType.
     * 
     * @param isForfeited
     */
    public void setIsForfeited(java.lang.Boolean isForfeited) {
        this.isForfeited = isForfeited;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TeamMatchDoubleTeamEntryType)) return false;
        TeamMatchDoubleTeamEntryType other = (TeamMatchDoubleTeamEntryType) obj;
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
            ((this.isForfeited==null && other.getIsForfeited()==null) || 
             (this.isForfeited!=null &&
              this.isForfeited.equals(other.getIsForfeited())));
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
        if (getIsForfeited() != null) {
            _hashCode += getIsForfeited().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TeamMatchDoubleTeamEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDoubleTeamEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Team"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isForfeited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IsForfeited"));
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
