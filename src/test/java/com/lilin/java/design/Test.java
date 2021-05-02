package com.lilin.java.design;

import junit.framework.TestCase;

import java.util.concurrent.atomic.AtomicBoolean;

public class Test extends TestCase {
    public static void main(String[] args) {
        System.out.println("hello_world");


    }


    private static final AtomicBoolean isShutdown = new AtomicBoolean(false);
}
