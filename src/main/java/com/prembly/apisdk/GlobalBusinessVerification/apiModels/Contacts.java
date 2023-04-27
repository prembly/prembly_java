package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.List;

@Data
public class Contacts {
    private List<String> email;
    private List<String> phone;
}
