package com.atguigu.spring6.autowird.service;


import com.atguigu.spring6.autowird.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
//    注入service
//    第一种方式 属性注入
//    @Autowired  // 根据类型找到对象，完成注入
//    private UserDao userDao;

//    第二种方式 set方法注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//    第三种方式 构造方法方法注入
//    private UserDao userDao;
//    @Autowired
//    public UserServiceImp(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //    第四种方式 形参上注入
//    private UserDao userDao;
//    public UserServiceImp(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }

//    最后方式：两个注解，根据名称注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;


    @Override
    public void add() {
        System.out.println("service ... ");
        userDao.add();
    }
}
