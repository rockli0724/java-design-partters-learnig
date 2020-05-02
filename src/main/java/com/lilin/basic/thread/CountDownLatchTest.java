package com.lilin.basic.thread;

import com.lilin.basic.thread.domain.Employee;

import java.util.concurrent.CountDownLatch;

/**
 * @author lilin
 * @Title: CountDownLatchTest
 * @date 2020/4/12下午4:55
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws Exception {
        //1. Thread.join()
//        Employee a = new Employee("A", 3000);
//        Employee b = new Employee("B", 3000);
//        Employee c = new Employee("C", 4000);
//        b.start();
//        c.start();
//        b.join();
//        c.join();
//        System.out.println("B,C准备完成");
//        a.start();
//
        //1. CountDownLatch
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Employee a = new Employee("A", 3000, countDownLatch);
        Employee b = new Employee("B", 3000, countDownLatch);
        Employee c = new Employee("C", 4000, countDownLatch);

        c.start();
        b.start();
        countDownLatch.await();
        System.out.println("B,C准备完成");
        a.start();

    }
}
