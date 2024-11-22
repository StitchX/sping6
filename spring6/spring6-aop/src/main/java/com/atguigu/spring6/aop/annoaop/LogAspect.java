package com.atguigu.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


import java.util.Arrays;

//切面类
@Aspect // 切面类
@Component // IOC容器
public class LogAspect {

//    设置切入点和通知类型
//    切入点表达式：execution(访问修饰符 增强方法返回类型 增强方法所在类全路径.方法名称(方法参数))
//                  * 表示包名任意                               *表示方法名任意              .. 表示参数列表任意
//                  *... 表示包名和包的层次深度任意                 get*表示匹配get开头的包名
//                                              类名称和上诉方法名称一样
//    通知类型：
//      前置 @Before(value="切入点表达式配置切入点")
//    @Before(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    @Before(value = "execution(public int com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知，方法名称："+methodName+",参数"+ Arrays.toString(args));
    }
//      后置 @After()
//    @After(value = "pointCut()")
    @After(value = "com.atguigu.spring6.aop.annoaop.LogAspect.pointCut()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名称："+methodName);
    }
//      返回 @AfterReturning
    @AfterReturning(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名称："+methodName+",返回名称"+ result);
    }

//      异常 @AfterThrowing 获取到目标方法异常信息
//    目标方法出现异常，这个通知执行
    @AfterThrowing(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名称："+methodName+"异常信息："+ex);
    }

//      环绕 @Around()
    @Around("execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
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
    @Pointcut(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointCut(){

    }


}


/*
第一步：引入AOP依赖

第二步：创建目标资源
    接口
    实现类

第三步：
    切入点
    通知类型

其它：
    切面的优先级：外面高于里面
                @Order可以控制优先级，数字越小等级越高
 */