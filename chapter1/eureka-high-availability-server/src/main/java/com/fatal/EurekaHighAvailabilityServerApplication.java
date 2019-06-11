package com.fatal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// 开启 Eureka 服务器相关配置
@EnableEurekaServer
public class EurekaHighAvailabilityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHighAvailabilityServerApplication.class, args);
    }

}
