package com.imooc.reflect;

/**
 * @do 测试Class的基本概念和获取方法
 * @author Lucifer
 * @date 2018／07／14 13:41
 */
public class ClassDemo1 {

    public static void main(String[] args){
        //有3种拿到Class对象的方法
        //1.
        Class c1 = Foo.class;
        //2.
        Class c2 = new Foo().getClass();
        //3.
        try {
            Class c3 = Class.forName("com.imooc.reflect.Foo");//需要类有空构造器
            //每一个类只能是一个Class的对象
            System.out.println(c2 == c3);
        }catch (Exception e){

        }
        //每一个类只能是一个Class的对象
        System.out.println(c1 == c2);
        try {
            Foo foo = (Foo) c2.newInstance();
            foo.say();
        }catch (Exception e){

        }
    }

}

class Foo{

    public void say(){
        System.out.println("haha");
    }

}