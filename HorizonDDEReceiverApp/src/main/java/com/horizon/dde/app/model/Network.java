
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
    "code",
    "description",
    "parStatus",
    "effectiveDate",
    "endDate"
})
public class Network implements Serializable
{

    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("parStatus")
    private String parStatus;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7291381435400089705L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Network() {
    }

    /**
     * 
     * @param parStatus
     * @param description
     * @param endDate
     * @param code
     * @param effectiveDate
     */
    public Network(String code, String description, String parStatus, String effectiveDate, String endDate) {
        super();
        this.code = code;
        this.description = description;
        this.parStatus = parStatus;
        this.effectiveDate = effectiveDate;
        this.endDate = endDate;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("parStatus")
    public String getParStatus() {
        return parStatus;
    }

    @JsonProperty("parStatus")
    public void setParStatus(String parStatus) {
        this.parStatus = parStatus;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
        return new ToStringBuilder(this).append("code", code).append("description", description).append("parStatus", parStatus).append("effectiveDate", effectiveDate).append("endDate", endDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parStatus).append(additionalProperties).append(description).append(endDate).append(code).append(effectiveDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Network) == false) {
            return false;
        }
        Network rhs = ((Network) other);
        return new EqualsBuilder().append(parStatus, rhs.parStatus).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(endDate, rhs.endDate).append(code, rhs.code).append(effectiveDate, rhs.effectiveDate).isEquals();
    }

}
