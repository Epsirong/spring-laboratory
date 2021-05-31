package com.example.当前类方法无法拦截.error;

import org.springframework.stereotype.Service;

/**
 * 在类的内部，通过 this 方式调用的方法，是没有被 Spring AOP 增强的
 * @author chenrong
 * @version 1.0
 * @since 2021/5/31
 **/
@Service
public class ElectricService {

    public void charge() throws Exception {
        System.out.println("Electric charging ...");
        this.pay();
    }

    public void pay() throws Exception {
        System.out.println("Pay with alipay ...");
        Thread.sleep(1000);
    }
}
