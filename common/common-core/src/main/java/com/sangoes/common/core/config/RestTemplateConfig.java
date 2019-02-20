package com.sangoes.common.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * redis 模板配置
 *
 * @author jerrychir
 * @date 2019 2019/2/20 3:26 PM
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
