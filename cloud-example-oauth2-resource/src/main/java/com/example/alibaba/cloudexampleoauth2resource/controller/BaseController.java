package com.example.alibaba.cloudexampleoauth2resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liq
 * @date 2020/1/5
 */
@RestController
public class BaseController {


    @GetMapping("hello")
    public String hello() {
        return "success";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/hello2")
    public String hello2() {
        return "success2";
    }
}
