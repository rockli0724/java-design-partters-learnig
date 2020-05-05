package com.lilin.basic.thread.imooc.consumer;

import com.lilin.basic.thread.imooc.lesson3.Punishment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author lilin
 * @Title: Teacher
 * @date 2020/5/4下午12:38
 */
public class Teacher extends Thread {

    private String name;
    private List<String> punishWords = Arrays.asList("internationalization", "hedgehog", "penicillin", "oasis", "nirvana", "miserable");
    private LinkedList<Punishment> tasks;
    private int MAX = 10;

    public Teacher(String name, LinkedList<Punishment> tasks) {
        //调用Thread构造方法，设置threadName
        super(name);
        this.name = name;
        this.tasks = tasks;
    }

    /**
     * 发作业
     *
     * @throws InterruptedException
     */
    public void arrangePunishment() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        while (true) {
            synchronized (tasks) {
                //如果发的作业小于最大容量 等待
                if (tasks.size() < MAX) {
                    Punishment punishment = new Punishment(new Random().nextInt(3) + 1, getPunishedWord());
                    tasks.add(punishment);
                    System.out.println(threadName + " 留了作业，抄写[" + punishment.getWordToCopy() + "]  [" + punishment.getLeftCopyCount() + "] 遍");
                    //通知学生 可以抄写作业了
                    tasks.notifyAll();
                } else {
                    System.out.println(threadName + " 开始等待");
                    tasks.wait();
                    System.out.println("teacher线程 " + threadName + "线程-" + name + "等待结束");
                }
            }
        }
    }

    @Override
    public void run() {
        try {
            arrangePunishment();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String getPunishedWord() {
        return punishWords.get(new Random().nextInt(punishWords.size()));
    }
}
