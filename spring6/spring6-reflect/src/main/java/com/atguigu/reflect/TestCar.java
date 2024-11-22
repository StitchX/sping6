package com.atguigu.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {

//    1、获取Class对象多种方式
    @Test
    public void test01() throws Exception {
//        1、类名.
        Class clazz1 = Car.class;

//        2、对象.getClass()
        Class clazz2 = new Car().getClass();

//        3、Class.forName("全路径")
        Class clazz3 = Class.forName("com.atguigu.reflect.Car");

//        实例化
        Car car = (Car)clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

//    2、获取构造方法
    @Test
    public void test02() throws Exception {
        Class clazz1 = Car.class;
//        获取所有构造
//        getConstructors() 获取所有public的构造方法
//        Constructor[] constructors = clazz1.getConstructors();
//        getDeclaredConstructors() 获取所有public private方法
        Constructor[] constructors = clazz1.getDeclaredConstructors();
        for (Constructor c:
             constructors) {
            System.out.println("方法名称：" + c.getName()+"参数个数："+c.getParameterCount());
        }

//        指定有参数构造创建对象
//        1、构造public
        Constructor con1 = clazz1.getConstructor();
        con1.newInstance();
//        2、构造private
        Constructor con2 = clazz1.getDeclaredConstructor(String.class,int.class,String.class);
        con2.setAccessible(true);
        Car car2 = (Car) con2.newInstance("夏利",10,"红色");
        System.out.println(car2);
    }

//    3、获取属性
    @Test
    public void test03() throws Exception{
        Class clazz1 = Car.class;
        Car car = (Car)clazz1.getDeclaredConstructor().newInstance();

//        获取所有public属性
//        Field[] fileds = clazz1.getFields();
//        获取所有public private属性
        Field[] fileds = clazz1.getDeclaredFields();

        for (Field field :
                fileds) {
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(car,"五菱宏光");
            }
            System.out.println(field.getName());
            System.out.println(car);
        }
    }

//    4、获取方法
    @Test
    public void test04() throws Exception{
        Car car = new Car();
        Class clazz = car.getClass();

//        1、获取public方法
//        Method[] methods = clazz.getMethods();
//        for (Method m1 :
//                methods) {
//            System.out.println(m1.getName());
//            System.out.println('1');
//        }
//        2、获取private方法
        Method[] methodsAll = clazz.getDeclaredMethods();
        for (Method m2 :
                methodsAll) {
            System.out.println(m2.getName());
//            执行方法 toString
            if(m2.getName().equals("run")){
                m2.setAccessible(true);
                String invoke = (String) m2.invoke(car);
                System.out.println(invoke);
            }
        }
    }
}
