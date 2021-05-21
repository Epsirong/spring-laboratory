package com.生命周期.构造器内抛NPE.error;

import org.springframework.stereotype.Service;

@Service
public class LightService {

    public void start() {
        System.out.println("turn on all lights");
    }

    public void shutdown() {
        System.out.println("trun off all lights");
    }

    public void check() {
        System.out.println("check all lights");
    }

}