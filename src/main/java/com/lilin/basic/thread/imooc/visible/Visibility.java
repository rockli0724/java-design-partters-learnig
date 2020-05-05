package com.lilin.basic.thread.imooc.visible;

/**
 * @author lilin
 * @Title: Visibility
 * @date 2020/5/4下午1:44
 */
public class Visibility {

    public static void main(String[] args) throws Exception{
        ShowVisibility showVisibility = new ShowVisibility();
        Thread blindThread = new Thread(showVisibility);
        blindThread.start();
        //给线程启动的时间
        Thread.sleep(500);
        //更新flag
        showVisibility.flag=true;
        System.out.println("flag is true, thread should print");
        Thread.sleep(1000);
        System.out.println("I have slept 1 seconds. I guess there was nothing printed ");
    }

    static class ShowVisibility implements Runnable {
        public static Object o = new Object();
        private volatile Boolean flag = false;

        @Override
        public void run() {
            while (true) {
                if (flag) {
                    System.out.println(Thread.currentThread().getName() + ":" + flag);
                }
            }
        }
    }
}
