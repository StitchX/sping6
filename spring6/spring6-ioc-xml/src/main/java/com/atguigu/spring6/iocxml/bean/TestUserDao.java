package com.atguigu.spring6.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    @Test
    public void demo01(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        根据接口类型获取接口对应的bean
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }
}
