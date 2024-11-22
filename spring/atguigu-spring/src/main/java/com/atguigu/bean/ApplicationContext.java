package com.atguigu.bean;

/**
 * @Description: 3、创建bean容器接口ApplicationContext定义方法，返回对象
 * @Author Eva
 * @Date 2024/11/22 16:27
 */
public interface ApplicationContext {
    Object getBean(Class clazz);
}
