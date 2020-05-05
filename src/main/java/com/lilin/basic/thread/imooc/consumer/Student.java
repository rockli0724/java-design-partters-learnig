package com.lilin.basic.thread.imooc.consumer;

import com.lilin.basic.thread.imooc.lesson3.Punishment;

import java.util.LinkedList;

/**
 * @author lilin
 * @Title: Student
 * @date 2020/5/4下午12:54
 */
public class Student extends Thread {

    private String name;
    private LinkedList<Punishment> tasks;

    public Student(String name, LinkedList<Punishment> tasks) {
        super(name);
        this.name = name;
        this.tasks = tasks;
    }


    public void copyWords() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        Punishment task = null;
        while (true) {
            //同步锁
            synchronized (tasks) {
                if (tasks.size() > 0) {
                    task = tasks.removeFirst();
                    sleep(300);
                    tasks.notifyAll();
                } else {
                    System.out.println(threadName + "开始等待");
                    tasks.wait();
                    System.out.println("学生线程 " + threadName + "线程-" + name + "等待结束");
                }
            }
            if (task != null) {
                for (int i = 0; i < task.getLeftCopyCount(); i++) {
                    System.out.println(threadName + "线程-" + name + "抄写 [" + task.getWordToCopy() + "]。已经抄写了" + i + "次");
                }
            }
        }

    }


    @Override
    public void run() {
        try {
            copyWords();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
