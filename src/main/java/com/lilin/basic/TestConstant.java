package com.lilin.basic;

import org.junit.Test;

public class TestConstant {

    @Test
    public void test01() {
        String str1 = new StringBuilder("hello").append("world").toString();
        System.out.println(str1.intern());
        System.out.println(str1 == str1.intern());

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern());
        System.out.println(str2 == str2.intern());

        String str3 = new StringBuilder("hello").toString();
        System.out.println(str3.intern());
        System.out.println(str3 == str3.intern());

    }


}
