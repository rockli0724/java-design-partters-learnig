package com.lilin.java.design.imooc.principle.pattern.structural.bridge;

/**
 * 定期账号
 *
 * @author lilin
 * @Title: DepositAccount
 * @date 2019/8/1下午10:58
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
