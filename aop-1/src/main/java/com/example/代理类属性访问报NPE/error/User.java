package com.example.代理类属性访问报NPE.error;

public class User {

    private String payNum;

    public User(String payNum) {
        this.payNum = payNum;
    }
    public String getPayNum() {
        return payNum;
    }
    public void setPayNum(String payNum) {
        this.payNum = payNum;
    }
}