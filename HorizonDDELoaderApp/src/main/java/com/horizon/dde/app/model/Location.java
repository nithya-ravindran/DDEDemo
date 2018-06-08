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
@JsonPropertyOrder({ "lon", "lat" })
public class Location implements Serializable {

	@JsonProperty("lon")
	private String lon;
	@JsonProperty("lat")
	private String lat;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 4742966388242940987L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Location() {
	}

	/**
	 * 
	 * @param lon
	 * @param lat
	 */
	public Location(String lon, String lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}

	@JsonProperty("lon")
	public String getLon() {
		return lon;
	}

	@JsonProperty("lon")
	public void setLon(String lon) {
		this.lon = lon;
	}

	@JsonProperty("lat")
	public String getLat() {
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(String lat) {
		this.lat = lat;
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
		return (new ToStringBuilder(this)).append("lon", lon).append("lat", lat)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(lon).append(additionalProperties).append(lat).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Location) == false) {
			return false;
		}
		Location rhs = ((Location) other);
		return new EqualsBuilder().append(lon, rhs.lon).append(additionalProperties, rhs.additionalProperties)
				.append(lat, rhs.lat).isEquals();
	}

}