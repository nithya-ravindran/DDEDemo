
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
    "tierName",
    "tierValue",
    "tierStartDate",
    "tierEndDate"
})
public class TierIndicators implements Serializable
{

    @JsonProperty("tierName")
    private String tierName;
    @JsonProperty("tierValue")
    private String tierValue;
    @JsonProperty("tierStartDate")
    private String tierStartDate;
    @JsonProperty("tierEndDate")
    private String tierEndDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5259590791158105136L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TierIndicators() {
    }

    /**
     * 
     * @param tierEndDate
     * @param tierStartDate
     * @param tierValue
     * @param tierName
     */
    public TierIndicators(String tierName, String tierValue, String tierStartDate, String tierEndDate) {
        super();
        this.tierName = tierName;
        this.tierValue = tierValue;
        this.tierStartDate = tierStartDate;
        this.tierEndDate = tierEndDate;
    }

    @JsonProperty("tierName")
    public String getTierName() {
        return tierName;
    }

    @JsonProperty("tierName")
    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    @JsonProperty("tierValue")
    public String getTierValue() {
        return tierValue;
    }

    @JsonProperty("tierValue")
    public void setTierValue(String tierValue) {
        this.tierValue = tierValue;
    }

    @JsonProperty("tierStartDate")
    public String getTierStartDate() {
        return tierStartDate;
    }

    @JsonProperty("tierStartDate")
    public void setTierStartDate(String tierStartDate) {
        this.tierStartDate = tierStartDate;
    }

    @JsonProperty("tierEndDate")
    public String getTierEndDate() {
        return tierEndDate;
    }

    @JsonProperty("tierEndDate")
    public void setTierEndDate(String tierEndDate) {
        this.tierEndDate = tierEndDate;
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
        return new ToStringBuilder(this).append("tierName", tierName).append("tierValue", tierValue).append("tierStartDate", tierStartDate).append("tierEndDate", tierEndDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tierEndDate).append(additionalProperties).append(tierStartDate).append(tierValue).append(tierName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TierIndicators) == false) {
            return false;
        }
        TierIndicators rhs = ((TierIndicators) other);
        return new EqualsBuilder().append(tierEndDate, rhs.tierEndDate).append(additionalProperties, rhs.additionalProperties).append(tierStartDate, rhs.tierStartDate).append(tierValue, rhs.tierValue).append(tierName, rhs.tierName).isEquals();
    }

}
