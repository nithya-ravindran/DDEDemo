
package com.horizon.dde.app.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "providers"
})
public class ProviderModel implements Serializable
{

    @JsonProperty("providers")
    @Valid
    private List<Provider> providers = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1783593089431021135L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProviderModel() {
    }

    /**
     * 
     * @param providers
     */
    public ProviderModel(List<Provider> providers) {
        super();
        this.providers = providers;
    }

    @JsonProperty("providers")
    public List<Provider> getProviders() {
        return providers;
    }

    @JsonProperty("providers")
    public void setProviders(List<Provider> providers) {
        this.providers = providers;
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
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).append("providers", providers).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder().append(providers).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProviderModel) == false) {
            return false;
        }
        ProviderModel rhs = ((ProviderModel) other);
        return new org.apache.commons.lang3.builder.EqualsBuilder().append(providers, rhs.providers).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
