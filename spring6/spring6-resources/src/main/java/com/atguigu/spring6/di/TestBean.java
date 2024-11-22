package com.atguigu.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean resourceBean = context.getBean(ResourceBean.class);
        resourceBean.parse();
    }
}

/*
归纳起来，如果 Bean 实例需要访问资源，有如下两种解决方案
    代码中获取 Resource 实例
    使用依赖注入
对于第一种方式，当程序获取 Resource 实例时，总需要提供 Resource 所在的位置，不管通过FileSystemResource 创建实例，
还是通过 ClassPathResource 创建实例，或者通过 ApplicationContext的getResource0 方法获取实例，都需要提供资源位置。
这意味着:资源所在的物理位置将被合到代码中，如果资源位置发生改变，则必须改写程序。因此，通常建议采用第二种方法，让 Spring 为
Bean 实例依赖注入资源。
 */
