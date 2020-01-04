package com.example.alibaba.nacosdiscoverygateway.configs.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * global过滤器
 * @author liq
 * @date 2020/1/4
 */
@Configuration
public class CustomGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("global filter is passed");

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
