package com.example.当前类方法无法拦截.fix02;

import org.springframework.aop.framework.AopContext;
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
        // 通过一个 ThreadLocal 来将 Proxy 和线程绑定起来
        ElectricService electric = ((ElectricService) AopContext.currentProxy());
        electric.pay();
    }

    public void pay() throws Exception {
        System.out.println("Pay with alipay ...");
        Thread.sleep(1000);
    }
}
