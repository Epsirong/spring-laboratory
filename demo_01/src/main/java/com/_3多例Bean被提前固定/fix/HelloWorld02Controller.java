package com._3多例Bean被提前固定.fix;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
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
public class HelloWorld02Controller implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @GetMapping("hi02")
    public String hi() {
        return "helloworld, service is : " + getServiceImpl();
    }

    public ServiceImpl getServiceImpl() {
        return applicationContext.getBean(ServiceImpl.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
