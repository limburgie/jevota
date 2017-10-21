/**
 * GetTournamentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class GetTournamentsResponse  implements java.io.Serializable {
    private java.math.BigInteger tournamentCount;

    private vttl.api.TournamentEntryType[] tournamentEntries;

    public GetTournamentsResponse() {
    }

    public GetTournamentsResponse(
           java.math.BigInteger tournamentCount,
           vttl.api.TournamentEntryType[] tournamentEntries) {
           this.tournamentCount = tournamentCount;
           this.tournamentEntries = tournamentEntries;
    }


    /**
     * Gets the tournamentCount value for this GetTournamentsResponse.
     * 
     * @return tournamentCount
     */
    public java.math.BigInteger getTournamentCount() {
        return tournamentCount;
    }


    /**
     * Sets the tournamentCount value for this GetTournamentsResponse.
     * 
     * @param tournamentCount
     */
    public void setTournamentCount(java.math.BigInteger tournamentCount) {
        this.tournamentCount = tournamentCount;
    }


    /**
     * Gets the tournamentEntries value for this GetTournamentsResponse.
     * 
     * @return tournamentEntries
     */
    public vttl.api.TournamentEntryType[] getTournamentEntries() {
        return tournamentEntries;
    }


    /**
     * Sets the tournamentEntries value for this GetTournamentsResponse.
     * 
     * @param tournamentEntries
     */
    public void setTournamentEntries(vttl.api.TournamentEntryType[] tournamentEntries) {
        this.tournamentEntries = tournamentEntries;
    }

    public vttl.api.TournamentEntryType getTournamentEntries(int i) {
        return this.tournamentEntries[i];
    }

    public void setTournamentEntries(int i, vttl.api.TournamentEntryType _value) {
        this.tournamentEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTournamentsResponse)) return false;
        GetTournamentsResponse other = (GetTournamentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tournamentCount==null && other.getTournamentCount()==null) || 
             (this.tournamentCount!=null &&
              this.tournamentCount.equals(other.getTournamentCount()))) &&
            ((this.tournamentEntries==null && other.getTournamentEntries()==null) || 
             (this.tournamentEntries!=null &&
              java.util.Arrays.equals(this.tournamentEntries, other.getTournamentEntries())));
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
        if (getTournamentCount() != null) {
            _hashCode += getTournamentCount().hashCode();
        }
        if (getTournamentEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTournamentEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTournamentEntries(), i);
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
        new org.apache.axis.description.TypeDesc(GetTournamentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetTournamentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tournamentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TournamentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tournamentEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TournamentEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TournamentEntryType"));
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
