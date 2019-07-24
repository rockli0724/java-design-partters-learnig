package com.lilin.java.design.imooc.principle.pattern.structural.adapter.objectadapter;

/**
 * @author lilin
 * @Title: Adapter
 * @date 2019/7/23下午11:24
 */
public class Adaptee {

    public void adapteeRequest() {
        System.out.println("被适配者的方法=" + this.getClass().getName());
    }
}
