package com.lilin.java.design.imooc.principle.pattern.structural.adapter.classadapter;

/**
 * @author lilin
 * @Title: Ap
 * @date 2019/7/23下午11:30
 */
public class App {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();


        Target addapterTarget = new Adapter();

        addapterTarget.request();
    }
}
