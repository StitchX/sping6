package com.atguigu.spring6.annoaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 3、测试 59/88
 * @Author Eva
 * @Date 2024/11/29 16:40
 */
public class TestAop {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2,3);
    }
}
