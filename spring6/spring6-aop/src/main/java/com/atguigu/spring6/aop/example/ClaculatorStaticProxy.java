package com.atguigu.spring6.aop.example;

public class ClaculatorStaticProxy implements Calculator{

//    被代理目标对象传递过来
    private Calculator calculator;

    public ClaculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
    /*
    静态代理确实实现了解耦，但是由于代码都写死了，完全不具备任何的灵活性。就拿日志功能来说，将来其他地方也需要附加日志，
    那还得再声明更多个静态代理类，那就产生了大量重复的代码，日志功能还是分散的，没有统一管理。
    提出进一步的需求:将日志功能集中到一个代理类中，将来有任何日志需求，都通过这一个代理类来实现.
    这就需要使用动态代理技术了。
     */
        System.out.println("[日志]add方法开始了，参数是："+i+","+j);
        int addResult = calculator.add(i,j);
        System.out.println("[日志]add方法结束了，结果是："+addResult);
        return addResult;
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
