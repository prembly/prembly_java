package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanySearchWithEmailRequest {
    private String email;
}
