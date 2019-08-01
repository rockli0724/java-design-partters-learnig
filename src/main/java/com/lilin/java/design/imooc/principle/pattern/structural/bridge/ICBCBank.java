package com.lilin.java.design.imooc.principle.pattern.structural.bridge;

/**
 * @author lilin
 * @Title: ICBCBank
 * @date 2019/8/1下午11:09
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //具体的委托实现
        return account.openAccount();
    }
}
