package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GuarantorDetails {
    @JsonProperty("GuarantorFirstName")
    private String firstName;

    @JsonProperty("GuarantorOtherName")
    private String otherName;

    @JsonProperty("GuarantorNationalIDNo")
    private String nationalIDNo;

    @JsonProperty("GuarantorPassport")
    private String passport;

    @JsonProperty("GuarantorDriverLicenceNo")
    private String driverLicenceNo;

    @JsonProperty("GuarantorPENCOMIDNo")
    private String pencomIDNo;

    @JsonProperty("GuarantorOtherID")
    private String otherID;

    @JsonProperty("GuarantorGender")
    private String gender;

    @JsonProperty("GuarantorDateOfBirth")
    private String dateOfBirth;

    @JsonProperty("GuarantorAddress1")
    private String address1;

    @JsonProperty("GuarantorAddress2")
    private String address2;

    @JsonProperty("GuarantorAddress3")
    private String address3;

    @JsonProperty("GuarantorHomeTelephone")
    private String homeTelephone;

    @JsonProperty("GuarantorworkTelephone")
    private String workTelephone;

    @JsonProperty("GuarantorMobileTelephone")
    private String mobileTelephone;
}
