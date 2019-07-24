package com.lilin.java.design.imooc.principle.pattern.structural.adapter.objectadapter;

/**
 * @author lilin
 * @Title: Adapter
 * @date 2019/7/24下午10:41
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();


    @Override
    public void request() {
        //。。。业务代码
        adaptee.adapteeRequest();
    }
}
