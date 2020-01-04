package com.example.alibaba.nacosdiscoveryprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

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

    @GetMapping("/param")
    public String hello(HttpServletResponse response, HttpServletRequest request) {


        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.forEach((k,v)-> {
            System.out.println(k+":"+v.toString());
        });

        return "ss";

    }
}
