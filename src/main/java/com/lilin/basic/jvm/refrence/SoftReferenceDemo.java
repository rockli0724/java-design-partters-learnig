package com.lilin.basic.jvm.refrence;

import java.lang.ref.SoftReference;

/**
 * 软引用
 */
public class SoftReferenceDemo {

    public static void main(String[] args) {
//        memoryEnough();
        memoryNotEnough();
    }


    /**
     * 内存足够
     * 内存够用就保留，不够就回收
     */
    public static void memoryEnough() {
        Object o = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o);
        System.out.println(o);//java.lang.Object@7e6cbb7a
        System.out.println(softReference.get());//java.lang.Object@7e6cbb7a

        o = null;
        System.gc();

        System.out.println(o);//null
        System.out.println(softReference.get());//因为内存足够
    }


    /**
     * 内存足够
     * 内存够用就保留，不够就回收
     * -Xms5m -Xmx5m -XX:+PrintGCDetails
     */
    public static void memoryNotEnough() {
        Object o = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o);
        System.out.println(o);//java.lang.Object@7e6cbb7a
        System.out.println(softReference.get());//java.lang.Object@7e6cbb7a

        o = null;
        System.gc();

        try {
            // 创建大对象
            byte[] bytes = new byte[30 * 1024 * 1024];
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(o); //null
            System.out.println(softReference.get()); //null
        }
    }
}
