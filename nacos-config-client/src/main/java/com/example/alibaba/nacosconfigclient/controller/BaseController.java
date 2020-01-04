package com.example.alibaba.nacosconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liq
 * @date 2020/1/2
 */
@RestController
public class BaseController {


    @Value("${test:test为空}")
    public String str;

    @GetMapping("/hello")
    public String hello(){
        return str;
    }
}
