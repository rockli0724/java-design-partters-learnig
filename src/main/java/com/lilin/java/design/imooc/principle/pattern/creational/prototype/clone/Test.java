package com.lilin.java.design.imooc.principle.pattern.creational.prototype.clone;


import java.util.Date;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/7/15上午12:43
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Date data = new Date(0L);
        Pig pig = new Pig("小猪", data);
        Pig pig1 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig1);


        //修改第一个对象字段的value
        pig.getBirthday().setTime(13213131312L);
        System.out.println(pig);
        System.out.println(pig1);
    }
}
