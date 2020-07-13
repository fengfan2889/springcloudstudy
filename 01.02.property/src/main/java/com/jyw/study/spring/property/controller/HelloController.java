package com.jyw.study.spring.property.controller;

import com.jyw.study.spring.property.system.entity.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jyw
 */
@RestController
public class HelloController {

    private final Environment environment ;

    private final MyConfig myConfig ;

    public HelloController(Environment environment, MyConfig myConfig) {
        this.environment = environment;
        this.myConfig = myConfig;
    }

    @Value("${server.name}")
    private String serverName ;



    @GetMapping("/hello")
    public String hello(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello , I am " + environment.getProperty("server.name")) ;
        sb.append("<br>") ;
        sb.append("hello , I am " + serverName );
        sb.append("<br>") ;
        sb.append("hello , I am " + myConfig.getName() );
        return sb.toString();
    }
}
