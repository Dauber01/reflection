package com.imooc.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 通过反射看泛型的底层原理
 * @author Lucifer
 * @date 2018／07／14 16:17
 */
public class ClassDemo5 {

    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        //stringArrayList.add(20);
        Class c1 = arrayList.getClass();
        Class c2 = stringArrayList.getClass();
        System.out.println(c1 == c2);
        try {
            Method m = c2.getMethod("add", Object.class);
            m.invoke(stringArrayList, 20);
        }catch (Exception e){

        }
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);
        /*for (String s : stringArrayList) {
            System.out.println(s);
        }*/
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }

}
