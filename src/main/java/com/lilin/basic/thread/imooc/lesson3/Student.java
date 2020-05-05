package com.lilin.basic.thread.imooc.lesson3;

/**
 * @author lilin
 * @Title: Student
 * @date 2020/5/3上午12:45
 */
public class Student extends Thread {
    private String name;
    private Punishment punishment;

    public Student(String name, Punishment punishment) {
        super(name);
        this.name = name;
        this.punishment = punishment;
    }

    /**
     * 抄写单词
     */
    public void copyWord() {

        int count = 0;
        String threadName = Thread.currentThread().getName();
        //v1
//        while (true) {
//            int leftCopyCount = punishment.getLeftCopyCount();
//            if (leftCopyCount > 0) {
//                leftCopyCount--;
//                if (leftCopyCount < punishment.getLeftCopyCount()) {
//                    punishment.setLeftCopyCount(leftCopyCount);
//                }
//                punishment.setLeftCopyCount(leftCopyCount);
//                count++;
//            } else {
//                break;
//            }
//        }



        //v2
        while (true) {
            int leftCopyCount = 0;
            //在同步代码块中访问punishment，确保读取和更新数量时，只有一个线程访问到共享资源
            synchronized (punishment) {
                int punishmentLeftCopyCount = punishment.getLeftCopyCount();
                if (punishmentLeftCopyCount > 0) {
                    leftCopyCount = punishmentLeftCopyCount;
                    punishment.setLeftCopyCount(leftCopyCount - 1);
                }
            }
            if (leftCopyCount > 0) {
//                System.out.println(threadName + "线程-" + name + "抄写" + punishment.getWordToCopy() + "。还要抄写" + leftCopyCount + "次");
                count++;
            } else {
                break;
            }
        }
        System.out.println(threadName + "线程-" + name + "一共抄写了 " + count + " 次！");
    }

    @Override
    public void run() {
        copyWord();
    }
}
