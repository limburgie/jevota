/**
 * DivisionEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class DivisionEntryType  implements java.io.Serializable {
    private java.math.BigInteger divisionId;

    private java.lang.String divisionName;

    private java.math.BigInteger divisionCategory;

    private java.math.BigInteger level;

    private java.math.BigInteger matchType;

    public DivisionEntryType() {
    }

    public DivisionEntryType(
           java.math.BigInteger divisionId,
           java.lang.String divisionName,
           java.math.BigInteger divisionCategory,
           java.math.BigInteger level,
           java.math.BigInteger matchType) {
           this.divisionId = divisionId;
           this.divisionName = divisionName;
           this.divisionCategory = divisionCategory;
           this.level = level;
           this.matchType = matchType;
    }


    /**
     * Gets the divisionId value for this DivisionEntryType.
     * 
     * @return divisionId
     */
    public java.math.BigInteger getDivisionId() {
        return divisionId;
    }


    /**
     * Sets the divisionId value for this DivisionEntryType.
     * 
     * @param divisionId
     */
    public void setDivisionId(java.math.BigInteger divisionId) {
        this.divisionId = divisionId;
    }


    /**
     * Gets the divisionName value for this DivisionEntryType.
     * 
     * @return divisionName
     */
    public java.lang.String getDivisionName() {
        return divisionName;
    }


    /**
     * Sets the divisionName value for this DivisionEntryType.
     * 
     * @param divisionName
     */
    public void setDivisionName(java.lang.String divisionName) {
        this.divisionName = divisionName;
    }


    /**
     * Gets the divisionCategory value for this DivisionEntryType.
     * 
     * @return divisionCategory
     */
    public java.math.BigInteger getDivisionCategory() {
        return divisionCategory;
    }


    /**
     * Sets the divisionCategory value for this DivisionEntryType.
     * 
     * @param divisionCategory
     */
    public void setDivisionCategory(java.math.BigInteger divisionCategory) {
        this.divisionCategory = divisionCategory;
    }


    /**
     * Gets the level value for this DivisionEntryType.
     * 
     * @return level
     */
    public java.math.BigInteger getLevel() {
        return level;
    }


    /**
     * Sets the level value for this DivisionEntryType.
     * 
     * @param level
     */
    public void setLevel(java.math.BigInteger level) {
        this.level = level;
    }


    /**
     * Gets the matchType value for this DivisionEntryType.
     * 
     * @return matchType
     */
    public java.math.BigInteger getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this DivisionEntryType.
     * 
     * @param matchType
     */
    public void setMatchType(java.math.BigInteger matchType) {
        this.matchType = matchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DivisionEntryType)) return false;
        DivisionEntryType other = (DivisionEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.divisionId==null && other.getDivisionId()==null) || 
             (this.divisionId!=null &&
              this.divisionId.equals(other.getDivisionId()))) &&
            ((this.divisionName==null && other.getDivisionName()==null) || 
             (this.divisionName!=null &&
              this.divisionName.equals(other.getDivisionName()))) &&
            ((this.divisionCategory==null && other.getDivisionCategory()==null) || 
             (this.divisionCategory!=null &&
              this.divisionCategory.equals(other.getDivisionCategory()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
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
        if (getDivisionId() != null) {
            _hashCode += getDivisionId().hashCode();
        }
        if (getDivisionName() != null) {
            _hashCode += getDivisionName().hashCode();
        }
        if (getDivisionCategory() != null) {
            _hashCode += getDivisionCategory().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DivisionEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Level"));
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
