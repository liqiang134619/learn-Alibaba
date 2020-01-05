package com.example.alibaba.cloudexampleoauth2resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class CloudExampleOauth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudExampleOauth2ResourceApplication.class, args);
    }

}
