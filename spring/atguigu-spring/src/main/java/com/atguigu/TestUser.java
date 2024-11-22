package com.atguigu;

import com.atguigu.bean.AnnotationApplicationContext;
import com.atguigu.bean.ApplicationContext;
import com.atguigu.service.UserService;

/**
 * @Description: 4、验证结果
 * @Author Eva
 * @Date 2024/11/22 16:50
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.atguigu");
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.add();
        userService.add();
    }
}
