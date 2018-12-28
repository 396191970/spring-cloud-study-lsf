package com.jlpay.quickpass.srv.trans.controller;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@Data
@Slf4j
public class TestRibbonController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/testribbon")
	public String testribbon() {

		String serviceId = "spring-cloud-eureka-producer";
		String uri = "/helloget?name=lishaofeng";
		String url = "http://"+serviceId+uri;
		return restTemplate.getForObject(url, String.class);

	}

	@GetMapping("/testribbonpost")
	public String testribbonpost() {

		String serviceId = "spring-cloud-eureka-producer";
		String uri = "/hellopost";
		String url = "http://"+serviceId+uri;
		return restTemplate.postForObject(url,"tuobuxie", String.class);

	}
}
