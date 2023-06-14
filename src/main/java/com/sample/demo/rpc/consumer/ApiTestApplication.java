package com.sample.demo.rpc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @description:
 * @author: sample
 * @date: 2023/6/14
 */
@SpringBootApplication
@ImportResource({"classpath:spring-config.xml"})
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

}
