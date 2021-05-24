package com._3多例Bean被提前固定.fix;

import org.springframework.beans.factory.annotation.Lookup;
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
public class HelloWorld03Controller {

    @GetMapping("hi03")
    public String hi() {
        return "helloworld, service is : " + getServiceImpl();
    }

    @Lookup
    public ServiceImpl getServiceImpl() {
        System.out.println("executing this method");
        return null;
    }
}
