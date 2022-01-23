package com.aliergul.mobileappusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MobileAppUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileAppUsersApplication.class, args);
    }

}
