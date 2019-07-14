package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

/**
 * 静态内部类
 * 延迟初始化，减少内存开销
 *
 * @author lilin
 * @Title: StaticInnerClass
 * @date 2019/7/11下午9:27
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        //注意私有构造被反射破坏
        //私有构造，可以通过如下方式防止反射修改构造
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
}
