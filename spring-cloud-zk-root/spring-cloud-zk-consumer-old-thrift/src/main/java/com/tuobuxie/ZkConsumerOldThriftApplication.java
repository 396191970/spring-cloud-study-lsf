package com.tuobuxie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author lishaofeng  396191970@qq.com
 *调用原来的thrift rpc 服务
 */
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
@ComponentScan(basePackages={"com.jlpay.commons.rpc.thrift.referer.service","com.jlpay.commons.rpc.thrift.referer.zookeeper","com.tuobuxie"})
public class ZkConsumerOldThriftApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkConsumerOldThriftApplication.class, args);
    }
}
