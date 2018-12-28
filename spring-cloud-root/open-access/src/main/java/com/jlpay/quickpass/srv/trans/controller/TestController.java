package com.jlpay.quickpass.srv.trans.controller;


import com.jlpay.quickpass.srv.trans.service.impl.Test;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 还没消化，先留着暂不用
 */
@RestController
@Data
@Slf4j
public class TestController  {

	@Autowired
	Test outQrPayOrderService;

	@GetMapping("/test")
	public void testHome() {

		outQrPayOrderService.test("spring-cloud-eureka-producer", "get", "/helloget");
//

	}
}
