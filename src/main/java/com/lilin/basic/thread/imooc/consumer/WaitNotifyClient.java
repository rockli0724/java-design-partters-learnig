package com.lilin.basic.thread.imooc.consumer;

import com.lilin.basic.thread.imooc.lesson3.Punishment;

import java.util.LinkedList;

/**
 * @author lilin
 * @Title: WaitNotifyClient
 * @date 2020/5/4下午1:08
 */
public class WaitNotifyClient {

    public static void main(String[] args) {
        LinkedList<Punishment> tasks = new LinkedList<>();
        Student xiaoming = new Student("小明", tasks);
        Student xiaowang = new Student("小王", tasks);
        Teacher lilaoshi = new Teacher("李老师", tasks);
        Teacher zhanglaoshi = new Teacher("张老师", tasks);

        xiaowang.start();
        lilaoshi.start();
        xiaoming.start();
        zhanglaoshi.start();
    }
}
