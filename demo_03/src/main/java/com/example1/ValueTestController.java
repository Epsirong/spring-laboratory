package com.example1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueTestController {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    // @Value也可用于注入
    @Value("#{student}")
    private Student student;

    @GetMapping("user")
    public String getUser(){
       return username + "," + student + ", " + password;
    };

}
