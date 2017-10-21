/**
 * TeamMatchPlayerEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TeamMatchPlayerEntryType  implements java.io.Serializable {
    private java.math.BigInteger position;

    private java.math.BigInteger uniqueIndex;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String ranking;

    private java.math.BigInteger victoryCount;

    private java.lang.Boolean isForfeited;

    public TeamMatchPlayerEntryType() {
    }

    public TeamMatchPlayerEntryType(
           java.math.BigInteger position,
           java.math.BigInteger uniqueIndex,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String ranking,
           java.math.BigInteger victoryCount,
           java.lang.Boolean isForfeited) {
           this.position = position;
           this.uniqueIndex = uniqueIndex;
           this.firstName = firstName;
           this.lastName = lastName;
           this.ranking = ranking;
           this.victoryCount = victoryCount;
           this.isForfeited = isForfeited;
    }


    /**
     * Gets the position value for this TeamMatchPlayerEntryType.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TeamMatchPlayerEntryType.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the uniqueIndex value for this TeamMatchPlayerEntryType.
     * 
     * @return uniqueIndex
     */
    public java.math.BigInteger getUniqueIndex() {
        return uniqueIndex;
    }


    /**
     * Sets the uniqueIndex value for this TeamMatchPlayerEntryType.
     * 
     * @param uniqueIndex
     */
    public void setUniqueIndex(java.math.BigInteger uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }


    /**
     * Gets the firstName value for this TeamMatchPlayerEntryType.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this TeamMatchPlayerEntryType.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this TeamMatchPlayerEntryType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TeamMatchPlayerEntryType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the ranking value for this TeamMatchPlayerEntryType.
     * 
     * @return ranking
     */
    public java.lang.String getRanking() {
        return ranking;
    }


    /**
     * Sets the ranking value for this TeamMatchPlayerEntryType.
     * 
     * @param ranking
     */
    public void setRanking(java.lang.String ranking) {
        this.ranking = ranking;
    }


    /**
     * Gets the victoryCount value for this TeamMatchPlayerEntryType.
     * 
     * @return victoryCount
     */
    public java.math.BigInteger getVictoryCount() {
        return victoryCount;
    }


    /**
     * Sets the victoryCount value for this TeamMatchPlayerEntryType.
     * 
     * @param victoryCount
     */
    public void setVictoryCount(java.math.BigInteger victoryCount) {
        this.victoryCount = victoryCount;
    }


    /**
     * Gets the isForfeited value for this TeamMatchPlayerEntryType.
     * 
     * @return isForfeited
     */
    public java.lang.Boolean getIsForfeited() {
        return isForfeited;
    }


    /**
     * Sets the isForfeited value for this TeamMatchPlayerEntryType.
     * 
     * @param isForfeited
     */
    public void setIsForfeited(java.lang.Boolean isForfeited) {
        this.isForfeited = isForfeited;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TeamMatchPlayerEntryType)) return false;
        TeamMatchPlayerEntryType other = (TeamMatchPlayerEntryType) obj;
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
            ((this.uniqueIndex==null && other.getUniqueIndex()==null) || 
             (this.uniqueIndex!=null &&
              this.uniqueIndex.equals(other.getUniqueIndex()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.ranking==null && other.getRanking()==null) || 
             (this.ranking!=null &&
              this.ranking.equals(other.getRanking()))) &&
            ((this.victoryCount==null && other.getVictoryCount()==null) || 
             (this.victoryCount!=null &&
              this.victoryCount.equals(other.getVictoryCount()))) &&
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
        if (getUniqueIndex() != null) {
            _hashCode += getUniqueIndex().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getRanking() != null) {
            _hashCode += getRanking().hashCode();
        }
        if (getVictoryCount() != null) {
            _hashCode += getVictoryCount().hashCode();
        }
        if (getIsForfeited() != null) {
            _hashCode += getIsForfeited().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TeamMatchPlayerEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchPlayerEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "UniqueIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ranking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Ranking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("victoryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "VictoryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
