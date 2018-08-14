package com.tuobuxie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author lishaofeng
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
public class ZkProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkProducerApplication.class, args);
    }

}
