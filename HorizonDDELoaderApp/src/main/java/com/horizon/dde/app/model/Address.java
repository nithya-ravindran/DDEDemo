
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
    "addressLine1",
    "addressLine2",
    "cityCode",
    "city",
    "countyCode",
    "county",
    "state",
    "zipCode",
    "zipPlus4",
    "countryCode",
    "country",
    "geoLocation",
    "mailabilityScore",
    "isContiguousCounty",
    "isOutOfState",
    "isAddressStandardized",
    "addressValidationScore"
})
public class Address implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("addressLine2")
    private String addressLine2;
    @JsonProperty("cityCode")
    private String cityCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("countyCode")
    private String countyCode;
    @JsonProperty("county")
    private String county;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("zipPlus4")
    private String zipPlus4;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("geoLocation")
    @Valid
    private GeoLocation geoLocation;
    @JsonProperty("mailabilityScore")
    private String mailabilityScore;
    @JsonProperty("isContiguousCounty")
    private String isContiguousCounty;
    @JsonProperty("isOutOfState")
    private String isOutOfState;
    @JsonProperty("isAddressStandardized")
    private Boolean isAddressStandardized;
    @JsonProperty("addressValidationScore")
    private String addressValidationScore;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8124127351998754105L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param isAddressStandardized
     * @param mailabilityScore
     * @param isOutOfState
     * @param addressValidationScore
     * @param geoLocation
     * @param cityCode
     * @param state
     * @param countryCode
     * @param type
     * @param addressLine2
     * @param countyCode
     * @param addressLine1
     * @param city
     * @param country
     * @param zipPlus4
     * @param county
     * @param zipCode
     * @param isContiguousCounty
     */
    public Address(String type, String addressLine1, String addressLine2, String cityCode, String city, String countyCode, String county, String state, String zipCode, String zipPlus4, String countryCode, String country, GeoLocation geoLocation, String mailabilityScore, String isContiguousCounty, String isOutOfState, Boolean isAddressStandardized, String addressValidationScore) {
        super();
        this.type = type;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.cityCode = cityCode;
        this.city = city;
        this.countyCode = countyCode;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.zipPlus4 = zipPlus4;
        this.countryCode = countryCode;
        this.country = country;
        this.geoLocation = geoLocation;
        this.mailabilityScore = mailabilityScore;
        this.isContiguousCounty = isContiguousCounty;
        this.isOutOfState = isOutOfState;
        this.isAddressStandardized = isAddressStandardized;
        this.addressValidationScore = addressValidationScore;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("cityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("cityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("countyCode")
    public String getCountyCode() {
        return countyCode;
    }

    @JsonProperty("countyCode")
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("zipPlus4")
    public String getZipPlus4() {
        return zipPlus4;
    }

    @JsonProperty("zipPlus4")
    public void setZipPlus4(String zipPlus4) {
        this.zipPlus4 = zipPlus4;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("geoLocation")
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    @JsonProperty("geoLocation")
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    @JsonProperty("mailabilityScore")
    public String getMailabilityScore() {
        return mailabilityScore;
    }

    @JsonProperty("mailabilityScore")
    public void setMailabilityScore(String mailabilityScore) {
        this.mailabilityScore = mailabilityScore;
    }

    @JsonProperty("isContiguousCounty")
    public String getIsContiguousCounty() {
        return isContiguousCounty;
    }

    @JsonProperty("isContiguousCounty")
    public void setIsContiguousCounty(String isContiguousCounty) {
        this.isContiguousCounty = isContiguousCounty;
    }

    @JsonProperty("isOutOfState")
    public String getIsOutOfState() {
        return isOutOfState;
    }

    @JsonProperty("isOutOfState")
    public void setIsOutOfState(String isOutOfState) {
        this.isOutOfState = isOutOfState;
    }

    @JsonProperty("isAddressStandardized")
    public Boolean getIsAddressStandardized() {
        return isAddressStandardized;
    }

    @JsonProperty("isAddressStandardized")
    public void setIsAddressStandardized(Boolean isAddressStandardized) {
        this.isAddressStandardized = isAddressStandardized;
    }

    @JsonProperty("addressValidationScore")
    public String getAddressValidationScore() {
        return addressValidationScore;
    }

    @JsonProperty("addressValidationScore")
    public void setAddressValidationScore(String addressValidationScore) {
        this.addressValidationScore = addressValidationScore;
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
        return new ToStringBuilder(this).append("type", type).append("addressLine1", addressLine1).append("addressLine2", addressLine2).append("cityCode", cityCode).append("city", city).append("countyCode", countyCode).append("county", county).append("state", state).append("zipCode", zipCode).append("zipPlus4", zipPlus4).append("countryCode", countryCode).append("country", country).append("geoLocation", geoLocation).append("mailabilityScore", mailabilityScore).append("isContiguousCounty", isContiguousCounty).append("isOutOfState", isOutOfState).append("isAddressStandardized", isAddressStandardized).append("addressValidationScore", addressValidationScore).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isAddressStandardized).append(mailabilityScore).append(isOutOfState).append(addressValidationScore).append(geoLocation).append(countryCode).append(state).append(cityCode).append(type).append(countyCode).append(addressLine2).append(addressLine1).append(country).append(city).append(zipPlus4).append(county).append(additionalProperties).append(zipCode).append(isContiguousCounty).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(isAddressStandardized, rhs.isAddressStandardized).append(mailabilityScore, rhs.mailabilityScore).append(isOutOfState, rhs.isOutOfState).append(addressValidationScore, rhs.addressValidationScore).append(geoLocation, rhs.geoLocation).append(countryCode, rhs.countryCode).append(state, rhs.state).append(cityCode, rhs.cityCode).append(type, rhs.type).append(countyCode, rhs.countyCode).append(addressLine2, rhs.addressLine2).append(addressLine1, rhs.addressLine1).append(country, rhs.country).append(city, rhs.city).append(zipPlus4, rhs.zipPlus4).append(county, rhs.county).append(additionalProperties, rhs.additionalProperties).append(zipCode, rhs.zipCode).append(isContiguousCounty, rhs.isContiguousCounty).isEquals();
    }

}
