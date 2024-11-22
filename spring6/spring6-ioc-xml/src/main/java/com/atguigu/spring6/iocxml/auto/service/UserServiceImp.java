package com.atguigu.spring6.iocxml.auto.service;

import com.atguigu.spring6.iocxml.auto.dao.UserDao;
import com.atguigu.spring6.iocxml.auto.dao.UserDaoImp;

public class UserServiceImp implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("serviceDao执行了...");
        userDao.addUserDao();
    }
}
