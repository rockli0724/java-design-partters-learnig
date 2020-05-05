package com.lilin.basic.thread.imooc.lesson3;

/**
 * @author lilin
 * @Title: StudentApp
 * @date 2020/5/3上午12:50
 */
public class StudentApp {
    public static void main(String[] args) {
        int leftCopyCount = 4000000;
//        v1
//        Punishment punishment = new Punishment(100, "internationalization");
//        Student student = new Student("小明", punishment);
//        student.copyWord();
        //v2
        Punishment punishment = new Punishment(leftCopyCount, "internationalization");
        Student student = new Student("A", punishment);
        Student student2 = new Student("B", punishment);
        Student student3 = new Student("C", punishment);
        student2.start();
        student.start();
        student3.start();
        System.out.println(leftCopyCount + " Another thread will finish the punishment。 main thread is finished");


    }
}
