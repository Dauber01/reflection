package com.imooc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 打印类的信息的类
 * @author Lucifer
 * @date 2018／07／14 15:12
 */
public class ClassUtil {

    /**
     * @do 打印类中的方法信息
     * @param o 类的信息
     */
    public static void printMethodMessage(Object o){
        Class c = o.getClass();
        //获取类中的所有共有方法,包括从父类中继承的方法
        Method[] methodType = c.getMethods();
        //c.getDeclaredMethods();获取当前类中的所有方法,包括私有方法,不包括从父类中继承的方法
        for (Method method : methodType) {
            Class c1 = method.getReturnType();
            System.out.print(c1.getName() + " ");
            System.out.print(method.getName() + "(");
            Class[] c2 = method.getParameterTypes();
            for (Class aClass : c2) {
                System.out.print(aClass.getName() + ",");
            }
            System.out.println(")");
        }
    }

    /**
     * @do 打印类中的成员变量的信息
     * @param o 类的信息
     */
    public static void printFiledMessage(Object o){
        Class c = o.getClass();
        //Field[] fields = c.getFields();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Class c1 = field.getType();
            System.out.print(c1.getName() + " ");
            System.out.println(field.getName());
        }
    }

    /**
     * @do 打印类中的构造器的信息
     * @param o 类的信息
     */
    public static void printCostMessage(Object o){
        Class c = o.getClass();
        //c.getConstructors();
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] c1 = constructor.getParameterTypes();
            for (Class aClass : c1) {
                System.out.print(aClass.getName() + ",");
            }
            System.out.println(")");
        }
    }

}
