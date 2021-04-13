package com.lilin.basic;

import org.junit.Test;

public class GcTest {
    @Test
    public void GCTest() {
        String str1 = new StringBuilder("ja").append("va").toString();
        String str2 = str1.intern();
        System.out.println(str1 == str2);
        // 通过System提供的方法得到hash值，打印hash值相当于内存地址，hashCode方法不完全等于

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = new StringBuilder("hello").append("world").toString();
        String str4 = str3.intern();
        System.out.println(str3 == str4);
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
