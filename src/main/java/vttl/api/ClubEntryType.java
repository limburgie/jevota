/**
 * ClubEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class ClubEntryType  implements java.io.Serializable {
    private java.lang.String uniqueIndex;

    private java.lang.String name;

    private java.lang.String longName;

    private java.math.BigInteger category;

    private java.lang.String categoryName;

    private java.math.BigInteger venueCount;

    private vttl.api.VenueEntryType[] venueEntries;

    public ClubEntryType() {
    }

    public ClubEntryType(
           java.lang.String uniqueIndex,
           java.lang.String name,
           java.lang.String longName,
           java.math.BigInteger category,
           java.lang.String categoryName,
           java.math.BigInteger venueCount,
           vttl.api.VenueEntryType[] venueEntries) {
           this.uniqueIndex = uniqueIndex;
           this.name = name;
           this.longName = longName;
           this.category = category;
           this.categoryName = categoryName;
           this.venueCount = venueCount;
           this.venueEntries = venueEntries;
    }


    /**
     * Gets the uniqueIndex value for this ClubEntryType.
     * 
     * @return uniqueIndex
     */
    public java.lang.String getUniqueIndex() {
        return uniqueIndex;
    }


    /**
     * Sets the uniqueIndex value for this ClubEntryType.
     * 
     * @param uniqueIndex
     */
    public void setUniqueIndex(java.lang.String uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }


    /**
     * Gets the name value for this ClubEntryType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ClubEntryType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the longName value for this ClubEntryType.
     * 
     * @return longName
     */
    public java.lang.String getLongName() {
        return longName;
    }


    /**
     * Sets the longName value for this ClubEntryType.
     * 
     * @param longName
     */
    public void setLongName(java.lang.String longName) {
        this.longName = longName;
    }


    /**
     * Gets the category value for this ClubEntryType.
     * 
     * @return category
     */
    public java.math.BigInteger getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ClubEntryType.
     * 
     * @param category
     */
    public void setCategory(java.math.BigInteger category) {
        this.category = category;
    }


    /**
     * Gets the categoryName value for this ClubEntryType.
     * 
     * @return categoryName
     */
    public java.lang.String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this ClubEntryType.
     * 
     * @param categoryName
     */
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * Gets the venueCount value for this ClubEntryType.
     * 
     * @return venueCount
     */
    public java.math.BigInteger getVenueCount() {
        return venueCount;
    }


    /**
     * Sets the venueCount value for this ClubEntryType.
     * 
     * @param venueCount
     */
    public void setVenueCount(java.math.BigInteger venueCount) {
        this.venueCount = venueCount;
    }


    /**
     * Gets the venueEntries value for this ClubEntryType.
     * 
     * @return venueEntries
     */
    public vttl.api.VenueEntryType[] getVenueEntries() {
        return venueEntries;
    }


    /**
     * Sets the venueEntries value for this ClubEntryType.
     * 
     * @param venueEntries
     */
    public void setVenueEntries(vttl.api.VenueEntryType[] venueEntries) {
        this.venueEntries = venueEntries;
    }

    public vttl.api.VenueEntryType getVenueEntries(int i) {
        return this.venueEntries[i];
    }

    public void setVenueEntries(int i, vttl.api.VenueEntryType _value) {
        this.venueEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClubEntryType)) return false;
        ClubEntryType other = (ClubEntryType) obj;
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
            ((this.longName==null && other.getLongName()==null) || 
             (this.longName!=null &&
              this.longName.equals(other.getLongName()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName()))) &&
            ((this.venueCount==null && other.getVenueCount()==null) || 
             (this.venueCount!=null &&
              this.venueCount.equals(other.getVenueCount()))) &&
            ((this.venueEntries==null && other.getVenueEntries()==null) || 
             (this.venueEntries!=null &&
              java.util.Arrays.equals(this.venueEntries, other.getVenueEntries())));
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
        if (getLongName() != null) {
            _hashCode += getLongName().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        if (getVenueCount() != null) {
            _hashCode += getVenueCount().hashCode();
        }
        if (getVenueEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVenueEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVenueEntries(), i);
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
        new org.apache.axis.description.TypeDesc(ClubEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ClubEntryType"));
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
        elemField.setFieldName("longName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "LongName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venueCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "VenueCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venueEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "VenueEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "VenueEntryType"));
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
