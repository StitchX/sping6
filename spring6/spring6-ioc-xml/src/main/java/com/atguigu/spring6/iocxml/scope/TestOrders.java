package com.atguigu.spring6.iocxml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {

    public static void main(String[] args) {
//        singleton(默认) 在IOC容器中，这个bean的对象始终为单实例，在IOC容器初始化时创建
//        prototype 这个bean在IOC容器中有多个实例 在获取bean时创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders1 = context.getBean("orders",Orders.class);
        System.out.println(orders1);

        Orders orders2 = context.getBean("orders",Orders.class);
        System.out.println(orders2);
    }

}
