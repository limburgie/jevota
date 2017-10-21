/**
 * MatchSystemEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class MatchSystemEntryType  implements java.io.Serializable {
    private java.math.BigInteger uniqueIndex;

    private java.lang.String name;

    private java.math.BigInteger singleMatchCount;

    private java.math.BigInteger doubleMatchCount;

    private java.math.BigInteger setCount;

    private java.math.BigInteger pointCount;

    private boolean forcedDoubleTeams;

    private java.math.BigInteger substituteCount;

    private java.math.BigInteger teamMatchCount;

    private vttl.api.TeamMatchDefinitionEntryType[] teamMatchDefinitionEntries;

    public MatchSystemEntryType() {
    }

    public MatchSystemEntryType(
           java.math.BigInteger uniqueIndex,
           java.lang.String name,
           java.math.BigInteger singleMatchCount,
           java.math.BigInteger doubleMatchCount,
           java.math.BigInteger setCount,
           java.math.BigInteger pointCount,
           boolean forcedDoubleTeams,
           java.math.BigInteger substituteCount,
           java.math.BigInteger teamMatchCount,
           vttl.api.TeamMatchDefinitionEntryType[] teamMatchDefinitionEntries) {
           this.uniqueIndex = uniqueIndex;
           this.name = name;
           this.singleMatchCount = singleMatchCount;
           this.doubleMatchCount = doubleMatchCount;
           this.setCount = setCount;
           this.pointCount = pointCount;
           this.forcedDoubleTeams = forcedDoubleTeams;
           this.substituteCount = substituteCount;
           this.teamMatchCount = teamMatchCount;
           this.teamMatchDefinitionEntries = teamMatchDefinitionEntries;
    }


    /**
     * Gets the uniqueIndex value for this MatchSystemEntryType.
     * 
     * @return uniqueIndex
     */
    public java.math.BigInteger getUniqueIndex() {
        return uniqueIndex;
    }


    /**
     * Sets the uniqueIndex value for this MatchSystemEntryType.
     * 
     * @param uniqueIndex
     */
    public void setUniqueIndex(java.math.BigInteger uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }


    /**
     * Gets the name value for this MatchSystemEntryType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MatchSystemEntryType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the singleMatchCount value for this MatchSystemEntryType.
     * 
     * @return singleMatchCount
     */
    public java.math.BigInteger getSingleMatchCount() {
        return singleMatchCount;
    }


    /**
     * Sets the singleMatchCount value for this MatchSystemEntryType.
     * 
     * @param singleMatchCount
     */
    public void setSingleMatchCount(java.math.BigInteger singleMatchCount) {
        this.singleMatchCount = singleMatchCount;
    }


    /**
     * Gets the doubleMatchCount value for this MatchSystemEntryType.
     * 
     * @return doubleMatchCount
     */
    public java.math.BigInteger getDoubleMatchCount() {
        return doubleMatchCount;
    }


    /**
     * Sets the doubleMatchCount value for this MatchSystemEntryType.
     * 
     * @param doubleMatchCount
     */
    public void setDoubleMatchCount(java.math.BigInteger doubleMatchCount) {
        this.doubleMatchCount = doubleMatchCount;
    }


    /**
     * Gets the setCount value for this MatchSystemEntryType.
     * 
     * @return setCount
     */
    public java.math.BigInteger getSetCount() {
        return setCount;
    }


    /**
     * Sets the setCount value for this MatchSystemEntryType.
     * 
     * @param setCount
     */
    public void setSetCount(java.math.BigInteger setCount) {
        this.setCount = setCount;
    }


    /**
     * Gets the pointCount value for this MatchSystemEntryType.
     * 
     * @return pointCount
     */
    public java.math.BigInteger getPointCount() {
        return pointCount;
    }


    /**
     * Sets the pointCount value for this MatchSystemEntryType.
     * 
     * @param pointCount
     */
    public void setPointCount(java.math.BigInteger pointCount) {
        this.pointCount = pointCount;
    }


    /**
     * Gets the forcedDoubleTeams value for this MatchSystemEntryType.
     * 
     * @return forcedDoubleTeams
     */
    public boolean isForcedDoubleTeams() {
        return forcedDoubleTeams;
    }


    /**
     * Sets the forcedDoubleTeams value for this MatchSystemEntryType.
     * 
     * @param forcedDoubleTeams
     */
    public void setForcedDoubleTeams(boolean forcedDoubleTeams) {
        this.forcedDoubleTeams = forcedDoubleTeams;
    }


    /**
     * Gets the substituteCount value for this MatchSystemEntryType.
     * 
     * @return substituteCount
     */
    public java.math.BigInteger getSubstituteCount() {
        return substituteCount;
    }


    /**
     * Sets the substituteCount value for this MatchSystemEntryType.
     * 
     * @param substituteCount
     */
    public void setSubstituteCount(java.math.BigInteger substituteCount) {
        this.substituteCount = substituteCount;
    }


    /**
     * Gets the teamMatchCount value for this MatchSystemEntryType.
     * 
     * @return teamMatchCount
     */
    public java.math.BigInteger getTeamMatchCount() {
        return teamMatchCount;
    }


    /**
     * Sets the teamMatchCount value for this MatchSystemEntryType.
     * 
     * @param teamMatchCount
     */
    public void setTeamMatchCount(java.math.BigInteger teamMatchCount) {
        this.teamMatchCount = teamMatchCount;
    }


    /**
     * Gets the teamMatchDefinitionEntries value for this MatchSystemEntryType.
     * 
     * @return teamMatchDefinitionEntries
     */
    public vttl.api.TeamMatchDefinitionEntryType[] getTeamMatchDefinitionEntries() {
        return teamMatchDefinitionEntries;
    }


    /**
     * Sets the teamMatchDefinitionEntries value for this MatchSystemEntryType.
     * 
     * @param teamMatchDefinitionEntries
     */
    public void setTeamMatchDefinitionEntries(vttl.api.TeamMatchDefinitionEntryType[] teamMatchDefinitionEntries) {
        this.teamMatchDefinitionEntries = teamMatchDefinitionEntries;
    }

    public vttl.api.TeamMatchDefinitionEntryType getTeamMatchDefinitionEntries(int i) {
        return this.teamMatchDefinitionEntries[i];
    }

    public void setTeamMatchDefinitionEntries(int i, vttl.api.TeamMatchDefinitionEntryType _value) {
        this.teamMatchDefinitionEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchSystemEntryType)) return false;
        MatchSystemEntryType other = (MatchSystemEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueIndex==null && other.getUniqueIndex()==null) || 
             (this.uniqueIndex!=null &&
              this.uniqueIndex.equals(other.getUniqueIndex()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.singleMatchCount==null && other.getSingleMatchCount()==null) || 
             (this.singleMatchCount!=null &&
              this.singleMatchCount.equals(other.getSingleMatchCount()))) &&
            ((this.doubleMatchCount==null && other.getDoubleMatchCount()==null) || 
             (this.doubleMatchCount!=null &&
              this.doubleMatchCount.equals(other.getDoubleMatchCount()))) &&
            ((this.setCount==null && other.getSetCount()==null) || 
             (this.setCount!=null &&
              this.setCount.equals(other.getSetCount()))) &&
            ((this.pointCount==null && other.getPointCount()==null) || 
             (this.pointCount!=null &&
              this.pointCount.equals(other.getPointCount()))) &&
            this.forcedDoubleTeams == other.isForcedDoubleTeams() &&
            ((this.substituteCount==null && other.getSubstituteCount()==null) || 
             (this.substituteCount!=null &&
              this.substituteCount.equals(other.getSubstituteCount()))) &&
            ((this.teamMatchCount==null && other.getTeamMatchCount()==null) || 
             (this.teamMatchCount!=null &&
              this.teamMatchCount.equals(other.getTeamMatchCount()))) &&
            ((this.teamMatchDefinitionEntries==null && other.getTeamMatchDefinitionEntries()==null) || 
             (this.teamMatchDefinitionEntries!=null &&
              java.util.Arrays.equals(this.teamMatchDefinitionEntries, other.getTeamMatchDefinitionEntries())));
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
        if (getUniqueIndex() != null) {
            _hashCode += getUniqueIndex().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSingleMatchCount() != null) {
            _hashCode += getSingleMatchCount().hashCode();
        }
        if (getDoubleMatchCount() != null) {
            _hashCode += getDoubleMatchCount().hashCode();
        }
        if (getSetCount() != null) {
            _hashCode += getSetCount().hashCode();
        }
        if (getPointCount() != null) {
            _hashCode += getPointCount().hashCode();
        }
        _hashCode += (isForcedDoubleTeams() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSubstituteCount() != null) {
            _hashCode += getSubstituteCount().hashCode();
        }
        if (getTeamMatchCount() != null) {
            _hashCode += getTeamMatchCount().hashCode();
        }
        if (getTeamMatchDefinitionEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeamMatchDefinitionEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeamMatchDefinitionEntries(), i);
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
        new org.apache.axis.description.TypeDesc(MatchSystemEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchSystemEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "UniqueIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleMatchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SingleMatchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleMatchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DoubleMatchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SetCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PointCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcedDoubleTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ForcedDoubleTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("substituteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SubstituteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamMatchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamMatchDefinitionEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDefinitionEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDefinitionEntryType"));
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
