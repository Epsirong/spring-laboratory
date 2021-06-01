package com.example.代理类属性访问报NPE.反射问题;

import sun.reflect.ReflectionFactory;

import java.lang.reflect.Constructor;

/**
 * 没有默认的构造函数
 * 字节码方式：newConstructorForSerialization().newInstance()
 * 通过字节码的方式生成 constructorAccessor
 * --存在大量反射而产生的临时类加载器和 ASM 临时生成的类，这些类会被保留在 Metaspace
 * ---动态构建一个类加载器加载一个类
 * @author chenrong
 * @version 1.0
 * @since 2021/6/1
 **/
public class User03 {
    private String id = "1";

    public User03(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static void main(String[] args) throws Exception {
        ReflectionFactory reflectionFactory = ReflectionFactory.getReflectionFactory();
        Constructor<?> constructor = reflectionFactory.newConstructorForSerialization(User03.class, Object.class.getDeclaredConstructor());
        constructor.setAccessible(true);
        User03 user = (User03) constructor.newInstance();
        System.out.println(user.getId());
    }

}
