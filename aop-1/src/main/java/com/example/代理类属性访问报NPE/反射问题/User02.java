package com.example.代理类属性访问报NPE.反射问题;

/**
 * 没有默认的构造函数
 * 构造函数反射创建：Constructor.newInstance()
 * @author chenrong
 * @version 1.0
 * @since 2021/6/1
 **/
public class User02 {
    private String id;

    public User02(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static void main(String[] args) throws Exception {
        User02 user = User02.class.getDeclaredConstructor().newInstance();
        System.out.println(user.getId());
    }

}
