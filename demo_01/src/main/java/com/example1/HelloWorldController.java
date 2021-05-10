package com.example1;

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

    @GetMapping("hi")
    public String hi() {
        return "helloWorld";
    }
}
