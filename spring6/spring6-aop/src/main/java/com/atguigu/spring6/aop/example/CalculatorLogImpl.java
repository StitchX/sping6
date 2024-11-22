package com.atguigu.spring6.aop.example;

//带日志

/*
缺点：
    针对带日志功能的实现类，我们发现有如下缺陷:
        对核心业务功能有干扰，导致程序员在开发核心业务功能时分散了精力
        附加功能分散在各个业务功能方法中，不利于统一维护
解决方案：
    解耦

解决问题的困难:
    要抽取的代码在方法内部，靠以前把子类中的重复代码抽取到父类的方式没法解决。所以需要引入新的技术。
 */
public class CalculatorLogImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        System.out.println("[日志]add方法开始了，参数是："+i+","+j);
        int result = i+j;
        System.out.println("方法内部 result = " + result);
        System.out.println("[日志]add方法结束了，结果是："+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
