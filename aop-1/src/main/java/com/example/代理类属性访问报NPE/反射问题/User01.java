package com.example.代理类属性访问报NPE.反射问题;

/**
 * 没有默认的构造函数
 * 最常规的反射：Class.newInsance()
 * @author chenrong
 * @version 1.0
 * @since 2021/6/1
 **/
public class User01 {
    private String id;

    public User01(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.example.代理类属性访问报NPE.反射问题.User01");
        User01 user = (User01) clazz.newInstance();
        System.out.println(user.getId());
    }

}
