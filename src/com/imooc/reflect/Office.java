package com.imooc.reflect;

/**
 * 描述类的加载方式的类
 * @author Lucifer
 * @date 2018／07／14 14:05
 */
public class Office {

    public static void main(String[] args){
        //new 是静态加载类,在编译的时候就会去加载所会用到的所有的类
        /*if ("World".equals(args[0])){
            World world = new World();
            world.start();
        }
        if ("Excel".equals(args[0])){
            Excel excel = new Excel();
            excel.start();
        }*/
        try{
            Class c = Class.forName("com.imooc.reflect." + args[0]);
            OfficeAble officeAble = (OfficeAble) c.newInstance();
            officeAble.start();
        }catch (Exception e){

        }
    }

}

interface OfficeAble{

    void start();

}

class World implements OfficeAble{

    @Override
    public void start(){
        System.out.println("world......start...");
    }

}

class Excel implements OfficeAble{

    @Override
    public void start() {
        System.out.println("excel......start...");
    }

}
