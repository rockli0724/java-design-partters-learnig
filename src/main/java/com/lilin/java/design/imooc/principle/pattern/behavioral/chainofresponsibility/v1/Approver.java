package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility.v1;

/**
 * @author lilin
 * @Title: Approver
 * @date 2020/5/2下午10:38
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver nextApprover) {
        this.approver = nextApprover;
    }

    public abstract void deploy(Course course);
}
