package com.example.alibaba.nacosdiscoveryprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liq
 * @date 2020/1/1
 */
@RestController
public class BaseController {


    @GetMapping("/hello")
    public String hello() {
        return "success";
    }
}
