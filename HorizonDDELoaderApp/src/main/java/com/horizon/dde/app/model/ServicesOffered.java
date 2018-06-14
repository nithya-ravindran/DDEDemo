
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
    "typeOfService",
    "value",
    "period"
})
public class ServicesOffered implements Serializable
{

    @JsonProperty("typeOfService")
    private String typeOfService;
    @JsonProperty("value")
    private String value;
    @JsonProperty("period")
    @Valid
    private Period______ period;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 231575111573058621L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServicesOffered() {
    }

    /**
     * 
     * @param value
     * @param typeOfService
     * @param period
     */
    public ServicesOffered(String typeOfService, String value, Period______ period) {
        super();
        this.typeOfService = typeOfService;
        this.value = value;
        this.period = period;
    }

    @JsonProperty("typeOfService")
    public String getTypeOfService() {
        return typeOfService;
    }

    @JsonProperty("typeOfService")
    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
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
    public Period______ getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period______ period) {
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
        return new ToStringBuilder(this).append("typeOfService", typeOfService).append("value", value).append("period", period).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(value).append(typeOfService).append(period).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServicesOffered) == false) {
            return false;
        }
        ServicesOffered rhs = ((ServicesOffered) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(typeOfService, rhs.typeOfService).append(period, rhs.period).isEquals();
    }

}
