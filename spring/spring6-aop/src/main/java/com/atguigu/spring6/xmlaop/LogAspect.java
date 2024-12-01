package com.atguigu.spring6.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Description: 2、
 * @Author Eva
 * @Date 2024/11/29 16:45
 */
@Component // IOC容器
public class LogAspect {

    //    前置通知
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知，方法名称："+methodName+",参数"+ Arrays.toString(args));
    }
    //      后置通知
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名称："+methodName);
    }
    //      返回通知
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名称："+methodName+",返回名称"+ result);
    }

    //      异常通知
    public void afterThrowing(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名称："+methodName+"异常信息："+ex);
    }

    //      环绕通知
    public Object around(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        Object result = null;
        try{
            System.out.println("环绕通知==目标方法出现返回值之前执行");
//            调用目标方法
            result = joinPoint.proceed();
            System.out.println("环绕通知==目标方法出现返回值之后执行");

        }catch (Throwable throwable){
            throwable.printStackTrace();
            System.out.println("环绕通知==目标方法出现异常执行");
        }finally {
            System.out.println("环绕通知==目标方法执行完毕");
        }
        return result;
    }

    //    重用切入点表达式
    @Pointcut(value = "execution(* com.atguigu.spring6.aop.xmlaop.CalculatorImpl.*(..))")
    public void pointCut(){

    }
}
