package com.atguigu.spring6.validator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {

//    方式三：基于方法实现校验
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);

        User user = new User();
        user.setAge(18);
        user.setName("lucy");
        user.setPhone("18888888888");
        user.setMessage("q pp");
        service.testMethod(user);
    }
}
