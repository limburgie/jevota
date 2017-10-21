/**
 * TeamMatchDefinitionEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TeamMatchDefinitionEntryType  implements java.io.Serializable {
    private java.math.BigInteger position;

    private java.math.BigInteger type;

    private java.math.BigInteger homePlayerIndex;

    private java.math.BigInteger awayPlayerIndex;

    private java.lang.Boolean allowSubstitute;

    public TeamMatchDefinitionEntryType() {
    }

    public TeamMatchDefinitionEntryType(
           java.math.BigInteger position,
           java.math.BigInteger type,
           java.math.BigInteger homePlayerIndex,
           java.math.BigInteger awayPlayerIndex,
           java.lang.Boolean allowSubstitute) {
           this.position = position;
           this.type = type;
           this.homePlayerIndex = homePlayerIndex;
           this.awayPlayerIndex = awayPlayerIndex;
           this.allowSubstitute = allowSubstitute;
    }


    /**
     * Gets the position value for this TeamMatchDefinitionEntryType.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TeamMatchDefinitionEntryType.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the type value for this TeamMatchDefinitionEntryType.
     * 
     * @return type
     */
    public java.math.BigInteger getType() {
        return type;
    }


    /**
     * Sets the type value for this TeamMatchDefinitionEntryType.
     * 
     * @param type
     */
    public void setType(java.math.BigInteger type) {
        this.type = type;
    }


    /**
     * Gets the homePlayerIndex value for this TeamMatchDefinitionEntryType.
     * 
     * @return homePlayerIndex
     */
    public java.math.BigInteger getHomePlayerIndex() {
        return homePlayerIndex;
    }


    /**
     * Sets the homePlayerIndex value for this TeamMatchDefinitionEntryType.
     * 
     * @param homePlayerIndex
     */
    public void setHomePlayerIndex(java.math.BigInteger homePlayerIndex) {
        this.homePlayerIndex = homePlayerIndex;
    }


    /**
     * Gets the awayPlayerIndex value for this TeamMatchDefinitionEntryType.
     * 
     * @return awayPlayerIndex
     */
    public java.math.BigInteger getAwayPlayerIndex() {
        return awayPlayerIndex;
    }


    /**
     * Sets the awayPlayerIndex value for this TeamMatchDefinitionEntryType.
     * 
     * @param awayPlayerIndex
     */
    public void setAwayPlayerIndex(java.math.BigInteger awayPlayerIndex) {
        this.awayPlayerIndex = awayPlayerIndex;
    }


    /**
     * Gets the allowSubstitute value for this TeamMatchDefinitionEntryType.
     * 
     * @return allowSubstitute
     */
    public java.lang.Boolean getAllowSubstitute() {
        return allowSubstitute;
    }


    /**
     * Sets the allowSubstitute value for this TeamMatchDefinitionEntryType.
     * 
     * @param allowSubstitute
     */
    public void setAllowSubstitute(java.lang.Boolean allowSubstitute) {
        this.allowSubstitute = allowSubstitute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TeamMatchDefinitionEntryType)) return false;
        TeamMatchDefinitionEntryType other = (TeamMatchDefinitionEntryType) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.homePlayerIndex==null && other.getHomePlayerIndex()==null) || 
             (this.homePlayerIndex!=null &&
              this.homePlayerIndex.equals(other.getHomePlayerIndex()))) &&
            ((this.awayPlayerIndex==null && other.getAwayPlayerIndex()==null) || 
             (this.awayPlayerIndex!=null &&
              this.awayPlayerIndex.equals(other.getAwayPlayerIndex()))) &&
            ((this.allowSubstitute==null && other.getAllowSubstitute()==null) || 
             (this.allowSubstitute!=null &&
              this.allowSubstitute.equals(other.getAllowSubstitute())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getHomePlayerIndex() != null) {
            _hashCode += getHomePlayerIndex().hashCode();
        }
        if (getAwayPlayerIndex() != null) {
            _hashCode += getAwayPlayerIndex().hashCode();
        }
        if (getAllowSubstitute() != null) {
            _hashCode += getAllowSubstitute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TeamMatchDefinitionEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDefinitionEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePlayerIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomePlayerIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayPlayerIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayPlayerIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowSubstitute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AllowSubstitute"));
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
