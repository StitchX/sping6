package com.atguigu.spring6.iocxml.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    /*
    1、bean对象创建 (调用无参数构造)
    2、给bean对象设置相关属性
    3、bean后置处理器 (初始化之前)
    4、bean对象初始化(调用指定初始化方法)
    5、bean后置处理器 (初始化之后)
    6、bean对象创建完成了，可以使用了
    7、bean对象销毁(配置指定销毁的方法)
    8、loC容器关闭了
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user",User.class);
        System.out.println("6 bean对象创建完成了，可以使用了");
        System.out.println(user);
        context.close();
    }
}
