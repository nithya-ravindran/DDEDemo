
package com.horizon.dde.app.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "organizationName",
    "type",
    "identifiers"
})
public class PartOf implements Serializable
{

    @JsonProperty("organizationName")
    private String organizationName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("identifiers")
    @Valid
    private List<Identifier_> identifiers = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4523227170013018358L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PartOf() {
    }

    /**
     * 
     * @param identifiers
     * @param organizationName
     * @param type
     */
    public PartOf(String organizationName, String type, List<Identifier_> identifiers) {
        super();
        this.organizationName = organizationName;
        this.type = type;
        this.identifiers = identifiers;
    }

    @JsonProperty("organizationName")
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty("organizationName")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("identifiers")
    public List<Identifier_> getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("identifiers")
    public void setIdentifiers(List<Identifier_> identifiers) {
        this.identifiers = identifiers;
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
        return new ToStringBuilder(this).append("organizationName", organizationName).append("type", type).append("identifiers", identifiers).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(identifiers).append(organizationName).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartOf) == false) {
            return false;
        }
        PartOf rhs = ((PartOf) other);
        return new EqualsBuilder().append(identifiers, rhs.identifiers).append(organizationName, rhs.organizationName).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
