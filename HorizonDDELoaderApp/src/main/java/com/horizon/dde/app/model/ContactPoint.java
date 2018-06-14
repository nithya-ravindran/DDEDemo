
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
    "isPrimary",
    "code",
    "usageType",
    "value",
    "period"
})
public class ContactPoint implements Serializable
{

    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("code")
    private String code;
    @JsonProperty("usageType")
    private String usageType;
    @JsonProperty("value")
    private String value;
    @JsonProperty("period")
    @Valid
    private Period___ period;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 976746379865307987L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContactPoint() {
    }

    /**
     * 
     * @param isPrimary
     * @param value
     * @param usageType
     * @param code
     * @param period
     */
    public ContactPoint(Boolean isPrimary, String code, String usageType, String value, Period___ period) {
        super();
        this.isPrimary = isPrimary;
        this.code = code;
        this.usageType = usageType;
        this.value = value;
        this.period = period;
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

    @JsonProperty("usageType")
    public String getUsageType() {
        return usageType;
    }

    @JsonProperty("usageType")
    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("period")
    public Period___ getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period___ period) {
        this.period = period;
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
        return new ToStringBuilder(this).append("isPrimary", isPrimary).append("code", code).append("usageType", usageType).append("value", value).append("period", period).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isPrimary).append(additionalProperties).append(value).append(usageType).append(code).append(period).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactPoint) == false) {
            return false;
        }
        ContactPoint rhs = ((ContactPoint) other);
        return new EqualsBuilder().append(isPrimary, rhs.isPrimary).append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(usageType, rhs.usageType).append(code, rhs.code).append(period, rhs.period).isEquals();
    }

}