package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

/**
 * @author lilin
 * @Title: Threads
 * @date 2019/7/9上午12:09
 */
public class Threads implements Runnable {

    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
