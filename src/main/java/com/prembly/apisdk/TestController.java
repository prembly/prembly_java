package com.prembly.apisdk;

import com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels.AdvanceDriversLicenseRequest;
import com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.service.DriverLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DriverLicenseService service;

    @GetMapping
    public ResponseEntity test(){
        AdvanceDriversLicenseRequest request = new AdvanceDriversLicenseRequest();
        request.setDob("1999-12-21");
        request.setFirstName("test");
        request.setLastName("test");
        request.setNumber("AAD23208212298");
        return ResponseEntity.ok(service.advanceDriversLicense(request));
    }
}
