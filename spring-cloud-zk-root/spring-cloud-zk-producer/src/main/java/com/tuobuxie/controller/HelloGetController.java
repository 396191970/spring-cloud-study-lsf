package com.tuobuxie.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: lishaofeng
 **/
@RestController
@Slf4j
public class HelloGetController {

    @GetMapping("/helloget")

    public String helloget(String name) {
        System.out.println("helloget");

        return "Hello, " + name + " " + new Date();
    }


}
