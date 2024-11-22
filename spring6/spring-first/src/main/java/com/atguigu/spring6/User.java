package com.atguigu.spring6;

public class User {

    public User(){
        System.out.println("0:");
    }

    public void add(){
        System.out.println("add ...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
