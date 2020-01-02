package com.example.alibaba.nacosconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NacosConfigClientApplication {



    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigClientApplication.class, args);
///        String userName = applicationContext.getEnvironment().getProperty("user.name");
//        String userAge = applicationContext.getEnvironment().getProperty("user.age");
//        System.out.println("user name :" +userName+"; age: "+userAge);
//        String test = applicationContext.getEnvironment().getProperty("test");
//        System.out.println(test);

    }


}
