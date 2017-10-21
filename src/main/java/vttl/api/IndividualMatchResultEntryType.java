/**
 * IndividualMatchResultEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class IndividualMatchResultEntryType  implements java.io.Serializable {
    private java.math.BigInteger position;

    private java.math.BigInteger[] homePlayerMatchIndex;

    private java.math.BigInteger[] homePlayerUniqueIndex;

    private java.math.BigInteger[] awayPlayerMatchIndex;

    private java.math.BigInteger[] awayPlayerUniqueIndex;

    private java.math.BigInteger homeSetCount;

    private java.math.BigInteger awaySetCount;

    private java.lang.Boolean isHomeForfeited;

    private java.lang.Boolean isAwayForfeited;

    private java.lang.String scores;

    public IndividualMatchResultEntryType() {
    }

    public IndividualMatchResultEntryType(
           java.math.BigInteger position,
           java.math.BigInteger[] homePlayerMatchIndex,
           java.math.BigInteger[] homePlayerUniqueIndex,
           java.math.BigInteger[] awayPlayerMatchIndex,
           java.math.BigInteger[] awayPlayerUniqueIndex,
           java.math.BigInteger homeSetCount,
           java.math.BigInteger awaySetCount,
           java.lang.Boolean isHomeForfeited,
           java.lang.Boolean isAwayForfeited,
           java.lang.String scores) {
           this.position = position;
           this.homePlayerMatchIndex = homePlayerMatchIndex;
           this.homePlayerUniqueIndex = homePlayerUniqueIndex;
           this.awayPlayerMatchIndex = awayPlayerMatchIndex;
           this.awayPlayerUniqueIndex = awayPlayerUniqueIndex;
           this.homeSetCount = homeSetCount;
           this.awaySetCount = awaySetCount;
           this.isHomeForfeited = isHomeForfeited;
           this.isAwayForfeited = isAwayForfeited;
           this.scores = scores;
    }


    /**
     * Gets the position value for this IndividualMatchResultEntryType.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this IndividualMatchResultEntryType.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the homePlayerMatchIndex value for this IndividualMatchResultEntryType.
     * 
     * @return homePlayerMatchIndex
     */
    public java.math.BigInteger[] getHomePlayerMatchIndex() {
        return homePlayerMatchIndex;
    }


    /**
     * Sets the homePlayerMatchIndex value for this IndividualMatchResultEntryType.
     * 
     * @param homePlayerMatchIndex
     */
    public void setHomePlayerMatchIndex(java.math.BigInteger[] homePlayerMatchIndex) {
        this.homePlayerMatchIndex = homePlayerMatchIndex;
    }

    public java.math.BigInteger getHomePlayerMatchIndex(int i) {
        return this.homePlayerMatchIndex[i];
    }

    public void setHomePlayerMatchIndex(int i, java.math.BigInteger _value) {
        this.homePlayerMatchIndex[i] = _value;
    }


    /**
     * Gets the homePlayerUniqueIndex value for this IndividualMatchResultEntryType.
     * 
     * @return homePlayerUniqueIndex
     */
    public java.math.BigInteger[] getHomePlayerUniqueIndex() {
        return homePlayerUniqueIndex;
    }


    /**
     * Sets the homePlayerUniqueIndex value for this IndividualMatchResultEntryType.
     * 
     * @param homePlayerUniqueIndex
     */
    public void setHomePlayerUniqueIndex(java.math.BigInteger[] homePlayerUniqueIndex) {
        this.homePlayerUniqueIndex = homePlayerUniqueIndex;
    }

    public java.math.BigInteger getHomePlayerUniqueIndex(int i) {
        return this.homePlayerUniqueIndex[i];
    }

    public void setHomePlayerUniqueIndex(int i, java.math.BigInteger _value) {
        this.homePlayerUniqueIndex[i] = _value;
    }


    /**
     * Gets the awayPlayerMatchIndex value for this IndividualMatchResultEntryType.
     * 
     * @return awayPlayerMatchIndex
     */
    public java.math.BigInteger[] getAwayPlayerMatchIndex() {
        return awayPlayerMatchIndex;
    }


    /**
     * Sets the awayPlayerMatchIndex value for this IndividualMatchResultEntryType.
     * 
     * @param awayPlayerMatchIndex
     */
    public void setAwayPlayerMatchIndex(java.math.BigInteger[] awayPlayerMatchIndex) {
        this.awayPlayerMatchIndex = awayPlayerMatchIndex;
    }

    public java.math.BigInteger getAwayPlayerMatchIndex(int i) {
        return this.awayPlayerMatchIndex[i];
    }

    public void setAwayPlayerMatchIndex(int i, java.math.BigInteger _value) {
        this.awayPlayerMatchIndex[i] = _value;
    }


    /**
     * Gets the awayPlayerUniqueIndex value for this IndividualMatchResultEntryType.
     * 
     * @return awayPlayerUniqueIndex
     */
    public java.math.BigInteger[] getAwayPlayerUniqueIndex() {
        return awayPlayerUniqueIndex;
    }


    /**
     * Sets the awayPlayerUniqueIndex value for this IndividualMatchResultEntryType.
     * 
     * @param awayPlayerUniqueIndex
     */
    public void setAwayPlayerUniqueIndex(java.math.BigInteger[] awayPlayerUniqueIndex) {
        this.awayPlayerUniqueIndex = awayPlayerUniqueIndex;
    }

    public java.math.BigInteger getAwayPlayerUniqueIndex(int i) {
        return this.awayPlayerUniqueIndex[i];
    }

    public void setAwayPlayerUniqueIndex(int i, java.math.BigInteger _value) {
        this.awayPlayerUniqueIndex[i] = _value;
    }


    /**
     * Gets the homeSetCount value for this IndividualMatchResultEntryType.
     * 
     * @return homeSetCount
     */
    public java.math.BigInteger getHomeSetCount() {
        return homeSetCount;
    }


    /**
     * Sets the homeSetCount value for this IndividualMatchResultEntryType.
     * 
     * @param homeSetCount
     */
    public void setHomeSetCount(java.math.BigInteger homeSetCount) {
        this.homeSetCount = homeSetCount;
    }


    /**
     * Gets the awaySetCount value for this IndividualMatchResultEntryType.
     * 
     * @return awaySetCount
     */
    public java.math.BigInteger getAwaySetCount() {
        return awaySetCount;
    }


    /**
     * Sets the awaySetCount value for this IndividualMatchResultEntryType.
     * 
     * @param awaySetCount
     */
    public void setAwaySetCount(java.math.BigInteger awaySetCount) {
        this.awaySetCount = awaySetCount;
    }


    /**
     * Gets the isHomeForfeited value for this IndividualMatchResultEntryType.
     * 
     * @return isHomeForfeited
     */
    public java.lang.Boolean getIsHomeForfeited() {
        return isHomeForfeited;
    }


    /**
     * Sets the isHomeForfeited value for this IndividualMatchResultEntryType.
     * 
     * @param isHomeForfeited
     */
    public void setIsHomeForfeited(java.lang.Boolean isHomeForfeited) {
        this.isHomeForfeited = isHomeForfeited;
    }


    /**
     * Gets the isAwayForfeited value for this IndividualMatchResultEntryType.
     * 
     * @return isAwayForfeited
     */
    public java.lang.Boolean getIsAwayForfeited() {
        return isAwayForfeited;
    }


    /**
     * Sets the isAwayForfeited value for this IndividualMatchResultEntryType.
     * 
     * @param isAwayForfeited
     */
    public void setIsAwayForfeited(java.lang.Boolean isAwayForfeited) {
        this.isAwayForfeited = isAwayForfeited;
    }


    /**
     * Gets the scores value for this IndividualMatchResultEntryType.
     * 
     * @return scores
     */
    public java.lang.String getScores() {
        return scores;
    }


    /**
     * Sets the scores value for this IndividualMatchResultEntryType.
     * 
     * @param scores
     */
    public void setScores(java.lang.String scores) {
        this.scores = scores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndividualMatchResultEntryType)) return false;
        IndividualMatchResultEntryType other = (IndividualMatchResultEntryType) obj;
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
            ((this.homePlayerMatchIndex==null && other.getHomePlayerMatchIndex()==null) || 
             (this.homePlayerMatchIndex!=null &&
              java.util.Arrays.equals(this.homePlayerMatchIndex, other.getHomePlayerMatchIndex()))) &&
            ((this.homePlayerUniqueIndex==null && other.getHomePlayerUniqueIndex()==null) || 
             (this.homePlayerUniqueIndex!=null &&
              java.util.Arrays.equals(this.homePlayerUniqueIndex, other.getHomePlayerUniqueIndex()))) &&
            ((this.awayPlayerMatchIndex==null && other.getAwayPlayerMatchIndex()==null) || 
             (this.awayPlayerMatchIndex!=null &&
              java.util.Arrays.equals(this.awayPlayerMatchIndex, other.getAwayPlayerMatchIndex()))) &&
            ((this.awayPlayerUniqueIndex==null && other.getAwayPlayerUniqueIndex()==null) || 
             (this.awayPlayerUniqueIndex!=null &&
              java.util.Arrays.equals(this.awayPlayerUniqueIndex, other.getAwayPlayerUniqueIndex()))) &&
            ((this.homeSetCount==null && other.getHomeSetCount()==null) || 
             (this.homeSetCount!=null &&
              this.homeSetCount.equals(other.getHomeSetCount()))) &&
            ((this.awaySetCount==null && other.getAwaySetCount()==null) || 
             (this.awaySetCount!=null &&
              this.awaySetCount.equals(other.getAwaySetCount()))) &&
            ((this.isHomeForfeited==null && other.getIsHomeForfeited()==null) || 
             (this.isHomeForfeited!=null &&
              this.isHomeForfeited.equals(other.getIsHomeForfeited()))) &&
            ((this.isAwayForfeited==null && other.getIsAwayForfeited()==null) || 
             (this.isAwayForfeited!=null &&
              this.isAwayForfeited.equals(other.getIsAwayForfeited()))) &&
            ((this.scores==null && other.getScores()==null) || 
             (this.scores!=null &&
              this.scores.equals(other.getScores())));
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
        if (getHomePlayerMatchIndex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHomePlayerMatchIndex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHomePlayerMatchIndex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHomePlayerUniqueIndex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHomePlayerUniqueIndex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHomePlayerUniqueIndex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAwayPlayerMatchIndex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAwayPlayerMatchIndex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwayPlayerMatchIndex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAwayPlayerUniqueIndex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAwayPlayerUniqueIndex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwayPlayerUniqueIndex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHomeSetCount() != null) {
            _hashCode += getHomeSetCount().hashCode();
        }
        if (getAwaySetCount() != null) {
            _hashCode += getAwaySetCount().hashCode();
        }
        if (getIsHomeForfeited() != null) {
            _hashCode += getIsHomeForfeited().hashCode();
        }
        if (getIsAwayForfeited() != null) {
            _hashCode += getIsAwayForfeited().hashCode();
        }
        if (getScores() != null) {
            _hashCode += getScores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndividualMatchResultEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualMatchResultEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePlayerMatchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomePlayerMatchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePlayerUniqueIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomePlayerUniqueIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayPlayerMatchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayPlayerMatchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awayPlayerUniqueIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwayPlayerUniqueIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeSetCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "HomeSetCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awaySetCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AwaySetCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("scores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Scores"));
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
