package com.example.alibaba.nacosdiscoveryconsumerfeign.controller;

import com.example.alibaba.nacosdiscoveryconsumerfeign.feign.FeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liq
 * @date 2020/1/2
 */
@RestController
public class BaseController {

    @Autowired
    FeignClients feignClients;

    @GetMapping("/hello")
    public String hello() {
        return feignClients.hello();
    }

}
