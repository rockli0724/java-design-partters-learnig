package com.lilin.java.design.imooc.principle.pattern.creational.prototype.abstractprototype;

/**
 * @author lilin
 * @Title: A
 * @date 2019/7/15上午12:36
 */
public abstract class A implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
