package com.fatal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册中心是eureka，那么就推荐@EnableEurekaClient；
 * 如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 */
@SpringBootApplication
// 开启 Eureka 客户端相关配置
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    @RequestMapping("/client")
    public String client() {
        return "this is eureka client";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
