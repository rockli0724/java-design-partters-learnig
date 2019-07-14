package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

import java.io.*;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/7/9上午12:07
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println("singleton:" + lazySingleton);

        //1.Test lazySingleton
        Thread thread1 = new Thread(new Threads());
        Thread thread2 = new Thread(new Threads());
        thread1.start();
        thread2.start();
        System.out.println();

        //2.test doubleCheck

        //3.破坏单例模式，反序列化
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("single"));
//        outputStream.writeObject(hungrySingleton);
//
//        File file = new File("single");
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton hungrySingleton1 = (HungrySingleton) objectInputStream.readObject();
//
//        System.out.println(hungrySingleton);
//        System.out.println(hungrySingleton1);
//        System.out.println(hungrySingleton == hungrySingleton1);

        //4.通过反射，破坏对象的私有构造
//        Class<HungrySingleton> singletonClass = HungrySingleton.class;
//        Constructor<HungrySingleton> declaredConstructor = singletonClass.getDeclaredConstructor();
//        //可以通过构造器修改私有性
//        declaredConstructor.setAccessible(true);
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        HungrySingleton hungrySingleton1 = declaredConstructor.newInstance();
//        System.out.println(hungrySingleton);
//        System.out.println(hungrySingleton1);
//        System.out.println(hungrySingleton == hungrySingleton1);


        //5.枚举类，天然的不可序列,禁止反射优势
//        EnumInstance hungrySingleton = EnumInstance.getInstance();
//        hungrySingleton.setData(new Object());
//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("enumSingle"));
//        outputStream.writeObject(hungrySingleton);
//
//        File file = new File("enumSingle");
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//
//        EnumInstance hungrySingleton1 = (EnumInstance) objectInputStream.readObject();
//
//        System.out.println(hungrySingleton.getData());
//        System.out.println(hungrySingleton1.getData());
//        System.out.println(hungrySingleton.getData() == hungrySingleton1.getData());
//        hungrySingleton.testPrint();
    }
}
