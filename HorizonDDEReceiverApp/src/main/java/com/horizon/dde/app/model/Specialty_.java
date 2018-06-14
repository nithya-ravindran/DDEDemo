
package com.horizon.dde.app.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "isPrimary",
    "code",
    "name",
    "displayName",
    "hznStandardCode",
    "hznStandardName",
    "taxonomyCode",
    "taxonomySpecialtyName",
    "taxonomyClassification",
    "taxonomyProviderType",
    "period",
    "boardCertifications",
    "isBoardCertified"
})
public class Specialty_ implements Serializable
{

    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("hznStandardCode")
    private String hznStandardCode;
    @JsonProperty("hznStandardName")
    private String hznStandardName;
    @JsonProperty("taxonomyCode")
    private String taxonomyCode;
    @JsonProperty("taxonomySpecialtyName")
    private String taxonomySpecialtyName;
    @JsonProperty("taxonomyClassification")
    private String taxonomyClassification;
    @JsonProperty("taxonomyProviderType")
    private String taxonomyProviderType;
    @JsonProperty("period")
    @Valid
    private Period____ period;
    @JsonProperty("boardCertifications")
    @Valid
    private List<String> boardCertifications = null;
    @JsonProperty("isBoardCertified")
    private Boolean isBoardCertified;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5526784409177673153L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Specialty_() {
    }

    /**
     * 
     * @param hznStandardName
     * @param isPrimary
     * @param taxonomyProviderType
     * @param hznStandardCode
     * @param name
     * @param taxonomySpecialtyName
     * @param isBoardCertified
     * @param code
     * @param boardCertifications
     * @param period
     * @param taxonomyCode
     * @param displayName
     * @param taxonomyClassification
     */
    public Specialty_(Boolean isPrimary, String code, String name, String displayName, String hznStandardCode, String hznStandardName, String taxonomyCode, String taxonomySpecialtyName, String taxonomyClassification, String taxonomyProviderType, Period____ period, List<String> boardCertifications, Boolean isBoardCertified) {
        super();
        this.isPrimary = isPrimary;
        this.code = code;
        this.name = name;
        this.displayName = displayName;
        this.hznStandardCode = hznStandardCode;
        this.hznStandardName = hznStandardName;
        this.taxonomyCode = taxonomyCode;
        this.taxonomySpecialtyName = taxonomySpecialtyName;
        this.taxonomyClassification = taxonomyClassification;
        this.taxonomyProviderType = taxonomyProviderType;
        this.period = period;
        this.boardCertifications = boardCertifications;
        this.isBoardCertified = isBoardCertified;
    }

    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("hznStandardCode")
    public String getHznStandardCode() {
        return hznStandardCode;
    }

    @JsonProperty("hznStandardCode")
    public void setHznStandardCode(String hznStandardCode) {
        this.hznStandardCode = hznStandardCode;
    }

    @JsonProperty("hznStandardName")
    public String getHznStandardName() {
        return hznStandardName;
    }

    @JsonProperty("hznStandardName")
    public void setHznStandardName(String hznStandardName) {
        this.hznStandardName = hznStandardName;
    }

    @JsonProperty("taxonomyCode")
    public String getTaxonomyCode() {
        return taxonomyCode;
    }

    @JsonProperty("taxonomyCode")
    public void setTaxonomyCode(String taxonomyCode) {
        this.taxonomyCode = taxonomyCode;
    }

    @JsonProperty("taxonomySpecialtyName")
    public String getTaxonomySpecialtyName() {
        return taxonomySpecialtyName;
    }

    @JsonProperty("taxonomySpecialtyName")
    public void setTaxonomySpecialtyName(String taxonomySpecialtyName) {
        this.taxonomySpecialtyName = taxonomySpecialtyName;
    }

    @JsonProperty("taxonomyClassification")
    public String getTaxonomyClassification() {
        return taxonomyClassification;
    }

    @JsonProperty("taxonomyClassification")
    public void setTaxonomyClassification(String taxonomyClassification) {
        this.taxonomyClassification = taxonomyClassification;
    }

    @JsonProperty("taxonomyProviderType")
    public String getTaxonomyProviderType() {
        return taxonomyProviderType;
    }

    @JsonProperty("taxonomyProviderType")
    public void setTaxonomyProviderType(String taxonomyProviderType) {
        this.taxonomyProviderType = taxonomyProviderType;
    }

    @JsonProperty("period")
    public Period____ getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period____ period) {
        this.period = period;
    }

    @JsonProperty("boardCertifications")
    public List<String> getBoardCertifications() {
        return boardCertifications;
    }

    @JsonProperty("boardCertifications")
    public void setBoardCertifications(List<String> boardCertifications) {
        this.boardCertifications = boardCertifications;
    }

    @JsonProperty("isBoardCertified")
    public Boolean getIsBoardCertified() {
        return isBoardCertified;
    }

    @JsonProperty("isBoardCertified")
    public void setIsBoardCertified(Boolean isBoardCertified) {
        this.isBoardCertified = isBoardCertified;
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
        return new ToStringBuilder(this).append("isPrimary", isPrimary).append("code", code).append("name", name).append("displayName", displayName).append("hznStandardCode", hznStandardCode).append("hznStandardName", hznStandardName).append("taxonomyCode", taxonomyCode).append("taxonomySpecialtyName", taxonomySpecialtyName).append("taxonomyClassification", taxonomyClassification).append("taxonomyProviderType", taxonomyProviderType).append("period", period).append("boardCertifications", boardCertifications).append("isBoardCertified", isBoardCertified).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hznStandardName).append(isPrimary).append(hznStandardCode).append(code).append(boardCertifications).append(period).append(taxonomyProviderType).append(additionalProperties).append(name).append(taxonomySpecialtyName).append(isBoardCertified).append(taxonomyCode).append(displayName).append(taxonomyClassification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Specialty_) == false) {
            return false;
        }
        Specialty_ rhs = ((Specialty_) other);
        return new EqualsBuilder().append(hznStandardName, rhs.hznStandardName).append(isPrimary, rhs.isPrimary).append(hznStandardCode, rhs.hznStandardCode).append(code, rhs.code).append(boardCertifications, rhs.boardCertifications).append(period, rhs.period).append(taxonomyProviderType, rhs.taxonomyProviderType).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(taxonomySpecialtyName, rhs.taxonomySpecialtyName).append(isBoardCertified, rhs.isBoardCertified).append(taxonomyCode, rhs.taxonomyCode).append(displayName, rhs.displayName).append(taxonomyClassification, rhs.taxonomyClassification).isEquals();
    }

}
