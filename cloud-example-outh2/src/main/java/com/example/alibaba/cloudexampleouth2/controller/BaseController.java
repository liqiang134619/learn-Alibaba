package com.example.alibaba.cloudexampleouth2.controller;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liq
 * @date 2020/1/5
 */
@RestController
public class BaseController {


    @GetMapping("/userInfo")
    public Map<String, Object> user(OAuth2Authentication authentication) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("user",authentication.getUserAuthentication().getPrincipal());
        map.put("authorities", AuthorityUtils.authorityListToSet(authentication.getUserAuthentication().getAuthorities()));
        return map;
    }
}
