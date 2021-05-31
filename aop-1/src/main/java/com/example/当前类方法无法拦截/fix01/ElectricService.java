package com.example.当前类方法无法拦截.fix01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 在类的内部，通过 this 方式调用的方法，是没有被 Spring AOP 增强的
 * @author chenrong
 * @version 1.0
 * @since 2021/5/31
 **/
@Service
public class ElectricService {

    @Autowired
    private ElectricService electricService;

    public void charge() throws Exception {
        System.out.println("Electric charging ...");
        electricService.pay();
    }

    public void pay() throws Exception {
        System.out.println("Pay with alipay ...");
        Thread.sleep(1000);
    }
}
