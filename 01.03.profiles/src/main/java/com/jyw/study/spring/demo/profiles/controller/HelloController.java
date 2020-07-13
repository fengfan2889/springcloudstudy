package com.jyw.study.spring.demo.profiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jyw
 */
@RestController
public class HelloController {

    @Value("${server.name}")
    private String serverName ;



    @GetMapping("/hello")
    public String hello(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello , I am " + serverName );

        return sb.toString();
    }
}
