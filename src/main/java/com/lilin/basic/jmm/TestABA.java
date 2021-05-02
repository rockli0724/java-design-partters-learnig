package com.lilin.basic.jmm;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author lilin
 * @Title: TestABA
 * @date 2021/4/13下午6:10
 */
public class TestABA {


    AtomicReference<String> str= new AtomicReference<>();

    public static void main(String[] args) {

            String  s = new String();
    }

}


