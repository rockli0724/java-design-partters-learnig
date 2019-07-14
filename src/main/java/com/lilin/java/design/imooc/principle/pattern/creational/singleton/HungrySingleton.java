package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 * 类加载时就初始化完成
 * 线程安全
 *
 * @author lilin
 * @Title: HungrySingleton
 * @date 2019/7/11下午9:51
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton hungrySingleton;

    static {
        //在类加载时就实例化对象
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        //私有构造，可以通过如下方式防止反射修改构造
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 序列化
     * 对单例会破坏
     *
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }
}
