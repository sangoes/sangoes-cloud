package com.sangoes.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * 网关模块
 *
 * @author jerrychir
 * @date 2019 2019/3/24 6:34 PM
 */
@SpringCloudApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
