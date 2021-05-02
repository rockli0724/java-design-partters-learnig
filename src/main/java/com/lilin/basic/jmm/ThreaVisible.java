package com.lilin.basic.jmm;

/**
 * 线程可见性
 *
 * @author lilin
 * @Title: ThreaVisible
 * @date 2021/4/13下午4:14
 */
public class ThreaVisible {

    static boolean run = true;

    public static void main(String[] args) throws Exception {
        Thread a = new Thread(() -> {
            while (run) {
                //todo
//                System.out.println("hello");
            }
        });
        a.start();

        Thread.sleep(5000);

        run = false;

    }

}
