package com._2定义Bean缺少隐式依赖;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
@Service
public class ServiceImpl {

    private String serviceName;

    public ServiceImpl(String serviceName){
        this.serviceName = serviceName;
    }
}
