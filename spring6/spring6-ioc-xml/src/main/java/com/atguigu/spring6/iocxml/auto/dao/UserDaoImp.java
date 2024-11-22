package com.atguigu.spring6.iocxml.auto.dao;

public class UserDaoImp implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDao里面的方法执行了 ");
    }
}
