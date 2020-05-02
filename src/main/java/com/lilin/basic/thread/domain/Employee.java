package com.lilin.basic.thread.domain;

import java.util.concurrent.CountDownLatch;

/**
 * @author lilin
 * @Title: Employee
 * @date 2020/4/12下午4:57
 */
public class Employee extends Thread {
    private String employeeName;
    private long time;
    private CountDownLatch countDownLatch;

    public Employee(String employeeName, long time) {
        this.employeeName = employeeName;
        this.time = time;
    }

    public Employee(String employeeName, long time, CountDownLatch countDownLatch) {
        this.employeeName = employeeName;
        this.time = time;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println(employeeName + "开始准备,count=" + countDownLatch.getCount());
            Thread.sleep(time);
            countDownLatch.countDown();
            System.out.println(employeeName + " 准备完成,count=" + countDownLatch.getCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    @Override
//    public void run() {
//        try {
//            System.out.println(employeeName + "开始准备");
//            Thread.sleep(time);
//            System.out.println(employeeName + " 准备完成");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
