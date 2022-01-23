package com.aliergul.mobileappaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MobileAppAccountManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileAppAccountManagementApplication.class, args);
    }

}
