package com.lilin.java.design.imooc.principle.pattern.structural.adapter.objectadapter;


/**
 * @author lilin
 * @Title: ConcreteTarget
 * @date 2019/7/23下午11:26
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法=" + this.getClass().getName());
    }
}
