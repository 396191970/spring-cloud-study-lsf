package com.tuobuxie.controller;

import com.tuobuxie.feign.HelloRemote;

import lombok.extern.apachecommons.CommonsLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lishaofeng
 **/
@RequestMapping("/hello")
@RestController
@CommonsLog
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {

    	log.info("name:"+name);
        return helloRemote.hello(name + "!");
    }

}
