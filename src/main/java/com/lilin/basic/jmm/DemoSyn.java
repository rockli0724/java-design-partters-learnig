package com.lilin.basic.jmm;

/**
 * @author lilin
 * @Title: DemoSyn
 * @date 2021/4/13下午3:46
 */
public class DemoSyn {


    static int i = 0;
    static Object object = new Object();

    public static void main(String[] args) throws Exception{

        Thread thread = new Thread(() -> {
            for (int j = 0; j < 50000; j++) {
                synchronized (object) {
                    i++;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int j = 0; j < 50000; j++) {
                synchronized (object) {
                    i--;
                }
            }
        });


        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(i);
    }


}
