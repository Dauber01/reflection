package com.imooc.reflect;

import java.lang.reflect.Method;

/**
 * 用来测试关于用反射调用对象的方法
 * @author Lucifer
 * @date 2018／07／14 16:05
 */
public class ClassDemo4 {

    public static void main(String[] args){
        Person person = new Person();
        Class c = person.getClass();
        try {
            Method method = c.getMethod("print", new Class[]{int.class, int.class});
            method.invoke(person, new Object[]{1, 2});
            method = c.getMethod("print", String.class, String.class);
            String result = (String) method.invoke(person, "fuck", "you");
            System.out.println("返回值:" + result);
            method = c.getMethod("print");
            method.invoke(person);
        }catch (Exception e){

        }
    }

}

class Person{

    public void print(int i, int j){
        System.out.println(i + j);
    }

    public String print(String a, String b){
        System.out.println(a + b);
        return a + b;
    }

    public void print(){
        System.out.println("helloword");
    }

}