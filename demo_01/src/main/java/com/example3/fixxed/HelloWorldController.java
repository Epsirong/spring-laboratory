package com.example3.fixxed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
@RestController
public class HelloWorldController {

    @Autowired
    private ServiceImpl serviceImpl;

    @GetMapping("hi01")
    public String hi() {
        return "helloworld, service is : " + serviceImpl;
    }
}
