package com.atguigu.spring6.autowird.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {

    @Override
    public void add() {
        System.out.println("dao .... ");
    }
}
