package com.example.alibaba.cloudexampleouth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author liq
 */
@SpringBootApplication
@EnableAuthorizationServer
//@EnableResourceServer
@MapperScan("com.example.alibaba.cloudexampleouth2.mapper")
public class CloudExampleOuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudExampleOuth2Application.class, args);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // 设置默认的加密方式
        return new BCryptPasswordEncoder();
    }

}
