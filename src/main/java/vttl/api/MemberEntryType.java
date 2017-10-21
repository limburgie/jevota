/**
 * MemberEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class MemberEntryType  implements java.io.Serializable {
    private java.math.BigInteger position;

    private java.math.BigInteger uniqueIndex;

    private java.math.BigInteger rankingIndex;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String ranking;

    private java.lang.String status;

    private java.lang.String club;

    private vttl.api.GenderType gender;

    private java.lang.String category;

    private java.util.Date birthDate;

    private java.lang.Boolean medicalAttestation;

    private java.math.BigInteger rankingPointsCount;

    private vttl.api.RankingPointEntryType[] rankingPointsEntries;

    private java.lang.String email;

    private vttl.api.PhoneType phone;

    private vttl.api.AddressType address;

    private java.math.BigInteger resultCount;

    private vttl.api.PlayerResultEntryType[] resultEntries;

    private java.lang.String nationalNumber;

    public MemberEntryType() {
    }

    public MemberEntryType(
           java.math.BigInteger position,
           java.math.BigInteger uniqueIndex,
           java.math.BigInteger rankingIndex,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String ranking,
           java.lang.String status,
           java.lang.String club,
           vttl.api.GenderType gender,
           java.lang.String category,
           java.util.Date birthDate,
           java.lang.Boolean medicalAttestation,
           java.math.BigInteger rankingPointsCount,
           vttl.api.RankingPointEntryType[] rankingPointsEntries,
           java.lang.String email,
           vttl.api.PhoneType phone,
           vttl.api.AddressType address,
           java.math.BigInteger resultCount,
           vttl.api.PlayerResultEntryType[] resultEntries,
           java.lang.String nationalNumber) {
           this.position = position;
           this.uniqueIndex = uniqueIndex;
           this.rankingIndex = rankingIndex;
           this.firstName = firstName;
           this.lastName = lastName;
           this.ranking = ranking;
           this.status = status;
           this.club = club;
           this.gender = gender;
           this.category = category;
           this.birthDate = birthDate;
           this.medicalAttestation = medicalAttestation;
           this.rankingPointsCount = rankingPointsCount;
           this.rankingPointsEntries = rankingPointsEntries;
           this.email = email;
           this.phone = phone;
           this.address = address;
           this.resultCount = resultCount;
           this.resultEntries = resultEntries;
           this.nationalNumber = nationalNumber;
    }


    /**
     * Gets the position value for this MemberEntryType.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this MemberEntryType.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the uniqueIndex value for this MemberEntryType.
     * 
     * @return uniqueIndex
     */
    public java.math.BigInteger getUniqueIndex() {
        return uniqueIndex;
    }


    /**
     * Sets the uniqueIndex value for this MemberEntryType.
     * 
     * @param uniqueIndex
     */
    public void setUniqueIndex(java.math.BigInteger uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }


    /**
     * Gets the rankingIndex value for this MemberEntryType.
     * 
     * @return rankingIndex
     */
    public java.math.BigInteger getRankingIndex() {
        return rankingIndex;
    }


    /**
     * Sets the rankingIndex value for this MemberEntryType.
     * 
     * @param rankingIndex
     */
    public void setRankingIndex(java.math.BigInteger rankingIndex) {
        this.rankingIndex = rankingIndex;
    }


    /**
     * Gets the firstName value for this MemberEntryType.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this MemberEntryType.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this MemberEntryType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this MemberEntryType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the ranking value for this MemberEntryType.
     * 
     * @return ranking
     */
    public java.lang.String getRanking() {
        return ranking;
    }


    /**
     * Sets the ranking value for this MemberEntryType.
     * 
     * @param ranking
     */
    public void setRanking(java.lang.String ranking) {
        this.ranking = ranking;
    }


    /**
     * Gets the status value for this MemberEntryType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MemberEntryType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the club value for this MemberEntryType.
     * 
     * @return club
     */
    public java.lang.String getClub() {
        return club;
    }


    /**
     * Sets the club value for this MemberEntryType.
     * 
     * @param club
     */
    public void setClub(java.lang.String club) {
        this.club = club;
    }


    /**
     * Gets the gender value for this MemberEntryType.
     * 
     * @return gender
     */
    public vttl.api.GenderType getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this MemberEntryType.
     * 
     * @param gender
     */
    public void setGender(vttl.api.GenderType gender) {
        this.gender = gender;
    }


    /**
     * Gets the category value for this MemberEntryType.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this MemberEntryType.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the birthDate value for this MemberEntryType.
     * 
     * @return birthDate
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this MemberEntryType.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the medicalAttestation value for this MemberEntryType.
     * 
     * @return medicalAttestation
     */
    public java.lang.Boolean getMedicalAttestation() {
        return medicalAttestation;
    }


    /**
     * Sets the medicalAttestation value for this MemberEntryType.
     * 
     * @param medicalAttestation
     */
    public void setMedicalAttestation(java.lang.Boolean medicalAttestation) {
        this.medicalAttestation = medicalAttestation;
    }


    /**
     * Gets the rankingPointsCount value for this MemberEntryType.
     * 
     * @return rankingPointsCount
     */
    public java.math.BigInteger getRankingPointsCount() {
        return rankingPointsCount;
    }


    /**
     * Sets the rankingPointsCount value for this MemberEntryType.
     * 
     * @param rankingPointsCount
     */
    public void setRankingPointsCount(java.math.BigInteger rankingPointsCount) {
        this.rankingPointsCount = rankingPointsCount;
    }


    /**
     * Gets the rankingPointsEntries value for this MemberEntryType.
     * 
     * @return rankingPointsEntries
     */
    public vttl.api.RankingPointEntryType[] getRankingPointsEntries() {
        return rankingPointsEntries;
    }


    /**
     * Sets the rankingPointsEntries value for this MemberEntryType.
     * 
     * @param rankingPointsEntries
     */
    public void setRankingPointsEntries(vttl.api.RankingPointEntryType[] rankingPointsEntries) {
        this.rankingPointsEntries = rankingPointsEntries;
    }

    public vttl.api.RankingPointEntryType getRankingPointsEntries(int i) {
        return this.rankingPointsEntries[i];
    }

    public void setRankingPointsEntries(int i, vttl.api.RankingPointEntryType _value) {
        this.rankingPointsEntries[i] = _value;
    }


    /**
     * Gets the email value for this MemberEntryType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MemberEntryType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the phone value for this MemberEntryType.
     * 
     * @return phone
     */
    public vttl.api.PhoneType getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this MemberEntryType.
     * 
     * @param phone
     */
    public void setPhone(vttl.api.PhoneType phone) {
        this.phone = phone;
    }


    /**
     * Gets the address value for this MemberEntryType.
     * 
     * @return address
     */
    public vttl.api.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this MemberEntryType.
     * 
     * @param address
     */
    public void setAddress(vttl.api.AddressType address) {
        this.address = address;
    }


    /**
     * Gets the resultCount value for this MemberEntryType.
     * 
     * @return resultCount
     */
    public java.math.BigInteger getResultCount() {
        return resultCount;
    }


    /**
     * Sets the resultCount value for this MemberEntryType.
     * 
     * @param resultCount
     */
    public void setResultCount(java.math.BigInteger resultCount) {
        this.resultCount = resultCount;
    }


    /**
     * Gets the resultEntries value for this MemberEntryType.
     * 
     * @return resultEntries
     */
    public vttl.api.PlayerResultEntryType[] getResultEntries() {
        return resultEntries;
    }


    /**
     * Sets the resultEntries value for this MemberEntryType.
     * 
     * @param resultEntries
     */
    public void setResultEntries(vttl.api.PlayerResultEntryType[] resultEntries) {
        this.resultEntries = resultEntries;
    }

    public vttl.api.PlayerResultEntryType getResultEntries(int i) {
        return this.resultEntries[i];
    }

    public void setResultEntries(int i, vttl.api.PlayerResultEntryType _value) {
        this.resultEntries[i] = _value;
    }


    /**
     * Gets the nationalNumber value for this MemberEntryType.
     * 
     * @return nationalNumber
     */
    public java.lang.String getNationalNumber() {
        return nationalNumber;
    }


    /**
     * Sets the nationalNumber value for this MemberEntryType.
     * 
     * @param nationalNumber
     */
    public void setNationalNumber(java.lang.String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemberEntryType)) return false;
        MemberEntryType other = (MemberEntryType) obj;
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
            ((this.uniqueIndex==null && other.getUniqueIndex()==null) || 
             (this.uniqueIndex!=null &&
              this.uniqueIndex.equals(other.getUniqueIndex()))) &&
            ((this.rankingIndex==null && other.getRankingIndex()==null) || 
             (this.rankingIndex!=null &&
              this.rankingIndex.equals(other.getRankingIndex()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.ranking==null && other.getRanking()==null) || 
             (this.ranking!=null &&
              this.ranking.equals(other.getRanking()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.club==null && other.getClub()==null) || 
             (this.club!=null &&
              this.club.equals(other.getClub()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.medicalAttestation==null && other.getMedicalAttestation()==null) || 
             (this.medicalAttestation!=null &&
              this.medicalAttestation.equals(other.getMedicalAttestation()))) &&
            ((this.rankingPointsCount==null && other.getRankingPointsCount()==null) || 
             (this.rankingPointsCount!=null &&
              this.rankingPointsCount.equals(other.getRankingPointsCount()))) &&
            ((this.rankingPointsEntries==null && other.getRankingPointsEntries()==null) || 
             (this.rankingPointsEntries!=null &&
              java.util.Arrays.equals(this.rankingPointsEntries, other.getRankingPointsEntries()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.resultCount==null && other.getResultCount()==null) || 
             (this.resultCount!=null &&
              this.resultCount.equals(other.getResultCount()))) &&
            ((this.resultEntries==null && other.getResultEntries()==null) || 
             (this.resultEntries!=null &&
              java.util.Arrays.equals(this.resultEntries, other.getResultEntries()))) &&
            ((this.nationalNumber==null && other.getNationalNumber()==null) || 
             (this.nationalNumber!=null &&
              this.nationalNumber.equals(other.getNationalNumber())));
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
        if (getUniqueIndex() != null) {
            _hashCode += getUniqueIndex().hashCode();
        }
        if (getRankingIndex() != null) {
            _hashCode += getRankingIndex().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getRanking() != null) {
            _hashCode += getRanking().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getClub() != null) {
            _hashCode += getClub().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getMedicalAttestation() != null) {
            _hashCode += getMedicalAttestation().hashCode();
        }
        if (getRankingPointsCount() != null) {
            _hashCode += getRankingPointsCount().hashCode();
        }
        if (getRankingPointsEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRankingPointsEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRankingPointsEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getResultCount() != null) {
            _hashCode += getResultCount().hashCode();
        }
        if (getResultEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNationalNumber() != null) {
            _hashCode += getNationalNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemberEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MemberEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "UniqueIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rankingIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ranking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Ranking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("club");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Club"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "BirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicalAttestation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MedicalAttestation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rankingPointsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingPointsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rankingPointsEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingPointsEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingPointEntryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PhoneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ResultEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PlayerResultEntryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "NationalNumber"));
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
