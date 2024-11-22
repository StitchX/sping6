package com.atguigu.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {

//    方式二：bean Validation注解实现
    @Test
    public void testValidationOne(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation01 Validation01 = context.getBean(MyValidation01.class);

        User user = new User();
        user.setAge(18);
        user.setName("lucy");
        boolean message = Validation01.validatorByUserOne(user);
        System.out.println(message);
    }

    @Test
    public void testValidationTwo(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation02 Validation02 = context.getBean(MyValidation02.class);

        User user = new User();
//        user.setAge(18);
//        user.setName("lucy");
        boolean message = Validation02.validatorByUserTwo(user);
//        有错误信息报错，没有错误信息返回false
        System.out.println(message);

    }
}
