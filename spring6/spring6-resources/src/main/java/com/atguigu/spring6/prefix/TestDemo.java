package com.atguigu.spring6.prefix;

import com.atguigu.spring6.di.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class TestDemo {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean*.xml");
//        通过 强制读取类路径下的内容
//        Resource resource = context.getResource("classpath: atguigu.txt");
//        System.out.println(resource.getDescription());


        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean*.xml");
//        通配符的使用
        Resource resource = context.getResource("classpath*: atguigu*.txt");
        User user = context.getBean(User.class);
        System.out.println(user);


    }

    /*
    ApplicationContext确定资源访问策略通常有两种方法：
        (1)使用ApplicationContext实现类指定访问策略
        (2)用前缀指定访问策略
     */
}
