package com.atguigu.spring6.annoaop;

/**
 * @Description: 1、环境准备，动态代理，基于注解的
 * @Author Eva
 * @Date 2024/11/29 16:34
 */
public interface Calculator {
    int add(int i,int j);
    int sub(int i,int j);
    int mul(int i,int j);
    int div(int i,int j);
}
