package com.example.代理类属性访问报NPE.fix;

import org.springframework.stereotype.Service;

@Service
public class AdminUserService {

    public final User adminUser = new User("202101166");

    public User getAdminUser() {
        return adminUser;
    }

    public void login() {
        System.out.println("admin user login...");
    }
}