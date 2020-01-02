package com.example.alibaba.nacosdiscoveryprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liq
 * @date 2020/1/1
 */
@RestController
public class BaseController {


    @Value("${server.port}")
    private String port;


    @GetMapping("/hello")
    public String hello() {
        return "success"+ port;
    }
}
