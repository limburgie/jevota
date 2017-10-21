/**
 * GetClubTeamsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetClubTeamsResponse  implements java.io.Serializable {
    private java.lang.String clubName;

    private java.math.BigInteger teamCount;

    private vttl.api.TeamEntryType[] teamEntries;

    public GetClubTeamsResponse() {
    }

    public GetClubTeamsResponse(
           java.lang.String clubName,
           java.math.BigInteger teamCount,
           vttl.api.TeamEntryType[] teamEntries) {
           this.clubName = clubName;
           this.teamCount = teamCount;
           this.teamEntries = teamEntries;
    }


    /**
     * Gets the clubName value for this GetClubTeamsResponse.
     * 
     * @return clubName
     */
    public java.lang.String getClubName() {
        return clubName;
    }


    /**
     * Sets the clubName value for this GetClubTeamsResponse.
     * 
     * @param clubName
     */
    public void setClubName(java.lang.String clubName) {
        this.clubName = clubName;
    }


    /**
     * Gets the teamCount value for this GetClubTeamsResponse.
     * 
     * @return teamCount
     */
    public java.math.BigInteger getTeamCount() {
        return teamCount;
    }


    /**
     * Sets the teamCount value for this GetClubTeamsResponse.
     * 
     * @param teamCount
     */
    public void setTeamCount(java.math.BigInteger teamCount) {
        this.teamCount = teamCount;
    }


    /**
     * Gets the teamEntries value for this GetClubTeamsResponse.
     * 
     * @return teamEntries
     */
    public vttl.api.TeamEntryType[] getTeamEntries() {
        return teamEntries;
    }


    /**
     * Sets the teamEntries value for this GetClubTeamsResponse.
     * 
     * @param teamEntries
     */
    public void setTeamEntries(vttl.api.TeamEntryType[] teamEntries) {
        this.teamEntries = teamEntries;
    }

    public vttl.api.TeamEntryType getTeamEntries(int i) {
        return this.teamEntries[i];
    }

    public void setTeamEntries(int i, vttl.api.TeamEntryType _value) {
        this.teamEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClubTeamsResponse)) return false;
        GetClubTeamsResponse other = (GetClubTeamsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clubName==null && other.getClubName()==null) || 
             (this.clubName!=null &&
              this.clubName.equals(other.getClubName()))) &&
            ((this.teamCount==null && other.getTeamCount()==null) || 
             (this.teamCount!=null &&
              this.teamCount.equals(other.getTeamCount()))) &&
            ((this.teamEntries==null && other.getTeamEntries()==null) || 
             (this.teamEntries!=null &&
              java.util.Arrays.equals(this.teamEntries, other.getTeamEntries())));
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
        if (getClubName() != null) {
            _hashCode += getClubName().hashCode();
        }
        if (getTeamCount() != null) {
            _hashCode += getTeamCount().hashCode();
        }
        if (getTeamEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeamEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeamEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetClubTeamsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubTeamsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clubName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ClubName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamEntryType"));
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
