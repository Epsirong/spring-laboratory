package com.生命周期.意外触发shutdown.error;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public LightService getTransmission(){
        return new LightService();
    }

}