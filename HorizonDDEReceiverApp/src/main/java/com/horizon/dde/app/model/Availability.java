
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
    "timeSlot",
    "dayOfWeek",
    "availableStartTime",
    "availableEndTime"
})
public class Availability implements Serializable
{

    @JsonProperty("timeSlot")
    private String timeSlot;
    @JsonProperty("dayOfWeek")
    private String dayOfWeek;
    @JsonProperty("availableStartTime")
    private String availableStartTime;
    @JsonProperty("availableEndTime")
    private String availableEndTime;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8603340148270100324L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Availability() {
    }

    /**
     * 
     * @param availableEndTime
     * @param availableStartTime
     * @param dayOfWeek
     * @param timeSlot
     */
    public Availability(String timeSlot, String dayOfWeek, String availableStartTime, String availableEndTime) {
        super();
        this.timeSlot = timeSlot;
        this.dayOfWeek = dayOfWeek;
        this.availableStartTime = availableStartTime;
        this.availableEndTime = availableEndTime;
    }

    @JsonProperty("timeSlot")
    public String getTimeSlot() {
        return timeSlot;
    }

    @JsonProperty("timeSlot")
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    @JsonProperty("dayOfWeek")
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @JsonProperty("dayOfWeek")
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @JsonProperty("availableStartTime")
    public String getAvailableStartTime() {
        return availableStartTime;
    }

    @JsonProperty("availableStartTime")
    public void setAvailableStartTime(String availableStartTime) {
        this.availableStartTime = availableStartTime;
    }

    @JsonProperty("availableEndTime")
    public String getAvailableEndTime() {
        return availableEndTime;
    }

    @JsonProperty("availableEndTime")
    public void setAvailableEndTime(String availableEndTime) {
        this.availableEndTime = availableEndTime;
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
        return new ToStringBuilder(this).append("timeSlot", timeSlot).append("dayOfWeek", dayOfWeek).append("availableStartTime", availableStartTime).append("availableEndTime", availableEndTime).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(availableEndTime).append(availableStartTime).append(dayOfWeek).append(timeSlot).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Availability) == false) {
            return false;
        }
        Availability rhs = ((Availability) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(availableEndTime, rhs.availableEndTime).append(availableStartTime, rhs.availableStartTime).append(dayOfWeek, rhs.dayOfWeek).append(timeSlot, rhs.timeSlot).isEquals();
    }

}
