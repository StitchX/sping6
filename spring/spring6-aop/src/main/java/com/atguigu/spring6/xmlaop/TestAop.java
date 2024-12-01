package com.atguigu.spring6.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 4、测试
 * @Author Eva
 * @Date 2024/11/29 16:46
 */
public class TestAop {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");

        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(9,13);
    }
}
