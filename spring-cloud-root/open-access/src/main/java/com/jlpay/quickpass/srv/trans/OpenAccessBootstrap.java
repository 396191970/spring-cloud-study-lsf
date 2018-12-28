package com.jlpay.quickpass.srv.trans;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;


/**
 * 启动类
 * @author lishaofeng  396191970@qq.com
 * @date 2018年3月5日 下午7:08:15
 * @ClassName: OnlinePaymentChannleJlBootstrap
 * @Description:
 */

@SpringBootApplication
@EnableAspectJAutoProxy
public class OpenAccessBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(OpenAccessBootstrap.class, args);


	}

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

