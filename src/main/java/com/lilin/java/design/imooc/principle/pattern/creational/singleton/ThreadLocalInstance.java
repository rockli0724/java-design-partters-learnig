package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

/**
 * 线程引用“单例”
 *
 * @author lilin
 * @Title: ThreadLocalInstance
 * @date 2019/7/14下午11:25
 */
public class ThreadLocalInstance {

    /**
     * 线程引用
     */
    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE_THREAD_LOCAL = ThreadLocal.withInitial(
            //匿名函数
            () -> new ThreadLocalInstance()
    );


    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL_INSTANCE_THREAD_LOCAL.get();
    }
}
