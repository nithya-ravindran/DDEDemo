
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
    "status",
    "genderLimitation",
    "minimumAgeLimit",
    "maximumAgeLimit",
    "notes",
    "startDate",
    "endDate"
})
public class Panel implements Serializable
{

    @JsonProperty("code")
    private String code;
    @JsonProperty("status")
    private String status;
    @JsonProperty("genderLimitation")
    private String genderLimitation;
    @JsonProperty("minimumAgeLimit")
    private String minimumAgeLimit;
    @JsonProperty("maximumAgeLimit")
    private String maximumAgeLimit;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7094063246944604500L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Panel() {
    }

    /**
     * 
     * @param startDate
     * @param maximumAgeLimit
     * @param status
     * @param endDate
     * @param genderLimitation
     * @param code
     * @param notes
     * @param minimumAgeLimit
     */
    public Panel(String code, String status, String genderLimitation, String minimumAgeLimit, String maximumAgeLimit, String notes, String startDate, String endDate) {
        super();
        this.code = code;
        this.status = status;
        this.genderLimitation = genderLimitation;
        this.minimumAgeLimit = minimumAgeLimit;
        this.maximumAgeLimit = maximumAgeLimit;
        this.notes = notes;
        this.startDate = startDate;
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("genderLimitation")
    public String getGenderLimitation() {
        return genderLimitation;
    }

    @JsonProperty("genderLimitation")
    public void setGenderLimitation(String genderLimitation) {
        this.genderLimitation = genderLimitation;
    }

    @JsonProperty("minimumAgeLimit")
    public String getMinimumAgeLimit() {
        return minimumAgeLimit;
    }

    @JsonProperty("minimumAgeLimit")
    public void setMinimumAgeLimit(String minimumAgeLimit) {
        this.minimumAgeLimit = minimumAgeLimit;
    }

    @JsonProperty("maximumAgeLimit")
    public String getMaximumAgeLimit() {
        return maximumAgeLimit;
    }

    @JsonProperty("maximumAgeLimit")
    public void setMaximumAgeLimit(String maximumAgeLimit) {
        this.maximumAgeLimit = maximumAgeLimit;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
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
        return new ToStringBuilder(this).append("code", code).append("status", status).append("genderLimitation", genderLimitation).append("minimumAgeLimit", minimumAgeLimit).append("maximumAgeLimit", maximumAgeLimit).append("notes", notes).append("startDate", startDate).append("endDate", endDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startDate).append(maximumAgeLimit).append(status).append(additionalProperties).append(endDate).append(genderLimitation).append(code).append(notes).append(minimumAgeLimit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Panel) == false) {
            return false;
        }
        Panel rhs = ((Panel) other);
        return new EqualsBuilder().append(startDate, rhs.startDate).append(maximumAgeLimit, rhs.maximumAgeLimit).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).append(endDate, rhs.endDate).append(genderLimitation, rhs.genderLimitation).append(code, rhs.code).append(notes, rhs.notes).append(minimumAgeLimit, rhs.minimumAgeLimit).isEquals();
    }

}
