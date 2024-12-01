package com.atguigu.spring6.annoaop;

/**
 * @Description:
 * @Author Eva
 * @Date 2024/11/29 16:34
 */
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        int result = i+j;
//        int a = 1/0; // 为了测试异常
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i-j;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i*j;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i/j;
        System.out.println("方法内部 result = " + result);
        return result;
    }
}
