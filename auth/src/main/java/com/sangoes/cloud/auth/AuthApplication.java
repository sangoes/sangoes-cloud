package com.sangoes.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * 认证中心
 *
 * @author jerrychir
 * @date 2019 2019/3/21 10:18 PM
 */
@SpringCloudApplication
@EnableFeignClients
public class AuthApplication {
    public static void main(String[] args) {

        SpringApplication.run(AuthApplication.class, args);
    }
}
