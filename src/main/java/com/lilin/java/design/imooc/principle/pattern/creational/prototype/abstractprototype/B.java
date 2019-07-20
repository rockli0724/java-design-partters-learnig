package com.lilin.java.design.imooc.principle.pattern.creational.prototype.abstractprototype;

/**
 * @author lilin
 * @Title: B
 * @date 2019/7/15上午12:36
 */
public class B extends A {

    public static void main(String[] args) throws Exception{
        B b = new B();
        B clone = (B) b.clone();


    }
}
