/**
 * GetSeasonsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetSeasonsResponse  implements java.io.Serializable {
    private java.math.BigInteger currentSeason;

    private java.lang.String currentSeasonName;

    private vttl.api.SeasonEntryType[] seasonEntries;

    public GetSeasonsResponse() {
    }

    public GetSeasonsResponse(
           java.math.BigInteger currentSeason,
           java.lang.String currentSeasonName,
           vttl.api.SeasonEntryType[] seasonEntries) {
           this.currentSeason = currentSeason;
           this.currentSeasonName = currentSeasonName;
           this.seasonEntries = seasonEntries;
    }


    /**
     * Gets the currentSeason value for this GetSeasonsResponse.
     * 
     * @return currentSeason
     */
    public java.math.BigInteger getCurrentSeason() {
        return currentSeason;
    }


    /**
     * Sets the currentSeason value for this GetSeasonsResponse.
     * 
     * @param currentSeason
     */
    public void setCurrentSeason(java.math.BigInteger currentSeason) {
        this.currentSeason = currentSeason;
    }


    /**
     * Gets the currentSeasonName value for this GetSeasonsResponse.
     * 
     * @return currentSeasonName
     */
    public java.lang.String getCurrentSeasonName() {
        return currentSeasonName;
    }


    /**
     * Sets the currentSeasonName value for this GetSeasonsResponse.
     * 
     * @param currentSeasonName
     */
    public void setCurrentSeasonName(java.lang.String currentSeasonName) {
        this.currentSeasonName = currentSeasonName;
    }


    /**
     * Gets the seasonEntries value for this GetSeasonsResponse.
     * 
     * @return seasonEntries
     */
    public vttl.api.SeasonEntryType[] getSeasonEntries() {
        return seasonEntries;
    }


    /**
     * Sets the seasonEntries value for this GetSeasonsResponse.
     * 
     * @param seasonEntries
     */
    public void setSeasonEntries(vttl.api.SeasonEntryType[] seasonEntries) {
        this.seasonEntries = seasonEntries;
    }

    public vttl.api.SeasonEntryType getSeasonEntries(int i) {
        return this.seasonEntries[i];
    }

    public void setSeasonEntries(int i, vttl.api.SeasonEntryType _value) {
        this.seasonEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSeasonsResponse)) return false;
        GetSeasonsResponse other = (GetSeasonsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentSeason==null && other.getCurrentSeason()==null) || 
             (this.currentSeason!=null &&
              this.currentSeason.equals(other.getCurrentSeason()))) &&
            ((this.currentSeasonName==null && other.getCurrentSeasonName()==null) || 
             (this.currentSeasonName!=null &&
              this.currentSeasonName.equals(other.getCurrentSeasonName()))) &&
            ((this.seasonEntries==null && other.getSeasonEntries()==null) || 
             (this.seasonEntries!=null &&
              java.util.Arrays.equals(this.seasonEntries, other.getSeasonEntries())));
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
        if (getCurrentSeason() != null) {
            _hashCode += getCurrentSeason().hashCode();
        }
        if (getCurrentSeasonName() != null) {
            _hashCode += getCurrentSeasonName().hashCode();
        }
        if (getSeasonEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeasonEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeasonEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetSeasonsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetSeasonsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSeason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CurrentSeason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSeasonName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CurrentSeasonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seasonEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SeasonEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SeasonEntryType"));
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
