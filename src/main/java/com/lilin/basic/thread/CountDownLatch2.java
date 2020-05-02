package com.lilin.basic.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lilin
 * @Title: CountDownLatch2
 * @date 2020/4/12下午5:32
 */
public class CountDownLatch2 implements Runnable {

    static final CountDownLatch latch = new CountDownLatch(10);
    static final CountDownLatch2 demo = new CountDownLatch2();

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.submit(demo);
        }
        latch.await();
        System.out.println("fire");
        service.shutdown();

    }

    @Override
    public void run() {
        long id = Thread.currentThread().getId();
        try {
            Thread.sleep(new Random().nextInt(10) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
            System.out.println(id + " check complete after count=" + latch.getCount());
        }
    }
}
