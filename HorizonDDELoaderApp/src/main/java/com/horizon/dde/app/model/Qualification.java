
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
    "type",
    "school",
    "graduationYear",
    "period"
})
public class Qualification implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("school")
    private String school;
    @JsonProperty("graduationYear")
    private String graduationYear;
    @JsonProperty("period")
    @Valid
    private Period period;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8459416596884528233L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Qualification() {
    }

    /**
     * 
     * @param school
     * @param graduationYear
     * @param period
     * @param type
     */
    public Qualification(String type, String school, String graduationYear, Period period) {
        super();
        this.type = type;
        this.school = school;
        this.graduationYear = graduationYear;
        this.period = period;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("school")
    public String getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(String school) {
        this.school = school;
    }

    @JsonProperty("graduationYear")
    public String getGraduationYear() {
        return graduationYear;
    }

    @JsonProperty("graduationYear")
    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period period) {
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
        return new ToStringBuilder(this).append("type", type).append("school", school).append("graduationYear", graduationYear).append("period", period).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(school).append(additionalProperties).append(graduationYear).append(period).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Qualification) == false) {
            return false;
        }
        Qualification rhs = ((Qualification) other);
        return new EqualsBuilder().append(school, rhs.school).append(additionalProperties, rhs.additionalProperties).append(graduationYear, rhs.graduationYear).append(period, rhs.period).append(type, rhs.type).isEquals();
    }

}
