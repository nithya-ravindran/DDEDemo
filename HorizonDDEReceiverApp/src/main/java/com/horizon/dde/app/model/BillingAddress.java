
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
    "id",
    "type",
    "isPrimary",
    "addressLine1",
    "addressLine2",
    "city",
    "county",
    "state",
    "zipCode",
    "zipPlus4",
    "mailabilityScore"
})
public class BillingAddress implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("addressLine2")
    private String addressLine2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("county")
    private String county;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("zipPlus4")
    private String zipPlus4;
    @JsonProperty("mailabilityScore")
    private String mailabilityScore;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4234532255322483909L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BillingAddress() {
    }

    /**
     * 
     * @param zipPlus4
     * @param id
     * @param isPrimary
     * @param mailabilityScore
     * @param county
     * @param zipCode
     * @param state
     * @param type
     * @param addressLine2
     * @param addressLine1
     * @param city
     */
    public BillingAddress(String id, String type, Boolean isPrimary, String addressLine1, String addressLine2, String city, String county, String state, String zipCode, String zipPlus4, String mailabilityScore) {
        super();
        this.id = id;
        this.type = type;
        this.isPrimary = isPrimary;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.zipPlus4 = zipPlus4;
        this.mailabilityScore = mailabilityScore;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("zipPlus4")
    public String getZipPlus4() {
        return zipPlus4;
    }

    @JsonProperty("zipPlus4")
    public void setZipPlus4(String zipPlus4) {
        this.zipPlus4 = zipPlus4;
    }

    @JsonProperty("mailabilityScore")
    public String getMailabilityScore() {
        return mailabilityScore;
    }

    @JsonProperty("mailabilityScore")
    public void setMailabilityScore(String mailabilityScore) {
        this.mailabilityScore = mailabilityScore;
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
        return new ToStringBuilder(this).append("id", id).append("type", type).append("isPrimary", isPrimary).append("addressLine1", addressLine1).append("addressLine2", addressLine2).append("city", city).append("county", county).append("state", state).append("zipCode", zipCode).append("zipPlus4", zipPlus4).append("mailabilityScore", mailabilityScore).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isPrimary).append(mailabilityScore).append(state).append(type).append(addressLine2).append(addressLine1).append(city).append(zipPlus4).append(id).append(county).append(additionalProperties).append(zipCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingAddress) == false) {
            return false;
        }
        BillingAddress rhs = ((BillingAddress) other);
        return new EqualsBuilder().append(isPrimary, rhs.isPrimary).append(mailabilityScore, rhs.mailabilityScore).append(state, rhs.state).append(type, rhs.type).append(addressLine2, rhs.addressLine2).append(addressLine1, rhs.addressLine1).append(city, rhs.city).append(zipPlus4, rhs.zipPlus4).append(id, rhs.id).append(county, rhs.county).append(additionalProperties, rhs.additionalProperties).append(zipCode, rhs.zipCode).isEquals();
    }

}
