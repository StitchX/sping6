package com.atguigu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        实现过程
        1、创建子模块 guigu.spring
        2、创建测试类   service dao
        3、创建两个注解
            @Bean
            @Di
        4、创建bean容器接口 ApplicationContext定义方法，返回对象
        5、实现bean容器接口
            (1)回对象
            (2)根据包规则加载bean
                *比如包com.atguigu
                扫描com.atguigu这个包，和他的子包里面所有类，看类上面是否有@Bean注解，
                如果有把这个类通过反射实例化
         */
    }
}