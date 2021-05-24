package com.生命周期.意外触发shutdown.fix;

import org.springframework.stereotype.Service;

@Service
public class LightService {

    public void start() {
        System.out.println("turn on all lights");
    }

    public void shutdown() {
        System.out.println("trun off all lights");
    }
}