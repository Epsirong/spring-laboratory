package com.example.代理类属性访问报NPE.error;

import org.springframework.stereotype.Service;

@Service
public class AdminUserService {

    public final User adminUser = new User("202101166");

    public void login() {
        System.out.println("admin user login...");
    }
}