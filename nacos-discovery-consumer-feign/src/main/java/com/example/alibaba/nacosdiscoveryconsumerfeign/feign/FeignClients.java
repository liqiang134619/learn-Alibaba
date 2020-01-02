package com.example.alibaba.nacosdiscoveryconsumerfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Liq
 * @date 2020/1/2
 */
@FeignClient(name = "nacos-provider")
public interface FeignClients {

    @GetMapping("/hello")
    String hello();

}
