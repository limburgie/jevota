/**
 * TestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TestResponse  implements java.io.Serializable {
    private java.util.Calendar timestamp;

    private java.lang.String apiVersion;

    private boolean isValidAccount;

    private vttl.api.SupportedLanguages language;

    private java.lang.String database;

    private java.lang.String requestorIp;

    private java.math.BigInteger consumedTicks;

    private java.math.BigInteger currentQuota;

    private java.math.BigInteger allowedQuota;

    public TestResponse() {
    }

    public TestResponse(
           java.util.Calendar timestamp,
           java.lang.String apiVersion,
           boolean isValidAccount,
           vttl.api.SupportedLanguages language,
           java.lang.String database,
           java.lang.String requestorIp,
           java.math.BigInteger consumedTicks,
           java.math.BigInteger currentQuota,
           java.math.BigInteger allowedQuota) {
           this.timestamp = timestamp;
           this.apiVersion = apiVersion;
           this.isValidAccount = isValidAccount;
           this.language = language;
           this.database = database;
           this.requestorIp = requestorIp;
           this.consumedTicks = consumedTicks;
           this.currentQuota = currentQuota;
           this.allowedQuota = allowedQuota;
    }


    /**
     * Gets the timestamp value for this TestResponse.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TestResponse.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the apiVersion value for this TestResponse.
     * 
     * @return apiVersion
     */
    public java.lang.String getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this TestResponse.
     * 
     * @param apiVersion
     */
    public void setApiVersion(java.lang.String apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the isValidAccount value for this TestResponse.
     * 
     * @return isValidAccount
     */
    public boolean isIsValidAccount() {
        return isValidAccount;
    }


    /**
     * Sets the isValidAccount value for this TestResponse.
     * 
     * @param isValidAccount
     */
    public void setIsValidAccount(boolean isValidAccount) {
        this.isValidAccount = isValidAccount;
    }


    /**
     * Gets the language value for this TestResponse.
     * 
     * @return language
     */
    public vttl.api.SupportedLanguages getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this TestResponse.
     * 
     * @param language
     */
    public void setLanguage(vttl.api.SupportedLanguages language) {
        this.language = language;
    }


    /**
     * Gets the database value for this TestResponse.
     * 
     * @return database
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this TestResponse.
     * 
     * @param database
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the requestorIp value for this TestResponse.
     * 
     * @return requestorIp
     */
    public java.lang.String getRequestorIp() {
        return requestorIp;
    }


    /**
     * Sets the requestorIp value for this TestResponse.
     * 
     * @param requestorIp
     */
    public void setRequestorIp(java.lang.String requestorIp) {
        this.requestorIp = requestorIp;
    }


    /**
     * Gets the consumedTicks value for this TestResponse.
     * 
     * @return consumedTicks
     */
    public java.math.BigInteger getConsumedTicks() {
        return consumedTicks;
    }


    /**
     * Sets the consumedTicks value for this TestResponse.
     * 
     * @param consumedTicks
     */
    public void setConsumedTicks(java.math.BigInteger consumedTicks) {
        this.consumedTicks = consumedTicks;
    }


    /**
     * Gets the currentQuota value for this TestResponse.
     * 
     * @return currentQuota
     */
    public java.math.BigInteger getCurrentQuota() {
        return currentQuota;
    }


    /**
     * Sets the currentQuota value for this TestResponse.
     * 
     * @param currentQuota
     */
    public void setCurrentQuota(java.math.BigInteger currentQuota) {
        this.currentQuota = currentQuota;
    }


    /**
     * Gets the allowedQuota value for this TestResponse.
     * 
     * @return allowedQuota
     */
    public java.math.BigInteger getAllowedQuota() {
        return allowedQuota;
    }


    /**
     * Sets the allowedQuota value for this TestResponse.
     * 
     * @param allowedQuota
     */
    public void setAllowedQuota(java.math.BigInteger allowedQuota) {
        this.allowedQuota = allowedQuota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestResponse)) return false;
        TestResponse other = (TestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.apiVersion==null && other.getApiVersion()==null) || 
             (this.apiVersion!=null &&
              this.apiVersion.equals(other.getApiVersion()))) &&
            this.isValidAccount == other.isIsValidAccount() &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.database==null && other.getDatabase()==null) || 
             (this.database!=null &&
              this.database.equals(other.getDatabase()))) &&
            ((this.requestorIp==null && other.getRequestorIp()==null) || 
             (this.requestorIp!=null &&
              this.requestorIp.equals(other.getRequestorIp()))) &&
            ((this.consumedTicks==null && other.getConsumedTicks()==null) || 
             (this.consumedTicks!=null &&
              this.consumedTicks.equals(other.getConsumedTicks()))) &&
            ((this.currentQuota==null && other.getCurrentQuota()==null) || 
             (this.currentQuota!=null &&
              this.currentQuota.equals(other.getCurrentQuota()))) &&
            ((this.allowedQuota==null && other.getAllowedQuota()==null) || 
             (this.allowedQuota!=null &&
              this.allowedQuota.equals(other.getAllowedQuota())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        _hashCode += (isIsValidAccount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getDatabase() != null) {
            _hashCode += getDatabase().hashCode();
        }
        if (getRequestorIp() != null) {
            _hashCode += getRequestorIp().hashCode();
        }
        if (getConsumedTicks() != null) {
            _hashCode += getConsumedTicks().hashCode();
        }
        if (getCurrentQuota() != null) {
            _hashCode += getCurrentQuota().hashCode();
        }
        if (getAllowedQuota() != null) {
            _hashCode += getAllowedQuota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">TestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ApiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValidAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IsValidAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SupportedLanguages"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestorIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RequestorIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumedTicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ConsumedTicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CurrentQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AllowedQuota"));
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
