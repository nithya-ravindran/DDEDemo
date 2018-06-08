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
@JsonPropertyOrder({ "address1", "address2", "bid", "city", "county", "degree", "etin", "firstname", "gender",
		"group_name", "language", "lastname", "location", "mi", "name", "nationalproviderid", "network", "officehours",
		"omt1", "phone", "practice_status", "provider_role", "providertype", "rwjb_tier", "specialties", "state",
		"zipcode" })
public class ProviderModel implements Serializable {

	@JsonProperty("address1")
	private String address1;
	@JsonProperty("address2")
	private String address2;
	@JsonProperty("bid")
	private String bid;
	@JsonProperty("city")
	private String city;
	@JsonProperty("county")
	private String county;
	@JsonProperty("degree")
	private String degree;
	@JsonProperty("etin")
	private String etin;
	@JsonProperty("firstname")
	private String firstname;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("group_name")
	private String groupName;
	@JsonProperty("language")
	private String language;
	@JsonProperty("lastname")
	private String lastname;
	@JsonProperty("location")
	@Valid
	private Location location;
	@JsonProperty("mi")
	private String mi;
	@JsonProperty("name")
	private String name;
	@JsonProperty("nationalproviderid")
	private String nationalproviderid;
	@JsonProperty("network")
	@Valid
	private List<String> network = null;
	@JsonProperty("officehours")
	private String officehours;
	@JsonProperty("omt1")
	private Boolean omt1;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("practice_status")
	private Integer practiceStatus;
	@JsonProperty("provider_role")
	private Integer providerRole;
	@JsonProperty("providertype")
	private String providertype;
	@JsonProperty("rwjb_tier")
	private Integer rwjbTier;
	@JsonProperty("specialties")
	@Valid
	private List<String> specialties = null;
	@JsonProperty("state")
	private String state;
	@JsonProperty("zipcode")
	private String zipcode;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 2545262620885680756L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ProviderModel() {
	}

	/**
	 * 
	 * @param groupName
	 * @param phone
	 * @param location
	 * @param state
	 * @param lastname
	 * @param address1
	 * @param address2
	 * @param network
	 * @param city
	 * @param specialties
	 * @param name
	 * @param gender
	 * @param omt1
	 * @param bid
	 * @param mi
	 * @param zipcode
	 * @param firstname
	 * @param nationalproviderid
	 * @param officehours
	 * @param etin
	 * @param degree
	 * @param rwjbTier
	 * @param county
	 * @param providerRole
	 * @param providertype
	 * @param language
	 * @param practiceStatus
	 */
	public ProviderModel(String address1, String address2, String bid, String city, String county, String degree,
			String etin, String firstname, String gender, String groupName, String language, String lastname,
			Location location, String mi, String name, String nationalproviderid, List<String> network,
			String officehours, Boolean omt1, String phone, Integer practiceStatus, Integer providerRole,
			String providertype, Integer rwjbTier, List<String> specialties, String state, String zipcode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.bid = bid;
		this.city = city;
		this.county = county;
		this.degree = degree;
		this.etin = etin;
		this.firstname = firstname;
		this.gender = gender;
		this.groupName = groupName;
		this.language = language;
		this.lastname = lastname;
		this.location = location;
		this.mi = mi;
		this.name = name;
		this.nationalproviderid = nationalproviderid;
		this.network = network;
		this.officehours = officehours;
		this.omt1 = omt1;
		this.phone = phone;
		this.practiceStatus = practiceStatus;
		this.providerRole = providerRole;
		this.providertype = providertype;
		this.rwjbTier = rwjbTier;
		this.specialties = specialties;
		this.state = state;
		this.zipcode = zipcode;
	}

	@JsonProperty("address1")
	public String getAddress1() {
		return address1;
	}

	@JsonProperty("address1")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@JsonProperty("address2")
	public String getAddress2() {
		return address2;
	}

	@JsonProperty("address2")
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@JsonProperty("bid")
	public String getBid() {
		return bid;
	}

	@JsonProperty("bid")
	public void setBid(String bid) {
		this.bid = bid;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("county")
	public String getCounty() {
		return county;
	}

	@JsonProperty("county")
	public void setCounty(String county) {
		this.county = county;
	}

	@JsonProperty("degree")
	public String getDegree() {
		return degree;
	}

	@JsonProperty("degree")
	public void setDegree(String degree) {
		this.degree = degree;
	}

	@JsonProperty("etin")
	public String getEtin() {
		return etin;
	}

	@JsonProperty("etin")
	public void setEtin(String etin) {
		this.etin = etin;
	}

	@JsonProperty("firstname")
	public String getFirstname() {
		return firstname;
	}

	@JsonProperty("firstname")
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("group_name")
	public String getGroupName() {
		return groupName;
	}

	@JsonProperty("group_name")
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}

	@JsonProperty("lastname")
	public String getLastname() {
		return lastname;
	}

	@JsonProperty("lastname")
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@JsonProperty("location")
	public Location getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(Location location) {
		this.location = location;
	}

	@JsonProperty("mi")
	public String getMi() {
		return mi;
	}

	@JsonProperty("mi")
	public void setMi(String mi) {
		this.mi = mi;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("nationalproviderid")
	public String getNationalproviderid() {
		return nationalproviderid;
	}

	@JsonProperty("nationalproviderid")
	public void setNationalproviderid(String nationalproviderid) {
		this.nationalproviderid = nationalproviderid;
	}

	@JsonProperty("network")
	public List<String> getNetwork() {
		return network;
	}

	@JsonProperty("network")
	public void setNetwork(List<String> network) {
		this.network = network;
	}

	@JsonProperty("officehours")
	public String getOfficehours() {
		return officehours;
	}

	@JsonProperty("officehours")
	public void setOfficehours(String officehours) {
		this.officehours = officehours;
	}

	@JsonProperty("omt1")
	public Boolean getOmt1() {
		return omt1;
	}

	@JsonProperty("omt1")
	public void setOmt1(Boolean omt1) {
		this.omt1 = omt1;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("practice_status")
	public Integer getPracticeStatus() {
		return practiceStatus;
	}

	@JsonProperty("practice_status")
	public void setPracticeStatus(Integer practiceStatus) {
		this.practiceStatus = practiceStatus;
	}

	@JsonProperty("provider_role")
	public Integer getProviderRole() {
		return providerRole;
	}

	@JsonProperty("provider_role")
	public void setProviderRole(Integer providerRole) {
		this.providerRole = providerRole;
	}

	@JsonProperty("providertype")
	public String getProvidertype() {
		return providertype;
	}

	@JsonProperty("providertype")
	public void setProvidertype(String providertype) {
		this.providertype = providertype;
	}

	@JsonProperty("rwjb_tier")
	public Integer getRwjbTier() {
		return rwjbTier;
	}

	@JsonProperty("rwjb_tier")
	public void setRwjbTier(Integer rwjbTier) {
		this.rwjbTier = rwjbTier;
	}

	@JsonProperty("specialties")
	public List<String> getSpecialties() {
		return specialties;
	}

	@JsonProperty("specialties")
	public void setSpecialties(List<String> specialties) {
		this.specialties = specialties;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("zipcode")
	public String getZipcode() {
		return zipcode;
	}

	@JsonProperty("zipcode")
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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
		return new ToStringBuilder(this).append("address1", address1).append("address2", address2).append("bid", bid)
				.append("city", city).append("county", county).append("degree", degree).append("etin", etin)
				.append("firstname", firstname).append("gender", gender).append("groupName", groupName)
				.append("language", language).append("lastname", lastname).append("location", location).append("mi", mi)
				.append("name", name).append("nationalproviderid", nationalproviderid).append("network", network)
				.append("officehours", officehours).append("omt1", omt1).append("phone", phone)
				.append("practiceStatus", practiceStatus).append("providerRole", providerRole)
				.append("providertype", providertype).append("rwjbTier", rwjbTier).append("specialties", specialties)
				.append("state", state).append("zipcode", zipcode).append("additionalProperties", additionalProperties)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(phone).append(groupName).append(location).append(state).append(lastname)
				.append(address1).append(address2).append(network).append(city).append(specialties).append(name)
				.append(gender).append(omt1).append(bid).append(mi).append(zipcode).append(firstname)
				.append(officehours).append(nationalproviderid).append(etin).append(degree).append(rwjbTier)
				.append(providerRole).append(county).append(additionalProperties).append(providertype)
				.append(practiceStatus).append(language).toHashCode();
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
		return new EqualsBuilder().append(phone, rhs.phone).append(groupName, rhs.groupName)
				.append(location, rhs.location).append(state, rhs.state).append(lastname, rhs.lastname)
				.append(address1, rhs.address1).append(address2, rhs.address2).append(network, rhs.network)
				.append(city, rhs.city).append(specialties, rhs.specialties).append(name, rhs.name)
				.append(gender, rhs.gender).append(omt1, rhs.omt1).append(bid, rhs.bid).append(mi, rhs.mi)
				.append(zipcode, rhs.zipcode).append(firstname, rhs.firstname).append(officehours, rhs.officehours)
				.append(nationalproviderid, rhs.nationalproviderid).append(etin, rhs.etin).append(degree, rhs.degree)
				.append(rwjbTier, rhs.rwjbTier).append(providerRole, rhs.providerRole).append(county, rhs.county)
				.append(additionalProperties, rhs.additionalProperties).append(providertype, rhs.providertype)
				.append(practiceStatus, rhs.practiceStatus).append(language, rhs.language).isEquals();
	}

}