package com.sangoes.cloud.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * 路由限流配置
 *
 * @author jerrychir
 * @date 2019 2019/3/24 6:49 PM
 */
@Configuration
public class RateLimiterConfig {

    /**
     * remote key resolver
     *
     * @return
     */
    @Bean(value = "remoteKeyResolver")
    public KeyResolver remoteKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }
}
