package com.lilin.java.design.imooc.principle.pattern.structural.adapter.objectadapter;

/**
 * @author lilin
 * @Title: App
 * @date 2019/7/24下午10:42
 */
public class App {

    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target target = new Adapter();
        target.request();
    }
}
