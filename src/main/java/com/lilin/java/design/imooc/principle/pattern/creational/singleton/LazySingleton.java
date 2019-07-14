package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

/**
 * 懒汉模式
 * 非线程安全
 *
 * @author lilin
 * @Title: LazySingleton
 * @date 2019/7/9上午12:04
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //注意私有构造会被反射破坏掉
    private LazySingleton() {

    }

    /**
     * 方法加锁可以解决此线程不安全问题
     * 但是对性能有影响
     *
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
