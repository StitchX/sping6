package com.atguigu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        ApplicationContext context = new AnnotationApplicationContext("com.atguigu");
        UserService userService = (UserService) context.getBean(UserService.class);
        这两行代码的作用是创建spring容器，最终获取到对象，但是每次测试都需要重复编写。针对上述问题，
        我们需要的是程序能自动帮我们创建容器。我们都知道]Unit无法知晓我们是否使用了 Spring 框架，更不
        用说帮我们创建Spring 容器了。Spring提供了一个运行器，可以读取配置文件(或注解)来创建容器。我们
        只需要告诉它配置文件位置就可以了。这样一来，我们通过Spring整合JUnit可以使程序创建spring容器了
         */
    }
}