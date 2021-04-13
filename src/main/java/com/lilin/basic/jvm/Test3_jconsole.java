package com.lilin.basic.jvm;

import java.util.concurrent.TimeUnit;

public class Test3_jconsole {
    public static void main(String[] args) throws Exception{
        System.out.println(".....1");
        Thread.sleep(30000);

        byte[] bytes = new byte[1024 * 1024 * 10];
        System.out.println(">>>>>2");

        Thread.sleep(20000);

        bytes=null;

        System.gc();

        System.out.println(".....3");

        Thread.sleep(10000000L);

    }
}
