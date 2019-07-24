package com.lilin.java.design.imooc.principle.pattern.structural.adapter.classadapter;

/**
 * @author lilin
 * @Title: Adapter
 * @date 2019/7/23下午11:28
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
