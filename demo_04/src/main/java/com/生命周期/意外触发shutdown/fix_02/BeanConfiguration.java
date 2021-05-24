package com.生命周期.意外触发shutdown.fix_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

   //修改方案之一：
    @Bean(destroyMethod="")
    public LightService getTransmission(){
        return new LightService();
    }
}