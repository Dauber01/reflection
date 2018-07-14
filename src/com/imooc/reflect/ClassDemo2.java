package com.imooc.reflect;

/**
 * 反射的应用
 * @author Lucifer
 * @date 2018／07／14 14:57
 */
public class ClassDemo2 {

    public static void main(String[] args){
        Class c1 = int.class;
        Class c2 = String.class;
        Class c3 = Void.class;
        Class c4 = double.class;
        Class c5 = Double.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());
    }

}
