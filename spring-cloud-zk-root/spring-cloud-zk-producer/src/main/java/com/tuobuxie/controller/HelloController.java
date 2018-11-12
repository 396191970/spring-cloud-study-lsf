package com.tuobuxie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.apachecommons.CommonsLog;

import java.util.Date;

/**
 * @author: lishaofeng
 **/
@RestController
@RequestMapping("/hello")
@CommonsLog
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam String name) {
    	String ret = "Hello, " + name + " " + new Date();
    	log.info(ret);
        return ret;
    }

}
