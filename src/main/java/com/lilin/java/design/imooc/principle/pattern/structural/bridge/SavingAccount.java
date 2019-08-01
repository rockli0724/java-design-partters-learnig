package com.lilin.java.design.imooc.principle.pattern.structural.bridge;

/**
 * 活期存款
 *
 * @author lilin
 * @Title: SavingAccount
 * @date 2019/8/1下午10:59
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
