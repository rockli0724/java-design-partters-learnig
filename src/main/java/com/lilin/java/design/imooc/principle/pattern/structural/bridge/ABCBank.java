package com.lilin.java.design.imooc.principle.pattern.structural.bridge;

/**
 * @author lilin
 * @Title: ABCBank
 * @date 2019/8/1下午11:03
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        return account.openAccount();
    }
}
