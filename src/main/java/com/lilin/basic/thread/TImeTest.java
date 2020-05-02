package com.lilin.basic.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author lilin
 * @Title: TImeTest
 * @date 2020/4/12下午12:02
 */
public class TImeTest {
    public static void main(String[] args) {
        long convert = TimeUnit.SECONDS.convert(1, TimeUnit.MINUTES);
        System.out.println(convert);
        AtomicLong atomicLong = new AtomicLong(20);
        System.out.println("origin=" + atomicLong.get());
        long andDecrement = atomicLong.getAndDecrement();
        System.out.println("andDecrement=" + andDecrement);
        long decrementAndGet = atomicLong.decrementAndGet();
        System.out.println("decrementAndGet" + decrementAndGet);
    }
}
