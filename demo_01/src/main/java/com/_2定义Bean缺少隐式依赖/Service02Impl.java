package com._2定义Bean缺少隐式依赖;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
// @Service
public class Service02Impl {
    private String serviceName;

    public Service02Impl(String serviceName) {
        this.serviceName = serviceName;
    }

    public Service02Impl(String serviceName, String otherStringParameter) {
        this.serviceName = serviceName;
    }
}
