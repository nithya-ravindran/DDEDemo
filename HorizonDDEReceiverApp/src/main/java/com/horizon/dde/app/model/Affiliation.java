
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
    "status",
    "type",
    "name",
    "providerId",
    "npi",
    "taxId",
    "horizonId",
    "role",
    "endpoint",
    "period"
})
public class Affiliation implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("providerId")
    private String providerId;
    @JsonProperty("npi")
    private String npi;
    @JsonProperty("taxId")
    private String taxId;
    @JsonProperty("horizonId")
    private String horizonId;
    @JsonProperty("role")
    private String role;
    @JsonProperty("endpoint")
    private String endpoint;
    @JsonProperty("period")
    @Valid
    private Period_____ period;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7877733872147897325L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Affiliation() {
    }

    /**
     * 
     * @param id
     * @param taxId
     * @param status
     * @param horizonId
     * @param npi
     * @param name
     * @param role
     * @param providerId
     * @param period
     * @param type
     * @param endpoint
     */
    public Affiliation(String id, String status, String type, String name, String providerId, String npi, String taxId, String horizonId, String role, String endpoint, Period_____ period) {
        super();
        this.id = id;
        this.status = status;
        this.type = type;
        this.name = name;
        this.providerId = providerId;
        this.npi = npi;
        this.taxId = taxId;
        this.horizonId = horizonId;
        this.role = role;
        this.endpoint = endpoint;
        this.period = period;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("providerId")
    public String getProviderId() {
        return providerId;
    }

    @JsonProperty("providerId")
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @JsonProperty("npi")
    public String getNpi() {
        return npi;
    }

    @JsonProperty("npi")
    public void setNpi(String npi) {
        this.npi = npi;
    }

    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @JsonProperty("horizonId")
    public String getHorizonId() {
        return horizonId;
    }

    @JsonProperty("horizonId")
    public void setHorizonId(String horizonId) {
        this.horizonId = horizonId;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonProperty("period")
    public Period_____ getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period_____ period) {
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
        return new ToStringBuilder(this).append("id", id).append("status", status).append("type", type).append("name", name).append("providerId", providerId).append("npi", npi).append("taxId", taxId).append("horizonId", horizonId).append("role", role).append("endpoint", endpoint).append("period", period).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(horizonId).append(npi).append(period).append(type).append(endpoint).append(id).append(taxId).append(additionalProperties).append(name).append(role).append(providerId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Affiliation) == false) {
            return false;
        }
        Affiliation rhs = ((Affiliation) other);
        return new EqualsBuilder().append(status, rhs.status).append(horizonId, rhs.horizonId).append(npi, rhs.npi).append(period, rhs.period).append(type, rhs.type).append(endpoint, rhs.endpoint).append(id, rhs.id).append(taxId, rhs.taxId).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(role, rhs.role).append(providerId, rhs.providerId).isEquals();
    }

}
