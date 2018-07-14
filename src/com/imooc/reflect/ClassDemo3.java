package com.imooc.reflect;

/**
 * 获取类的全部信息
 * @author Lucifer
 * @date 2018／07／14 15:01
 */
public class ClassDemo3 {

    public static void main(String[] args){
        String name = "hello world";
        //ClassUtil.printMethodMessage(name);
        //ClassUtil.printFiledMessage(name);
        ClassUtil.printCostMessage(name);
        System.out.println("=============");
        int i = 0;
        //ClassUtil.printMethodMessage(i);
        //ClassUtil.printFiledMessage(i);
        ClassUtil.printCostMessage(i);
    }

}
