package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class InterpolBanListData {
    @JsonProperty("summary")
    private String summary;

    @JsonProperty("weight")
    private String weight;

    @JsonProperty("profession")
    private String profession;

    @JsonProperty("purposes")
    private List<String> purposes;

    @JsonProperty("entity_id")
    private String entityId;

    @JsonProperty("aliases")
    private List<Alias> aliases;

    @JsonProperty("father_name")
    private String fatherName;

    @JsonProperty("un_reference")
    private String unReference;

    @JsonProperty("identity_documents")
    private List<IdentityDocument> identityDocuments;

    @JsonProperty("nationalities")
    private List<String> nationalities;

    @JsonProperty("name_at_birth")
    private String nameAtBirth;

    @JsonProperty("name")
    private String name;

    @JsonProperty("name_in_original_script")
    private String nameInOriginalScript;

    @JsonProperty("un_resolution")
    private String unResolution;

    @JsonProperty("father_forename")
    private String fatherForename;

    @JsonProperty("mother_forename")
    private String motherForename;

    @JsonProperty("forename")
    private String forename;

    @JsonProperty("associates")
    private List<Associate> associates;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @JsonProperty("un_reference_date")
    private String unReferenceDate;
    @JsonProperty("forename_in_original_script")
    private String forenameInOriginalScript;
    @JsonProperty("languages_spoken_ids")
    private List<String> languagesSpokenIds;
    @JsonProperty("country_of_birth_id")
    private String countryOfBirthId;
    @JsonProperty("sex_id")
    private String sexId;
    @JsonProperty("mother_name")
    private String motherName;
    @JsonProperty("adresses")
    private List<String> addresses;
    @JsonProperty("place_of_birth")
    private String placeOfBirth;
}
