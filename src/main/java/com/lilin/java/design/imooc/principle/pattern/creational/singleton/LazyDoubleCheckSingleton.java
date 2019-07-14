package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

/**
 * 双重检查
 * 延迟加载
 *
 * @author lilin
 * @Title: LazySingleton
 * @date 2019/7/9上午12:04
 */
public class LazyDoubleCheckSingleton {

    //
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }


    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            //减少方法锁对线程的开销
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //1.分配内存
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //步骤2和3可能会被重排序,对结果无影响
                    // intra-thread semantics
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
