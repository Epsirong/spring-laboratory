package com.example.当前类方法无法拦截.fix02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class Aop1Application {

    public static void main(String[] args) {
        SpringApplication.run(Aop1Application.class, args);
    }

}
