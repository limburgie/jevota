/**
 * UploadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class UploadResponse  implements java.io.Serializable {
    private boolean result;

    private java.lang.String[] errorLines;

    public UploadResponse() {
    }

    public UploadResponse(
           boolean result,
           java.lang.String[] errorLines) {
           this.result = result;
           this.errorLines = errorLines;
    }


    /**
     * Gets the result value for this UploadResponse.
     * 
     * @return result
     */
    public boolean isResult() {
        return result;
    }


    /**
     * Sets the result value for this UploadResponse.
     * 
     * @param result
     */
    public void setResult(boolean result) {
        this.result = result;
    }


    /**
     * Gets the errorLines value for this UploadResponse.
     * 
     * @return errorLines
     */
    public java.lang.String[] getErrorLines() {
        return errorLines;
    }


    /**
     * Sets the errorLines value for this UploadResponse.
     * 
     * @param errorLines
     */
    public void setErrorLines(java.lang.String[] errorLines) {
        this.errorLines = errorLines;
    }

    public java.lang.String getErrorLines(int i) {
        return this.errorLines[i];
    }

    public void setErrorLines(int i, java.lang.String _value) {
        this.errorLines[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadResponse)) return false;
        UploadResponse other = (UploadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.isResult() &&
            ((this.errorLines==null && other.getErrorLines()==null) || 
             (this.errorLines!=null &&
              java.util.Arrays.equals(this.errorLines, other.getErrorLines())));
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
        _hashCode += (isResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrorLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorLines(), i);
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
        new org.apache.axis.description.TypeDesc(UploadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">UploadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ErrorLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
