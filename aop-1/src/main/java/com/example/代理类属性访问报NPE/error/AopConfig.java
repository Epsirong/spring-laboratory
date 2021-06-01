package com.example.代理类属性访问报NPE.error;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
@Slf4j
public class AopConfig {

    @Before("execution(* com.example.代理类属性访问报NPE.error.AdminUserService.login(..)) ")
    public void logAdminLogin(JoinPoint pjp) throws Throwable {
        System.out.println("! admin login ...");
    }
}