
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
    "providerId",
    "entityType",
    "providerType",
    "providerRole",
    "ancillaryType****",
    "name",
    "prefix",
    "firstName",
    "lastName",
    "middleInitial",
    "gender",
    "groupName****",
    "degree",
    "boardCertified",
    "pcp_Specialist",
    "acceptNewPatients",
    "identifiers",
    "qualifications",
    "languages",
    "specialties",
    "networks",
    "practiceLocations",
    "tierIndicators******",
    "partOf",
    "providerAttributes",
    "billingAddress",
    "hospitalAffiliations",
    "inNetwork",
    "messages",
    "contactPoints",
    "participatingStatus",
    "isDirectory",
    "isExcluded"
})
public class Provider implements Serializable
{

    @JsonProperty("providerId")
    private String providerId;
    @JsonProperty("entityType")
    private String entityType;
    @JsonProperty("providerType")
    private String providerType;
    @JsonProperty("providerRole")
    private String providerRole;
    @JsonProperty("ancillaryType****")
    private String ancillaryType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("prefix")
    private String prefix;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("middleInitial")
    private String middleInitial;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("groupName****")
    private String groupName;
    @JsonProperty("degree")
    private String degree;
    @JsonProperty("boardCertified")
    private Boolean boardCertified;
    @JsonProperty("pcp_Specialist")
    private Boolean pcpSpecialist;
    @JsonProperty("acceptNewPatients")
    private Boolean acceptNewPatients;
    @JsonProperty("identifiers")
    @Valid
    private List<Identifier> identifiers = null;
    @JsonProperty("qualifications")
    @Valid
    private List<Qualification> qualifications = null;
    @JsonProperty("languages")
    @Valid
    private List<String> languages = null;
    @JsonProperty("specialties")
    @Valid
    private List<Specialty> specialties = null;
    @JsonProperty("networks")
    @Valid
    private List<Network> networks = null;
    @JsonProperty("practiceLocations")
    @Valid
    private List<PracticeLocation> practiceLocations = null;
    @JsonProperty("tierIndicators******")
    @Valid
    private List<TierIndicators> tierIndicators = null;
    @JsonProperty("partOf")
    @Valid
    private PartOf partOf;
    @JsonProperty("providerAttributes")
    private String providerAttributes;
    @JsonProperty("billingAddress")
    @Valid
    private BillingAddress billingAddress;
    @JsonProperty("hospitalAffiliations")
    @Valid
    private List<HospitalAffiliation> hospitalAffiliations = null;
    @JsonProperty("inNetwork")
    private Boolean inNetwork;
    @JsonProperty("messages")
    @Valid
    private List<Message> messages = null;
    @JsonProperty("contactPoints")
    @Valid
    private List<ContactPoint_> contactPoints = null;
    @JsonProperty("participatingStatus")
    private String participatingStatus;
    @JsonProperty("isDirectory")
    private Boolean isDirectory;
    @JsonProperty("isExcluded")
    private String isExcluded;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3259683734895351422L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Provider() {
    }

    /**
     * 
     * @param groupName
     * @param boardCertified
     * @param qualifications
     * @param ancillaryType
     * @param identifiers
     * @param entityType
     * @param tierIndicators
     * @param practiceLocations
     * @param messages
     * @param languages
     * @param specialties
     * @param acceptNewPatients
     * @param name
     * @param gender
     * @param partOf
     * @param hospitalAffiliations
     * @param firstName
     * @param networks
     * @param lastName
     * @param providerType
     * @param pcpSpecialist
     * @param participatingStatus
     * @param isExcluded
     * @param degree
     * @param contactPoints
     * @param isDirectory
     * @param providerRole
     * @param inNetwork
     * @param prefix
     * @param middleInitial
     * @param providerId
     * @param billingAddress
     * @param providerAttributes
     */
    public Provider(String providerId, String entityType, String providerType, String providerRole, String ancillaryType, String name, String prefix, String firstName, String lastName, String middleInitial, String gender, String groupName, String degree, Boolean boardCertified, Boolean pcpSpecialist, Boolean acceptNewPatients, List<Identifier> identifiers, List<Qualification> qualifications, List<String> languages, List<Specialty> specialties, List<Network> networks, List<PracticeLocation> practiceLocations, List<TierIndicators> tierIndicators, PartOf partOf, String providerAttributes, BillingAddress billingAddress, List<HospitalAffiliation> hospitalAffiliations, Boolean inNetwork, List<Message> messages, List<ContactPoint_> contactPoints, String participatingStatus, Boolean isDirectory, String isExcluded) {
        super();
        this.providerId = providerId;
        this.entityType = entityType;
        this.providerType = providerType;
        this.providerRole = providerRole;
        this.ancillaryType = ancillaryType;
        this.name = name;
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.gender = gender;
        this.groupName = groupName;
        this.degree = degree;
        this.boardCertified = boardCertified;
        this.pcpSpecialist = pcpSpecialist;
        this.acceptNewPatients = acceptNewPatients;
        this.identifiers = identifiers;
        this.qualifications = qualifications;
        this.languages = languages;
        this.specialties = specialties;
        this.networks = networks;
        this.practiceLocations = practiceLocations;
        this.tierIndicators = tierIndicators;
        this.partOf = partOf;
        this.providerAttributes = providerAttributes;
        this.billingAddress = billingAddress;
        this.hospitalAffiliations = hospitalAffiliations;
        this.inNetwork = inNetwork;
        this.messages = messages;
        this.contactPoints = contactPoints;
        this.participatingStatus = participatingStatus;
        this.isDirectory = isDirectory;
        this.isExcluded = isExcluded;
    }

    @JsonProperty("providerId")
    public String getProviderId() {
        return providerId;
    }

    @JsonProperty("providerId")
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("providerType")
    public String getProviderType() {
        return providerType;
    }

    @JsonProperty("providerType")
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    @JsonProperty("providerRole")
    public String getProviderRole() {
        return providerRole;
    }

    @JsonProperty("providerRole")
    public void setProviderRole(String providerRole) {
        this.providerRole = providerRole;
    }

    @JsonProperty("ancillaryType****")
    public String getAncillaryType() {
        return ancillaryType;
    }

    @JsonProperty("ancillaryType****")
    public void setAncillaryType(String ancillaryType) {
        this.ancillaryType = ancillaryType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("middleInitial")
    public String getMiddleInitial() {
        return middleInitial;
    }

    @JsonProperty("middleInitial")
    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("groupName****")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("groupName****")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("degree")
    public String getDegree() {
        return degree;
    }

    @JsonProperty("degree")
    public void setDegree(String degree) {
        this.degree = degree;
    }

    @JsonProperty("boardCertified")
    public Boolean getBoardCertified() {
        return boardCertified;
    }

    @JsonProperty("boardCertified")
    public void setBoardCertified(Boolean boardCertified) {
        this.boardCertified = boardCertified;
    }

    @JsonProperty("pcp_Specialist")
    public Boolean getPcpSpecialist() {
        return pcpSpecialist;
    }

    @JsonProperty("pcp_Specialist")
    public void setPcpSpecialist(Boolean pcpSpecialist) {
        this.pcpSpecialist = pcpSpecialist;
    }

    @JsonProperty("acceptNewPatients")
    public Boolean getAcceptNewPatients() {
        return acceptNewPatients;
    }

    @JsonProperty("acceptNewPatients")
    public void setAcceptNewPatients(Boolean acceptNewPatients) {
        this.acceptNewPatients = acceptNewPatients;
    }

    @JsonProperty("identifiers")
    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("identifiers")
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("qualifications")
    public List<Qualification> getQualifications() {
        return qualifications;
    }

    @JsonProperty("qualifications")
    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @JsonProperty("specialties")
    public List<Specialty> getSpecialties() {
        return specialties;
    }

    @JsonProperty("specialties")
    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }

    @JsonProperty("networks")
    public List<Network> getNetworks() {
        return networks;
    }

    @JsonProperty("networks")
    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    @JsonProperty("practiceLocations")
    public List<PracticeLocation> getPracticeLocations() {
        return practiceLocations;
    }

    @JsonProperty("practiceLocations")
    public void setPracticeLocations(List<PracticeLocation> practiceLocations) {
        this.practiceLocations = practiceLocations;
    }

    @JsonProperty("tierIndicators******")
    public List<TierIndicators> getTierIndicators() {
        return tierIndicators;
    }

    @JsonProperty("tierIndicators******")
    public void setTierIndicators(List<TierIndicators> tierIndicators) {
        this.tierIndicators = tierIndicators;
    }

    @JsonProperty("partOf")
    public PartOf getPartOf() {
        return partOf;
    }

    @JsonProperty("partOf")
    public void setPartOf(PartOf partOf) {
        this.partOf = partOf;
    }

    @JsonProperty("providerAttributes")
    public String getProviderAttributes() {
        return providerAttributes;
    }

    @JsonProperty("providerAttributes")
    public void setProviderAttributes(String providerAttributes) {
        this.providerAttributes = providerAttributes;
    }

    @JsonProperty("billingAddress")
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billingAddress")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("hospitalAffiliations")
    public List<HospitalAffiliation> getHospitalAffiliations() {
        return hospitalAffiliations;
    }

    @JsonProperty("hospitalAffiliations")
    public void setHospitalAffiliations(List<HospitalAffiliation> hospitalAffiliations) {
        this.hospitalAffiliations = hospitalAffiliations;
    }

    @JsonProperty("inNetwork")
    public Boolean getInNetwork() {
        return inNetwork;
    }

    @JsonProperty("inNetwork")
    public void setInNetwork(Boolean inNetwork) {
        this.inNetwork = inNetwork;
    }

    @JsonProperty("messages")
    public List<Message> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @JsonProperty("contactPoints")
    public List<ContactPoint_> getContactPoints() {
        return contactPoints;
    }

    @JsonProperty("contactPoints")
    public void setContactPoints(List<ContactPoint_> contactPoints) {
        this.contactPoints = contactPoints;
    }

    @JsonProperty("participatingStatus")
    public String getParticipatingStatus() {
        return participatingStatus;
    }

    @JsonProperty("participatingStatus")
    public void setParticipatingStatus(String participatingStatus) {
        this.participatingStatus = participatingStatus;
    }

    @JsonProperty("isDirectory")
    public Boolean getIsDirectory() {
        return isDirectory;
    }

    @JsonProperty("isDirectory")
    public void setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    @JsonProperty("isExcluded")
    public String getIsExcluded() {
        return isExcluded;
    }

    @JsonProperty("isExcluded")
    public void setIsExcluded(String isExcluded) {
        this.isExcluded = isExcluded;
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
        return new ToStringBuilder(this).append("providerId", providerId).append("entityType", entityType).append("providerType", providerType).append("providerRole", providerRole).append("ancillaryType", ancillaryType).append("name", name).append("prefix", prefix).append("firstName", firstName).append("lastName", lastName).append("middleInitial", middleInitial).append("gender", gender).append("groupName", groupName).append("degree", degree).append("boardCertified", boardCertified).append("pcpSpecialist", pcpSpecialist).append("acceptNewPatients", acceptNewPatients).append("identifiers", identifiers).append("qualifications", qualifications).append("languages", languages).append("specialties", specialties).append("networks", networks).append("practiceLocations", practiceLocations).append("tierIndicators", tierIndicators).append("partOf", partOf).append("providerAttributes", providerAttributes).append("billingAddress", billingAddress).append("hospitalAffiliations", hospitalAffiliations).append("inNetwork", inNetwork).append("messages", messages).append("contactPoints", contactPoints).append("participatingStatus", participatingStatus).append("isDirectory", isDirectory).append("isExcluded", isExcluded).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(boardCertified).append(groupName).append(qualifications).append(identifiers).append(ancillaryType).append(tierIndicators).append(entityType).append(practiceLocations).append(messages).append(languages).append(specialties).append(acceptNewPatients).append(name).append(partOf).append(gender).append(hospitalAffiliations).append(firstName).append(networks).append(lastName).append(providerType).append(pcpSpecialist).append(participatingStatus).append(isExcluded).append(degree).append(contactPoints).append(isDirectory).append(providerRole).append(additionalProperties).append(inNetwork).append(prefix).append(middleInitial).append(providerId).append(billingAddress).append(providerAttributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Provider) == false) {
            return false;
        }
        Provider rhs = ((Provider) other);
        return new EqualsBuilder().append(boardCertified, rhs.boardCertified).append(groupName, rhs.groupName).append(qualifications, rhs.qualifications).append(identifiers, rhs.identifiers).append(ancillaryType, rhs.ancillaryType).append(tierIndicators, rhs.tierIndicators).append(entityType, rhs.entityType).append(practiceLocations, rhs.practiceLocations).append(messages, rhs.messages).append(languages, rhs.languages).append(specialties, rhs.specialties).append(acceptNewPatients, rhs.acceptNewPatients).append(name, rhs.name).append(partOf, rhs.partOf).append(gender, rhs.gender).append(hospitalAffiliations, rhs.hospitalAffiliations).append(firstName, rhs.firstName).append(networks, rhs.networks).append(lastName, rhs.lastName).append(providerType, rhs.providerType).append(pcpSpecialist, rhs.pcpSpecialist).append(participatingStatus, rhs.participatingStatus).append(isExcluded, rhs.isExcluded).append(degree, rhs.degree).append(contactPoints, rhs.contactPoints).append(isDirectory, rhs.isDirectory).append(providerRole, rhs.providerRole).append(additionalProperties, rhs.additionalProperties).append(inNetwork, rhs.inNetwork).append(prefix, rhs.prefix).append(middleInitial, rhs.middleInitial).append(providerId, rhs.providerId).append(billingAddress, rhs.billingAddress).append(providerAttributes, rhs.providerAttributes).isEquals();
    }

}
