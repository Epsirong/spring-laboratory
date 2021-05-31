package com.example.当前类方法无法拦截.fix01;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/31
 **/
@Aspect
@Service
@Slf4j
public class AopConfig {

    @Around("execution(* com.example.当前类方法无法拦截.fix01.ElectricService.pay())")
    public void recordPayPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("Pay method time cost(ms):" + (end - start));
    }
}
