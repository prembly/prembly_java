package com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FrscDataAdvance {
    @JsonProperty("name")
    private String name;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("mother_name")
    private String motherName;
    @JsonProperty("height_in_metres")
    private String heightInMetres;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("tin")
    private String tin;
    @JsonProperty("issued_date")
    private String issuedDate;
    @JsonProperty("validity")
    private String validity;
    @JsonProperty("lga_of_origin")
    private String lgaOfOrigin;
    @JsonProperty("face_mark")
    private String faceMark;
    @JsonProperty("blood_group")
    private String bloodGroup;
    @JsonProperty("state_of_origin")
    private String stateOfOrigin;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("glasses")
    private String glasses;
    @JsonProperty("disability")
    private String disability;
    @JsonProperty("nin")
    private String nin;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("nok_phone")
    private String nextOfKinPhone;
    @JsonProperty("address_line1")
    private String addressLine1;
    @JsonProperty("address_line2")
    private String addressLine2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postal_code")
    private String postalCode;
}
