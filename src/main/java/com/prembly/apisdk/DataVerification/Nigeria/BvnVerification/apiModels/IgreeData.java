package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IgreeData {
    @JsonProperty("marital_status")
    private String maritalStatus;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("middle_name")
    private String middleName;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("enroll_user_name")
    private String enrollUserName;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("state_of_origin")
    private String stateOfOrigin;

    @JsonProperty("lga_of_origin")
    private String lgaOfOrigin;

    @JsonProperty("nin")
    private String nin;

    @JsonProperty("phone_number2")
    private String phoneNumber2;

    @JsonProperty("title")
    private String title;

    @JsonProperty("watchlisted")
    private Integer watchlisted;

    @JsonProperty("additional_info_1")
    private String additionalInfo1;

    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

    @JsonProperty("face_image")
    private String faceImage;
}
