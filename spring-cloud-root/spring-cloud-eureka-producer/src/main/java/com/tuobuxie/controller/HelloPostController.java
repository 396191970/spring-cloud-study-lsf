package com.tuobuxie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: lishaofeng
 **/
@RestController
public class HelloPostController {

	@PostMapping("/hellopost")
	public String hello(@RequestBody  String name) {
        return "Hello, " + name + " " + new Date();
	}



}
