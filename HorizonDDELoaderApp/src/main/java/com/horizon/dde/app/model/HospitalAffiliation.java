
package com.horizon.dde.app.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hospitalId",
    "hospitalName",
    "taxId",
    "medicareNum",
    "horizonId",
    "npi",
    "role",
    "endpoints",
    "affiliationStartDate",
    "affiliationEndDate",
    "status"
})
public class HospitalAffiliation implements Serializable
{

    @JsonProperty("hospitalId")
    private String hospitalId;
    @JsonProperty("hospitalName")
    private String hospitalName;
    @JsonProperty("taxId")
    private String taxId;
    @JsonProperty("medicareNum")
    private String medicareNum;
    @JsonProperty("horizonId")
    private String horizonId;
    @JsonProperty("npi")
    private String npi;
    @JsonProperty("role")
    private String role;
    @JsonProperty("endpoints")
    private String endpoints;
    @JsonProperty("affiliationStartDate")
    private String affiliationStartDate;
    @JsonProperty("affiliationEndDate")
    private String affiliationEndDate;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 682382408464460255L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HospitalAffiliation() {
    }

    /**
     * 
     * @param affiliationEndDate
     * @param status
     * @param taxId
     * @param endpoints
     * @param npi
     * @param horizonId
     * @param hospitalName
     * @param role
     * @param hospitalId
     * @param affiliationStartDate
     * @param medicareNum
     */
    public HospitalAffiliation(String hospitalId, String hospitalName, String taxId, String medicareNum, String horizonId, String npi, String role, String endpoints, String affiliationStartDate, String affiliationEndDate, String status) {
        super();
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.taxId = taxId;
        this.medicareNum = medicareNum;
        this.horizonId = horizonId;
        this.npi = npi;
        this.role = role;
        this.endpoints = endpoints;
        this.affiliationStartDate = affiliationStartDate;
        this.affiliationEndDate = affiliationEndDate;
        this.status = status;
    }

    @JsonProperty("hospitalId")
    public String getHospitalId() {
        return hospitalId;
    }

    @JsonProperty("hospitalId")
    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    @JsonProperty("hospitalName")
    public String getHospitalName() {
        return hospitalName;
    }

    @JsonProperty("hospitalName")
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @JsonProperty("medicareNum")
    public String getMedicareNum() {
        return medicareNum;
    }

    @JsonProperty("medicareNum")
    public void setMedicareNum(String medicareNum) {
        this.medicareNum = medicareNum;
    }

    @JsonProperty("horizonId")
    public String getHorizonId() {
        return horizonId;
    }

    @JsonProperty("horizonId")
    public void setHorizonId(String horizonId) {
        this.horizonId = horizonId;
    }

    @JsonProperty("npi")
    public String getNpi() {
        return npi;
    }

    @JsonProperty("npi")
    public void setNpi(String npi) {
        this.npi = npi;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("endpoints")
    public String getEndpoints() {
        return endpoints;
    }

    @JsonProperty("endpoints")
    public void setEndpoints(String endpoints) {
        this.endpoints = endpoints;
    }

    @JsonProperty("affiliationStartDate")
    public String getAffiliationStartDate() {
        return affiliationStartDate;
    }

    @JsonProperty("affiliationStartDate")
    public void setAffiliationStartDate(String affiliationStartDate) {
        this.affiliationStartDate = affiliationStartDate;
    }

    @JsonProperty("affiliationEndDate")
    public String getAffiliationEndDate() {
        return affiliationEndDate;
    }

    @JsonProperty("affiliationEndDate")
    public void setAffiliationEndDate(String affiliationEndDate) {
        this.affiliationEndDate = affiliationEndDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hospitalId", hospitalId).append("hospitalName", hospitalName).append("taxId", taxId).append("medicareNum", medicareNum).append("horizonId", horizonId).append("npi", npi).append("role", role).append("endpoints", endpoints).append("affiliationStartDate", affiliationStartDate).append("affiliationEndDate", affiliationEndDate).append("status", status).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(endpoints).append(npi).append(horizonId).append(hospitalId).append(affiliationStartDate).append(affiliationEndDate).append(taxId).append(additionalProperties).append(hospitalName).append(role).append(medicareNum).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HospitalAffiliation) == false) {
            return false;
        }
        HospitalAffiliation rhs = ((HospitalAffiliation) other);
        return new EqualsBuilder().append(status, rhs.status).append(endpoints, rhs.endpoints).append(npi, rhs.npi).append(horizonId, rhs.horizonId).append(hospitalId, rhs.hospitalId).append(affiliationStartDate, rhs.affiliationStartDate).append(affiliationEndDate, rhs.affiliationEndDate).append(taxId, rhs.taxId).append(additionalProperties, rhs.additionalProperties).append(hospitalName, rhs.hospitalName).append(role, rhs.role).append(medicareNum, rhs.medicareNum).isEquals();
    }

}
