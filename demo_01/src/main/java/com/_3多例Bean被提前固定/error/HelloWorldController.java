package com._3多例Bean被提前固定.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private ServiceImpl serviceImpl;

    @GetMapping("hi")
    public String hi(){
         return "helloworld, service is : " + serviceImpl;
    };

}