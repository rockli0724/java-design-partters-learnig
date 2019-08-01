package com.lilin.java.design.imooc.principle.pattern.structural.bridge;

/**
 * @author lilin
 * @Title: Bank
 * @date 2019/8/1下午11:01
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 抽象方法
     *
     * @return
     */
    abstract Account openAccount();
}
