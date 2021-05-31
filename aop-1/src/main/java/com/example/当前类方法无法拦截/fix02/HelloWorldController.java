package com.example.当前类方法无法拦截.fix02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/31
 **/
@RestController
public class HelloWorldController {

    @Autowired
    private ElectricService electricService;

    @GetMapping(path = "charge")
    public void charge() throws Exception{
        electricService.charge();
    }
}
