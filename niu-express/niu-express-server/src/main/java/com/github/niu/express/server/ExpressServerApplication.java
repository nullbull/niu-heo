package com.github.niu.express.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/13 14:36
 * @desc
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableEurekaClient
@MapperScan(basePackages = "com.github.niu.express.server.mapper")
public class ExpressServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExpressServerApplication.class, args);
    }
}
