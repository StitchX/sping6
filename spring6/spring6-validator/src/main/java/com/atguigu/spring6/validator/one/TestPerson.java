package com.atguigu.spring6.validator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

//校验测试
public class TestPerson {

//    方法一：通过Validator接口实现
    public static void main(String[] args) {
//        创建Person对象
        Person person = new Person();
//        person.setName("lucy");
//        person.setAge(222);

//        创建person对应databinder
        DataBinder binder = new DataBinder(person);

//        设置校验器
        binder.setValidator(new PersonValidator());
//        调用方法执行校验
        binder.validate();

//        输出校验结构
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}
