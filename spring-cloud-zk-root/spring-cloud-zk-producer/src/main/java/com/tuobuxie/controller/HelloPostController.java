package com.tuobuxie.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: lishaofeng
 **/
@RestController
@Slf4j
public class HelloPostController {

	@PostMapping("/hellopost")
	public String hello(@RequestBody  String name) {
		System.out.println("hellopost");
		log.info("hellopost");
		return "Hello, " + name + " " + new Date();
	}



}
