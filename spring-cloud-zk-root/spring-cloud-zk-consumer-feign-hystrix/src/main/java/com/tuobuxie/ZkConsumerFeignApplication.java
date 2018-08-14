package com.tuobuxie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lishaofeng
 */
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class ZkConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkConsumerFeignApplication.class, args);
    }
}
