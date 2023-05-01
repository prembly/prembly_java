# Prembly-API-Java-SpringBoot-SDK

### Steps to use the Prembly Java SpringBoot SDK
### 1. Add the dependency to your Pom file:
```
        <dependency>
            <groupId>io.github.devgoks</groupId>
            <artifactId>api-sdk</artifactId>
            <version>1.0.0</version>
        </dependency>
```
### 2. Create a bean for PremblyRestClient in your config class and include your app ID and app key:
```
    @Bean
    public PremblySdkRestClient premblySdkRestClient(RestTemplate restTemplate){
        return new PremblySdkRestClient(restTemplate,"your-api-id","your-app-key");
    }
```
### 3. Create a bean in your config class for the specific class you need. The APIs are classified into classes just as you have it in the documentation. You can navigate the library to locate the class you need. For example, if you want to use the DataVerification Nigeria Driver License APIs, specify the base URL, which you will change depending on which environment you are calling (sandbox or live):
```
    @Bean
    public DriverLicenseService driverLicenseService(PremblySdkRestClient premblySdkRestClient){
        return new DriverLicenseService("https://sandbox.myidentitypay.com", premblySdkRestClient);
    }
```
### 4. Sample usage in your codebase:
```
    @Autowired
    private DriverLicenseService driverLicenseService;
    
    public DriversLicenseBasicResponse test(){
        DriversLicenseBasicRequest request = new DriversLicenseBasicRequest();
        request.setDob("1999-12-21");
        request.setFirstName("test");
        request.setNumber("AAD23208212298");
        request.setLastName("test");
        DriversLicenseBasicResponse response = driverLicenseService.driversLicenseBasic(request);
        return response;
    }
```
 
