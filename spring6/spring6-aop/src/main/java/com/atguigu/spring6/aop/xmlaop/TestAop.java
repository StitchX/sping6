package com.atguigu.spring6.aop.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");

        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(9,13);
    }
}
