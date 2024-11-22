package com.atguigu.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserDao")
public class UserDaoImp implements UserDao {

    @Override
    public void add() {
        System.out.println("dao .... ");
    }
}
