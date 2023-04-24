package com.prembly.apisdk.RestClient.config;

import org.apache.commons.lang3.StringUtils;

public class PremblyApiUrls {
    public static String baseUrl;
    public PremblyApiUrls(String baseApiUrl) {
        baseUrl = StringUtils.removeEnd(baseApiUrl, "/");
    }
    public String getGetBankCodesApiUrl() {
        String getBankCodesApiUrl = "/api/v2/biometrics/merchant/data/verification/bank_code";
        return baseUrl + getBankCodesApiUrl;
    }
    public String getAccountNumberOnePointZeroApiUrl() {
        String accountNumberOnePointZeroApiUrl = "/api/v2/biometrics/merchant/data/verification/bank_account";
        return baseUrl + accountNumberOnePointZeroApiUrl;
    }
    public String getAccountWithNameComparisonApiUrl() {
        String accountWithNameComparisonApiUrl = "/api/v2/biometrics/merchant/data/verification/bank_account/comparism";
        return baseUrl + accountWithNameComparisonApiUrl;
    }
    public String getAccountNumberTwoPointZeroApiUrl() {
        String accountNumberTwoPointZeroApiUrl = "/api/v2/biometrics/merchant/data/verification/bank_account/advance";
        return baseUrl + accountNumberTwoPointZeroApiUrl;
    }
    public String getBvnOnePointZeroApiUrl() {
        String bvnOnePointZeroApiUrl = "/api/v2/biometrics/merchant/data/verification/bvn_validation";
        return baseUrl + bvnOnePointZeroApiUrl;
    }
    public String getBvnTwoPointZeroApiUrl() {
        String bvnTwoPointZeroApiUrl = "/api/v2/biometrics/merchant/data/verification/bvn";
        return baseUrl + bvnTwoPointZeroApiUrl;
    }
    public String getIgreeApiUrl() {
        String igreeApiUrl = "/api/v2/biometrics/merchant/data/verification/bvn/igree";
        return baseUrl + igreeApiUrl;
    }
    public String getBvnTwoPointZeroPlusFaceValidationApiUrl() {
        String bvnTwoPointZeroPlusFaceValidationApiUrl = "/api/v2/biometrics/merchant/data/verification/bvn_w_face";
        return baseUrl + bvnTwoPointZeroPlusFaceValidationApiUrl;
    }
    public String getBasicCacApiUrl() {
        String basicCacApiUrl = "/api/v2/biometrics/merchant/data/verification/cac";
        return baseUrl + basicCacApiUrl;
    }
    public String getBasicCacUsingNameApiUrl() {
        String basicCacUsingNameApiUrl = "/api/v2/biometrics/merchant/data/verification/cac_w_name";
        return baseUrl + basicCacUsingNameApiUrl;
    }
    public String getAdvanceCacApiUrl() {
        String advanceCacApiUrl = "/api/v2/biometrics/merchant/data/verification/cac/advance";
        return baseUrl + advanceCacApiUrl;
    }
    public String getDriversLicenseBasicApiUrl() {
        String driversLicenseBasicApiUrl = "/api/v2/biometrics/merchant/data/verification/drivers_license/basic";
        return baseUrl + driversLicenseBasicApiUrl;
    }
    public String getAdvanceDriversLicenseApiUrl() {
        String advanceDriversLicenseApiUrl = "/api/v2/biometrics/merchant/data/verification/drivers_license/advance";
        return baseUrl + advanceDriversLicenseApiUrl;
    }
    public String getDriversLicenseImageApiUrl() {
        String driversLicenseImageApiUrl = "/api/v2/biometrics/merchant/data/verification/drivers_license/image";
        return baseUrl + driversLicenseImageApiUrl;
    }
    public String getLookupDriversLicenseApiUrl() {
        String lookupDriversLicenseApiUrl = "/api/v1/biometrics/merchant/data/verification/drivers_license";
        return baseUrl + lookupDriversLicenseApiUrl;
    }
    public String getDriversLicenseFaceValidationApiUrl() {
        String driversLicenseFaceValidationApiUrl = "/api/v2/biometrics/merchant/data/verification/drivers_license_with_face";
        return baseUrl + driversLicenseFaceValidationApiUrl;
    }
    public String getInternationalPassportSyncApiUrl() {
        String internationalPassportSyncApiUrl = "/api/v2/biometrics/merchant/data/verification/national_passport";
        return baseUrl + internationalPassportSyncApiUrl;
    }
    public String getInternationalPassportImageApiUrl() {
        String internationalPassportImageApiUrl = "/api/v2/biometrics/merchant/data/verification/national_passport_image";
        return baseUrl + internationalPassportImageApiUrl;
    }
    public String getInternationalPassportFaceValidationApiUrl() {
        String internationalPassportFaceValidationApiUrl = "/api/v2/biometrics/merchant/data/verification/national_passport_with_face";
        return baseUrl + internationalPassportFaceValidationApiUrl;
    }
    public String getInternationalPassportAsyncApiUrl() {
        String internationalPassportAsyncApiUrl = "/api/v2/biometrics/merchant/data/verification/national_passport/async";
        return baseUrl + internationalPassportAsyncApiUrl;
    }
    public String getLookUpNINSlipImageApiUrl() {
        String lookUpNINSlipImageApiUrl = "/api/v2/biometrics/merchant/data/verification/nin/image";
        return baseUrl + lookUpNINSlipImageApiUrl;
    }
    public String getLookUpVirtualNINApiUrl() {
        String lookUpVirtualNINApiUrl = "/api/v2/biometrics/merchant/data/verification/nin_wo_face";
        return baseUrl + lookUpVirtualNINApiUrl;
    }
    public String getLookUpNINWithFaceApiUrl() {
        String lookUpNINWithFaceApiUrl = "/api/v2/biometrics/merchant/data/verification/nin";
        return baseUrl + lookUpNINWithFaceApiUrl;
    }
    public String getBasicPhoneNumberApiUrl() {
        String basicPhoneNumberApiUrl = "/api/v2/biometrics/merchant/data/verification/phone_number";
        return baseUrl + basicPhoneNumberApiUrl;
    }
    public String getAdvancePhoneNumberApiUrl() {
        String advancePhoneNumberApiUrl = "/api/v2/biometrics/merchant/data/verification/phone_number/advance";
        return baseUrl + advancePhoneNumberApiUrl;
    }
    public String getVerifyStampDutyApiUrl() {
        String verifyStampDutyApiUrl = "/api/v2/biometrics/merchant/data/verification/stamp_duty";
        return baseUrl + verifyStampDutyApiUrl;
    }
    public String getTaxIdentificationNumberVerificationApiUrl() {
        String taxIdentificationNumberVerificationApiUrl = "/api/v1/biometrics/merchant/data/verification/tin";
        return baseUrl + taxIdentificationNumberVerificationApiUrl;
    }
    public String getPlateNumberVerificationApiUrl() {
        String plateNumberVerificationApiUrl = "/api/v1/biometrics/merchant/data/verification/tin";
        return baseUrl + plateNumberVerificationApiUrl;
    }
    public String getLookupVinIdImageApiUrl() {
        String lookupVinIdImageApiUrl = "/api/v2/biometrics/merchant/data/verification/voters_card/image";
        return baseUrl + lookupVinIdImageApiUrl;
    }
    public String getLookupVinApiUrl() {
        String lookupVinApiUrl = "/api/v1/biometrics/merchant/data/verification/voters_card";
        return baseUrl + lookupVinApiUrl;
    }
    public String getConsumerBasicApiUrl() {
        String consumerBasicApiUrl = "/api/v2/biometrics/merchant/data/verification/credit_bureau/consumer/basic";
        return baseUrl + consumerBasicApiUrl;
    }
    public String getConsumerAdvanceApiUrl() {
        String consumerAdvanceApiUrl = "/api/v2/biometrics/merchant/data/verification/credit_bureau/consumer/advance";
        return baseUrl + consumerAdvanceApiUrl;
    }
    public String getCommercialBasicApiUrl() {
        String commercialBasicApiUrl = "/api/v2/biometrics/merchant/data/verification/credit_bureau/commercial/basic";
        return baseUrl + commercialBasicApiUrl;
    }
    public String getCommercialAdvanceApiUrl() {
        String commercialAdvanceApiUrl = "/api/v2/biometrics/merchant/data/verification/credit_bureau/commercial/advance";
        return baseUrl + commercialAdvanceApiUrl;
    }
    public String getCreditBureauApiUrl() {
        String creditBureauApiUrl = "/api/v2/biometrics/merchant/data/verification/credit_bureau";
        return baseUrl + creditBureauApiUrl;
    }
    public String getCreditBureauMashupApiUrl() {
        String creditBureauMashupApiUrl = "/api/v2/biometrics/merchant/data/verification/credit_bureau/combined";
        return baseUrl + creditBureauMashupApiUrl;
    }
    public String getBvnCreditBureauApiUrl() {
        String bvnCreditBureauApiUrl = "/api/v2/biometrics/merchant/custom/bvn_w_credit";
        return baseUrl + bvnCreditBureauApiUrl;
    }
    public String getBvnOrPhoneApiUrl() {
        String bvnOrPhoneApiUrl = "/api/v2/biometrics/merchant/bp/verification";
        return baseUrl + bvnOrPhoneApiUrl;
    }
    public String getBvnNinPhoneApiUrl() {
        String bvnNinPhoneApiUrl = "/api/v2/biometrics/merchant/data/verification/bvn_nin_phone";
        return baseUrl + bvnNinPhoneApiUrl;
    }
    public String getNIDApiUrl() {
        String nidApiUrl = "/api/v2/biometrics/merchant/data/verification/rwanda/nid";
        return baseUrl + nidApiUrl;
    }
    public String getRwandaPassportApiUrl() {
        String rwandaPassportApiUrl = "/api/v2/biometrics/merchant/data/verification/rwanda/passport";
        return baseUrl + rwandaPassportApiUrl;
    }
    public String getUgandaBusinessVerificationApiUrl() {
        String ugandaBusinessVerificationApiUrl = "/api/v2/biometrics/merchant/data/verification/ug/company";
        return baseUrl + ugandaBusinessVerificationApiUrl;
    }
    public String getSSNITApiUrl() {
        String ssnitApiUrl = "/api/v2/biometrics/merchant/data/verification/gh/ssnit";
        return baseUrl + ssnitApiUrl;
    }
    public String getSNNITWithFaceApiUrlApiUrl() {
        String ssnitWithFaceApiUrl = "/api/v2/biometrics/merchant/data/verification/gh/ssnit/face";
        return baseUrl + ssnitWithFaceApiUrl;
    }
    public String getGhanaInternationalPassportApiUrl() {
        String internationalPassportApiUrl = "/api/v2/biometrics/merchant/data/verification/gh/passport";
        return baseUrl + internationalPassportApiUrl;
    }
    public String getGhanaDriversLicenseApiUrl() {
        String ghanaDriversLicenseApiUrl = "/api/v2/biometrics/merchant/data/verification/gh/drivers_license";
        return baseUrl + ghanaDriversLicenseApiUrl;
    }
    public String getGhanaVotersCardApiUrl() {
        String votersCardApiUrl = "/api/v2/biometrics/merchant/data/verification/gh/voters";
        return baseUrl + votersCardApiUrl;
    }
    public String getKenyaNationalIdentityNumberApiUrl() {
        String nationalIdentityApiUrl = "/api/v2/biometrics/merchant/data/verification/ke/national_id/new";
        return baseUrl + nationalIdentityApiUrl;
    }
    public String getKenyaInternationalPassportApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/ke/passport";
        return baseUrl + url;
    }
    public String getKenyaDriversLicenseApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/ke/drivers_license";
        return baseUrl + url;
    }
    public String getKenyaAlienIdApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/ke/alien_id";
        return baseUrl + url;
    }
    public String getKenyaSerialNumberApiUrl() {
        String url = "/biometrics/merchant/data/verification/ke/serial_number";
        return baseUrl + url;
    }
    public String getSouthAfricaNationalIdentityApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/sa/national_id";
        return baseUrl + url;
    }
    public String getSouthAfricaBusinessVerificationApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/sa/company";
        return baseUrl + url;
    }
    public String getSierraLeoneVotersCardApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/sl/voters";
        return baseUrl + url;
    }
    public String getSierraLeoneDriversLicenseApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/sl/drivers_license";
        return baseUrl + url;
    }
    public String getAgeAndGenderApiUrl() {
        String url = "/api/v2/biometrics/merchant/face/age_and_gender";
        return baseUrl + url;
    }
    public String getFaceComparisonApiUrl() {
        String url = "/api/v2/biometrics/merchant/face/comparison";
        return baseUrl + url;
    }
    public String getFaceEnrollmentApiUrl() {
        String url = "/api/v2/biometrics/merchant/user/enroll";
        return baseUrl + url;
    }
    public String getFaceLivelinessCheckApiUrl() {
        String url = "api/v2/biometrics/merchant/face/liveliness_check";
        return baseUrl + url;
    }
    public String getFaceAuthenticationApiUrl() {
        String url = "/api/v2/biometrics/merchant/user/authenticate";
        return baseUrl + url;
    }
    public String getIdFaceMatchingApiUrl() {
        String url = "/api/v2/biometrics/merchant/user/id_verification";
        return baseUrl + url;
    }
    public String getDocumentVerificationApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/document";
        return baseUrl + url;
    }
    public String getRadarApiUrl() {
        String url = "/intelligence/complete-profile-check";
        return baseUrl + url;
    }
    public String getCompanySearchWithEmailApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/global/company/search_with_email";
        return baseUrl + url;
    }
    public String getCompanySearchWithStringsApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/global/company/search_with_string";
        return baseUrl + url;
    }
    public String getCompanySearchWithNameApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/global/company/search";
        return baseUrl + url;
    }
    public String getCompanySearchWithRegistrationNumberApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/global/company";
        return baseUrl + url;
    }
    public String getEmailVerificationApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/emailage";
        return baseUrl + url;
    }
    public String getCardBinApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/card_bin";
        return baseUrl + url;
    }
    public String getInterpolBanListApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/ban_list/search";
        return baseUrl + url;
    }
    public String getVinCarChassisApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/vehicle/vin";
        return baseUrl + url;
    }
    public String getWalletBalanceApiUrl() {
        String url = "/api/v1/biometrics/merchant/data/wallet/balance";
        return baseUrl + url;
    }
    public String getVerificationStatusApiUrl() {
        String url = "/api/v2/biometrics/merchant/data/verification/status";
        return baseUrl + url;
    }
    public String getGetAllVerificationEndpointsApiUrl() {
        String url = "/api/v2/biometrics/api/endpoint/get";
        return baseUrl + url;
    }
}
