/**
 * TournamentEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TournamentEntryType  implements java.io.Serializable {
    private java.lang.String uniqueIndex;

    private java.lang.String name;

    private java.lang.String externalIndex;

    public TournamentEntryType() {
    }

    public TournamentEntryType(
           java.lang.String uniqueIndex,
           java.lang.String name,
           java.lang.String externalIndex) {
           this.uniqueIndex = uniqueIndex;
           this.name = name;
           this.externalIndex = externalIndex;
    }


    /**
     * Gets the uniqueIndex value for this TournamentEntryType.
     * 
     * @return uniqueIndex
     */
    public java.lang.String getUniqueIndex() {
        return uniqueIndex;
    }


    /**
     * Sets the uniqueIndex value for this TournamentEntryType.
     * 
     * @param uniqueIndex
     */
    public void setUniqueIndex(java.lang.String uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }


    /**
     * Gets the name value for this TournamentEntryType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TournamentEntryType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the externalIndex value for this TournamentEntryType.
     * 
     * @return externalIndex
     */
    public java.lang.String getExternalIndex() {
        return externalIndex;
    }


    /**
     * Sets the externalIndex value for this TournamentEntryType.
     * 
     * @param externalIndex
     */
    public void setExternalIndex(java.lang.String externalIndex) {
        this.externalIndex = externalIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TournamentEntryType)) return false;
        TournamentEntryType other = (TournamentEntryType) obj;
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
            ((this.externalIndex==null && other.getExternalIndex()==null) || 
             (this.externalIndex!=null &&
              this.externalIndex.equals(other.getExternalIndex())));
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
        if (getExternalIndex() != null) {
            _hashCode += getExternalIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TournamentEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TournamentEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "UniqueIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ExternalIndex"));
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
