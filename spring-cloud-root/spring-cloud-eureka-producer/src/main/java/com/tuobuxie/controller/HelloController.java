package com.tuobuxie.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;

import com.tuobuxie.interface1.HelloInterface;

/**
 * @author: lishaofeng
 **/
@RestController
public class HelloController  implements HelloInterface{

	@Override
	public String hello(String name) {
        return "Hello, " + name + " " + new Date();
	}



}
