
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
    "identifiers",
    "identificationCode",
    "identificationValue",
    "period"
})
public class Identifier_ implements Serializable
{

    @JsonProperty("identifiers")
    @Valid
    private Identifiers identifiers;
    @JsonProperty("identificationCode")
    private String identificationCode;
    @JsonProperty("identificationValue")
    private String identificationValue;
    @JsonProperty("period")
    @Valid
    private Period_______ period;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4077805332897192471L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Identifier_() {
    }

    /**
     * 
     * @param identificationValue
     * @param identificationCode
     * @param identifiers
     * @param period
     */
    public Identifier_(Identifiers identifiers, String identificationCode, String identificationValue, Period_______ period) {
        super();
        this.identifiers = identifiers;
        this.identificationCode = identificationCode;
        this.identificationValue = identificationValue;
        this.period = period;
    }

    @JsonProperty("identifiers")
    public Identifiers getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("identifiers")
    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("identificationCode")
    public String getIdentificationCode() {
        return identificationCode;
    }

    @JsonProperty("identificationCode")
    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    @JsonProperty("identificationValue")
    public String getIdentificationValue() {
        return identificationValue;
    }

    @JsonProperty("identificationValue")
    public void setIdentificationValue(String identificationValue) {
        this.identificationValue = identificationValue;
    }

    @JsonProperty("period")
    public Period_______ getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period_______ period) {
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
        return new ToStringBuilder(this).append("identifiers", identifiers).append("identificationCode", identificationCode).append("identificationValue", identificationValue).append("period", period).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(identificationValue).append(identificationCode).append(identifiers).append(additionalProperties).append(period).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identifier_) == false) {
            return false;
        }
        Identifier_ rhs = ((Identifier_) other);
        return new EqualsBuilder().append(identificationValue, rhs.identificationValue).append(identificationCode, rhs.identificationCode).append(identifiers, rhs.identifiers).append(additionalProperties, rhs.additionalProperties).append(period, rhs.period).isEquals();
    }

}
