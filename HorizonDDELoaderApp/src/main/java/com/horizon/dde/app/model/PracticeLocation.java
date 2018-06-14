
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
    "isPrimary",
    "locationId",
    "name",
    "status",
    "period",
    "address",
    "nearestIntersection",
    "publicTransportation",
    "additionalInformation",
    "contactPoints",
    "availability",
    "networks",
    "specialties",
    "affiliation",
    "servicesOffered",
    "availabilityNotes",
    "locationMessage",
    "locationAttributes",
    "panel",
    "practiceLimitations",
    "accessibility",
    "isSuppressedDirectory"
})
public class PracticeLocation implements Serializable
{

    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("locationId")
    private String locationId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
    @JsonProperty("period")
    @Valid
    private Period__ period;
    @JsonProperty("address")
    @Valid
    private Address address;
    @JsonProperty("nearestIntersection")
    private String nearestIntersection;
    @JsonProperty("publicTransportation")
    private String publicTransportation;
    @JsonProperty("additionalInformation")
    private String additionalInformation;
    @JsonProperty("contactPoints")
    @Valid
    private List<ContactPoint> contactPoints = null;
    @JsonProperty("availability")
    @Valid
    private List<Availability> availability = null;
    @JsonProperty("networks")
    @Valid
    private List<Network_> networks = null;
    @JsonProperty("specialties")
    @Valid
    private List<Specialty_> specialties = null;
    @JsonProperty("affiliation")
    @Valid
    private List<Affiliation> affiliation = null;
    @JsonProperty("servicesOffered")
    @Valid
    private List<ServicesOffered> servicesOffered = null;
    @JsonProperty("availabilityNotes")
    private String availabilityNotes;
    @JsonProperty("locationMessage")
    @Valid
    private List<String> locationMessage = null;
    @JsonProperty("locationAttributes")
    private String locationAttributes;
    @JsonProperty("panel")
    @Valid
    private List<Panel> panel = null;
    @JsonProperty("practiceLimitations")
    @Valid
    private List<PracticeLimitation> practiceLimitations = null;
    @JsonProperty("accessibility")
    private String accessibility;
    @JsonProperty("isSuppressedDirectory")
    private Boolean isSuppressedDirectory;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7735119048762325283L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PracticeLocation() {
    }

    /**
     * 
     * @param panel
     * @param networks
     * @param isPrimary
     * @param publicTransportation
     * @param locationMessage
     * @param status
     * @param availabilityNotes
     * @param locationId
     * @param nearestIntersection
     * @param servicesOffered
     * @param isSuppressedDirectory
     * @param period
     * @param practiceLimitations
     * @param specialties
     * @param locationAttributes
     * @param contactPoints
     * @param address
     * @param name
     * @param affiliation
     * @param additionalInformation
     * @param accessibility
     * @param availability
     */
    public PracticeLocation(Boolean isPrimary, String locationId, String name, String status, Period__ period, Address address, String nearestIntersection, String publicTransportation, String additionalInformation, List<ContactPoint> contactPoints, List<Availability> availability, List<Network_> networks, List<Specialty_> specialties, List<Affiliation> affiliation, List<ServicesOffered> servicesOffered, String availabilityNotes, List<String> locationMessage, String locationAttributes, List<Panel> panel, List<PracticeLimitation> practiceLimitations, String accessibility, Boolean isSuppressedDirectory) {
        super();
        this.isPrimary = isPrimary;
        this.locationId = locationId;
        this.name = name;
        this.status = status;
        this.period = period;
        this.address = address;
        this.nearestIntersection = nearestIntersection;
        this.publicTransportation = publicTransportation;
        this.additionalInformation = additionalInformation;
        this.contactPoints = contactPoints;
        this.availability = availability;
        this.networks = networks;
        this.specialties = specialties;
        this.affiliation = affiliation;
        this.servicesOffered = servicesOffered;
        this.availabilityNotes = availabilityNotes;
        this.locationMessage = locationMessage;
        this.locationAttributes = locationAttributes;
        this.panel = panel;
        this.practiceLimitations = practiceLimitations;
        this.accessibility = accessibility;
        this.isSuppressedDirectory = isSuppressedDirectory;
    }

    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("locationId")
    public String getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("period")
    public Period__ getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period__ period) {
        this.period = period;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("nearestIntersection")
    public String getNearestIntersection() {
        return nearestIntersection;
    }

    @JsonProperty("nearestIntersection")
    public void setNearestIntersection(String nearestIntersection) {
        this.nearestIntersection = nearestIntersection;
    }

    @JsonProperty("publicTransportation")
    public String getPublicTransportation() {
        return publicTransportation;
    }

    @JsonProperty("publicTransportation")
    public void setPublicTransportation(String publicTransportation) {
        this.publicTransportation = publicTransportation;
    }

    @JsonProperty("additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @JsonProperty("contactPoints")
    public List<ContactPoint> getContactPoints() {
        return contactPoints;
    }

    @JsonProperty("contactPoints")
    public void setContactPoints(List<ContactPoint> contactPoints) {
        this.contactPoints = contactPoints;
    }

    @JsonProperty("availability")
    public List<Availability> getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    @JsonProperty("networks")
    public List<Network_> getNetworks() {
        return networks;
    }

    @JsonProperty("networks")
    public void setNetworks(List<Network_> networks) {
        this.networks = networks;
    }

    @JsonProperty("specialties")
    public List<Specialty_> getSpecialties() {
        return specialties;
    }

    @JsonProperty("specialties")
    public void setSpecialties(List<Specialty_> specialties) {
        this.specialties = specialties;
    }

    @JsonProperty("affiliation")
    public List<Affiliation> getAffiliation() {
        return affiliation;
    }

    @JsonProperty("affiliation")
    public void setAffiliation(List<Affiliation> affiliation) {
        this.affiliation = affiliation;
    }

    @JsonProperty("servicesOffered")
    public List<ServicesOffered> getServicesOffered() {
        return servicesOffered;
    }

    @JsonProperty("servicesOffered")
    public void setServicesOffered(List<ServicesOffered> servicesOffered) {
        this.servicesOffered = servicesOffered;
    }

    @JsonProperty("availabilityNotes")
    public String getAvailabilityNotes() {
        return availabilityNotes;
    }

    @JsonProperty("availabilityNotes")
    public void setAvailabilityNotes(String availabilityNotes) {
        this.availabilityNotes = availabilityNotes;
    }

    @JsonProperty("locationMessage")
    public List<String> getLocationMessage() {
        return locationMessage;
    }

    @JsonProperty("locationMessage")
    public void setLocationMessage(List<String> locationMessage) {
        this.locationMessage = locationMessage;
    }

    @JsonProperty("locationAttributes")
    public String getLocationAttributes() {
        return locationAttributes;
    }

    @JsonProperty("locationAttributes")
    public void setLocationAttributes(String locationAttributes) {
        this.locationAttributes = locationAttributes;
    }

    @JsonProperty("panel")
    public List<Panel> getPanel() {
        return panel;
    }

    @JsonProperty("panel")
    public void setPanel(List<Panel> panel) {
        this.panel = panel;
    }

    @JsonProperty("practiceLimitations")
    public List<PracticeLimitation> getPracticeLimitations() {
        return practiceLimitations;
    }

    @JsonProperty("practiceLimitations")
    public void setPracticeLimitations(List<PracticeLimitation> practiceLimitations) {
        this.practiceLimitations = practiceLimitations;
    }

    @JsonProperty("accessibility")
    public String getAccessibility() {
        return accessibility;
    }

    @JsonProperty("accessibility")
    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    @JsonProperty("isSuppressedDirectory")
    public Boolean getIsSuppressedDirectory() {
        return isSuppressedDirectory;
    }

    @JsonProperty("isSuppressedDirectory")
    public void setIsSuppressedDirectory(Boolean isSuppressedDirectory) {
        this.isSuppressedDirectory = isSuppressedDirectory;
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
        return new ToStringBuilder(this).append("isPrimary", isPrimary).append("locationId", locationId).append("name", name).append("status", status).append("period", period).append("address", address).append("nearestIntersection", nearestIntersection).append("publicTransportation", publicTransportation).append("additionalInformation", additionalInformation).append("contactPoints", contactPoints).append("availability", availability).append("networks", networks).append("specialties", specialties).append("affiliation", affiliation).append("servicesOffered", servicesOffered).append("availabilityNotes", availabilityNotes).append("locationMessage", locationMessage).append("locationAttributes", locationAttributes).append("panel", panel).append("practiceLimitations", practiceLimitations).append("accessibility", accessibility).append("isSuppressedDirectory", isSuppressedDirectory).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(panel).append(networks).append(publicTransportation).append(isPrimary).append(locationMessage).append(status).append(availabilityNotes).append(locationId).append(nearestIntersection).append(servicesOffered).append(isSuppressedDirectory).append(period).append(practiceLimitations).append(specialties).append(locationAttributes).append(contactPoints).append(address).append(additionalProperties).append(name).append(affiliation).append(additionalInformation).append(accessibility).append(availability).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PracticeLocation) == false) {
            return false;
        }
        PracticeLocation rhs = ((PracticeLocation) other);
        return new EqualsBuilder().append(panel, rhs.panel).append(networks, rhs.networks).append(publicTransportation, rhs.publicTransportation).append(isPrimary, rhs.isPrimary).append(locationMessage, rhs.locationMessage).append(status, rhs.status).append(availabilityNotes, rhs.availabilityNotes).append(locationId, rhs.locationId).append(nearestIntersection, rhs.nearestIntersection).append(servicesOffered, rhs.servicesOffered).append(isSuppressedDirectory, rhs.isSuppressedDirectory).append(period, rhs.period).append(practiceLimitations, rhs.practiceLimitations).append(specialties, rhs.specialties).append(locationAttributes, rhs.locationAttributes).append(contactPoints, rhs.contactPoints).append(address, rhs.address).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(affiliation, rhs.affiliation).append(additionalInformation, rhs.additionalInformation).append(accessibility, rhs.accessibility).append(availability, rhs.availability).isEquals();
    }

}
